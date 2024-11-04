package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        conn = new ConexaoDAO().getConnection();
    }

    public boolean cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuarios (nome, email, nome_usuario, senha, perfil) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getNomeUsuario());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getPerfil());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     public boolean verificaLogin(String usuario, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha = ?";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            return rs.next(); // retorna true se encontrar o usuário
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar login: " + e.getMessage());
            return false;
        }
    }
}
