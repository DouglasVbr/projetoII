
package DAO;



import DTO.PecaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PecaDAO {
    public void adicionarPeca(PecaDTO peca) {
        String sql = "INSERT INTO peca (nome, descricao, idMaquina) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, peca.getNome());
            stmt.setString(2, peca.getDescricao());
            stmt.setInt(3, peca.getIdMaquina());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar peça: " + e.getMessage());
        }
    }

    public List<PecaDTO> listarPecas(PecaDTO peca ) {
        List<PecaDTO> pecas = new ArrayList<>();
        String sql = "SELECT * FROM peca";

        try (Connection conn = ConexaoDAO.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                
                peca.setId(rs.getInt("id"));
                peca.setNome(rs.getString("nome"));
                peca.setDescricao(rs.getString("descricao"));
                peca.setIdMaquina(rs.getInt("idMaquina"));
                pecas.add(peca);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar peças: " + e.getMessage());
        }
        return pecas;
    }
}

