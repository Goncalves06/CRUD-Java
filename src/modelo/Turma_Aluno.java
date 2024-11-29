package modelo;

public class Turma_Aluno {
    private int fk_aluno;
    private int fk_turma;
    private Aluno aluno;
    private Turma turma;

    public int getFk_aluno() {
        return fk_aluno;
    }

    public void setFk_aluno(int fk_aluno) {
        this.fk_aluno = fk_aluno;
    }

    public int getFk_turma() {
        return fk_turma;
    }

    public void setFk_turma(int fk_turma) {
        this.fk_turma = fk_turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}