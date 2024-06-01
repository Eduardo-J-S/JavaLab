package model;

import java.time.LocalDate;

public class Inscricao {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataInscricao;

    public Inscricao(Aluno aluno, Curso curso, LocalDate dataInscricao) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não pode ser nulo.");
        }
        if (curso == null) {
            throw new IllegalArgumentException("Curso não pode ser nulo.");
        }
        this.aluno = aluno;
        this.curso = curso;
        this.dataInscricao = dataInscricao;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public LocalDate getDataInscricao() {
        return dataInscricao;
    }
    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "Inscrição{" +
                "aluno=" + aluno.getNome() +
                ", curso=" + curso.getTitulo() +
                ", dataInscricao=" + dataInscricao +
                '}';
    }
    

    
}
