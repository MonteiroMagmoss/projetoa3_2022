
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
    
    
}
