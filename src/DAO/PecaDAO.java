
package DAO;


import DTO.PecaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PecaDAO {
    private Connection connection;

    public PecaDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarPeca(PecaDTO peca) {
        String sql = "INSERT INTO pecas (tipo, fabricante, numero_serie, quantidade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, peca.getTipo());
            stmt.setString(2, peca.getFabricante());
            stmt.setString(3, peca.getNumeroSerie());
            stmt.setInt(4, peca.getQuantidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PecaDTO> listarPecas() {
        List<PecaDTO> pecas = new ArrayList<>();
        String sql = "SELECT * FROM pecas";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                PecaDTO peca = new PecaDTO(
                    rs.getInt("id_peca"),
                    rs.getString("tipo"),
                    rs.getString("fabricante"),
                    rs.getString("numero_serie"),
                    rs.getInt("quantidade")
                );
                pecas.add(peca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pecas;
    }

    public void atualizarPeca(PecaDTO peca) {
        String sql = "UPDATE pecas SET tipo=?, fabricante=?, numero_serie=?, quantidade=? WHERE id_peca=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, peca.getTipo());
            stmt.setString(2, peca.getFabricante());
            stmt.setString(3, peca.getNumeroSerie());
            stmt.setInt(4, peca.getQuantidade());
            stmt.setInt(5, peca.getIdPeca());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerPeca(int idPeca) {
        String sql = "DELETE FROM pecas WHERE id_peca=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idPeca);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

