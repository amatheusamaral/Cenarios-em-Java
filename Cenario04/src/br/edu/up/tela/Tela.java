// Tela.java
package br.edu.up.tela;

import java.util.Scanner;

public class Tela {
    private Scanner scanner;

    public Tela() {
        this.scanner = new Scanner(System.in);
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem + ": ");
        return scanner.nextLine();
    }
}
