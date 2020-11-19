/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.pojo;

import com.mycompany.proyectofinallinea1.services.Select;
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

    public void traeDatos(String nombre, String apellido, String correo, String username, String password) {
        try {
            st = ConexionBaseDatos.conect.conexion().createStatement();
            st.executeUpdate(Select.traeDatos("compradores", username, password));
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPojo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
