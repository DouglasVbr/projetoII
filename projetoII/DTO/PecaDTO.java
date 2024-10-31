
package DTO;

public class PecaDTO {
    private int id;
    private String nome;
    private String descricao;
    private int idMaquina;

    // Construtor
    public PecaDTO(int id, String nome, String descricao, int idMaquina) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idMaquina = idMaquina;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }
}
