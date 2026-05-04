import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USUARIO = "root";
    private static final String SENHA = "SenhadoRoot"; // Altere se a sua senha for diferente

    public static Connection obterConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
