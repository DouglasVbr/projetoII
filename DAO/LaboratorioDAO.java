
package DAO;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DTO.LaboratorioDTO;
import DAO.ConexaoDAO;

public class LaboratorioDAO {
    
    public void criarLaboratorio(LaboratorioDTO lab) {
        String sql = "INSERT INTO laboratorios (nome, localizacao) VALUES (?, ?)";
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, lab.getNome());
            stmt.setString(2, lab.getLocalizacao());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Laboratório criado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar laboratório: " + e.getMessage());
        }
    }
    
    public List<LaboratorioDTO> lerLaboratorios() {
        String sql = "SELECT * FROM laboratorios";
        List<LaboratorioDTO> laboratorios = new ArrayList<>();
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                LaboratorioDTO lab = new LaboratorioDTO(rs.getInt("id_laboratorio"), rs.getString("nome"), rs.getString("localizacao"));
                laboratorios.add(lab);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler laboratórios: " + e.getMessage());
        }
        return laboratorios;
    }
    
    public void atualizarLaboratorio(LaboratorioDTO lab) {
        String sql = "UPDATE laboratorios SET nome = ?, localizacao = ? WHERE id_laboratorio = ?";
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, lab.getNome());
            stmt.setString(2, lab.getLocalizacao());
            stmt.setInt(3, lab.getIdLaboratorio());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Laboratório atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar laboratório: " + e.getMessage());
        }
    }
    
    public void excluirLaboratorio(int id) {
        String sql = "DELETE FROM laboratorios WHERE id_laboratorio = ?";
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Laboratório excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir laboratório: " + e.getMessage());
        }
    }
}


