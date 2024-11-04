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
public class CadastroMaquinasView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroMaquinasView
     */
    public CadastroMaquinasView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMaquina = new javax.swing.JPanel();
        btnLerMaquina = new javax.swing.JButton();
        btnExcluirMaquina = new javax.swing.JButton();
        btnAtualizarMaquina = new javax.swing.JButton();
        btnCriarMaquina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDLaboratorio = new javax.swing.JTextField();
        txtIDMaquina = new javax.swing.JTextField();
        txtArmazenamentoMaquina = new javax.swing.JTextField();
        txtCPUMaquina = new javax.swing.JTextField();
        txtRamMaquina = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeMaquinasCadastradas = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLerMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/livro.png"))); // NOI18N
        btnLerMaquina.setText("LER");
        btnLerMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerMaquinaActionPerformed(evt);
            }
        });

        btnExcluirMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excluir.png"))); // NOI18N
        btnExcluirMaquina.setText("Excluir");
        btnExcluirMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMaquinaActionPerformed(evt);
            }
        });

        btnAtualizarMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atualizada.png"))); // NOI18N
        btnAtualizarMaquina.setText("Atualizar");
        btnAtualizarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarMaquinaActionPerformed(evt);
            }
        });

        btnCriarMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aba.png"))); // NOI18N
        btnCriarMaquina.setText("CRIAR");
        btnCriarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarMaquinaActionPerformed(evt);
            }
        });

        jLabel1.setText("CPU");

        jLabel2.setText("RAM");

        jLabel3.setText("ARMAZENAMENTO");

        jLabel4.setText("ID MAQUINA ");

        jLabel5.setText("ID LABORÁTORIO");

        txtIDLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDLaboratorioActionPerformed(evt);
            }
        });

        txtIDMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDMaquinaActionPerformed(evt);
            }
        });

        txtArmazenamentoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArmazenamentoMaquinaActionPerformed(evt);
            }
        });

        txtCPUMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPUMaquinaActionPerformed(evt);
            }
        });

        txtRamMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRamMaquinaActionPerformed(evt);
            }
        });

        ListaDeMaquinasCadastradas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListaDeMaquinasCadastradasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ListaDeMaquinasCadastradas);

        jLabel6.setText("Lista de Maquinas Cadastradas");

        javax.swing.GroupLayout PainelMaquinaLayout = new javax.swing.GroupLayout(PainelMaquina);
        PainelMaquina.setLayout(PainelMaquinaLayout);
        PainelMaquinaLayout.setHorizontalGroup(
            PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMaquinaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtArmazenamentoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222))
            .addGroup(PainelMaquinaLayout.createSequentialGroup()
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCriarMaquina)
                        .addGap(52, 52, 52)
                        .addComponent(btnLerMaquina))
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(PainelMaquinaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRamMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(49, 49, 49)
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addComponent(btnAtualizarMaquina)
                        .addGap(75, 75, 75)
                        .addComponent(btnExcluirMaquina))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelMaquinaLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(txtIDMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(526, Short.MAX_VALUE)))
        );
        PainelMaquinaLayout.setVerticalGroup(
            PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMaquinaLayout.createSequentialGroup()
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtArmazenamentoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRamMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCriarMaquina)
                            .addComponent(btnLerMaquina)
                            .addComponent(btnAtualizarMaquina)
                            .addComponent(btnExcluirMaquina))
                        .addGap(89, 89, 89))
                    .addGroup(PainelMaquinaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PainelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelMaquinaLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(txtIDMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMaquinaActionPerformed

    private void txtIDLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDLaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDLaboratorioActionPerformed

    private void txtRamMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRamMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRamMaquinaActionPerformed

    private void txtArmazenamentoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArmazenamentoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArmazenamentoMaquinaActionPerformed

    private void txtCPUMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPUMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPUMaquinaActionPerformed

    private void ListaDeMaquinasCadastradasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListaDeMaquinasCadastradasAncestorAdded
       // Exemplo de método para atualizar a lista de máquinas

    // Aqui você pode obter a lista de máquinas cadastradas do banco de dados ou de uma lista local
    String listaMaquinas = "ID: 1 - CPU: Intel - RAM: 8GB\n"; // Exemplo de dados fictícios
    listaMaquinas += "ID: 2 - CPU: AMD - RAM: 16GB\n"; // Continue para adicionar mais dados
    
    ListaDeMaquinasCadastradas.setText(listaMaquinas);


    }//GEN-LAST:event_ListaDeMaquinasCadastradasAncestorAdded

    private void btnCriarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarMaquinaActionPerformed
         String idMaquina = txtIDMaquina.getText();
    String idLaboratorio = txtIDLaboratorio.getText();
    String armazenamento = txtArmazenamentoMaquina.getText();
    String cpu = txtCPUMaquina.getText();
    String ram = txtRamMaquina.getText();

    // Adicione aqui a lógica para criar e salvar a máquina no banco de dados ou na lista
    // Exemplo de exibição de mensagem:
    JOptionPane.showMessageDialog(this, "Máquina criada com sucesso!");
    }//GEN-LAST:event_btnCriarMaquinaActionPerformed

    private void btnLerMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLerMaquinaActionPerformed
        String idMaquina = txtIDMaquina.getText();

    // Adicione aqui a lógica para buscar a máquina no banco de dados ou na lista usando o ID
    // Exemplo fictício de exibição:
    JOptionPane.showMessageDialog(this, "Máquina ID: " + idMaquina + " encontrada.");
    }//GEN-LAST:event_btnLerMaquinaActionPerformed

    private void btnAtualizarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarMaquinaActionPerformed
        String idMaquina = txtIDMaquina.getText();
    String idLaboratorio = txtIDLaboratorio.getText();
    String armazenamento = txtArmazenamentoMaquina.getText();
    String cpu = txtCPUMaquina.getText();
    String ram = txtRamMaquina.getText();

    // Adicione aqui a lógica para atualizar a máquina no banco de dados ou na lista
    JOptionPane.showMessageDialog(this, "Máquina atualizada com sucesso!");
    }//GEN-LAST:event_btnAtualizarMaquinaActionPerformed

    private void btnExcluirMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMaquinaActionPerformed
        String idMaquina = txtIDMaquina.getText();

    // Adicione aqui a lógica para excluir a máquina do banco de dados ou da lista
    JOptionPane.showMessageDialog(this, "Máquina excluída com sucesso!");
    }//GEN-LAST:event_btnExcluirMaquinaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMaquinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMaquinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMaquinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMaquinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMaquinasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ListaDeMaquinasCadastradas;
    private javax.swing.JPanel PainelMaquina;
    private javax.swing.JButton btnAtualizarMaquina;
    private javax.swing.JButton btnCriarMaquina;
    private javax.swing.JButton btnExcluirMaquina;
    private javax.swing.JButton btnLerMaquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtArmazenamentoMaquina;
    private javax.swing.JTextField txtCPUMaquina;
    private javax.swing.JTextField txtIDLaboratorio;
    private javax.swing.JTextField txtIDMaquina;
    private javax.swing.JTextField txtRamMaquina;
    // End of variables declaration//GEN-END:variables
}