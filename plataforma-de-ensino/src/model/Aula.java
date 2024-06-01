package model;

public class Aula {
    private String titulo;
    private String conteudo;

    public Aula(String titulo, String conteudo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio.");
        }
        if (conteudo == null || conteudo.isEmpty()) {
            throw new IllegalArgumentException("Conteudo não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Aula [titulo=" + titulo + ", conteudo=" + conteudo + "]";
    }
}
