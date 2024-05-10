// Controle.java
package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.tela.Tela;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controle {
    private Tela tela;
    private List<Evento> eventos;
    private List<Reserva> reservas;

    public Controle() {
        this.tela = new Tela();
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void cadastrarEvento() {
        String nome = tela.lerString("Informe o nome do evento");
        Date data = tela.lerData("Informe a data do evento");
        String local = tela.lerString("Informe o local do evento");
        int lotacaoMaxima = tela.lerInteiro("Informe a lotação máxima do evento");
        double precoIngresso = tela.lerDouble("Informe o preço do ingresso");

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventos.add(evento);
        System.out.println("Evento cadastrado com sucesso!");
    }

    public void listarEventos() {
        System.out.println("Lista de Eventos:");
        for (Evento evento : eventos) {
            System.out.println("Nome: " + evento.getNome());
            System.out.println("Data: " + evento.getData());
            System.out.println("Local: " + evento.getLocal());
            System.out.println("Lotação Máxima: " + evento.getLotacaoMaxima());
            System.out.println("Preço do Ingresso: " + evento.getPrecoIngresso());
            System.out.println();
        }
    }

    // Métodos para alterar, excluir e outras operações com eventos

    public void cadastrarReserva() {
        String responsavel = tela.lerString("Informe o nome do responsável pela reserva");
        int quantidadePessoas = tela.lerInteiro("Informe a quantidade de pessoas");
        Date dataReserva = tela.lerData("Informe a data da reserva");

        // Lógica para calcular o valor total da reserva
        // Neste exemplo, considerando que o valor total seja a quantidade de pessoas multiplicada pelo preço do ingresso
        double valorTotal = quantidadePessoas * eventos.get(0).getPrecoIngresso();

        Reserva reserva = new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
        reservas.add(reserva);
        System.out.println("Reserva cadastrada com sucesso!");
    }

    // Métodos para listar, alterar, excluir e outras operações com reservas
}
