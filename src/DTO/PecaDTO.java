
package DTO;


public class PecaDTO {
    private int idPeca;
    private String tipo;
    private String fabricante;
    private String numeroSerie;
    private int quantidade;

    // Construtor completo
    public PecaDTO(int idPeca, String tipo, String fabricante, String numeroSerie, int quantidade) {
        this.idPeca = idPeca;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getIdPeca() { return idPeca; }
    public void setIdPeca(int idPeca) { this.idPeca = idPeca; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}

