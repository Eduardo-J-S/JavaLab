package model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Aluno extends Usuario {

    private Set<Curso> cursosInscritos;

    public Aluno(String nome, String email) {
        super(nome, email);
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        this.cursosInscritos = new LinkedHashSet<>();
    }

    public void progredir(String nomeCurso) {
        Optional<Curso> cursoAvancar = cursosInscritos.stream()
                .filter(curso -> curso.getTitulo().equalsIgnoreCase(nomeCurso))
                .findFirst();

        if (cursoAvancar.isPresent()) {
            Curso curso = cursoAvancar.get();
            Set<Aula> aulas = curso.getAulas();
            if (!aulas.isEmpty()) {
                Aula aulaRemover = aulas.stream().findFirst().orElse(null);
                if (aulaRemover != null) {
                    aulas.remove(aulaRemover);
                    cursoAvancar.get().setAulasFinalizadas(aulaRemover);
                    if (aulas.isEmpty()) {
                        System.out.println("Parabéns, você concluiu o curso.");
                    } else {
                        System.out.println("Aulas restantes: " + aulas);
                    }
                }
            } else {
                System.err.println("O curso não tem aulas a serem concluídas.");
            }

        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void aulasNaoConcluidas(String nomeCurso) {
        Optional<Curso> cursoAvancar = cursosInscritos.stream()
                .filter(curso -> curso.getTitulo().equalsIgnoreCase(nomeCurso))
                .findFirst();

        if (cursoAvancar.isPresent()) {
            Set<Aula> aulas = cursoAvancar.get().getAulas();
            if (!aulas.isEmpty()) {
                System.out.println(aulas);
            } else {
                System.err.println("O curso não tem aulas a serem concluídas.");
            }

        } else {
            System.err.println("O aluno não está inscrito no curso especificado.");
        }
    }

    public void aulasConcluidas(String nomeCurso) {
        Optional<Curso> cursoAvancar = cursosInscritos.stream()
                .filter(curso -> curso.getTitulo().equalsIgnoreCase(nomeCurso))
                .findFirst();

        if (cursoAvancar.isPresent()) {
            Set<Aula> aulas = cursoAvancar.get().getAulasFinalizadas();
            if (!aulas.isEmpty()) {
                System.out.println("Aulas concluidas: " + aulas);
            } else {
                System.err.println("O curso não tem aulas concluídas.");
            }

        } else {
            System.err.println("O aluno não está inscrito no curso especificado.");
        }
    }

    public Optional<String> emitirCertificado(String nomeCurso) {
        Optional<Curso> cursoCertificado = cursosInscritos.stream()
                .filter(curso -> curso.getTitulo().equalsIgnoreCase(nomeCurso))
                .findFirst();

        if (cursoCertificado.isPresent()) {
            Curso curso = cursoCertificado.get();
            if (curso.getAulas().isEmpty()) {
                String certificado = "Certificado de Conclusão do Curso " + curso.getTitulo() + " para " + this.getNome();
                return Optional.of(certificado);
            } else {
                System.err.println("O aluno ainda não concluiu todas as aulas do curso.");
            }

        } else {
            System.err.println("O aluno não está inscrito no curso especificado.");
        }
        return Optional.empty();
    }


    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
        curso.adicionarInscrito(this);
        curso.adicionarIncricoes(new Inscricao(this, curso, LocalDate.now()));
    }

    public Set<Curso> listarCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Curso> procurarCursoPorTitulo(String titulo) {
        return cursosInscritos.stream()
                .filter(curso -> curso.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toSet());
    }
}
