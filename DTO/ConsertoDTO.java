package DTO;

public class ConsertoDTO {
    private int id;
    private String data;
    private String descricaoProblema;
    private String solucaoAplicada;
    private int idMaquina;

    // Construtor
    public ConsertoDTO(int id, String data, String descricaoProblema, String solucaoAplicada, int idMaquina) {
        this.id = id;
        this.data = data;
        this.descricaoProblema = descricaoProblema;
        this.solucaoAplicada = solucaoAplicada;
        this.idMaquina = idMaquina;
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

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getSolucaoAplicada() {
        return solucaoAplicada;
    }

    public void setSolucaoAplicada(String solucaoAplicada) {
        this.solucaoAplicada = solucaoAplicada;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }
}
