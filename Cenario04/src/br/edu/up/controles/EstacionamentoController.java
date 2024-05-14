package br.edu.up.controles;

import br.edu.up.modelos.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;


public class EstacionamentoController {
    private HashMap<String, Veiculo> vagas;
    public EstacionamentoController() {
        this.vagas = new HashMap<>();
    }
    public class Estacionamento {
        public static final int NUM_VAGAS = 10; 
    
        public Estacionamento() {
            this.vagas = new HashMap<>();
        }
    
        public boolean entrarCarro(Veiculo carro) {
            if (vagas.size() < NUM_VAGAS) {
                vagas.put(carro.getPlaca(), carro);
                return true;
            }
            return false;
        }
    
        public Veiculo sairCarro(String placa) {
            return vagas.remove(placa);
        }
    
        public int vagasDisponiveis() {
            return NUM_VAGAS - vagas.size();
        }
    }
}
