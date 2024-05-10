package br.edu.up.modelos;

public class Ponto {
    private double x;
    private double y;

    // Construtor para criar um ponto na origem (0,0)
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor para criar um ponto nas coordenadas (x, y)
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters para obter os valores de x e y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Métodos setters para alterar os valores de x e y
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outroPonto) {
        double distanciaX = this.x - outroPonto.getX();
        double distanciaY = this.y - outroPonto.getY();
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }
}
