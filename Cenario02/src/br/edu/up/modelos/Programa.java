package br.edu.up.modelos;

public class Programa {
    public static void main(String[] args) {
        // 1. Crie um objeto ponto1 usando o primeiro construtor;
        Ponto ponto1 = new Ponto();

        // 2. Crie um objeto ponto2 na posição (2,5);
        Ponto ponto2 = new Ponto(2, 5);

        // 3. Calcule a distância do ponto1 ao ponto2;
        double distanciaP1P2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distanciaP1P2);

        // 4. Calcule a distância do ponto2 às coordenadas (7,2);
        Ponto ponto3 = new Ponto(7, 2);
        double distanciaP2P3 = ponto2.calcularDistancia(ponto3);
        System.out.println("Distância do ponto2 às coordenadas (7,2): " + distanciaP2P3);

        // 5. Altere o valor de x para 10 no ponto1;
        ponto1.setX(10);

        // 6. Altere o valor de y para 3 no ponto1;
        ponto1.setY(3);
    }
}
