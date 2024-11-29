package controller;

import DAO.AlunoDAO;
import java.util.List;
import modelo.Aluno;

public class AlunoControl {
    public void adicionar(String nome, String data_nasc, int idade, double renda) {
        Aluno a = new Aluno();
        a.setNome(nome);
        a.setData_nasc(data_nasc);
        a.setIdade(idade);
        a.setRenda(renda);
        AlunoDAO d = new AlunoDAO();
        d.cadAluno(a);
    }

    public void alterar(String nome, String data_nasc, int idade, double renda, int id) {
        Aluno a = new Aluno();
        a.setNome(nome);
        a.setData_nasc(data_nasc);
        a.setIdade(idade);
        a.setRenda(renda);
        a.setId(id);
        AlunoDAO d = new AlunoDAO();
        d.alterarAluno(a);
    }

    public void deletar(int id) {
        Aluno a = new Aluno();
        a.setId(id);
        AlunoDAO d = new AlunoDAO();
        d.deleteAluno(a);
    }

    public List<Aluno> listar(String query) {
        AlunoDAO d = new AlunoDAO();
        List<Aluno> alunos = d.listarAluno(query);
        return alunos;
    }
}
