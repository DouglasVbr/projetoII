
package DAO;


import DTO.ManutencaoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManutencaoDAO {
    private Connection connection;

    public ManutencaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarManutencao(ManutencaoDTO manutencao) {
        String sql = "INSERT INTO manutencoes (id_maquina, data_conserto, problema, solucao) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, manutencao.getIdMaquina());
            stmt.setString(2, manutencao.getDataConserto());
            stmt.setString(3, manutencao.getProblema());
            stmt.setString(4, manutencao.getSolucao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ManutencaoDTO> listarManutencoes() {
        List<ManutencaoDTO> manutencoes = new ArrayList<>();
        String sql = "SELECT * FROM manutencoes";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ManutencaoDTO manutencao = new ManutencaoDTO(
                    rs.getInt("id_manutencao"),
                    rs.getInt("id_maquina"),
                    rs.getString("data_conserto"),
                    rs.getString("problema"),
                    rs.getString("solucao")
                );
                manutencoes.add(manutencao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manutencoes;
    }

    public void atualizarManutencao(ManutencaoDTO manutencao) {
        String sql = "UPDATE manutencoes SET data_conserto=?, problema=?, solucao=? WHERE id_manutencao=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, manutencao.getDataConserto());
            stmt.setString(2, manutencao.getProblema());
            stmt.setString(3, manutencao.getSolucao());
            stmt.setInt(4, manutencao.getIdManutencao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerManutencao(int idManutencao) {
        String sql = "DELETE FROM manutencoes WHERE id_manutencao=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idManutencao);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

