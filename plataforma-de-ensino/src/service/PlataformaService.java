package service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import model.Aluno;
import model.Aula;
import model.Curso;
import model.Inscricao;
import model.Professor;

public class PlataformaService {
    private Set<Professor> professores;
    private Set<Aluno> alunos;
    private Set<Curso> cursos;

    public PlataformaService() {
        this.professores = new HashSet<>();
        this.alunos = new HashSet<>();
        this.cursos = new HashSet<>();
    }

    public Professor adicionarProfessor(String nome, String email) {
        Professor professor = new Professor(nome, email);
        professores.add(professor);
        return professor;
    }

    public Set<Professor> listarProfessores() {
        return professores;
    }

    public Aluno adicionarAluno(String nome, String email){
        Aluno aluno = new Aluno(nome, email);
        alunos.add(aluno);
        return aluno;
    }

    public Set<Aluno> listarAlunos() {
        return alunos;
    }

    public Curso adicionarCurso(String titulo, String descricao, Professor professor) {
        Curso curso = new Curso(titulo, descricao, professor);
        cursos.add(curso);
        professor.adicionarCurso(curso);
        return curso;
    }

    public Set<Curso> listarCursos() {
        return cursos;
    }

    public void adicionarAulaNoCurso(String titulo, String conteudo, Curso curso){
        Aula aula = new Aula(titulo, conteudo);
        curso.adicionarAula(aula);
    }

    public Set<Aula> listarAulasDoCurso(Curso curso){
        return curso.listarAulas();
    }

    public Set<Curso> procurarCursosPorTitulo(String titulo) {
        return cursos.stream()
        .filter(curso -> curso.getTitulo().equalsIgnoreCase(titulo))
        .collect(Collectors.toSet());
    }

    public void inscreverAlunoNoCurso(Aluno aluno, Curso curso){
        aluno.inscreverCurso(curso);
    }

    public Set<Aluno> listarAlunosInscritosNoCurso(Curso curso) {
        return curso.getInscritos();
    }

    public Set<Curso> listarCursosDoProfessor(Professor professor){
        return professor.listarCursosMinistrados();
    }

    public Set<Curso> listarCursosDoAluno(Aluno aluno){
        return aluno.listarCursosInscritos();
    }

    public Set<Curso> procurarCursoDoAlunoPorTitulo(Aluno aluno, String titulo){
        return aluno.procurarCursoPorTitulo(titulo);
    }

    public Set<Inscricao> exibirDetalhesIncricoesDoCurso(Curso curso){
        return curso.getInscricoes();
    }

    public void aulasNaoConcluidas(Aluno aluno, String nomeCurso){
        aluno.aulasNaoConcluidas(nomeCurso);
    }

    public void aulasConcluidas(Aluno aluno, String nomeCurso){
        aluno.aulasConcluidas(nomeCurso);
    }

    public void progredirAula(Aluno aluno, String nomeCurso){
        aluno.progredir(nomeCurso);
    }

    public Optional<String> emitirCertificado(Aluno aluno, String nomeCurso){
        return aluno.emitirCertificado(nomeCurso);
    }

}
