
package projectfood;

/**
 *
 * @author 821216972
 */
public class pedido {
    private Integer id_pedido, qntPedidos, formaPagamento;
    //private String nomeProduto;
    private Double valorTotal;

    
    pedido(){
        System.out.println(" Criando Pedido... ");
    }
    pedido(Integer id_pedido, Integer qntPedidos,Integer formaPagamento, Double valorTotal){
        
        //adm = 1;
        //funcionario = 2;
        //cliente = 3;
        
        
        
        System.out.println("Criando seu Pedido... ");
        
        infopedido(id_pedido, qntPedidos, formaPagamento, valorTotal);
        
        
        
    }
    
    public void statusVars(){
        System.out.println( " Id " + this.id_pedido
                            + " Quantidade de Produtos " + this.qntPedidos 
                            + " Forma de Pagamento " + this.formaPagamento 
                            + " Valor a ser pago " + this.valorTotal);
    }
    
    private void infopedido(Integer id_pedido, Integer qntPedidos,Integer formaPagamento, Double valorTotal){
        
        
        this.id_pedido = id_pedido;
        this.qntPedidos = qntPedidos;
        this.formaPagamento = formaPagamento;
        
        if (this.formaPagamento == 1 ){
            //this.tipoUsuario = adm;
            System.out.println("Credito... ");
            
        } if(this.formaPagamento == 2 ){
           // this.tipoUsuario = funcionario;
            System.out.println("Debito.... ");
            
        } if(this.formaPagamento == 3 ){
           // this.tipoUsuario = cliente;
            System.out.println("PIX... ");
            
        } if(this.formaPagamento<1&this.formaPagamento>3){
            System.out.println("Pagamento Indisponivel ou nao liberado... ");
        }
        
        this.valorTotal = valorTotal;
        
    }
    
}
