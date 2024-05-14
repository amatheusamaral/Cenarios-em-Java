package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String identificacaoLattes;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String identificacaoLattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.identificacaoLattes = identificacaoLattes;
        this.titulacao = titulacao;
    }

    public String getIdentificacaoLattes() {
        return identificacaoLattes;
    }

    public void setIdentificacaoLattes(String identificacaoLattes) {
        this.identificacaoLattes = identificacaoLattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
}
