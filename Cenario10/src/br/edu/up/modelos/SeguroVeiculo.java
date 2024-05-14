package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro {
    private String modeloVeiculo;

    public SeguroVeiculo(String numeroApolice, double valorSegurado, String modeloVeiculo) {
        super(numeroApolice, valorSegurado);
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    @Override
    public String obterTipoSeguro() {
        return "Seguro de Veículo";
    }
}
