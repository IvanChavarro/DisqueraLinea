/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.pojo;

import com.mycompany.proyectofinallinea1.services.Insert;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class ArtistaPojo {
Statement st;
    public void envioRegistro(String nombre, String nacionalidad, String ruta) {
        try {
            st = ConexionBaseDatos.conect.conexion().createStatement();
            st.executeUpdate(Insert.EnviarDatos("artistas", nombre, nacionalidad, "22-03-2000", "n/a", ruta ));
        } catch (SQLException ex) {
            Logger.getLogger(RegistroUserPojo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
