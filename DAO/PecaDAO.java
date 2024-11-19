
package DAO;


import DTO.PecaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

  
public class PecaDAO {

    public static PecaDTO pesquisarUsuario(int idPecas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final String url = "jdbc:mysql://localhost:3306/gerenciador_hardware";
    private final String user = "root"; 
    private final String password = ""; 

    // Método para criar uma peça
    public void criarPeca(String nome, int quantidade) throws SQLException {
        String query = "INSERT INTO pecas (tipo, quantidade_estoque) VALUES (?, ?)";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setInt(2, quantidade);
            stmt.executeUpdate();
        }
    }

    // Método para ler todas as peças
    public List<String> lerPecas() throws SQLException {
        String query = "SELECT * FROM pecas";
        List<String> pecas = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                pecas.add("ID: " + rs.getInt("id_peca") + ", Nome: " + rs.getString("tipo") + ", Quantidade: " + rs.getInt("quantidade_estoque"));
            }
        }
        return pecas;
    }

    // Método para atualizar uma peça
    public void atualizarPeca(int id, String nome, int quantidade) throws SQLException {
        String query = "UPDATE pecas SET tipo = ?, quantidade_estoque = ? WHERE id_peca = ?";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setInt(2, quantidade);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
    }

    // Método para excluir uma peça
    public void excluirPeca(int id) throws SQLException {
        String query = "DELETE FROM pecas WHERE id_peca = ?";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}


