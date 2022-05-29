package com.isaacflores.controller.ui;


import com.isaacflores.view.gui.MainMenu;
/** interfaz de usuario, que compone la información que se envía al cliente y los mecanismos interacción con éste.*/
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }

}
