package com.isaacflores.application.db;

import java.util.ArrayList;
/**Clase que contiene las operaciones de la base de datos (CRUD)*/
public interface Operaciones {
    /**Metodo que permite insertar una fila en la tabla
     *
     * @param obj Objeto que contiene los datos a insertar
     * @return true si se inserta correctamente, false si no
     */
    public boolean agregar(Object obj);

    /**Metodo que permite modificar una fila en la tabla (no implementado)
     *
     * @param obj Objeto que contiene los datos a modificar
     * @return true si se modifica correctamente, false si no
     */

}
