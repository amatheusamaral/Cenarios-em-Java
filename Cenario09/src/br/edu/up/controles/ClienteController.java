package br.edu.up.controles;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.ClienteEmpresa;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public void incluirClientePessoa(String nome) {
        clientes.add(new ClientePessoa(nome));
        System.out.println("Cliente pessoa " + nome + " incluído com sucesso.");
    }

    public void incluirClienteEmpresa(String nome) {
        clientes.add(new ClienteEmpresa(nome));
        System.out.println("Cliente empresa " + nome + " incluído com sucesso.");
    }

    public void mostrarDadosClientePessoa(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getNome().equals(nome)) {
                System.out.println("Nome: " + cliente.getNome() + ", Valor emprestado: R$" + cliente.getVlrEmprestado());
                return;
            }
        }
        System.out.println("Cliente pessoa não encontrado.");
    }

    public void mostrarDadosClienteEmpresa(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getNome().equals(nome)) {
                System.out.println("Nome: " + cliente.getNome() + ", Valor emprestado: R$" + cliente.getVlrEmprestado());
                return;
            }
        }
        System.out.println("Cliente empresa não encontrado.");
    }

    public void emprestarClientePessoa(String nome, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getNome().equals(nome)) {
                cliente.emprestar(valor);
                return;
            }
        }
        System.out.println("Cliente pessoa não encontrado.");
    }

    public void emprestarClienteEmpresa(String nome, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getNome().equals(nome)) {
                cliente.emprestar(valor);
                return;
            }
        }
        System.out.println("Cliente empresa não encontrado.");
    }

    public void devolverClientePessoa(String nome, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getNome().equals(nome)) {
                cliente.devolver(valor);
                return;
            }
        }
        System.out.println("Cliente pessoa não encontrado.");
    }

    public void devolverClienteEmpresa(String nome, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getNome().equals(nome)) {
                cliente.devolver(valor);
                return;
            }
        }
        System.out.println("Cliente empresa não encontrado.");
    }
}
