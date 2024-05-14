package br.edu.up.modelos;

import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<String> competenciasNecessarias;
    private List<String> competenciasComplementares;
    private Professor professor;
    private List<AlunoDisciplina> alunos;

    public Disciplina(String nome, String identificador, String curriculo, List<String> competenciasNecessarias,
                      List<String> competenciasComplementares, Professor professor, List<AlunoDisciplina> alunos) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competenciasNecessarias = competenciasNecessarias;
        this.competenciasComplementares = competenciasComplementares;
        this.professor = professor;
        this.alunos = alunos;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public List<String> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void setCompetenciasNecessarias(List<String> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public List<String> getCompetenciasComplementares() {
        return competenciasComplementares;
    }

    public void setCompetenciasComplementares(List<String> competenciasComplementares) {
        this.competenciasComplementares = competenciasComplementares;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<AlunoDisciplina> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoDisciplina> alunos) {
        this.alunos = alunos;
    }
}
