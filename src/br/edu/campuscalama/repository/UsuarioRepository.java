package br.edu.campuscalama.repository;

public class UsuarioRepository {
    public boolean autenticar(String login, String senha) {
        return "admin".equals(login) && "123".equals(senha);
    }
}
