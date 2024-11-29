package controller;

import DAO.TurmaDAO;
import java.util.List;
import modelo.Turma;

/**
 * @author Mario
 */
public class TurmaControl {

    public void adicionar(String descricao) {
        Turma t = new Turma();
        t.setDescricao(descricao);
        TurmaDAO d = new TurmaDAO();
        d.cadTurma(t);
    }

    public void alterar(String descricao, int id) {
        Turma t = new Turma();
        t.setDescricao(descricao);
        t.setId(id);
        TurmaDAO d = new TurmaDAO();
        d.alterarTurma(t);
    }

    public void deletar(int id) {
        Turma t = new Turma();
        t.setId(id);
        TurmaDAO d = new TurmaDAO();
        d.deleteTurma(t);
    }

    public List<Turma> listar(String query) {
        TurmaDAO d = new TurmaDAO();
        List<Turma> turmas = d.listarTurma(query);
        return turmas;
    }
}
