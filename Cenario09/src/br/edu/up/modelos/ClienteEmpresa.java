package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private static final double MAX_CREDITO = 25000.00;

    public ClienteEmpresa(String nome) {
        super(nome);
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= MAX_CREDITO) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$" + valor + " realizado para " + nome);
        } else {
            System.out.println("Empréstimo excede o limite de crédito para cliente empresa.");
        }
    }

    @Override
    public void devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            System.out.println("Devolução de R$" + valor + " realizado por " + nome);
        } else {
            System.out.println("Valor a ser devolvido excede o valor emprestado por " + nome);
        }
    }
}
