package br.edu.up.modelos;

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, Aeronave aeronave, String identificadorBagagem, Passagem passagem) {
        super(nome, rg, aeronave);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}
