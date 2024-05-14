package br.edu.up;

import br.edu.up.controle.ClienteController;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente pessoa: ");
                    String nomePessoa = scanner.nextLine();
                    clienteController.incluirClientePessoa(nomePessoa);
                    break;
                case 2:
                    System.out.print("Nome do cliente empresa: ");
                    String nomeEmpresa = scanner.nextLine();
                    clienteController.incluirClienteEmpresa(nomeEmpresa);
                    break;
                case 3:
                    System.out.print("Nome do cliente pessoa: ");
                    String nomePessoaConsulta = scanner.nextLine();
                    clienteController.mostrarDadosClientePessoa(nomePessoaConsulta);
                    break;
                case 4:
                    System.out.print("Nome do cliente empresa: ");
                    String nomeEmpresaConsulta = scanner.nextLine();
                    clienteController.mostrarDadosClienteEmpresa(nomeEmpresaConsulta);
                    break;
                case 5:
                    System.out.print("Nome do cliente pessoa: ");
                    String nomePessoaEmprestimo = scanner.nextLine();
                    System.out.print("Valor para emprestar: ");
                    double valorEmprestimoPessoa = scanner.nextDouble();
                    clienteController.emprestarClientePessoa(nomePessoaEmprestimo, valorEmprestimoPessoa);
                    break;
                case 6:
                    System.out.print("Nome do cliente empresa: ");
                    String nomeEmpresaEmprestimo = scanner.nextLine();
                    System.out.print("Valor para emprestar: ");
                    double valorEmprestimoEmpresa = scanner.nextDouble();
                    clienteController.emprestarClienteEmpresa(nomeEmpresaEmprestimo, valorEmprestimoEmpresa);
                    break;
                case 7:
                    System.out.print("Nome do cliente pessoa: ");
                    String nomePessoaDevolucao = scanner.nextLine();
                    System.out.print("Valor para devolver: ");
                    double valorDevolucaoPessoa = scanner.nextDouble();
                    clienteController.devolverClientePessoa(nomePessoaDevolucao, valorDevolucaoPessoa);
                    break;
                case 8:
                    System.out.print("Nome do cliente empresa: ");
                    String nomeEmpresaDevolucao = scanner.nextLine();
                    System.out.print("Valor para devolver: ");
                    double valorDevolucaoEmpresa = scanner.nextDouble();
                    clienteController.devolverClienteEmpresa(nomeEmpresaDevolucao, valorDevolucaoEmpresa);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 9);
        scanner.close();
    }
}
