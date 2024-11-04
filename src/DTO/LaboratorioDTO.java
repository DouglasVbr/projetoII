
package DTO;


public class LaboratorioDTO {
    private int idLaboratorio;
    private String nome;
    private String localizacao;

    // Construtor completo
    public LaboratorioDTO(int idLaboratorio, String nome, String localizacao) {
        this.idLaboratorio = idLaboratorio;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public int getIdLaboratorio() { return idLaboratorio; }
    public void setIdLaboratorio(int idLaboratorio) { this.idLaboratorio = idLaboratorio; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}

