package controller;

import DAO.Turma_AlunoDAO;
import modelo.Turma_Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import escola.ConnectionFactory; // Importa a sua classe de conexão

/**
 * Controller para manipulação de Turma_Aluno.
 * 
 * @author Mario
 */
public class Turma_AlunoControl {

    // Método para adicionar um relacionamento entre aluno e turma
    public void adicionar(int fk_aluno, int fk_turma) {
        Turma_Aluno ta = new Turma_Aluno();
        ta.setFk_aluno(fk_aluno);
        ta.setFk_turma(fk_turma);
        Turma_AlunoDAO d = new Turma_AlunoDAO();
        d.cadTurma_Aluno(ta);
    }

    // Método para listar todos os relacionamentos
    public List<Turma_Aluno> listar(String query) {
        Turma_AlunoDAO d = new Turma_AlunoDAO();
        return d.listarTurma_Aluno(query); // Chama o método do DAO para listar os registros
    }

    // Método para obter o nome de um aluno pelo seu ID
    public String obterNomeAlunoPorId(int id) {
        try (Connection conexao = new ConnectionFactory().conexao()) { // Usa a sua classe ConnectionFactory
            String sql = "SELECT nome FROM aluno WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Exibe o erro para depuração
        }
        return "Desconhecido"; // Caso o ID não seja encontrado
    }
}
