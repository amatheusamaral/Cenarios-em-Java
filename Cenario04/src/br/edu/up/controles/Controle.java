// Controle.java
package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.tela.Tela;

public class Controle {
    private Estacionamento estacionamento;
    private Tela tela;

    public Controle() {
        this.estacionamento = new Estacionamento();
        this.tela = new Tela();
    }

    public void entradaCarro() {
        String modelo = tela.lerString("Informe o modelo do carro");
        String placa = tela.lerString("Informe a placa do carro");
        String cor = tela.lerString("Informe a cor do carro");

        Carro carro = new Carro(modelo, placa, cor);
        if (estacionamento.entrarCarro(carro)) {
            System.out.println("Carro estacionado com sucesso!");
        } else {
            System.out.println("Estacionamento lotado, não é possível estacionar o carro.");
        }
    }

    public void saidaCarro() {
        String placa = tela.lerString("Informe a placa do carro");

        Carro carro = estacionamento.sairCarro(placa);
        if (carro != null) {
            System.out.println("Carro com placa " + placa + " saiu do estacionamento.");
        } else {
            System.out.println("Carro com placa " + placa + " não encontrado no estacionamento.");
        }
    }

    public void relatorio() {
        int vagasDisponiveis = Estacionamento.NUM_VAGAS - estacionamento.vagasDisponiveis();
        int vagasOcupadas = Estacionamento.NUM_VAGAS - vagasDisponiveis;

        System.out.println("Relatório do estacionamento:");
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
        System.out.println("Vagas ocupadas: " + vagasOcupadas);
        System.out.println("Valor a ser pago: R$ " + (vagasOcupadas * 5));
    }
}
