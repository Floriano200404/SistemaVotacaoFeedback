package br.edu.campuscalama.view;

import br.edu.campuscalama.controller.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField campoLogin;
    private JPasswordField campoSenha;

    public LoginView() {
        setTitle("Login - Campus Calama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Login:"));
        campoLogin = new JTextField();
        add(campoLogin);

        add(new JLabel("Senha:"));
        campoSenha = new JPasswordField();
        add(campoSenha);

        JButton botaoEntrar = new JButton("Entrar");
        botaoEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = campoLogin.getText();
                String senha = new String(campoSenha.getPassword());

                LoginController controller = new LoginController();
                if (controller.realizarLogin(login, senha)) {
                    JOptionPane.showMessageDialog(LoginView.this, "Login realizado com sucesso!");
                    new MenuPrincipalView().setVisible(true);
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Login ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(botaoEntrar);
        setLocationRelativeTo(null); // Centraliza a janela
    }
}
