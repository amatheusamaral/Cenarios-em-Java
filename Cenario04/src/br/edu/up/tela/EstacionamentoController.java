package br.edu.up.tela;

import java.util.Scanner;

public class EstacionamentoController {
    private int vagasDisponiveis = 10;
    private int veiculosEstacionados = 0;
    private double valorTotalPeriodo = 0;
    private final double VALOR_POR_PERIODO = 5.0;
    private Scanner scanner = new Scanner(System.in);

    public void registrarEntrada() {
        if (vagasDisponiveis > 0) {
            System.out.println("Digite o modelo do veículo:");
            String modelo = scanner.nextLine();
            System.out.println("Digite a placa do veículo:");
            String placa = scanner.nextLine();
            System.out.println("Digite a cor do veículo:");
            String cor = scanner.nextLine();

            System.out.println("Veículo registrado com sucesso!");
            vagasDisponiveis--; // Reduz o número de vagas disponíveis
            veiculosEstacionados++; // Aumenta o número de veículos estacionados
        } else {
            System.out.println("O estacionamento está lotado. Não é possível registrar a entrada.");
        }
    }

    public void registrarSaida() {
        if (veiculosEstacionados > 0) {
            System.out.println("Digite a placa do veículo que está saindo:");
            String placa = scanner.nextLine();

            System.out.println("Veículo com placa " + placa + " saiu do estacionamento.");
            veiculosEstacionados--; // Reduz o número de veículos estacionados
        } else {
            System.out.println("Não há veículos estacionados para registrar a saída.");
        }
    }

    public void emitirRelatorio() {
        System.out.println("Relatório do período:");
        System.out.println("Veículos que entraram: " + (10 - vagasDisponiveis));
        System.out.println("Veículos que saíram: " + (10 - vagasDisponiveis - veiculosEstacionados));
        double valorTotal = (10 - vagasDisponiveis - veiculosEstacionados) * VALOR_POR_PERIODO;
        System.out.println("Valor total arrecadado no período: R$" + valorTotal);
        valorTotalPeriodo += valorTotal; // Atualiza o valor total arrecadado
    }
}

 