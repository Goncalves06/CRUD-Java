package DAO;

import escola.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Turma;

public class TurmaDAO {
    private Connection c;

    public TurmaDAO() {
        this.c = new ConnectionFactory().conexao();
    }

    public void cadTurma(Turma t) {
        try {
            String sql = "INSERT INTO turma (descricao) VALUES (?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, t.getDescricao());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarTurma(Turma t) {
        try {
            String sql = "UPDATE turma SET descricao = ? WHERE id = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, t.getDescricao());
            stmt.setInt(2, t.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTurma(Turma t) {
        try {
            String sql = "DELETE FROM turma WHERE id = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, t.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Turma> listarTurma(String query) {
        try {
            String sql = "SELECT * FROM turma " + query;
            List<Turma> turmas = new ArrayList<>();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Turma t = new Turma();
                t.setId(rs.getInt("id"));
                t.setDescricao(rs.getString("descricao"));
                turmas.add(t);
            }
            rs.close();
            stmt.close();
            return turmas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
