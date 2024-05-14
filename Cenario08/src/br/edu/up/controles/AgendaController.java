package br.edu.up.controles;

import br.edu.up.model.Contato;
import br.edu.up.model.ContatoPessoal;
import br.edu.up.model.ContatoComercial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaController {
    private List<Contato> contatos;
    private Scanner scanner;

    public AgendaController() {
        contatos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarContatoPessoal() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        contatos.add(new ContatoPessoal(nome, telefone, email));
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    public void adicionarContatoComercial() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();

        contatos.add(new ContatoComercial(nome, telefone, empresa));
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    public void excluirContato(int codigo) {
        boolean removido = false;
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                contatos.remove(contato);
                removido = true;
                break;
            }
        }
        if (removido) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                System.out.println(contato);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
