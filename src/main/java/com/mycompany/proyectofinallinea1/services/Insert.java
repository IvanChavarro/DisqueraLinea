/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.services;

import com.mycompany.proyectofinallinea1.pojo.ConexionBaseDatos;
import com.mycompany.proyectofinallinea1.pojo.RegistroUserPojo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class Insert {

    public static String EnviarDatos(String tabla, String nombre, String apellido, String correo, String username, String password) {
        String query = null;
        if (tabla.equalsIgnoreCase("compradores")) {
            query = "Insert into compradores (nombre, apellido, correo, username, password) VALUES ('"
                    + nombre + "','" + apellido + "','" + correo + "','" + username + "','" + password + "')";

        }
        return query;
    }
}
