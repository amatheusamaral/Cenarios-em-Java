package br.edu.up.modelos;

public class Livro {
    private String codigo;
    private String titulo;
    private String autores;
    private String isbn;
    private int ano;

    public Livro(String codigo, String titulo, String autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }
}
