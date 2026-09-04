package br.senac.bibliotech_api.Model;

public class Livro {

    private Long id;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(Long id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}