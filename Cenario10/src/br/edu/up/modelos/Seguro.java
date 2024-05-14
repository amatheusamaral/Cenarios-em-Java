package br.edu.up.modelos;

public abstract class Seguro {
    private String numeroApolice;
    private double valorSegurado;

    public Seguro(String numeroApolice, double valorSegurado) {
        this.numeroApolice = numeroApolice;
        this.valorSegurado = valorSegurado;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public abstract String obterTipoSeguro();
}
