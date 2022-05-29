package com.isaacflores.application.db;

import com.isaacflores.application.db.Database;
import com.isaacflores.application.db.Operaciones;
import com.isaacflores.application.entities.Rayas;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
/** Clase que contiene los metodos para interactuar con la tabla rayas*/
public class DaoRayas implements Operaciones {
    /** Instancia una nueva conexion a la base de datos*/
    Database db = new Database();
    /** Instancia un nuevo objeto de la clase rayas*/
    Rayas rayas = new Rayas();
    /**Metodo que inserta una nueva fila en la tabla rayas*/
    @Override
    public boolean agregar(Object obj) {
        rayas = (Rayas) obj;
        String sql = "INSERT INTO Rayas (especie, habitat, profundidad, tiempoNavegacion, nubosidad, horaDeLlegada, numeroEmbarcaciones, temperatura, cebo, sexo, parasitos, anzuelos, numeroAnzuelos, tamanio, color, numberOfFins) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection con;
        PreparedStatement pst;
        try {
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            pst = con.prepareStatement(sql);
            pst.setString(1, rayas.getEspecie());
            pst.setString(2, rayas.getHabitat());
            pst.setString(3, rayas.getProfundidad());
            pst.setString(4, rayas.getTiempoNavegacion());
            pst.setString(5, rayas.getNubosidad());
            pst.setString(6, rayas.getHoraDeLlegada());
            pst.setString(7, rayas.getNumeroEmbarcaciones());
            pst.setString(8, rayas.getTemperatura());
            pst.setString(9, rayas.getCebo());
            pst.setString(10, rayas.getSexo());
            pst.setString(11, rayas.getParasitos());
            pst.setString(12, rayas.getAnzuelos());
            pst.setString(13, rayas.getNumeroAnzuelos());
            pst.setString(14, rayas.getTamanio());
            pst.setString(15, rayas.getColor());
            pst.setString(16, rayas.getNumberOfFins());
            int filas = pst.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha agregado el registro correctamente");
                con.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar el registro");
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(null, "Error al agregar el registro");
            return false;
        }
    }
}


