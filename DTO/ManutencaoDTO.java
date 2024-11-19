
package DTO;


public class ManutencaoDTO {
    private int idManutencao;
    private int idMaquina;
    private String dataConserto;
    private String problema;
    private String solucao;
    

    // Construtor completo
    public ManutencaoDTO(int idManutencao, int idMaquina, String dataConserto, String problema, String solucao) {
        this.idManutencao = idManutencao;
        this.idMaquina = idMaquina;
        this.dataConserto = dataConserto;
        this.problema = problema;
        this.solucao = solucao;
    }

    // Getters e Setters
    public int getIdManutencao() { return idManutencao; }
    public void setIdManutencao(int idManutencao) { this.idManutencao = idManutencao; }
    public int getIdMaquina() { return idMaquina; }
    public void setIdMaquina(int idMaquina) { this.idMaquina = idMaquina; }
    public String getDataConserto() { return dataConserto; }
    public void setDataConserto(String dataConserto) { this.dataConserto = dataConserto; }
    public String getProblema() { return problema; }
    public void setProblema(String problema) { this.problema = problema; }
    public String getSolucao() { return solucao; }
    public void setSolucao(String solucao) { this.solucao = solucao; }
}

