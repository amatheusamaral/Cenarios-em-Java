package br.edu.up.modelos;

public class SeguroVida extends Seguro {
    private int idadeSegurado;

    public SeguroVida(String numeroApolice, double valorSegurado, int idadeSegurado) {
        super(numeroApolice, valorSegurado);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    @Override
    public String obterTipoSeguro() {
        return "Seguro de Vida";
    }
}
