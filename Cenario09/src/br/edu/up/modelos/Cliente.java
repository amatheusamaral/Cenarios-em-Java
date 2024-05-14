package br.edu.up.modelos;

public abstract class Cliente {
    protected String nome;
    protected double vlrEmprestado;

    public Cliente(String nome) {
        this.nome = nome;
        this.vlrEmprestado = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);
}
