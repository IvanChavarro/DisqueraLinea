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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iván
 */
public class Conexion {

    Connection conect = null;

    public Connection conexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/tiendadisco", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex);
        }
//Se hace la conexión con el localhost y con la base de datos creada que en éste caso se llamí agata y "root" que por lo general es el usuario de ingreso

        return conect;
    }

}
