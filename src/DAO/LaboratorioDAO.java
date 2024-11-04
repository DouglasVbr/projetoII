
package DAO;


import DTO.LaboratorioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAO {
    private Connection connection;

    public LaboratorioDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarLaboratorio(LaboratorioDTO laboratorio) {
        String sql = "INSERT INTO laboratorios (nome, localizacao) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<LaboratorioDTO> listarLaboratorios() {
        List<LaboratorioDTO> laboratorios = new ArrayList<>();
        String sql = "SELECT * FROM laboratorios";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                LaboratorioDTO laboratorio = new LaboratorioDTO(
                    rs.getInt("id_laboratorio"),
                    rs.getString("nome"),
                    rs.getString("localizacao")
                );
                laboratorios.add(laboratorio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laboratorios;
    }

    public void atualizarLaboratorio(LaboratorioDTO laboratorio) {
        String sql = "UPDATE laboratorios SET nome=?, localizacao=? WHERE id_laboratorio=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());
            stmt.setInt(3, laboratorio.getIdLaboratorio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerLaboratorio(int idLaboratorio) {
        String sql = "DELETE FROM laboratorios WHERE id_laboratorio=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idLaboratorio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

