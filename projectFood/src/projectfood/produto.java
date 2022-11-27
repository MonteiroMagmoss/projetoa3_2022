
package projectfood;

/**
 *
 * @author 821216972
 */
public class produto {
    private Integer id_produto, tipoProduto;
    private String nomeProduto;
    private Double valorProduto;
    private Boolean disponibilidade;
    public enum produtos{SANDUICHE,PORCAO, BEBIDA, SOBREMESA, ACOMPANHAMENTO}
    private produtos tipo;

    
    produto(){
        System.out.println(" Criando produto padrao... ");
    }
    produto(Integer id_produto, String nomeProduto, Integer tipoProduto, Double valorProduto, Boolean disponibilidade){
        
        //adm = 1;
        //funcionario = 2;
        //cliente = 3;
        
        
        
        System.out.println("Criando produto... ");
        
        infoprod(id_produto, nomeProduto, tipoProduto, valorProduto, disponibilidade);
        
        
        
    }
    
    public void statusVars(){
        System.out.println( " Id " + this.id_produto 
                            + " Nome " + this.nomeProduto 
                            + " Tipo de Produto " + this.tipoProduto 
                            + " Valor " + this.valorProduto 
                            + " Disponibilidade " + this.disponibilidade);
    }
    
    private void infoprod(int id_produto, String nomeProduto, int tipoProduto, Double valorProduto, Boolean disponibilidade){
        
        
        this.id_produto = id_produto;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
        
        if (this.tipoProduto == 1 ){
            //this.tipoUsuario = adm;
            System.out.println("Criando Sanduiche... ");
            
        } if(this.tipoProduto == 2 ){
           // this.tipoUsuario = funcionario;
            System.out.println("Criando Bebida.... ");
            
        } if(this.tipoProduto == 3 ){
           // this.tipoUsuario = cliente;
            System.out.println("Criando Acompanhamento... ");
            
        } if(this.tipoProduto<1&this.tipoProduto>3){
            System.out.println("Produto Inexistente... ");
        }
        
        this.disponibilidade = disponibilidade;
        
    }
    
}
