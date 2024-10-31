package DAO;

import DTO.MaquinaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaquinaDAO {
    public void adicionarMaquina(MaquinaDTO maquina) {
        String sql = "INSERT INTO maquina (nome, descricao, idLaboratorio) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoDAO.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, maquina.getNome());
            stmt.setString(2, maquina.getDescricao());
            stmt.setInt(3, maquina.getIdLaboratorio());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar máquina: " + e.getMessage());
        }
    }

    public List<MaquinaDTO> listarMaquinas() {
        List<MaquinaDTO> maquinas = new ArrayList<>();
        String sql = "SELECT * FROM maquina";

        try (Connection conn = ConexaoDAO.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                MaquinaDTO maquina = new MaquinaDTO();
                maquina.setIdMaquina(rs.getInt("id"));
                maquina.setNome(rs.getString("nome"));
                maquina.setDescricao(rs.getString("descricao"));
                maquina.setIdLaboratorio(rs.getInt("idLaboratorio"));
                maquinas.add(maquina);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar máquinas: " + e.getMessage());
        }
        return maquinas;
    }
}
