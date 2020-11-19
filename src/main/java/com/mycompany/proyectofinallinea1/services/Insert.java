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

    public static String EnviarDatos(String tabla, String campoUno, String campoDos, String campoTres, String campoCuatro, String campoCinco) {
        String query = null;
        if (tabla.equalsIgnoreCase("compradores")) {
            query = "Insert into compradores (nombre, apellido, correo, username, password) VALUES ('"
                    + campoUno + "','" + campoDos + "','" + campoTres + "','" + campoCuatro + "','" + campoCinco + "')";

        }else if (tabla.equalsIgnoreCase("artistas")) {
            query = "Insert into artistas (nombre, nacionalidad, fecha_nacimiento, foto) VALUES ('"
                    + campoUno + "','" + campoDos + "','2000-03-22','foto')";
            System.out.println(query);

        }
        return query;
    }
}
