package DTO;

public class HistoricoDTO {
    private int id;
    private String data;
    private String descricao;
    private int idConserto;

    // Construtor
    public HistoricoDTO(int id, String data, String descricao, int idConserto) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.idConserto = idConserto;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdConserto() {
        return idConserto;
    }

    public void setIdConserto(int idConserto) {
        this.idConserto = idConserto;
    }
}
