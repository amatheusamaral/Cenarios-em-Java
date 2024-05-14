package br.edu.up.modelos;

public class Programa {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double distanciaP1P2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distanciaP1P2);

        Ponto ponto3 = new Ponto(7, 2);
        double distanciaP2P3 = ponto2.calcularDistancia(ponto3);
        System.out.println("Distância do ponto2 às coordenadas (7,2): " + distanciaP2P3);

        ponto1.setX(10);

        ponto1.setY(3);
    }
}
