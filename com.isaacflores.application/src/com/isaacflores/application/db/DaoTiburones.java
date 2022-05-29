package com.isaacflores.application.db;

import com.isaacflores.application.db.Database;
import com.isaacflores.application.db.Operaciones;
import com.isaacflores.application.entities.Tiburones;

import javax.swing.*;
import java.sql.*;

import java.util.ArrayList;
/** Clase que contiene los metodos para interactuar con la base de datos Tiburones*/
public class DaoTiburones implements Operaciones {
    /** Instancia una nueva conexion a la base de datos*/
    Database db = new Database();
    /** Instancia un nuevo objeto de la clase Tiburones*/
    Tiburones tiburones = new Tiburones();

    /** Metodo que permite agregar un nuevo registro a la tabla Tiburones*/
    @Override
    public boolean agregar(Object obj) {
        tiburones = (Tiburones) obj;
        String sql = "INSERT INTO Tiburones (especie, habitat, profundidad, tiempoNavegacion, nubosidad, horaDeLlegada, numeroEmbarcaciones, temperatura, cebo, sexo, parasitos, anzuelos, numeroAnzuelos, tamanio, color, numberOfFins) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection con;
        PreparedStatement pst;
        try {
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            pst = con.prepareStatement(sql);
            pst.setString(1, tiburones.getEspecie());
            pst.setString(2, tiburones.getHabitat());
            pst.setString(3, tiburones.getProfundidad());
            pst.setString(4, tiburones.getTiempoNavegacion());
            pst.setString(5, tiburones.getNubosidad());
            pst.setString(6, tiburones.getHoraDeLlegada());
            pst.setString(7, tiburones.getNumeroEmbarcaciones());
            pst.setString(8, tiburones.getTemperatura());
            pst.setString(9, tiburones.getCebo());
            pst.setString(10, tiburones.getSexo());
            pst.setString(11, tiburones.getParasitos());
            pst.setString(12, tiburones.getAnzuelos());
            pst.setString(13, tiburones.getNumeroAnzuelos());
            pst.setString(14, tiburones.getTamanio());
            pst.setString(15, tiburones.getColor());
            pst.setString(16, tiburones.getNumberOfFins());
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
