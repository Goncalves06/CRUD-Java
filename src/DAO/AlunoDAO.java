package DAO;

import escola.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

public class AlunoDAO {
    private Connection c;

    public AlunoDAO() {
        this.c = new ConnectionFactory().conexao();
    }

    public void cadAluno(Aluno a) {
        try {
            String sql = "INSERT INTO aluno (nome, data_nasc, idade, renda) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getData_nasc());
            stmt.setInt(3, a.getIdade());
            stmt.setDouble(4, a.getRenda());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterarAluno(Aluno a) {
        try {
            String sql = "UPDATE aluno SET nome=?, data_nasc=?, idade=?, renda=? WHERE id=?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getData_nasc());
            stmt.setInt(3, a.getIdade());
            stmt.setDouble(4, a.getRenda());
            stmt.setInt(5, a.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAluno(Aluno a) {
        try {
            String sql = "DELETE FROM aluno WHERE id=?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, a.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Aluno> listarAluno(String query) {
        try {
            String sql = "SELECT * FROM aluno " + query;
            List<Aluno> alunos = new ArrayList<>();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setData_nasc(rs.getString("data_nasc"));
                a.setIdade(rs.getInt("idade"));
                a.setRenda(rs.getDouble("renda"));
                alunos.add(a);
            }

            rs.close();
            stmt.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
