/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectfood;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class testeTabela {
    public static void main(String args[]){
        String[] titulos = {"nome", "idade", "sexo", "endereco"};
        Object[][] dados = {
            {"a", 221, 'F', "Rua Xsad, 25"},
            {"s", 2242, 'M', "Rua 13sad, 123"},
            {"e", 2240, 'M', "Rua 25sda, 567"},
            {"q", 2241, 'F', "Rua X, 25"},
            {"s", 22, 'M', "Rua 13,asd 123"},
            {"z", 2240, 'M', "Rua 25, 567"},
            {"x", 21, 'F', "Rua X, 25"},
            {"c", 222, 'M', "Rua 13,sad 123"},
            {"v", 20, 'M', "Rua 25, 567"},
            {"n", 241, 'F', "Rua X, sda25"},
            {"b", 22, 'M', "Rua 13, 123"},
            {"m", 220, 'M', "Rua 25,sda 567"},
            {".", 21, 'F', "Rua X, 25"},
            {",", 222, 'M', "Rua 13, 123"},
            {"d", 2470, 'M', "Rua 25ads, 567"},
            {"y", 271, 'F', "Rua X, 25"},
            {"u", 22, 'M', "Rua 13, 123"},
            {"o", 2890, 'M', "Rua 25,asd 567"},
            {"i", 28971, 'F', "Rua X, 25"},
            {"fa", 27892, 'M', "Rua 13, 123"},
            {"p", 280, 'M', "Rua 25, 5asd67"},
            {"Ana", 281, 'F', "Rua X, 25"},
            {"Giqql", 252, 'M', "Rua 13, 123"},
            {"Joao", 20, 'M', "Rua 25, 567"},
            {"Ana", 216, 'F', "Rua X, 25"},
            {"Gadsdasil", 622, 'M', "Rua 13, 123"},
            {"sda", 20, 'M', "Rua 25, 567"},
            {"fa", 21, 'F', "Rua X, 25"},
            {"dsa", 22, 'M', "Rua 13, 123"},
            {"sfad", 270, 'M', "Rua 25, 567"},
            {"Ana", 21, 'F', "Rua X, 25"},
            {"asdf", 22, 'M', "Rua 13, 123"},
            {"Joao", 20, 'M', "Rua 25, 567"},
            {"fsa", 21, 'F', "Rua X, 25"},
            {"Gil", 22, 'M', "Rua 13, 123"},
            {"Jofasfao", 20, 'M', "Rua 25, 567"},
            {"Ana", 21, 'F', "Rua X, 25"},
            {"fa", 22, 'M', "Rua 13, 123"},
            {"sfa", 20, 'M', "Rua 25, 567"},
            {"fasd", 21, 'F', "Rua X, 25"},
            {"fas", 22, 'M', "Rua 13, 123"},
            {"Joao", 20, 'M', "Rua 25, 567"}
            
        };
        JTable table = new JTable (dados, titulos);
        
        //caso seja necessária a rolagem 
        JScrollPane scrollPane = new JScrollPane(table);
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
