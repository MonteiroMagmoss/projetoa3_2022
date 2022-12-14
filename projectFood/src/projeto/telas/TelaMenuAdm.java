
package projeto.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author mmdam
 */
public class TelaMenuAdm extends javax.swing.JFrame {

    /**
     * Creates new form telaMenu
     */
    public TelaMenuAdm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pedidosMenuAdminButton = new javax.swing.JButton();
        usuariosMenuAdminButton = new javax.swing.JButton();
        produtosMenuAdminButton = new javax.swing.JButton();
        editarMaquinaMenuAdminButton = new javax.swing.JButton();
        visualizarCardapioMenuAdminButton = new javax.swing.JButton();
        voltarMenuAdminButton = new javax.swing.JButton();
        sairMenuAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pedidosMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pedidosMenuAdminButton.setText("Pedidos");

        usuariosMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usuariosMenuAdminButton.setText("Usuários");
        usuariosMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMenuAdminButtonActionPerformed(evt);
            }
        });

        produtosMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        produtosMenuAdminButton.setText("Produtos");
        produtosMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosMenuAdminButtonActionPerformed(evt);
            }
        });

        editarMaquinaMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editarMaquinaMenuAdminButton.setText("Editar Máquina");
        editarMaquinaMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMaquinaMenuAdminButtonActionPerformed(evt);
            }
        });

        visualizarCardapioMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        visualizarCardapioMenuAdminButton.setText("Visualizar Cardápio");
        visualizarCardapioMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCardapioMenuAdminButtonActionPerformed(evt);
            }
        });

        voltarMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        voltarMenuAdminButton.setText("Voltar");
        voltarMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuAdminButtonActionPerformed(evt);
            }
        });

        sairMenuAdminButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sairMenuAdminButton.setText("Sair");
        sairMenuAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(voltarMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sairMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pedidosMenuAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(produtosMenuAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editarMaquinaMenuAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usuariosMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(visualizarCardapioMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariosMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtosMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarMaquinaMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedidosMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(visualizarCardapioMenuAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarMenuAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(sairMenuAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosMenuAdminButtonActionPerformed
        EditarUsuarios eu = new EditarUsuarios();
        eu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuariosMenuAdminButtonActionPerformed

    private void sairMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuAdminButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairMenuAdminButtonActionPerformed

    private void voltarMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuAdminButtonActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarMenuAdminButtonActionPerformed

    private void editarMaquinaMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMaquinaMenuAdminButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Esta funcionalidade nao esta funcionando no momento");
    }//GEN-LAST:event_editarMaquinaMenuAdminButtonActionPerformed

    private void produtosMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosMenuAdminButtonActionPerformed
        TelaEditarProduto tep = new TelaEditarProduto();
        tep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_produtosMenuAdminButtonActionPerformed

    private void visualizarCardapioMenuAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCardapioMenuAdminButtonActionPerformed
        TelaVisualizarCardapio tvc = new TelaVisualizarCardapio();
        tvc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_visualizarCardapioMenuAdminButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarMaquinaMenuAdminButton;
    private javax.swing.JButton pedidosMenuAdminButton;
    private javax.swing.JButton produtosMenuAdminButton;
    private javax.swing.JButton sairMenuAdminButton;
    private javax.swing.JButton usuariosMenuAdminButton;
    private javax.swing.JButton visualizarCardapioMenuAdminButton;
    private javax.swing.JButton voltarMenuAdminButton;
    // End of variables declaration//GEN-END:variables
}
