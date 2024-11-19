
package DTO;

public class RelatorioDTO {
    private int idRelatorio;
    private String categoria;
    private String descricao;

    // Construtor completo
    public RelatorioDTO(int idRelatorio, String categoria, String descricao) {
        this.idRelatorio = idRelatorio;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getIdRelatorio() { return idRelatorio; }
    public void setIdRelatorio(int idRelatorio) { this.idRelatorio = idRelatorio; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}

