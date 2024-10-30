package DTO;


public class UsuarioDTO {
    private int idUsuario;
    private String nome;
    private String email;
    private String nomeUsuario;
    private String senha;
    private String perfil; // tecnico, administrador, professor
    private String dataCriacao;

    // Construtor vazio
    public UsuarioDTO() {}

    // Construtor com parâmetros
    public UsuarioDTO(int idUsuario, String nome, String email, String nomeUsuario, String senha, String perfil, String dataCriacao) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.perfil = perfil;
        this.dataCriacao = dataCriacao;
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}


    

