import java.util.Optional;
import java.util.Set;

import model.Aluno;
import model.Curso;
import model.Professor;
import service.PlataformaService;

public class App {
    public static void main(String[] args) {
        PlataformaService plataformaService = new PlataformaService();

        // Adicionando professores
        Professor professor1 = plataformaService.adicionarProfessor("Miguel Silva", "miguel.santos@example.com");
        Professor professor2 = plataformaService.adicionarProfessor("Arthur Ferreira", "arthru.ferreira@example.com");

        // Listando professores
        System.out.println("Professores:");
        plataformaService.listarProfessores().forEach(System.out::println);

        System.out.println("------------");

        // Adicionando alunos
        Aluno aluno1 = plataformaService.adicionarAluno("Helena Pereira", "helena.pereira@example.com");
        Aluno aluno2 = plataformaService.adicionarAluno("Theo Costa", "theo.costa@example.com");

        // Listando alunos
        System.out.println("Alunos:");
        plataformaService.listarAlunos().forEach(System.out::println);

        System.out.println("------------");

        // Adicionando cursos
        Curso curso1 = plataformaService.adicionarCurso("Java Básico", "Aprenda o básico de Java", professor1);
        Curso curso2 = plataformaService.adicionarCurso("Python Avançado", "Aprenda Python avançado", professor2);

        // Listando cursos
        System.out.println("Cursos:");
        plataformaService.listarCursos().forEach(System.out::println);

        System.out.println("------------");

        // Adicionando aulas
        plataformaService.adicionarAulaNoCurso("Introdução ao Java", "Conteúdo da aula de introdução ao Java", curso1);
        plataformaService.adicionarAulaNoCurso("POO em Java", "Conteúdo da aula de POO em Java", curso1);

        plataformaService.adicionarAulaNoCurso("Introdução ao Python", "Conteúdo da aula de introdução ao Python", curso2);
        plataformaService.adicionarAulaNoCurso("Data Science com Python", "Conteúdo da aula de Data Science com Python", curso2);

        // Listando aulas de um curso
        System.out.println("Aulas do curso 'Java Básico':");
        plataformaService.listarAulasDoCurso(curso1).forEach(aula -> System.out.println(aula.getTitulo() + ": " + aula.getConteudo()));

        System.out.println("------------");

        // Inscrevendo alunos em cursos
        plataformaService.inscreverAlunoNoCurso(aluno1, curso1);
        plataformaService.inscreverAlunoNoCurso(aluno2, curso1);
        plataformaService.inscreverAlunoNoCurso(aluno1, curso2);

        // Listando alunos inscritos em um curso
        System.out.println("Alunos inscritos no curso 'Java Básico':");
        plataformaService.listarAlunosInscritosNoCurso(curso1).forEach(System.out::println);

        System.out.println("------------");

        // Listando cursos ministrados por um professor
        System.out.println("Cursos ministrados por " + professor1.getNome() + ":");
        plataformaService.listarCursosDoProfessor(professor1).forEach(System.out::println);

        System.out.println("------------");

        // Listando cursos de um aluno
        System.out.println("Cursos de " + aluno1.getNome() + ":");
        plataformaService.listarCursosDoAluno(aluno1).forEach(System.out::println);

        System.out.println("------------");

        // Procurando curso por título
        System.out.println("Procurando curso com título 'Java Básico':");
        Set<Curso> cursosEncontrados = plataformaService.procurarCursosPorTitulo("Java Básico");
        cursosEncontrados.forEach(System.out::println);

        System.out.println("------------");

        // Procurando curso do aluno por título
        System.out.println("Procurando curso de " + aluno1.getNome() + " com título 'Java Básico':");
        Set<Curso> cursosAlunoEncontrados = plataformaService.procurarCursoDoAlunoPorTitulo(aluno1, "Java Básico");
        cursosAlunoEncontrados.forEach(System.out::println);

        System.out.println("------------");

        // Detalhes das inscrições
        System.out.println("Observando detalhes das inscrições:");
        plataformaService.exibirDetalhesIncricoesDoCurso(curso1).forEach(System.out::println);

        System.out.println("----------------");

        // Procurando aulas não concluidas de um curso especifico do aluno
        System.out.println("Aulas não concluidas do aluno " + aluno1.getNome() + " no curso de 'Java Básico");
        plataformaService.aulasNaoConcluidas(aluno1, "Java Básico");

        System.out.println("----------------");

        // Concluindo uma aula de um curso especidfico de um aluno
        System.out.println("Concluindo uma aula do curso 'Java Básico' do aluno: " + aluno1.getNome());
        plataformaService.progredirAula(aluno1, "Java Básico");

        System.out.println("----------------");
        
        // Procurando aulas concluidas de um curso especifico do aluno
        System.out.println("Aulas concluidas do aluno " + aluno1.getNome() + " no curso de 'Java Básico");
        plataformaService.aulasConcluidas(aluno1, "Java Básico");

        System.out.println("----------------");

        // Procurando aulas não concluidas de um curso especifico do aluno
        System.out.println("Aulas não concluidas do aluno " + aluno1.getNome() + " no curso de 'Java Básico");
        plataformaService.aulasNaoConcluidas(aluno1, "Java Básico");

        System.out.println("----------------");

        // Concluindo uma aula de um curso especidfico de um aluno
        System.out.println("Concluindo uma aula do curso 'Java Básico' do aluno: " + aluno1.getNome());
        plataformaService.progredirAula(aluno1, "Java Básico");

        System.out.println("----------------");

        // Procurando aulas não concluidas de um curso especifico do aluno
        System.out.println("Aulas não concluidas do aluno " + aluno1.getNome() + " no curso de 'Java Básico");
        plataformaService.aulasNaoConcluidas(aluno1, "Java Básico");

        System.out.println("----------------");

        // Procurando aulas concluidas de um curso especifico do aluno
        System.out.println("Aulas concluidas do aluno " + aluno1.getNome() + " no curso de 'Java Básico");
        plataformaService.aulasConcluidas(aluno1, "Java Básico");

        System.out.println("----------------");

         // Emissão de certificado para um aluno
        Optional<String> certificado = plataformaService.emitirCertificado(aluno1, "Java Básico");
        certificado.ifPresent(System.out::println);

    }
}
