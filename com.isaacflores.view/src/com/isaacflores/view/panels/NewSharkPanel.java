package com.isaacflores.view.panels;

import com.isaacflores.application.db.DaoTiburones;
import com.isaacflores.application.entities.Tiburones;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Panel para la creacion de tiburones*/
public class NewSharkPanel extends JPanel implements ActionListener {
    /**Instancia de la clase tiburones*/
    Tiburones tb = new Tiburones();
    /**Instancia de la clase DaoTiburones*/
    DaoTiburones daotb = new DaoTiburones();
    /** JLabel para el tiempo de navegación*/
    private JLabel tiemponavLabel;
    /** TextField para el tiempo de navegación*/
    private JTextField tiemponavTextField;
    /** Jlabel para la nubosidad*/
    private JLabel nubosidadLabel;
    /** JComboBox para la nubosidad*/
    private JComboBox nubosidadComboBox;
    /** String para la nubosidad*/
    private String[] nubosidad = {"","Nuboso", "No nuboso"};
    /** JLabel para la Hora de llegada*/
    private JLabel horaLLegadaLabel;
    /** JLabel para la Hora de llegada al lugar*/
    private JTextField horaLLegadaTextField;
    /** Label para el numero de embarcaciones*/
    private JLabel numeroE;
    /** TextField para el numero de embarcaciones*/
    private JTextField numeroETextField;
    /** Label para la temperatura*/
    private JLabel temperaturaLabel;
    /** TextField para la temperatura*/
    private JTextField temperaturaTextField;
    /** Label para el cebo*/
    private JLabel ceboLabel;
    /** TextField para el cebo*/
    private JTextField ceboField;
    /** Label para parasitos*/
    private JLabel parasitosLabel;
    /** TextField para parasitos*/
    private JComboBox parasitosComboBox;
    /** String para parasitos*/
    private String[] parasitos = {"","Si", "No"};
    /** Label para anzuelos*/
    private JLabel anzueloLabel;
    /** TextField para anzuelos*/
    private JComboBox anzueloComboBox;
    /** String para anzuelos*/
    private String[] anzuelo = {"","Si", "No"};
    /** Label para el numero de anzuelos*/
    private JLabel numeroAnzueloLabel;
    /** TextField para el numero de anzuelos*/
    private JTextField numeroAnzueloTextField;
    /** label para el color*/
    private JLabel colorLabel;
    /** TextField para el color*/
    private JTextField colorTextField;
    /** Label para el panel de intercambio*/
    private JPanel swapPanel;
    /** Label para la especie*/
    private JLabel speciesLabel;
    /** ComboBox para la especie*/
    private JComboBox speciesComboBox;
    /** String para la especie*/
    String[] species = {"GALEORHINUS FALEUS",
            "HEXANCHUS GRISEUS",
            "ISURUS OXYRINCHUS",
            "LAMNA NARUS",
            "MUSTELUS ASTERIAS",
            "ODOTASPIS FEROX",
            "OXYNOTUS CENTRINA",
            "PRIONACE GLAUCA",
            "SCYLIORHINUS STELLARIS",
            "SQUALUS ACANTHIAS",
            "SQUATINA SQUATINA",
            "CETORHINUS MAXIMUS"
    };
    /**Label del habitat*/
    private JLabel habitatLabel;
    /**ComboBox del habitat*/
    private JComboBox habitatComboBox;
    /**String del habitat*/
    private String[] habitat = {"","Demarsal", "Pelagic", "No definido"};
    /**Label de la profundidad*/
    private JLabel profundidadLabel;
    /**TextField de la profundidad*/
    private JTextField profundidadTextField;
    /** label del tamano*/
    private JLabel tamanoLabel;
    /** TextField del tamano*/
    private JTextField tamanoTextField;
    /** Label del sexo*/
    private JLabel sexoLabel;
    /** Combobox del sexo*/
    private JComboBox sexoComboBox;
    /** String del sexo*/
    private String[] sexo = {"","Macho", "Hembra"};
    /** Label del numero de aletas*/
    private JLabel numberOfFinsLabel;
    /** TextField del numero de aletas*/
    private JTextField numberOfFinsTextField;
    /** Contiene el Panel de añadir un nuevo tiburón*/
    public NewSharkPanel() {

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

        speciesComboBox = new JComboBox(species);
        speciesComboBox.setBounds(10, 40, 200, 25);
        speciesComboBox.setFont(new Font("Helvetica", 1, 14));
        speciesComboBox.setForeground(new Color(63, 103, 178));
        speciesComboBox.setBackground(Color.WHITE);
        speciesComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(speciesComboBox);


        habitatLabel = new JLabel("*Seleccione un habitat");
        habitatLabel.setBounds(10, 70, 200, 25);
        habitatLabel.setFont(new Font("Helvetica", 1, 14));
        habitatLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(habitatLabel);

        habitatComboBox = new JComboBox(habitat);
        habitatComboBox.setBounds(10, 100, 200, 25);
        habitatComboBox.setFont(new Font("Helvetica", 1, 14));
        habitatComboBox.setForeground(new Color(63, 103, 178));
        habitatComboBox.setBackground(Color.WHITE);
        habitatComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(habitatComboBox);

        sexoLabel = new JLabel("*Sexo");
        sexoLabel.setBounds(230, 70, 300, 25);
        sexoLabel.setFont(new Font("Helvetica", 1, 14));
        sexoLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(sexoLabel);

        sexoComboBox = new JComboBox(sexo);
        sexoComboBox.setBounds(230, 100, 100, 25);
        sexoComboBox.setFont(new Font("Helvetica", 1, 14));
        sexoComboBox.setForeground(new Color(63, 103, 178));
        sexoComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(sexoComboBox);

        numberOfFinsLabel = new JLabel("*Numero de aletas");
        numberOfFinsLabel.setBounds(350, 70, 150, 25);
        numberOfFinsLabel.setFont(new Font("Helvetica", 1, 14));
        numberOfFinsLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(numberOfFinsLabel);

        numberOfFinsTextField = new JTextField();
        numberOfFinsTextField.setBounds(350, 100, 150, 25);
        numberOfFinsTextField.setFont(new Font("Helvetica", 1, 14));
        numberOfFinsTextField.setForeground(new Color(63, 103, 178));
        numberOfFinsTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(numberOfFinsTextField);

        colorLabel = new JLabel("*Color");
        colorLabel.setBounds(540, 70, 300, 25);
        colorLabel.setFont(new Font("Helvetica", 1, 14));
        colorLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(colorLabel);

        colorTextField = new JTextField();
        colorTextField.setBounds(540, 100, 200, 25);
        colorTextField.setFont(new Font("Helvetica", 1, 14));
        colorTextField.setForeground(new Color(63, 103, 178));
        colorTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(colorTextField);

        profundidadLabel = new JLabel("*Ingrese la profundidad");
        profundidadLabel.setBounds(10, 130, 200, 25);
        profundidadLabel.setFont(new Font("Helvetica", 1, 14));
        profundidadLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(profundidadLabel);

        profundidadTextField = new JTextField();
        profundidadTextField.setBounds(10, 160, 200, 25);
        profundidadTextField.setFont(new Font("Helvetica", 1, 14));
        profundidadTextField.setForeground(new Color(63, 103, 178));
        profundidadTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(profundidadTextField);

        tamanoLabel = new JLabel("*Ingrese el tamaño");
        tamanoLabel.setBounds(330, 130, 200, 25);
        tamanoLabel.setFont(new Font("Helvetica", 1, 14));
        tamanoLabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(tamanoLabel);

        tamanoTextField = new JTextField();
        tamanoTextField.setBounds(330, 160, 200, 25);
        tamanoTextField.setFont(new Font("Helvetica", 1, 14));
        tamanoTextField.setForeground(new Color(63, 103, 178));
        tamanoTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        swapPanel.add(tamanoTextField);





        //Pro Sharks
        JLabel prosharklabel = new JLabel("Pro Sharks");
        prosharklabel.setBounds(10, 190, 100, 25);
        prosharklabel.setFont(new Font("Helvetica", 2, 14));
        prosharklabel.setForeground(new Color(63, 103, 178));
        swapPanel.add(prosharklabel);


        JRadioButton siPro=new JRadioButton("Si",false);
        JRadioButton noPro=new JRadioButton("No",true);
        ButtonGroup groupPro=new ButtonGroup();
        groupPro.add(siPro);
        groupPro.add(noPro);
        siPro.setBounds(120,190,50,25);
        noPro.setBounds(170,190,50,25);
        siPro.setFont(new Font("Helvetica", 1, 14));
        noPro.setFont(new Font("Helvetica", 1, 14));
        siPro.setForeground(new Color(63, 103, 178));
        noPro.setForeground(new Color(63, 103, 178));
        swapPanel.add(siPro);
        swapPanel.add(noPro);

        siPro.addActionListener(e -> {
            if(siPro.isSelected()){
                tiemponavLabel.setVisible(true);
                tiemponavTextField.setVisible(true);
                nubosidadLabel.setVisible(true);
                nubosidadComboBox.setVisible(true);
                horaLLegadaLabel.setVisible(true);
                horaLLegadaTextField.setVisible(true);
                numeroE.setVisible(true);
                numeroETextField.setVisible(true);
                temperaturaLabel.setVisible(true);
                temperaturaTextField.setVisible(true);
                ceboLabel.setVisible(true);
                ceboField.setVisible(true);
                parasitosLabel.setVisible(true);
                parasitosComboBox.setVisible(true);
                anzueloLabel.setVisible(true);
                anzueloComboBox.setVisible(true);
                numeroAnzueloLabel.setVisible(true);
                numeroAnzueloTextField.setVisible(true);
                revalidate();
                repaint();

            }
        });
        noPro.addActionListener(e -> {
            if(noPro.isSelected()){
                tiemponavLabel.setVisible(false);
                tiemponavTextField.setVisible(false);
                nubosidadLabel.setVisible(false);
                nubosidadComboBox.setVisible(false);
                horaLLegadaLabel.setVisible(false);
                horaLLegadaTextField.setVisible(false);
                numeroE.setVisible(false);
                numeroETextField.setVisible(false);
                temperaturaLabel.setVisible(false);
                temperaturaTextField.setVisible(false);
                ceboLabel.setVisible(false);
                ceboField.setVisible(false);
                parasitosLabel.setVisible(false);
                parasitosComboBox.setVisible(false);
                anzueloLabel.setVisible(false);
                anzueloComboBox.setVisible(false);
                numeroAnzueloLabel.setVisible(false);
                numeroAnzueloTextField.setVisible(false);
                revalidate();
                repaint();
            }
        });



        tiemponavLabel = new JLabel("*Ingrese el tiempo de navegacion");
        tiemponavLabel.setBounds(10, 220, 300, 25);
        tiemponavLabel.setFont(new Font("Helvetica", 1, 14));
        tiemponavLabel.setForeground(new Color(63, 103, 178));
        tiemponavLabel.setVisible(false);
        swapPanel.add(tiemponavLabel);

        tiemponavTextField = new JTextField();
        tiemponavTextField.setBounds(10, 250, 300, 25);
        tiemponavTextField.setFont(new Font("Helvetica", 1, 14));
        tiemponavTextField.setForeground(new Color(63, 103, 178));
        tiemponavTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        tiemponavTextField.setVisible(false);
        swapPanel.add(tiemponavTextField);

        nubosidadLabel = new JLabel("*Ingrese la nubosidad");
        nubosidadLabel.setBounds(320, 220, 300, 25);
        nubosidadLabel.setFont(new Font("Helvetica", 1, 14));
        nubosidadLabel.setForeground(new Color(63, 103, 178));
        nubosidadLabel.setVisible(false);
        swapPanel.add(nubosidadLabel);

        nubosidadComboBox = new JComboBox(nubosidad);
        nubosidadComboBox.setBounds(320, 250, 300, 25);
        nubosidadComboBox.setFont(new Font("Helvetica", 1, 14));
        nubosidadComboBox.setForeground(new Color(63, 103, 178));
        nubosidadComboBox.setBackground(Color.WHITE);
        nubosidadComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        nubosidadComboBox.setVisible(false);
        swapPanel.add(nubosidadComboBox);

        horaLLegadaLabel = new JLabel("*Hora de llegada a la zona de muestreo");
        horaLLegadaLabel.setBounds(10, 280, 300, 25);
        horaLLegadaLabel.setFont(new Font("Helvetica", 1, 14));
        horaLLegadaLabel.setForeground(new Color(63, 103, 178));
        horaLLegadaLabel.setVisible(false);
        swapPanel.add(horaLLegadaLabel);

        horaLLegadaTextField = new JTextField();
        horaLLegadaTextField.setBounds(10, 310, 300, 25);
        horaLLegadaTextField.setFont(new Font("Helvetica", 1, 14));
        horaLLegadaTextField.setForeground(new Color(63, 103, 178));
        horaLLegadaTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        horaLLegadaTextField.setVisible(false);
        swapPanel.add(horaLLegadaTextField);

        numeroE = new JLabel("*Numero de embarcaciones en la zona");
        numeroE.setBounds(320, 280, 300, 25);
        numeroE.setFont(new Font("Helvetica", 1, 14));
        numeroE.setForeground(new Color(63, 103, 178));
        numeroE.setVisible(false);
        swapPanel.add(numeroE);

        numeroETextField = new JTextField();
        numeroETextField.setBounds(320, 310, 300, 25);
        numeroETextField.setFont(new Font("Helvetica", 1, 14));
        numeroETextField.setForeground(new Color(63, 103, 178));
        numeroETextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        numeroETextField.setVisible(false);
        swapPanel.add(numeroETextField);

        temperaturaLabel = new JLabel("*Temperatura superficial");
        temperaturaLabel.setBounds(10, 340, 300, 25);
        temperaturaLabel.setFont(new Font("Helvetica", 1, 14));
        temperaturaLabel.setForeground(new Color(63, 103, 178));
        temperaturaLabel.setVisible(false);
        swapPanel.add(temperaturaLabel);

        temperaturaTextField = new JTextField();
        temperaturaTextField.setBounds(10, 370, 300, 25);
        temperaturaTextField.setFont(new Font("Helvetica", 1, 14));
        temperaturaTextField.setForeground(new Color(63, 103, 178));
        temperaturaTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        temperaturaTextField.setVisible(false);
        swapPanel.add(temperaturaTextField);

        ceboLabel = new JLabel("*Cebo");
        ceboLabel.setBounds(320, 340, 300, 25);
        ceboLabel.setFont(new Font("Helvetica", 1, 14));
        ceboLabel.setForeground(new Color(63, 103, 178));
        ceboLabel.setVisible(false);
        swapPanel.add(ceboLabel);

        ceboField = new JTextField();
        ceboField.setBounds(320, 370, 300, 25);
        ceboField.setFont(new Font("Helvetica", 1, 14));
        ceboField.setForeground(new Color(63, 103, 178));
        ceboField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        ceboField.setVisible(false);
        swapPanel.add(ceboField);

        parasitosLabel = new JLabel("*Parasitos");
        parasitosLabel.setBounds(320, 400, 300, 25);
        parasitosLabel.setFont(new Font("Helvetica", 1, 14));
        parasitosLabel.setForeground(new Color(63, 103, 178));
        parasitosLabel.setVisible(false);
        swapPanel.add(parasitosLabel);

        parasitosComboBox = new JComboBox(parasitos);
        parasitosComboBox.setBounds(320, 430, 300, 25);
        parasitosComboBox.setFont(new Font("Helvetica", 1, 14));
        parasitosComboBox.setForeground(new Color(63, 103, 178));
        parasitosComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        parasitosComboBox.setVisible(false);
        swapPanel.add(parasitosComboBox);

        anzueloLabel = new JLabel("*Anzuelo");
        anzueloLabel.setBounds(10, 460, 300, 25);
        anzueloLabel.setFont(new Font("Helvetica", 1, 14));
        anzueloLabel.setForeground(new Color(63, 103, 178));
        anzueloLabel.setVisible(false);
        swapPanel.add(anzueloLabel);

        anzueloComboBox = new JComboBox(anzuelo);
        anzueloComboBox.setBounds(10, 490, 200, 25);
        anzueloComboBox.setFont(new Font("Helvetica", 1, 14));
        anzueloComboBox.setForeground(new Color(63, 103, 178));
        anzueloComboBox.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        anzueloComboBox.setVisible(false);
        swapPanel.add(anzueloComboBox);

        numeroAnzueloLabel = new JLabel("*Numero de anzuelo");
        numeroAnzueloLabel.setBounds(320, 460, 300, 25);
        numeroAnzueloLabel.setFont(new Font("Helvetica", 1, 14));
        numeroAnzueloLabel.setForeground(new Color(63, 103, 178));
        numeroAnzueloLabel.setVisible(false);
        swapPanel.add(numeroAnzueloLabel);

        numeroAnzueloTextField = new JTextField();
        numeroAnzueloTextField.setBounds(320, 490, 200, 25);
        numeroAnzueloTextField.setFont(new Font("Helvetica", 1, 14));
        numeroAnzueloTextField.setForeground(new Color(63, 103, 178));
        numeroAnzueloTextField.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        numeroAnzueloTextField.setVisible(false);
        swapPanel.add(numeroAnzueloTextField);




        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(700, 700, 200, 40);
        guardarButton.setFont(new Font("Helvetica", 1, 14));
        guardarButton.setForeground(Color.WHITE);
        guardarButton.setBackground(new Color(63, 103, 178));
        guardarButton.setBorder(BorderFactory.createLineBorder(new Color(63, 103, 178)));
        guardarButton.addActionListener(e -> {
            tb.setEspecie(this.speciesComboBox.getSelectedItem().toString());
            tb.setHabitat(this.habitatComboBox.getSelectedItem().toString());
            tb.setProfundidad(this.profundidadTextField.getText());
            tb.setTamanio(this.tamanoTextField.getText());
            tb.setSexo(this.sexoComboBox.getSelectedItem().toString());
            tb.setNumberOfFins(this.numberOfFinsTextField.getText());
            tb.setTiempoNavegacion(this.tiemponavTextField.getText());
            tb.setNubosidad(this.nubosidadComboBox.getSelectedItem().toString());
            tb.setHoraDeLlegada(this.horaLLegadaTextField.getText());
            tb.setNumeroEmbarcaciones(this.numeroETextField.getText());
            tb.setTemperatura(this.temperaturaTextField.getText());
            tb.setCebo(this.ceboField.getText());
            tb.setParasitos(this.parasitosComboBox.getSelectedItem().toString());
            tb.setAnzuelos(this.anzueloComboBox.getSelectedItem().toString());
            tb.setNumeroAnzuelos(this.numeroAnzueloTextField.getText());
            tb.setColor(this.colorTextField.getText());
            daotb.agregar(this.tb);
        });
        guardarButton.setActionCommand("guardar");
        swapPanel.add(guardarButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

