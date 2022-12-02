package projeto.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {

    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private int tipo;
    private String apelido;

    public Usuario() {
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(int id_usuario, String nome, String email, String senha, int tipo, String apelido) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.apelido = apelido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Arrumar toString";
    }

    public void selecionarProdutos() {
    }

    public void realizarPedido() {
    }

    public void efetuarPagamento() {
    }

    public void visualizarPedidos() {
    }

    public void atenderPedidos() {
    }

    public void visualizarUsuarios() {
        String sql = "SELECT * FROM tb_pessoa"; // alterar campos
        Conexao factory = new Conexao();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ResultSet rs = ps.executeQuery(); // nao tem ? - então nao precisa setar nada, só executar
            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                int tipo = rs.getInt("tipo");
                String apelido = rs.getString("apelido");
                String aux = String.format("ID_Usuario: %d, Nome: %s, Email: %s, Senha: %s, tipo: %s, Apelido: %s", id_usuario, nome, email, senha, tipo, apelido);  // %d - digito / %s - string
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar exibir usuarios \n------------------------");
            e.printStackTrace();
        }
    }

    public void inserirUsuarios() {
        // String que contem o query / "query" são os comandos do banco de dados
        String sql = "INSERT INTO tb_usuario(nome, email, senha, tipo, apelido) VALUES (?, ?, ?, ?, ?)";
        Conexao factory = new Conexao();
        // utilizando try - se nao conseguir se conectar com o banco de dados, fazer oque?
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setString(1, nome); // inserindo no campo nome
            ps.setString(2, email); // inserindo no campo fone
            ps.setString(3, senha); // inserindo no campo email
            ps.setInt(4, tipo);
            ps.setString(5, apelido);
            System.out.println(ps); // executando o código acima
            ps.execute();
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar inserir um usuario \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }

    public void deletarUsuarios() {
        String sql = "DELETE FROM tb_usuario WHERE id_usuario = ?"; // alterar os campos
        Conexao factory = new Conexao();

        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setInt(1, id_usuario);
            ps.execute();
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar remover um usuario \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }

    public void alterarUsuarios() {
        String sql = "UPDATE tb_usuario SET nome = ?, email = ?, senha = ?, tipo = ?, apelido = ? WHERE id_usuario = ?"; // alterar os campos
        Conexao factory = new Conexao();

        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setString(1, nome); // inserindo no campo nome
            ps.setString(2, email); // inserindo no campo fone
            ps.setString(3, senha); // inserindo no campo email
            ps.setInt(4, tipo);
            ps.setString(5, apelido);
            ps.execute(); // vai pegar o erro real
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar alterar um usuario \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }


}
