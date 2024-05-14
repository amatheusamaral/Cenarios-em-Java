package br.edu.up.modelos;

public class Titulacao {
    private String instituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTrabalhoConclusao;

    public Titulacao(String instituicao, int anoConclusao, String nomeTitulo, String tituloTrabalhoConclusao) {
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getTituloTrabalhoConclusao() {
        return tituloTrabalhoConclusao;
    }

    public void setTituloTrabalhoConclusao(String tituloTrabalhoConclusao) {
        this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }
}
