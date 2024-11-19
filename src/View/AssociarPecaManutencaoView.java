
package View;

import javafx.scene.control.Spinner;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;


public class AssociarPecaManutencaoView extends javax.swing.JFrame {

    
    public AssociarPecaManutencaoView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeDaPeca = new javax.swing.JTextField();
        txtIDDaPeca = new javax.swing.JTextField();
        QTDPeca = new javax.swing.JSpinner();
        btnCriarPecas = new javax.swing.JButton();
        btnLerPecas = new javax.swing.JButton();
        btnAtualizarPecas = new javax.swing.JButton();
        btnExcluirPecas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome da Peça");

        jLabel2.setText("ID da Peça");

        jLabel3.setText("QTD Peças");

        txtNomeDaPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDaPecaActionPerformed(evt);
            }
        });

        txtIDDaPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDDaPecaActionPerformed(evt);
            }
        });

        QTDPeca.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                QTDPecaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnCriarPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sinal-de-mais.png"))); // NOI18N
        btnCriarPecas.setText("CRIAR");
        btnCriarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPecasActionPerformed(evt);
            }
        });

        btnLerPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/livro.png"))); // NOI18N
        btnLerPecas.setText("LER");
        btnLerPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerPecasActionPerformed(evt);
            }
        });

        btnAtualizarPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atualizar-banco-de-dados.png"))); // NOI18N
        btnAtualizarPecas.setText("ATUALIZAR");
        btnAtualizarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPecasActionPerformed(evt);
            }
        });

        btnExcluirPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excluir.png"))); // NOI18N
        btnExcluirPecas.setText("EXCLUIR");
        btnExcluirPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPecasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCriarPecas)
                        .addGap(30, 30, 30)
                        .addComponent(btnLerPecas)
                        .addGap(31, 31, 31)
                        .addComponent(btnAtualizarPecas)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirPecas))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(QTDPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txtIDDaPeca)
                        .addComponent(txtNomeDaPeca, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtNomeDaPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIDDaPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(QTDPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarPecas)
                    .addComponent(btnLerPecas)
                    .addComponent(btnAtualizarPecas)
                    .addComponent(btnExcluirPecas))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDaPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDaPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDaPecaActionPerformed

    private void txtIDDaPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDDaPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDDaPecaActionPerformed

    private void QTDPecaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_QTDPecaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_QTDPecaAncestorAdded

    private void btnCriarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPecasActionPerformed
      String idPecas = txtIDDaPeca.getText();
      String NomePecas = txtNomeDaPeca.getText();
       int qtdpecas = (int) QTDPeca.getValue();
       System.out.println("ID da Peça: " + idPecas);
       System.out.println("Nome da Peça: " + NomePecas);
       System.out.println("Quantidade de Peças: " + qtdpecas);
       
       limparCampos();
    
    }//GEN-LAST:event_btnCriarPecasActionPerformed

    private void btnLerPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerPecasActionPerformed
        String idPecas = txtIDDaPeca.getText();
      String NomePecas = txtNomeDaPeca.getText();
       int qtdpecas = (int) QTDPeca.getValue();
       System.out.println("ID da Peça: " + idPecas);
       System.out.println("Nome da Peça: " + NomePecas);
       System.out.println("Quantidade de Peças: " + qtdpecas);
       
       limparCampos();
    }//GEN-LAST:event_btnLerPecasActionPerformed

    private void btnAtualizarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPecasActionPerformed
        // TODO add your handling code here:
        String idPecas = txtIDDaPeca.getText();
      String NomePecas = txtNomeDaPeca.getText();
       int qtdpecas = (int) QTDPeca.getValue();
       System.out.println("ID da Peça: " + idPecas);
       System.out.println("Nome da Peça: " + NomePecas);
       System.out.println("Quantidade de Peças: " + qtdpecas);
       
       limparCampos();
    }//GEN-LAST:event_btnAtualizarPecasActionPerformed

    private void btnExcluirPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPecasActionPerformed
        
        String idPecas = txtIDDaPeca.getText();
      String NomePecas = txtNomeDaPeca.getText();
       int qtdpecas = (int) QTDPeca.getValue();
       System.out.println("ID da Peça: " + idPecas);
       System.out.println("Nome da Peça: " + NomePecas);
       System.out.println("Quantidade de Peças: " + qtdpecas);
       
       limparCampos();
    }//GEN-LAST:event_btnExcluirPecasActionPerformed

    
    private void limparCampos(){
    txtIDDaPeca.setText("");
    txtNomeDaPeca.setText("");
    QTDPeca.setValue(0); 
    
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
            java.util.logging.Logger.getLogger(AssociarPecaManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociarPecaManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociarPecaManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociarPecaManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssociarPecaManutencaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QTDPeca;
    private javax.swing.JButton btnAtualizarPecas;
    private javax.swing.JButton btnCriarPecas;
    private javax.swing.JButton btnExcluirPecas;
    private javax.swing.JButton btnLerPecas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIDDaPeca;
    private javax.swing.JTextField txtNomeDaPeca;
    // End of variables declaration//GEN-END:variables
}
