
package projectfood;

/**
 *
 * @author 821216972
 */
public class ProjectFood {

    
    public static void main(String[] args) {
        
        
        
        usuario usu1 = new usuario();
        //usu1.statusVars();
        
        usuario usu2 = new usuario(1,"Cleber", "hotmail.com", 3, 12321);
        usu2.statusVars();
        
        usuario usu3 = new usuario(2,"Kratos","gmail.com",2,1232);
        usu3.statusVars();
        
        usuario usu4 = new usuario(3,"Tobi","yahoo.com",1,3042);
        usu4.statusVars();
        
        
        
        
        produto prod1 = new produto();
        //prod1.statusVars();
        
        
        produto prod2 = new produto(1,"XBaccon",1,10.00,true);
        prod2.statusVars();
        
        produto prod3 = new produto(2,"CocaCola",2,5.00,false);
        prod3.statusVars();
        
        
        
        pedido ped1 = new pedido();
        //ped1.statusVars();
        
        pedido ped2 = new pedido(1,10,3,50.00);
        ped2.statusVars();
        
        //usuarioCaixa v = new usuarioCaixa();
        //v.visualizarPedido();
        
        
        
    }
    
    
}
