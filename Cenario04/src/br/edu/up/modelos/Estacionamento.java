// Estacionamento.java
package br.edu.up.modelos;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
    public static final int NUM_VAGAS = 10; // Torna a constante pública
    private Map<String, Carro> vagas;

    public Estacionamento() {
        this.vagas = new HashMap<>();
    }

    public boolean entrarCarro(Carro carro) {
        if (vagas.size() < NUM_VAGAS) {
            vagas.put(carro.getPlaca(), carro);
            return true;
        }
        return false;
    }

    public Carro sairCarro(String placa) {
        return vagas.remove(placa);
    }

    public int vagasDisponiveis() {
        return NUM_VAGAS - vagas.size();
    }
}
