
package View;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class RelatoriosView extends javax.swing.JFrame {

    
    public RelatoriosView() {
        initComponents(); 
        Relatar = new JComboBox<>(new String[] 
        { "PEÇAS", "MAQUINAS", "LABINS" });
        add(Relatar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Relatar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoRelatorio = new javax.swing.JTextPane();
        btnCriarRelatorio = new javax.swing.JButton();
        btnLerRelatorio = new javax.swing.JButton();
        btnAtualizarRelatorio = new javax.swing.JButton();
        btnExcluirRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Relatar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPÇÕES DE RELATORIO", "PEÇAS", "MAQUINAS", "LABORÁTORIO" }));
        Relatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatarActionPerformed(evt);
            }
        });

        txtDescricaoRelatorio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtDescricaoRelatorioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txtDescricaoRelatorio);

        btnCriarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aba.png"))); // NOI18N
        btnCriarRelatorio.setText("CRIAR");
        btnCriarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarRelatorioActionPerformed(evt);
            }
        });

        btnLerRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/livro.png"))); // NOI18N
        btnLerRelatorio.setText("LER");
        btnLerRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerRelatorioActionPerformed(evt);
            }
        });

        btnAtualizarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atualizada.png"))); // NOI18N
        btnAtualizarRelatorio.setText("ATUALIZAR");
        btnAtualizarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarRelatorioActionPerformed(evt);
            }
        });

        btnExcluirRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excluir.png"))); // NOI18N
        btnExcluirRelatorio.setText("EXCLUIR");
        btnExcluirRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Relatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnCriarRelatorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLerRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirRelatorio))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarRelatorio)
                    .addComponent(btnLerRelatorio)
                    .addComponent(btnAtualizarRelatorio)
                    .addComponent(btnExcluirRelatorio))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RelatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatarActionPerformed

    private void txtDescricaoRelatorioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtDescricaoRelatorioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoRelatorioAncestorAdded

    private void btnCriarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarRelatorioActionPerformed
        String relatorioSelecionado = (String) Relatar.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Relatório Criado com Sucesso !!\n" + "Relato: " + relatorioSelecionado);
        
        limparCampos();
        
    }//GEN-LAST:event_btnCriarRelatorioActionPerformed

    private void btnLerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerRelatorioActionPerformed
        String relatorioSelecionado = (String) Relatar.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Relatório Criado com Sucesso !!\n" + "Relato: " + relatorioSelecionado);
        
        limparCampos(); 
    }//GEN-LAST:event_btnLerRelatorioActionPerformed

    private void btnAtualizarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarRelatorioActionPerformed
        String relatorioSelecionado = (String) Relatar.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Relatório Criado com Sucesso !!\n" + "Relato: " + relatorioSelecionado);
        
        limparCampos();
    }//GEN-LAST:event_btnAtualizarRelatorioActionPerformed

    private void btnExcluirRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRelatorioActionPerformed
        String relatorioSelecionado = (String) Relatar.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Relatório Criado com Sucesso !!\n" + "Relato: " + relatorioSelecionado);
        
        limparCampos();
    }//GEN-LAST:event_btnExcluirRelatorioActionPerformed

    private void limparCampos(){
    txtDescricaoRelatorio.setText("");
    
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
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Relatar;
    private javax.swing.JButton btnAtualizarRelatorio;
    private javax.swing.JButton btnCriarRelatorio;
    private javax.swing.JButton btnExcluirRelatorio;
    private javax.swing.JButton btnLerRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtDescricaoRelatorio;
    // End of variables declaration//GEN-END:variables
}
