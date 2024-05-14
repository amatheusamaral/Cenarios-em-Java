package br.edu.up.tela;
import br.edu.up.controles.PessoaController;
import br.edu.up.modelos.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private PessoaController controller;

    public Menu() {
        controller = new PessoaController();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulação");
            System.out.println("3. Listar Pessoas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPassageiro(scanner);
                    break;
                case 2:
                    adicionarTripulacao(scanner);
                    break;
                case 3:
                    listarPessoas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private void adicionarPassageiro(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Identificador de Bagagem: ");
        String identificadorBagagem = scanner.next();
        System.out.print("Número do Assento: ");
        String numeroAssento = scanner.next();
        System.out.print("Classe: ");
        String classe = scanner.next();
        LocalDateTime dataVoo = LocalDateTime.now(); // Apenas para exemplo

        Aeronave aeronave = new Aeronave("123", "Boeing", 150);
        Passagem passagem = new Passagem(numeroAssento, classe, dataVoo);
        Passageiro passageiro = new Passageiro(nome, rg, aeronave, identificadorBagagem, passagem);

        controller.adicionarPessoa(passageiro);
    }

    private void adicionarTripulacao(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.next();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        Aeronave aeronave = new Aeronave("123", "Boeing", 150);

        System.out.println("1. Adicionar Comandante");
        System.out.println("2. Adicionar Comissário");
        int tipoTripulacao = scanner.nextInt();

        if (tipoTripulacao == 1) {
            System.out.print("Total de Horas de Voo: ");
            int totalHorasVoo = scanner.nextInt();
            Comandante comandante = new Comandante(nome, rg, aeronave, identificacaoAeronautica, matricula, totalHorasVoo);
            controller.adicionarPessoa(comandante);
        } else if (tipoTripulacao == 2) {
            System.out.print("Idiomas (separados por vírgula): ");
            scanner.nextLine(); 
            String idiomas = scanner.nextLine();
            Comissario comissario = new Comissario(nome, rg, aeronave, identificacaoAeronautica, matricula, Arrays.asList(idiomas.split(",")));
            controller.adicionarPessoa(comissario);
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void listarPessoas() {
        for (Pessoa pessoa : controller.listarPessoas()) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getRg());
        }
    }
}
