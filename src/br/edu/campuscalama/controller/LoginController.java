package br.edu.campuscalama.controller;

import br.edu.campuscalama.repository.UsuarioRepository;

public class LoginController {
    public boolean realizarLogin(String login, String senha) {
        return new UsuarioRepository().autenticar(login, senha);
    }
}
