package br.edu.up;

import br.edu.up.controles.AgendaController;
import java.util.Scanner;

public class AgendaView {
    private AgendaController controles;

    public AgendaView(AgendaController controles) {
        this.controles = controles;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir contato pessoal");
            System.out.println("2. Incluir contato comercial");
            System.out.println("3. Excluir contato pelo código");
            System.out.println("4. Consultar contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    controles.adicionarContatoPessoal();
                    break;
                case 2:
                    controles.adicionarContatoComercial();
                    break;
                case 3:
                    System.out.print("Digite o código do contato a ser excluído: ");
                    int codigoExclusao = scanner.nextInt();
                    controles.excluirContato(codigoExclusao);
                    break;
                case 4:
                    System.out.print("Digite o código do contato a ser consultado: ");
                    int codigoConsulta = scanner.nextInt();
                    controles.consultarContato(codigoConsulta);
                    break;
                case 5:
                    controles.listarContatos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }
}
