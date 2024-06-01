package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Curso {

    private String titulo;
    private String descricao;
    private Professor professor;
    private Set<Aula> aulas;
    private Set<Aula> aulasFinalizadas;
    private Set<Aluno> inscritos;
    private Set<Inscricao> inscricoes;

    public Curso(String titulo, String descricao, Professor professor) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio.");
        }
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao não pode ser nulo ou vazio.");
        }
        if (professor == null) {
            throw new IllegalArgumentException("Professor não pode ser nulo.");
        }
        this.titulo = titulo;
        this.descricao = descricao;
        this.professor = professor;
        this.aulas = new LinkedHashSet<>();
        this.aulasFinalizadas = new LinkedHashSet<>();
        this.inscritos = new LinkedHashSet<>();
        this.inscricoes = new LinkedHashSet<>();
    }
    
    public void adicionarAula(Aula aula){
        aulas.add(aula);
    }

    public void adicionarIncricoes(Inscricao inscricao){
        inscricoes.add(inscricao);
    }

    public Set<Aula> listarAulas() {
        return aulas;
    }

    public Set<Aluno> getInscritos() {
        return inscritos;
    }

    public Set<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    public void adicionarInscrito(Aluno inscrito) {
        this.inscritos.add(inscrito);
    }

    public String getTitulo() {
        return titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Set<Aula> getAulasFinalizadas() {
        return aulasFinalizadas;
    }

    public void setAulasFinalizadas(Aula aulasFinalizadas) {
        this.aulasFinalizadas.add(aulasFinalizadas);
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", professor=" + professor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((professor == null) ? 0 : professor.hashCode());
        result = prime * result + ((aulas == null) ? 0 : aulas.hashCode());
        result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (professor == null) {
            if (other.professor != null)
                return false;
        } else if (!professor.equals(other.professor))
            return false;
        if (aulas == null) {
            if (other.aulas != null)
                return false;
        } else if (!aulas.equals(other.aulas))
            return false;
        if (inscritos == null) {
            if (other.inscritos != null)
                return false;
        } else if (!inscritos.equals(other.inscritos))
            return false;
        return true;
    }
   
    
}
