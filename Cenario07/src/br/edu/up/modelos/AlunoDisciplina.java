package br.edu.up.modelos;

public class AlunoDisciplina {
    private Aluno aluno;
    private boolean competenciaNecessariaAtingida;
    private boolean competenciaComplementarAtingida;

    public AlunoDisciplina(Aluno aluno, boolean competenciaNecessariaAtingida, boolean competenciaComplementarAtingida) {
        this.aluno = aluno;
        this.competenciaNecessariaAtingida = competenciaNecessariaAtingida;
        this.competenciaComplementarAtingida = competenciaComplementarAtingida;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isCompetenciaNecessariaAtingida() {
        return competenciaNecessariaAtingida;
    }

    public void setCompetenciaNecessariaAtingida(boolean competenciaNecessariaAtingida) {
        this.competenciaNecessariaAtingida = competenciaNecessariaAtingida;
    }

    public boolean isCompetenciaComplementarAtingida() {
        return competenciaComplementarAtingida;
    }

    public void setCompetenciaComplementarAtingida(boolean competenciaComplementarAtingida) {
        this.competenciaComplementarAtingida = competenciaComplementarAtingida;
    }

    public String avaliarSituacao() {
        if (competenciaNecessariaAtingida && competenciaComplementarAtingida) {
            return "Aprovado";
        } else if (!competenciaNecessariaAtingida || !competenciaComplementarAtingida) {
            return "Reprovado";
        } else {
            return "Pendente";
        }
    }
}
