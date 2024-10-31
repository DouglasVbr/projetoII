package DAO;

import DTO.LaboratorioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAO {
    public void adicionarLaboratorio(LaboratorioDTO laboratorio) {
        String sql = "INSERT INTO laboratorio (nome, localizacao) VALUES (?, ?)";

        try (Connection conn = ConexaoDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar laboratório: " + e.getMessage());
        }
    }

    public List<LaboratorioDTO> listarLaboratorios() {
        List<LaboratorioDTO> laboratorios = new ArrayList<>();
        String sql = "SELECT * FROM laboratorio";

        try (Connection conn = ConexaoDAO.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                LaboratorioDTO laboratorio = new LaboratorioDTO();
                laboratorio.setIdLaboratorio(rs.getInt("id"));
                laboratorio.setNome(rs.getString("nome"));
                laboratorio.setLocalizacao(rs.getString("localizacao"));
                laboratorios.add(laboratorio);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar laboratórios: " + e.getMessage());
        }
        return laboratorios;
    }
}
