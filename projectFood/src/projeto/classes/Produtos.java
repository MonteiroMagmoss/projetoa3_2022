package projeto.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Produtos {

    private int id_produto;
    private String nome = "";
    private double valor;
    private int tipo;
    private boolean disponibilidade;

    public Produtos() {
    }

    public Produtos(int id_produto, double valor, int tipo, boolean disponibilidade) {
        this.id_produto = id_produto;
        this.valor = valor;
        this.tipo = tipo;
        this.disponibilidade = disponibilidade;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Arrumar toString";
    }

    public void inserirProdutos() {
        // String que contem o query / "query" são os comandos do banco de dados
        String sql = "INSERT INTO tb_produtos (nome, valor, tipo, disponibilidade) VALUES (?, ?, ?, ?)";
        Conexao factory = new Conexao();
        // utilizando try - se nao conseguir se conectar com o banco de dados, fazer oque?
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setString(1, nome); // inserindo no campo nome
            ps.setDouble(2, valor); // inserindo no campo fone
            ps.setInt(3, tipo); // inserindo no campo email
            ps.setBoolean(4, disponibilidade);
            System.out.println(ps); // executando o código acima
            ps.execute();
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar inserir um produto \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }

    public void visualizarProdutos() {
        String sql = "SELECT * FROM tb_produtos"; // alterar campos
        Conexao factory = new Conexao();
        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ResultSet rs = ps.executeQuery(); // nao tem ? - então nao precisa setar nada, só executar
            while (rs.next()) {
                int id_produto = rs.getInt("id_produto");
                String nome = rs.getString("nome");
                double valor = rs.getDouble("valor");
                int tipo = rs.getInt("tipo");
                boolean disponibilidade = rs.getBoolean("disponibilidade");

                String aux = String.format("ID_Produto: %d, Nome: %s, Valor: %s, Tipo: %s, Disponibilidade: %s", id_produto, nome, valor, tipo, disponibilidade);  // %d - digito / %s - string
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar exibir produto \n------------------------");
            e.printStackTrace();
        }
    }

    public void deletarProdutos() {
        String sql = "DELETE FROM tb_produtos WHERE id_produto = ?"; // alterar os campos
        Conexao factory = new Conexao();

        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setInt(1, id_produto);
            ps.execute();
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar remover um produto \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }

    public void alterarProdutos() {

        String sql = "UPDATE tb_produtos SET nome = ?, valor = ?, tipo = ?, disponibilidade = ? WHERE id_produto = ?"; // alterar os campos
        Conexao factory = new Conexao();

        try ( Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // conectando no banco de dados
            ps.setString(1, nome); // inserindo no campo nome
            ps.setDouble(2, valor); // inserindo no campo fone
            ps.setInt(3, tipo); // inserindo no campo email
            ps.setBoolean(4, disponibilidade);
            ps.execute(); // vai pegar o erro real
        } catch (Exception e) {
            System.out.println("------------------------ \nErro ao tentar alterar um produto \n------------------------");
            e.printStackTrace(); // vai pegar o erro real
        }
    }
}
