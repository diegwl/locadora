package persistencia;

import entidades.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
    public static boolean excluir(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, id);
            int nLinhas = query.executeUpdate();
            query.close();
            return nLinhas > 0;
        } catch (Exception e) {
            return false;
        }
    }
    public static ArrayList<Categoria> listar() {
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM categoria";
            Statement query = con.createStatement();
            ResultSet res = query.executeQuery(sql);
            while (res.next()) {
                Categoria c = new Categoria(res.getInt("id"), res.getString("nome"), res.getString("tipo").charAt(0));
                categorias.add(c);
            }
            res.close();
            query.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return categorias;
    }
}
