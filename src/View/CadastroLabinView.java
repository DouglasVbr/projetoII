/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class CadastroLabinView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLabinView
     */
    public CadastroLabinView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDLabin = new javax.swing.JTextField();
        txtNomeLabin = new javax.swing.JTextField();
        txtLocalLabin = new javax.swing.JTextField();
        btnCriarLabin = new javax.swing.JButton();
        btnLerLabin = new javax.swing.JButton();
        btnAtualizarLabin = new javax.swing.JButton();
        btnExcluirLabin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Laborátorio");

        jLabel2.setText("Nome Laborátorio");

        jLabel3.setText("Local Laborátorio");

        txtIDLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDLabinActionPerformed(evt);
            }
        });

        txtNomeLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLabinActionPerformed(evt);
            }
        });

        txtLocalLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalLabinActionPerformed(evt);
            }
        });

        btnCriarLabin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aba.png"))); // NOI18N
        btnCriarLabin.setText("CRIAR");
        btnCriarLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarLabinActionPerformed(evt);
            }
        });

        btnLerLabin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/livro.png"))); // NOI18N
        btnLerLabin.setText("LER");
        btnLerLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerLabinActionPerformed(evt);
            }
        });

        btnAtualizarLabin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atualizada.png"))); // NOI18N
        btnAtualizarLabin.setText("ATUALIZAR");
        btnAtualizarLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarLabinActionPerformed(evt);
            }
        });

        btnExcluirLabin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excluir.png"))); // NOI18N
        btnExcluirLabin.setText("EXCLUIR");
        btnExcluirLabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLabinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtIDLabin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeLabin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLocalLabin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCriarLabin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLerLabin)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarLabin)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirLabin)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeLabin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalLabin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDLabin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarLabin)
                    .addComponent(btnLerLabin)
                    .addComponent(btnAtualizarLabin)
                    .addComponent(btnExcluirLabin))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDLabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDLabinActionPerformed

    private void txtNomeLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLabinActionPerformed

    private void txtLocalLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalLabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalLabinActionPerformed

    private void btnCriarLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarLabinActionPerformed
      String idLabin = txtIDLabin.getText();
      String NomeLabin = txtNomeLabin.getText();
       String LocalLabin = txtLocalLabin.getText();
        
       
       JOptionPane.showMessageDialog(this, "Laboratorio criado com Sucesso!\n" +
        "ID Labin: " + idLabin +
        "\nNome Labin: " + NomeLabin +
        "\nLocal Labin: " + LocalLabin );
       
       limparCampos();

    }//GEN-LAST:event_btnCriarLabinActionPerformed

    private void btnLerLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerLabinActionPerformed
        // TODO add your handling code here:
         String idLabin = txtIDLabin.getText();
      String NomeLabin = txtNomeLabin.getText();
       String LocalLabin = txtLocalLabin.getText();
        
       
       JOptionPane.showMessageDialog(this, "Laboratorio criado com Sucesso!\n" +
        "ID Labin: " + idLabin +
        "\nNome Labin: " + NomeLabin +
        "\nLocal Labin: " + LocalLabin );
       
       limparCampos();

        
        
        
    }//GEN-LAST:event_btnLerLabinActionPerformed

    private void btnAtualizarLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarLabinActionPerformed
        // TODO add your handling code here:
        
         String idLabin = txtIDLabin.getText();
      String NomeLabin = txtNomeLabin.getText();
       String LocalLabin = txtLocalLabin.getText();
        
       
       JOptionPane.showMessageDialog(this, "Laboratorio criado com Sucesso!\n" +
        "ID Labin: " + idLabin +
        "\nNome Labin: " + NomeLabin +
        "\nLocal Labin: " + LocalLabin );
       
       limparCampos();

    }//GEN-LAST:event_btnAtualizarLabinActionPerformed

    private void btnExcluirLabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLabinActionPerformed
        // TODO add your handling code here:
        
         String idLabin = txtIDLabin.getText();
      String NomeLabin = txtNomeLabin.getText();
       String LocalLabin = txtLocalLabin.getText();
        
       
       JOptionPane.showMessageDialog(this, "Laboratorio criado com Sucesso!\n" +
        "ID Labin: " + idLabin +
        "\nNome Labin: " + NomeLabin +
        "\nLocal Labin: " + LocalLabin );
       
       limparCampos();

    }//GEN-LAST:event_btnExcluirLabinActionPerformed

    
    private void limparCampos(){
    txtIDLabin.setText("");
    txtLocalLabin.setText("");
    txtNomeLabin.setText("");
    
    }
    
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
            java.util.logging.Logger.getLogger(CadastroLabinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLabinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLabinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLabinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLabinView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarLabin;
    private javax.swing.JButton btnCriarLabin;
    private javax.swing.JButton btnExcluirLabin;
    private javax.swing.JButton btnLerLabin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIDLabin;
    private javax.swing.JTextField txtLocalLabin;
    private javax.swing.JTextField txtNomeLabin;
    // End of variables declaration//GEN-END:variables
}
