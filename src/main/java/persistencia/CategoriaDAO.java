package persistencia;

import entidades.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CategoriaDAO {
    public static boolean inserir(Categoria categoria) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "INSERT INTO categoria (nome, tipo)" +
                        "VALUES (?, ?)";
            PreparedStatement query = conexao.prepareStatement(sql);
            query.setString(1, categoria.getNome());
            query.setString(2, String.valueOf(categoria.getTipo()));
            query.execute();
            query.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
