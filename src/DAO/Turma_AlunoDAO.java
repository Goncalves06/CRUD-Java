package DAO;

import escola.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Turma_Aluno;

public class Turma_AlunoDAO {
    private Connection c;

    public Turma_AlunoDAO() {
        this.c = new ConnectionFactory().conexao();
    }

    public void cadTurma_Aluno(Turma_Aluno ta) {
        try {
            String sql = "INSERT INTO turma_aluno (fk_aluno, fk_turma) VALUES (?, ?);";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ta.getFk_aluno());
            stmt.setInt(2, ta.getFk_turma());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para listar Turma_Aluno
    public List<Turma_Aluno> listarTurma_Aluno(String query) {
        List<Turma_Aluno> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM turma_aluno"; // Aqui você pode adicionar filtros à query, se necessário
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Turma_Aluno ta = new Turma_Aluno();
                ta.setFk_aluno(rs.getInt("fk_aluno"));
                ta.setFk_turma(rs.getInt("fk_turma"));
                lista.add(ta);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
