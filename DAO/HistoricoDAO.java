
package DAO;

import DTO.HistoricoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDAO {
    public void adicionarHistorico(HistoricoDTO historico) {
        String sql = "INSERT INTO historico (data, descricao, idConserto) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, historico.getData());
            stmt.setString(2, historico.getDescricao());
            stmt.setInt(3, historico.getIdConserto());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar histórico: " + e.getMessage());
        }
    }

    public List<HistoricoDTO> listarHistoricos(HistoricoDTO historico) {
        List<HistoricoDTO> historicos = new ArrayList<>();
        String sql = "SELECT * FROM historico";

        try (Connection conn = ConexaoDAO.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                
                historico.setId(rs.getInt("id"));
                historico.setData(rs.getString("data"));
                historico.setDescricao(rs.getString("descricao"));
                historico.setIdConserto(rs.getInt("idConserto"));
                historicos.add(historico);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar históricos: " + e.getMessage());
        }
        return historicos;
    }
}

