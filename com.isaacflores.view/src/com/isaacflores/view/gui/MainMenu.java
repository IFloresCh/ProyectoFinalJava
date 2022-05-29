package com.isaacflores.view.gui;

import com.isaacflores.view.panels.*;

import javax.swing.*;
;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/** Clase que representa el menu principal de la aplicación*/
public class MainMenu extends JFrame{
    /** Panel principal*/
    private JPanel mainPanel;
    /** boton1*/
    private JPanel newObservation;
    /** boton2*/
    private JPanel newSpecies;
    /** boton3*/
    private JPanel buttonPanel3;
    /** boton4*/
    private JPanel buttonPanel4;
    /** boton5*/
    private JPanel buttonPanel5;
    /** boton6*/
    private JPanel buttonPanel6;
    /** texto del boton1*/
    private JLabel newObservationLabel;
    /** texto del boton2*/
    private JLabel newEspecieLabel;
    /** panel del cardboxlayout*/
    private JPanel cardPanel;
    /** texto del boton3*/
    private JLabel label3;
    /** texto del boton4*/
    private JLabel label4;
    /** texto del boton6*/
    private JLabel label6;
    /** texto de bienvenida*/
    private JLabel welcomeLabel;


/** Creacion del menu principal*/
    public MainMenu() {
        super("Main Menu");
        setSize(1210,840);
        //setResizable(false);
        setLocation(100,100);


        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 1210, 840);
        mainPanel.setBackground(new Color(137, 143, 156));
        mainPanel.setVisible(true);
        add(mainPanel);


        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());
        cardPanel.setBounds(220, 10, 970, 780);
        cardPanel.setBackground(new Color(255, 255, 255));
        mainPanel.add(cardPanel);


        welcomeLabel = new JLabel("Bienvenido");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setVerticalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds(0, 0, 200, 100);
        welcomeLabel.setFont(new Font("Helvetica", Font.PLAIN, 40));
        welcomeLabel.setForeground(new Color(63, 103, 178));
        cardPanel.add(welcomeLabel);


        newObservation = new JPanel();
        newObservation.setLayout(null);
        newObservation.setBounds(10, 10, 200, 100);
        newObservation.setBackground(new Color(66, 103, 178));
        mainPanel.add(newObservation);


        newObservationLabel = new JLabel("Añadir Tiburón");
        newObservationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newObservationLabel.setVerticalAlignment(SwingConstants.CENTER);
        newObservationLabel.setBounds(0, 0, 200, 100);
        newObservationLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        newObservationLabel.setForeground(Color.WHITE);
        newObservation.add(newObservationLabel);

        /**acciones del boton de añadir tiburón*/
        newObservation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                newObservation.setBackground(new Color(66, 103, 178));
                newObservation.setBorder(BorderFactory.createRaisedBevelBorder());

            }
        });

        newObservation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                newObservation.setBackground(new Color(66, 103, 178));
                newObservation.setBorder(BorderFactory.createEmptyBorder());
            }
        });
        newObservation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                newObservation.setBorder(BorderFactory.createLoweredBevelBorder());
                cardPanel.removeAll();
                NewSharkPanel newob = new NewSharkPanel();
                cardPanel.add(newob, "newObservation");
                revalidate();
                repaint();
            }
        });

        newSpecies = new JPanel();
        newSpecies.setLayout(null);
        newSpecies.setBounds(10, 120, 200, 100);
        newSpecies.setBackground(new Color(66, 103, 178));
        newSpecies.setBorder(BorderFactory.createRaisedBevelBorder());
        mainPanel.add(newSpecies);

        newEspecieLabel = new JLabel("Añadir Raya");
        newEspecieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newEspecieLabel.setVerticalAlignment(SwingConstants.CENTER);
        newEspecieLabel.setBounds(0, 0, 200, 100);
        newEspecieLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        newEspecieLabel.setForeground(Color.WHITE);
        newSpecies.add(newEspecieLabel);

        /**acciones del boton de añadir raya*/
        newSpecies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                newSpecies.setBackground(new Color(66, 103, 178));
                newSpecies.setBorder(BorderFactory.createRaisedBevelBorder());
            }
        });

        newSpecies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                newSpecies.setBackground(new Color(66, 103, 178));
                newSpecies.setBorder(BorderFactory.createEmptyBorder());
            }
        });
        newSpecies.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                newSpecies.setBorder(BorderFactory.createLoweredBevelBorder());
                cardPanel.removeAll();
                NewStingrayPanel newSting = new NewStingrayPanel();
                cardPanel.add(newSting, "newObservation");
                revalidate();
                repaint();
            }
        });


        buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(null);
        buttonPanel3.setBounds(10, 230, 200, 100);
        buttonPanel3.setBackground(new Color(66, 103, 178));
        buttonPanel3.setBorder(BorderFactory.createRaisedBevelBorder());
        mainPanel.add(buttonPanel3);

        label3 = new JLabel("Añadir Ave");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.CENTER);
        label3.setBounds(0, 0, 200, 100);
        label3.setFont(new Font("Helvetica", Font.PLAIN, 20));
        label3.setForeground(Color.WHITE);
        buttonPanel3.add(label3);

        /**acciones del boton de añadir ave*/
        buttonPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                buttonPanel3.setBackground(new Color(66, 103, 178));
                buttonPanel3.setBorder(BorderFactory.createRaisedBevelBorder());
            }
        });

        buttonPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                buttonPanel3.setBackground(new Color(66, 103, 178));
                buttonPanel3.setBorder(BorderFactory.createEmptyBorder());
            }
        });

        buttonPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                buttonPanel3.setBorder(BorderFactory.createLoweredBevelBorder());
                cardPanel.removeAll();
                AvePanel ave = new AvePanel();
                cardPanel.add(ave, "ListaTodo");
                revalidate();
                repaint();

            }
        });

        buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(null);
        buttonPanel4.setBounds(10, 340, 200, 100);
        buttonPanel4.setBackground(new Color(66, 103, 178));
        buttonPanel4.setBorder(BorderFactory.createRaisedBevelBorder());
        mainPanel.add(buttonPanel4);

        label4 = new JLabel("Añadir Otro");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.CENTER);
        label4.setBounds(0, 0, 200, 100);
        label4.setFont(new Font("Helvetica", Font.PLAIN, 20));
        label4.setForeground(Color.WHITE);
        buttonPanel4.add(label4);
        /**acciones del boton de añadir otro*/
        buttonPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                buttonPanel4.setBackground(new Color(66, 103, 178));
                buttonPanel4.setBorder(BorderFactory.createLoweredBevelBorder());
            }
        });

        buttonPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                buttonPanel4.setBackground(new Color(66, 103, 178));
                buttonPanel4.setBorder(BorderFactory.createRaisedBevelBorder());
            }
        });
        buttonPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                buttonPanel3.setBorder(BorderFactory.createLoweredBevelBorder());
                cardPanel.removeAll();
                OtroPanel otro = new OtroPanel();
                cardPanel.add(otro, "Otro");
                revalidate();
                repaint();

            }
        });

        buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(null);
        buttonPanel5.setBounds(10, 450, 200, 100);
        buttonPanel5.setBackground(new Color(66, 103, 178));
        buttonPanel5.setBorder(BorderFactory.createRaisedBevelBorder());
        buttonPanel5.setVisible(false);
        mainPanel.add(buttonPanel5);

        buttonPanel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                buttonPanel5.setBackground(new Color(66, 103, 178));
                buttonPanel5.setBorder(BorderFactory.createLoweredBevelBorder());
            }
        });

        buttonPanel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                buttonPanel5.setBackground(new Color(66, 103, 178));
                buttonPanel5.setBorder(BorderFactory.createRaisedBevelBorder());
            }
        });





        buttonPanel6 = new JPanel();
        buttonPanel6.setLayout(null);
        buttonPanel6.setBounds(10, 560, 200, 100);
        buttonPanel6.setBackground(new Color(66, 103, 178));
        buttonPanel6.setBorder(BorderFactory.createRaisedBevelBorder());
        mainPanel.add(buttonPanel6);

        label6 = new JLabel("Base de datos");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setVerticalAlignment(SwingConstants.CENTER);
        label6.setBounds(0, 0, 200, 100);
        label6.setFont(new Font("Helvetica", Font.PLAIN, 20));
        label6.setForeground(Color.WHITE);
        buttonPanel6.add(label6);

        buttonPanel6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                buttonPanel6.setBackground(new Color(66, 103, 178));
                buttonPanel6.setBorder(BorderFactory.createLoweredBevelBorder());
            }
        });

        buttonPanel6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                buttonPanel6.setBackground(new Color(66, 103, 178));
                buttonPanel6.setBorder(BorderFactory.createRaisedBevelBorder());
            }
        });

        buttonPanel6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cardPanel.removeAll();
                DatabasePanel dbpanel = new DatabasePanel();
                cardPanel.add(dbpanel, "Datos de la Base de datos");
                revalidate();
                repaint();

            }
        });



    }
}