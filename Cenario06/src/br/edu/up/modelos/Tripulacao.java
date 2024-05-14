package br.edu.up.modelos;

public abstract class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matricula;

    public Tripulacao(String nome, String rg, Aeronave aeronave, String identificacaoAeronautica, String matricula) {
        super(nome, rg, aeronave);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matricula = matricula;
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
