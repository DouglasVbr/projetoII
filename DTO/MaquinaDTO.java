
package DTO;




public class MaquinaDTO {
    private int idMaquina;
    private String numeroSerie;
    private String especificacoes;
    private String dataAquisicao;
    private String localizacao;
    private String status;
    private String ram;
    private String armazenamento;
    private String cpu;

    // Construtor completo
    public MaquinaDTO(int idMaquina, String numeroSerie, String especificacoes, String dataAquisicao, String localizacao, String status) {
        this.idMaquina = idMaquina;
        this.numeroSerie = numeroSerie;
        this.especificacoes = especificacoes;
        this.dataAquisicao = dataAquisicao;
        this.localizacao = localizacao;
        this.status = status;
    }

    public MaquinaDTO(int idMaquina, String numeroSerie, String especificacoes, String dataAquisicao, String localizacao, String status, String ram, String armazenamento, String cpu) {
        this.idMaquina = idMaquina;
        this.numeroSerie = numeroSerie;
        this.especificacoes = especificacoes;
        this.dataAquisicao = dataAquisicao;
        this.localizacao = localizacao;
        this.status = status;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.cpu = cpu;
    }

    public MaquinaDTO() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
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

