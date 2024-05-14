package br.edu.up.controles;
import br.edu.up.modelos.Seguro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeguroController {
    private List<Seguro> seguros;
    private Scanner scanner;

    public SeguroController() {
        seguros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void incluirSeguro(Seguro seguro) {
        if (buscarSeguro(seguro.getNumeroApolice()) != null) {
            System.out.println("Número da apólice já existe. Seguro não incluído.");
        } else {
            seguros.add(seguro);
            System.out.println("Seguro incluído com sucesso.");
        }
    }

    public Seguro buscarSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                return seguro;
            }
        }
        return null;
    }

    public void excluirSeguro(String numeroApolice) {
        Seguro seguro = buscarSeguro(numeroApolice);
        if (seguro != null) {
            seguros.remove(seguro);
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    public void excluirTodosSeguros() {
        System.out.println("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String confirmacao = scanner.nextLine().toUpperCase();
        if (confirmacao.equals("S")) {
            seguros.clear();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    public void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados.");
        } else {
            System.out.println("Lista de seguros:");
            for (Seguro seguro : seguros) {
                System.out.println("Número da apólice: " + seguro.getNumeroApolice() +
                        ", Valor segurado: " + seguro.getValorSegurado() +
                        ", Tipo de seguro: " + seguro.obterTipoSeguro());
            }
        }
    }

    public int obterQuantidadeSeguros() {
        return seguros.size();
    }
}
