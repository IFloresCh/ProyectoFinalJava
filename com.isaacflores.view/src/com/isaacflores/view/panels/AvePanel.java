package com.isaacflores.view.panels;


import com.isaacflores.application.db.DaoAve;
import com.isaacflores.application.entities.Ave;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Panel para la creacion de aves*/

public class AvePanel extends JPanel implements ActionListener {
    /**Instancia de la clase Ave*/
    Ave ave = new Ave();
    /**Instancia de la clase DaoAve*/
    DaoAve daoave = new DaoAve();
    /** JLabel para el tamaño*/
    private JLabel tamanioLabel;
    /** JLabel para el sexo*/
    private JLabel sexoLabel;
    /** JLabel para el color*/
    private JLabel colorLabel;
    /**Label para la cantidad de aves*/
    private JLabel cantidadLabel;
    /**Label para la especie*/
    private JLabel speciesLabel;
    /**TextField para la especie*/
    private JTextField specieTextField;
    /**TextField para el tamaño*/
    private JTextField tamanioTextField;
    /**ComboBox para el sexo*/
    private JComboBox sexoComboBox;
    /**String para el sexo*/
    private String[] sexo = {" ","Macho", "Hembra"};
    /**TextField para el color*/
    private JTextField colorTextField;
    /**TextField para la cantidad de aves*/
    private JTextField cantidadTextField;
    /**Panel para el cambio de paneles*/
    private JPanel swapPanel;
    /** Label para la altrura*/
    private JLabel alturaLabel;
    /**TextField para la altura*/
    private JTextField alturaTextField;

/** Interfaz para la creacion de aves*/
    public AvePanel() {

        setSize(970, 780);
        setLayout(null);

        swapPanel = new JPanel();
        swapPanel.setBounds(0, 0, 970, 780);
        swapPanel.setLayout(null);
        add(swapPanel);

        speciesLabel = new JLabel("*Seleccione una especie");
        speciesLabel.setBounds(10, 10, 200, 25);
        speciesLabel.setFont(new java.awt.Font("Helvetica", 1, 14));
        speciesLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(speciesLabel);

        specieTextField = new JTextField();
        specieTextField.setBounds(10, 40, 200, 25);
        specieTextField.setFont(new java.awt.Font("Helvetica", 1, 14));
        specieTextField.setForeground(new Color(63, 103, 178));
        swapPanel.add(specieTextField);

        tamanioLabel = new JLabel("Tamaño (cm): ");
        tamanioLabel.setBounds(10, 80, 200, 25);
        tamanioLabel.setFont(new Font("Helvetica", 1, 14));
        tamanioLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(tamanioLabel);

        tamanioTextField = new JTextField();
        tamanioTextField.setBounds(10, 110, 200, 25);
        tamanioTextField.setFont(new Font("Helvetica", 1, 14));
        tamanioTextField.setForeground(new Color(63, 103, 178));
        swapPanel.add(tamanioTextField);

        sexoLabel = new JLabel("Sexo: ");
        sexoLabel.setBounds(10, 150, 200, 25);
        sexoLabel.setFont(new Font("Helvetica", 1, 14));
        sexoLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(sexoLabel);

        sexoComboBox = new JComboBox(sexo);
        sexoComboBox.setBounds(10, 180, 200, 25);
        sexoComboBox.setFont(new Font("Helvetica", 1, 14));
        sexoComboBox.setForeground(new Color(63, 103, 178));
        swapPanel.add(sexoComboBox);

        colorLabel = new JLabel("Color: ");
        colorLabel.setBounds(10, 220, 200, 25);
        colorLabel.setFont(new Font("Helvetica", 1, 14));
        colorLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(colorLabel);

        colorTextField = new JTextField();
        colorTextField.setBounds(10, 250, 200, 25);
        colorTextField.setFont(new Font("Helvetica", 1, 14));
        colorTextField.setForeground(new Color(63, 103, 178));
        swapPanel.add(colorTextField);

        cantidadLabel = new JLabel("Cantidad: ");
        cantidadLabel.setBounds(10, 290, 200, 25);
        cantidadLabel.setFont(new Font("Helvetica", 1, 14));
        cantidadLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(cantidadLabel);

        cantidadTextField = new JTextField();
        cantidadTextField.setBounds(10, 320, 200, 25);
        cantidadTextField.setFont(new Font("Helvetica", 1, 14));
        cantidadTextField.setForeground(new Color(63, 103, 178));
        swapPanel.add(cantidadTextField);

        alturaLabel = new JLabel("Altura (m): ");
        alturaLabel.setBounds(10, 360, 200, 25);
        alturaLabel.setFont(new Font("Helvetica", 1, 14));
        alturaLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(alturaLabel);

        alturaTextField = new JTextField();
        alturaTextField.setBounds(10, 390, 200, 25);
        alturaTextField.setFont(new Font("Helvetica", 1, 14));
        alturaTextField.setForeground(new Color(63, 103, 178));
        swapPanel.add(alturaTextField);


        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(700, 700, 200, 40);
        guardarButton.setFont(new Font("Helvetica", 1, 14));
        guardarButton.setForeground(Color.WHITE);
        guardarButton.setBackground(new Color(63, 103, 178));
        guardarButton.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        guardarButton.addActionListener(e -> {
            ave.setEspecie(this.specieTextField.getText());
            ave.setTamanio(this.tamanioTextField.getText());
            ave.setSexo(this.sexoComboBox.getSelectedItem().toString());
            ave.setColor(this.colorTextField.getText());
            ave.setCantidad(this.cantidadTextField.getText());
            ave.setAltura(this.alturaTextField.getText());
            daoave.agregar(ave);
        });
        guardarButton.setActionCommand("guardar");
        swapPanel.add(guardarButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

