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
public class CrearCancionesPojo {

    public void envioRegistro(String id_album, String nombreAlbum, String precio) {
        Statement st;
        try {
            st = ConexionBaseDatos.conect.conexion().createStatement();
            st.executeUpdate(Insert.EnviarDatos("cancion", nombreAlbum, precio, id_album, "n/a", "n/a"));
        } catch (SQLException ex) {
            Logger.getLogger(RegistroUserPojo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
