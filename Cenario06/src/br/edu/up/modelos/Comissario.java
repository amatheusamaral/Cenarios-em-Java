package br.edu.up.modelos;

import java.util.List;

public class Comissario extends Tripulacao {
    private List<String> idiomas;

    public Comissario(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matricula, List<String> idiomas) {
        super(nome, rg, aeronave, identificacaoAeronautica, matricula);
        this.idiomas = idiomas;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
}
