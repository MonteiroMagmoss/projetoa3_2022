package projeto.classes;


public class Pedido {

    private int id_pedido;
    private int id_produto;
    private int usuario;
    private int qtdProduto;
    private int formaPagamento;
    private double valorTotal;

    public Pedido() {
    }

    public Pedido(int id_pedido, int id_produto, int usuario, int qtdProduto, int formaPagamento, double valorTotal) {
        this.id_pedido = id_pedido;
        this.id_produto = id_produto;
        this.usuario = usuario;
        this.qtdProduto = qtdProduto;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "PArrumar toString";
    }

}
