package com.isaacflores.application.db;


import com.isaacflores.application.entities.Ave;


import javax.swing.*;
import java.sql.*;

import java.util.ArrayList;
/** Clase que contiene los metodos para interactuar con la base de datos Ave*/
public class DaoAve implements Operaciones {
    /** Instancia una nueva conexion a la base de datos*/
    Database db = new Database();
    /** Instancia un nuevo objeto de la clase Ave*/
    Ave ave = new Ave();

    /** Metodo que permite agregar un nuevo registro a la tabla Ave*/
    @Override
    public boolean agregar(Object obj) {
        String sql = "INSERT INTO Aves (especie, cantidad, tamanio, sexo, altura) VALUES(?, ?, ?, ?, ?)";
        ave = (Ave) obj;
        Connection con;
        PreparedStatement pst;
        try {
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            pst = con.prepareStatement(sql);
            pst.setString(1, ave.getEspecie());
            pst.setString(2, ave.getCantidad());
            pst.setString(3, ave.getTamanio());
            pst.setString(4, ave.getSexo());
            pst.setString(5, ave.getAltura());

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
