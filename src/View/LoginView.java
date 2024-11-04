
package View;

import DAO.UsuarioDAO;
import javax.swing.JOptionPane;


public class LoginView extends javax.swing.JFrame {

    
    public LoginView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLoginView = new javax.swing.JPanel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblNomeUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelLoginView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PainelLoginView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PainelLoginViewAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/assinar-em.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblNomeUsuario.setText("Nome de Usuario");
        lblNomeUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblNomeUsuarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblSenha.setText("Senha");
        lblSenha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblSenhaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblMensagem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblMensagemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout PainelLoginViewLayout = new javax.swing.GroupLayout(PainelLoginView);
        PainelLoginView.setLayout(PainelLoginViewLayout);
        PainelLoginViewLayout.setHorizontalGroup(
            PainelLoginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLoginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUsuario))
                .addGap(39, 39, 39))
            .addGroup(PainelLoginViewLayout.createSequentialGroup()
                .addGroup(PainelLoginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLoginViewLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblNomeUsuario))
                    .addGroup(PainelLoginViewLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblSenha))
                    .addGroup(PainelLoginViewLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLoginViewLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnEntrar)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PainelLoginViewLayout.setVerticalGroup(
            PainelLoginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginViewLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEntrar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLoginView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLoginView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMensagemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblMensagemAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMensagemAncestorAdded

    private void lblNomeUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblNomeUsuarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeUsuarioAncestorAdded

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void lblSenhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblSenhaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSenhaAncestorAdded

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         String nomeUsuario = txtNomeUsuario.getText();
        String senha = new String(txtSenhaUsuario.getPassword());

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        if (usuarioDAO.verificaLogin(nomeUsuario, senha)) {
            lblMensagem.setText("Login bem-sucedido!");
            JOptionPane.showMessageDialog(this, "Bem-vindo, " + nomeUsuario + "!", "Login", JOptionPane.INFORMATION_MESSAGE);
            
            // Abre a tela principal e fecha a tela de login
            new TelaPrincipalView().setVisible(true);
            this.dispose();
            
        } else {
            lblMensagem.setText("Nome de usuário ou senha incorretos.");
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    
      
    }//GEN-LAST:event_btnEntrarActionPerformed

    private boolean verificaLogin(String usuario, String senha) {
        // Substitua por lógica real de autenticação (por exemplo, consulta ao banco de dados)
        return "admin".equals(usuario) && "senha123".equals(senha); // exemplo fixo
    }
    
    private void PainelLoginViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PainelLoginViewAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PainelLoginViewAncestorAdded

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PainelLoginView;
    public static javax.swing.JButton btnEntrar;
    public static javax.swing.JLabel lblMensagem;
    public static javax.swing.JLabel lblNomeUsuario;
    public static javax.swing.JLabel lblSenha;
    public static javax.swing.JTextField txtNomeUsuario;
    public static javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
