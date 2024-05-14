package br.edu.up;

import br.edu.up.controles.AgendaController;
import br.edu.up.tela.AgendaView;

public class Programa {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView(controller);
        view.exibirMenu();
    }
}
