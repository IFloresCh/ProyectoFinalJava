package com.isaacflores.view.panels;

import javax.swing.*;
import java.awt.*;
/**Clase que contiene los datos de la base de datos*/
public class DatabasePanel extends JPanel {
    /** Label del username*/
    private JLabel userLabel;
    /** Label del password*/
    private JLabel passwordLabel;
    /** Label del host*/
    private JLabel urlLabel;
    /** TextField del username*/
    private JTextField userTextField;
    /** TextField del password*/
    private JTextField passwordTextField;
    /** TextField del host*/
    private JTextField urlTextField;
    /** Panel de intercambio*/
    private JPanel swapPanel;
/** Contiene el Panel de los datos de la base de datos*/
    public DatabasePanel() {

        setSize(970, 780);
        setLayout(null);

        swapPanel = new JPanel();
        swapPanel.setBounds(0, 0, 970, 780);
        swapPanel.setLayout(null);
        add(swapPanel);

        userLabel = new JLabel("Usuario: ");
        userLabel.setBounds(50, 50, 500, 50);
        userLabel.setFont(new java.awt.Font("Helvetica", 1, 18));
        userLabel.setForeground(new Color(66, 103, 178));
        swapPanel.add(userLabel);

        userTextField = new JTextField("iflores_pg");
        userTextField.setBounds(200, 50, 500, 50);
        userTextField.setFont(new java.awt.Font("Helvetica", 1, 18));
        userTextField.setForeground(new Color(66, 103, 178));
        swapPanel.add(userTextField);


        passwordLabel = new JLabel("Contraseña: ");
        passwordLabel.setBounds(50, 100, 500, 50);
        passwordLabel.setFont(new java.awt.Font("Helvetica", 1, 18));
        passwordLabel.setForeground(new Color(66, 103, 178));
        swapPanel.add(passwordLabel);

        passwordTextField = new JTextField("wev6pimwmduULgs");
        passwordTextField.setBounds(200, 100, 500, 50);
        passwordTextField.setFont(new java.awt.Font("Helvetica", 1, 18));
        passwordTextField.setForeground(new Color(66, 103, 178));
        swapPanel.add(passwordTextField);


        urlLabel = new JLabel("URL: ");
        urlLabel.setBounds(50, 150, 600, 50);
        urlLabel.setFont(new java.awt.Font("Helvetica", 1, 18));
        urlLabel.setForeground(new Color(66, 103, 178));
        swapPanel.add(urlLabel);

        urlTextField = new JTextField("https://phpmyadmin.alwaysdata.com/");
        urlTextField.setBounds(200, 150, 500, 50);
        urlTextField.setFont(new java.awt.Font("Helvetica", 1, 18));
        urlTextField.setForeground(new Color(66, 103, 178));
        swapPanel.add(urlTextField);


    }
}
