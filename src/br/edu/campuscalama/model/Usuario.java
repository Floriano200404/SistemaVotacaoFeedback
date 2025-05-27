package br.edu.campuscalama.model;

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String tipo; // ALUNO, PROFESSOR, ADMIN

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
