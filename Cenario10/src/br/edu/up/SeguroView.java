package br.edu.up;
import br.edu.up.controles.SeguroController;
import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVida;
import br.edu.up.modelos.SeguroVeiculo;
import java.util.Scanner;


public class SeguroView {
    private SeguroController seguroController;
    private Scanner scanner;

    public SeguroView() {
        seguroController = new SeguroController();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir seguro de vida");
            System.out.println("2. Incluir seguro de veículo");
            System.out.println("3. Localizar seguro");
            System.out.println("4. Excluir seguro");
            System.out.println("5. Excluir todos os seguros");
            System.out.println("6. Listar todos os seguros");
            System.out.println("7. Ver quantidade de seguros");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    incluirSeguroVida();
                    break;
                case 2:
                    incluirSeguroVeiculo();
                    break;
                case 3:
                    localizarSeguro();
                    break;
                case 4:
                    excluirSeguro();
                    break;
                case 5:
                    seguroController.excluirTodosSeguros();
                    break;
                case 6:
                    seguroController.listarTodosSeguros();
                    break;
                case 7:
                    System.out.println("Quantidade de seguros cadastrados: " + seguroController.obterQuantidadeSeguros());
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 8);
    }

    private void incluirSeguroVida() {
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.print("Valor segurado: ");
        double valorSegurado = scanner.nextDouble();
        System.out.print("Idade do segurado: ");
        int idadeSegurado = scanner.nextInt();

        SeguroVida seguroVida = new SeguroVida(numeroApolice, valorSegurado, idadeSegurado);
        seguroController.incluirSeguro(seguroVida);
    }

    private void incluirSeguroVeiculo() {
        scanner.nextLine(); 
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.print("Valor segurado: ");
        double valorSegurado = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Modelo do veículo: ");
        String modeloVeiculo = scanner.nextLine();

        SeguroVeiculo seguroVeiculo = new SeguroVeiculo(numeroApolice, valorSegurado, modeloVeiculo);
        seguroController.incluirSeguro(seguroVeiculo);
    }

    private void localizarSeguro() {
        scanner.nextLine(); 
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.nextLine();
        Seguro seguro = seguroController.buscarSeguro(numeroApolice);
        if (seguro != null) {
            System.out.println("Seguro encontrado:");
            System.out.println("Número da apólice: " + seguro.getNumeroApolice());
            System.out.println("Valor segurado: " + seguro.getValorSegurado());
            System.out.println("Tipo de seguro: " + seguro.obterTipoSeguro());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        scanner.nextLine(); 
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.nextLine();
        seguroController.excluirSeguro(numeroApolice);
    }

    public static void main(String[] args) {
        SeguroView seguroView = new SeguroView();
        seguroView.exibirMenu();
    }
}

