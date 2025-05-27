package br.edu.campuscalama.view;

import javax.swing.*;

public class MenuPrincipalView extends JFrame {
    public MenuPrincipalView() {
        setTitle("Sistema de Votação - Campus Calama");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Bem-vindo ao Sistema de Votação!", JLabel.CENTER));
        setVisible(true);
    }
}
