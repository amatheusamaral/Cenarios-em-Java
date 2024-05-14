package br.edu.up.modelos;

import java.time.LocalDateTime;

public class Passagem {
    private String numeroAssento;
    private String classe;
    private LocalDateTime dataVoo;

    public Passagem(String numeroAssento, String classe, LocalDateTime dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classe = classe;
        this.dataVoo = dataVoo;
    }

    public String getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }
}
