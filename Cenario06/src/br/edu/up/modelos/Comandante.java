package br.edu.up.modelos;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    public Comandante(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matricula, int totalHorasVoo) {
        super(nome, rg, aeronave, identificacaoAeronautica, matricula);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }
}
