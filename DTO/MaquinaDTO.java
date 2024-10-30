
package DTO;


public class MaquinaDTO {
    private int idMaquina;
    private String numeroSerie;
    private String modelo;
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String dataAquisicao;
    private String status;
    private int idLaboratorio;
    private String Nome;
    private String Descricao;

    // Getters e setters
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
    public int getIdMaquina() { return idMaquina; }
    public void setIdMaquina(int idMaquina) { this.idMaquina = idMaquina; }
    
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }
    
    public String getMemoriaRam() { return memoriaRam; }
    public void setMemoriaRam(String memoriaRam) { this.memoriaRam = memoriaRam; }
    
    public String getArmazenamento() { return armazenamento; }
    public void setArmazenamento(String armazenamento) { this.armazenamento = armazenamento; }
    
    public String getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(String dataAquisicao) { this.dataAquisicao = dataAquisicao; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public int getIdLaboratorio() { return idLaboratorio; }
    public void setIdLaboratorio(int idLaboratorio) { this.idLaboratorio = idLaboratorio; }
}


    

