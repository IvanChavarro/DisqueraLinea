/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.services;
/**
 *
 * @author Iván
 */
public class Insert {

    public static String EnviarDatos(String tabla, String campoUno, String campoDos, String campoTres, String campoCuatro, String campoCinco) {
        String query = null;
        if (tabla.equalsIgnoreCase("compradores")) {
            /*Campo1 = nombr, campo2 = apellido, campo3 = correo, campo4 = username, campo5 = password*/
            query = "Insert into compradores (nombre, apellido, correo, username, password) VALUES ('"
                    + campoUno + "','" + campoDos + "','" + campoTres + "','" + campoCuatro + "','" + campoCinco + "')";

        } else if (tabla.equalsIgnoreCase("artistas")) {
            /*Campo1 = nombre, campo2 = nacionalidad, campo3 = fecha de nacimiento, campoCinco = Foto*/
            query = "Insert into artistas (nombre, nacionalidad, fecha_nacimiento, foto) VALUES ('"
                    + campoUno + "','" + campoDos + "','"+campoTres+"','" + campoCinco + "')";
        }
        return query;
    }
}
