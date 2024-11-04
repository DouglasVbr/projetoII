
package DTO;


public class MaquinaDTO {
    private int idMaquina;
    private String numeroSerie;
    private String especificacoes;
    private String dataAquisicao;
    private String localizacao;
    private String status;

    // Construtor completo
    public MaquinaDTO(int idMaquina, String numeroSerie, String especificacoes, String dataAquisicao, String localizacao, String status) {
        this.idMaquina = idMaquina;
        this.numeroSerie = numeroSerie;
        this.especificacoes = especificacoes;
        this.dataAquisicao = dataAquisicao;
        this.localizacao = localizacao;
        this.status = status;
    }

    // Getters e Setters
    public int getIdMaquina() { return idMaquina; }
    public void setIdMaquina(int idMaquina) { this.idMaquina = idMaquina; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public String getEspecificacoes() { return especificacoes; }
    public void setEspecificacoes(String especificacoes) { this.especificacoes = especificacoes; }
    public String getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(String dataAquisicao) { this.dataAquisicao = dataAquisicao; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

