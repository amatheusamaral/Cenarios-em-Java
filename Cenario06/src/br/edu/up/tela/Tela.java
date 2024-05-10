
package br.edu.up.tela;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Tela {
    private Scanner scanner;
    private SimpleDateFormat dateFormat;

    public Tela() {
        this.scanner = new Scanner(System.in);
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    }

    public String lerString(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }

    public Date lerData(String mensagem) {
        System.out.println(mensagem);
        try {
            return dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
            return null;
        }
    }
}
