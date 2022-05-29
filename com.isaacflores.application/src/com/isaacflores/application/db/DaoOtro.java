package com.isaacflores.application.db;

import com.isaacflores.application.db.Database;
import com.isaacflores.application.db.Operaciones;
import com.isaacflores.application.entities.Otro;

import javax.swing.*;
import java.sql.*;

import java.util.ArrayList;
/** Clase que contiene los metodos para interactuar con la base de datos Tiburones*/
public class DaoOtro implements Operaciones {
    /** Instancia una nueva conexion a la base de datos*/
    Database db = new Database();
    /** Instancia un nuevo objeto de la clase Tiburones*/
    Otro otro = new Otro();

    /** Metodo que permite agregar un nuevo registro a la tabla Tiburones*/
    @Override
    public boolean agregar(Object obj) {
        String sql = "INSERT INTO Otro (especie, cantidad, tamanio, sexo, color) VALUES(?, ?, ?, ?, ?)";
        otro = (Otro) obj;
        Connection con;
        PreparedStatement pst;
        try {
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            pst = con.prepareStatement(sql);
            pst.setString(1, otro.getEspecie());
            pst.setString(2, otro.getCantidad());
            pst.setString(3, otro.getTamanio());
            pst.setString(4, otro.getSexo());
            pst.setString(5, otro.getColor());
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
