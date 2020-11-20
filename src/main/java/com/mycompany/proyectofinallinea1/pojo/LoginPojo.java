/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class LoginPojo {

    Statement st;

    public String traeDatos(String username, String password) {
        String dato = null;
        String user = null;
        String pass = null;
        try {
            st = ConexionBaseDatos.conect.conexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM administrador where nombre = '" + username + "' and password = '" + password + "'");
            System.out.println(rs.toString());
            while (rs.next()) {
                user = rs.getString("nombre");
                pass = rs.getString("password");
            }
            System.out.println("user "+user+" username "+username);
            if (user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
                dato = "Admin";
                System.out.println(dato + " Dato");
            }
            
        } catch (SQLException ex) {
            try {
                st = ConexionBaseDatos.conect.conexion().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM compradores where username = '" + username + "' and password = '" + password + "'");
                while (rs.next()) {
                    user = rs.getString("username");
                    pass = rs.getString("password");
                }
                if (username.equalsIgnoreCase(user) && password.equalsIgnoreCase(user)) {
                    dato = "Comprador";
                }

            } catch (SQLException ex1) {
                Logger.getLogger(LoginPojo.class.getName()).log(Level.SEVERE, null, ex1);
                dato = "falso";
            }
        }
        System.out.println("clase dato: " + dato);
        return dato;
    }

}
