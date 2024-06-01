package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor extends Usuario{
    private Set<Curso> cursosMinistrados;

    public Professor(String nome, String email) {
        super(nome, email);
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        cursosMinistrados = new LinkedHashSet<>();
    }

    public void adicionarCurso(Curso curso){
        cursosMinistrados.add(curso);
    }

    public Set<Curso> listarCursosMinistrados(){
        return cursosMinistrados;
    }
}
