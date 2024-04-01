package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/java2";
    private static final String user = "root";
    private static final String password = "";
    public static Connection getConexao() {
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            return c;
        } catch (Exception e) {
            return null;
        }
    }
}
