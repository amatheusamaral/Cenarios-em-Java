package br.edu.up.modelos;

public class Compromisso {
    private String pessoa;
    private String local;
    private int hora;
    private int dia;
    private int mes;

    public Compromisso(String pessoa, String local, int hora, int dia, int mes) {
        this.pessoa = pessoa;
        this.local = local;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
    }

    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public int getHora() {
        return hora;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "compromisso [pessoa=" + pessoa + ", local=" + local + ", hora=" + hora + ", dia=" + dia + ", mes="
                + mes + "]";
    }
}
