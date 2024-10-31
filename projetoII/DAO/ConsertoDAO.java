package DAO;

import DTO.ConsertoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsertoDAO {
    public void adicionarConserto(ConsertoDTO conserto) {
        String sql = "INSERT INTO conserto (data, descricaoProblema, solucaoAplicada, idMaquina) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, conserto.getData());
            stmt.setString(2, conserto.getDescricaoProblema());
            stmt.setString(3, conserto.getSolucaoAplicada());
            stmt.setInt(4, conserto.getIdMaquina());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar conserto: " + e.getMessage());
        }
    }

    public List<ConsertoDTO> listarConsertos(ConsertoDTO conserto) {
        List<ConsertoDTO> consertos = new ArrayList<>();
        String sql = "SELECT * FROM conserto";

        try (Connection conn = ConexaoDAO.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                
                conserto.setId(rs.getInt("id"));
                conserto.setData(rs.getString("data"));
                conserto.setDescricaoProblema(rs.getString("descricaoProblema"));
                conserto.setSolucaoAplicada(rs.getString("solucaoAplicada"));
                conserto.setIdMaquina(rs.getInt("idMaquina"));
                consertos.add(conserto);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar consertos: " + e.getMessage());
        }
        return consertos;
    }
}
