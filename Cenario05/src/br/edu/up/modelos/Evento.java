// Evento.java
package br.edu.up.modelos;

import java.util.Date;

public class Evento {
    private String nome;
    private Date data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nome, Date data, String local, int lotacaoMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
}
