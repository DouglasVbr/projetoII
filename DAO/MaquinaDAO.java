package DAO;

import DTO.MaquinaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaquinaDAO {
    private Connection connection;

    public MaquinaDAO(Connection connection) {
        this.connection = connection;
    }

    public MaquinaDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cadastrarMaquina(MaquinaDTO maquina) {
        String sql = "INSERT INTO maquinas (numero_serie, especificacoes, data_aquisicao, localizacao, status, ram, armazenamento, cpu) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, maquina.getNumeroSerie());
            stmt.setString(2, maquina.getEspecificacoes());
            stmt.setString(3, maquina.getDataAquisicao());
            stmt.setString(4, maquina.getLocalizacao());
            stmt.setString(5, maquina.getStatus());
            stmt.setString(6, maquina.getRam());
            stmt.setString(7, maquina.getArmazenamento());
            stmt.setString(8, maquina.getCpu());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MaquinaDTO> listaMaquinasCadastradas() {
        List<MaquinaDTO> maquinas = new ArrayList<>();
        String sql = "SELECT * FROM maquinas";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                MaquinaDTO maquina = new MaquinaDTO(
                    rs.getInt("id_maquina"),
                    rs.getString("numero_serie"),
                    rs.getString("especificacoes"),
                    rs.getString("data_aquisicao"),
                    rs.getString("localizacao"),
                    rs.getString("status"),
                    rs.getString("ram"),
                    rs.getString("armazenamento"),
                    rs.getString("cpu")
                );
                maquinas.add(maquina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maquinas;
    }

    public void atualizarMaquina(MaquinaDTO maquina) {
        String sql = "UPDATE maquinas SET numero_serie=?, especificacoes=?, data_aquisicao=?, localizacao=?, status=?, ram=?, armazenamento=?, cpu=? WHERE id_maquina=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, maquina.getNumeroSerie());
            stmt.setString(2, maquina.getEspecificacoes());
            stmt.setString(3, maquina.getDataAquisicao());
            stmt.setString(4, maquina.getLocalizacao());
            stmt.setString(5, maquina.getStatus());
            stmt.setString(6, maquina.getRam());
            stmt.setString(7, maquina.getArmazenamento());
            stmt.setString(8, maquina.getCpu());
            stmt.setInt(9, maquina.getIdMaquina());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerMaquina(int idMaquina) {
        String sql = "DELETE FROM maquinas WHERE id_maquina=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idMaquina);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
