package escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mario de Jesus
 */
public class ConnectionFactory {

    public Connection conexao() {
        try {
            // String de conexão sem quebra de linha
            return DriverManager.getConnection(
                "jdbc:mysql://localhost/escola", "root", "admin123"
            );
        } catch (SQLException e) {
            // Lança a exceção para facilitar o debug
            throw new RuntimeException("Erro ao conectar ao banco de dados: ", e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Conectando...");
        new ConnectionFactory().conexao();
        System.out.println("Conectado!");
    }
}
