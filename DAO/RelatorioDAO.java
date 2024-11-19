
package DAO;

import DTO.RelatorioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {
    private Connection connection;

    public RelatorioDAO(Connection connection) {
        this.connection = connection;
    }

    public void criarRelatorio(RelatorioDTO relatorio) {
        String sql = "INSERT INTO relatorios (categoria, descricao) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, relatorio.getCategoria());
            stmt.setString(2, relatorio.getDescricao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<RelatorioDTO> lerRelatorios(String categoria) {
        List<RelatorioDTO> relatorios = new ArrayList<>();
        String sql = "SELECT * FROM relatorios WHERE categoria = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, categoria);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                RelatorioDTO relatorio = new RelatorioDTO(
                    rs.getInt("id_relatorio"),
                    rs.getString("categoria"),
                    rs.getString("descricao")
                );
                relatorios.add(relatorio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return relatorios;
    }

    public void atualizarRelatorio(RelatorioDTO relatorio) {
        String sql = "UPDATE relatorios SET descricao=? WHERE id_relatorio=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, relatorio.getDescricao());
            stmt.setInt(2, relatorio.getIdRelatorio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirRelatorio(int idRelatorio) {
        String sql = "DELETE FROM relatorios WHERE id_relatorio=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idRelatorio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

