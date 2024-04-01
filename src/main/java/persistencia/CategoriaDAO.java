package persistencia;

import entidades.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CategoriaDAO {
    public static boolean inserir(Categoria categoria) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "INSERT INTO categoria (nome, tipo) " +
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
    public static boolean alterar(Categoria categoria) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE categoria SET " +
                    "nome = ?, " +
                    "tipo = ? " +
                    "WHERE id = ?";
            PreparedStatement query = con.prepareStatement(sql);
            query.setString(1, categoria.getNome());
            query.setString(2, String.valueOf(categoria.getTipo()));
            query.setInt(3, categoria.getId());
            int nLinhas = query.executeUpdate();
            query.close();
            return nLinhas > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
