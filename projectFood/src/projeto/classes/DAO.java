package projeto.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    public boolean existeUsuario(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try ( Connection conn = Conexao.obtemConexao();  
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public boolean descobrirTipo(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE id_usuario = ? AND tipo = ?";
        try ( Connection conn = Conexao.obtemConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, usuario.getId_usuario());
            ps.setInt(2, usuario.getTipo());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public boolean existeProduto(Produtos produto) throws Exception {
        String sql = "SELECT * FROM tb_produtos WHERE nome = ? AND senha = ?";
        try ( Connection conn = Conexao.obtemConexao();  
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValor());
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

//    public List<Produtos> buscaProdutos(Produtos produtos) throws Exception {
//        String sql = "SELECT * FROM tb_produtos WHERE id_curso=  ?";
//        List<Produtos> produtos = new ArrayList<>();
//        try ( Connection conexao = Conexao.obtemConexao();  
//            PreparedStatement ps = conexao.prepareStatement(sql)) {
////            ps.setInt(1, curso.getId());
//            try ( ResultSet rs = ps.executeQuery()) {
//                while (rs.next()) {
//                    int ra = rs.getInt("ra");
//                    String nome = rs.getString("nome");
//                    int anoNascimento = rs.getInt("ano_nascimento");
//                    produtos.add(new Produtos());
//                }
//            }
//        }
//        return produtos;
//    }
}
