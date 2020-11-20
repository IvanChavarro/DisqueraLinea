/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class CrearAlbumPojo {

    Statement st;
    ArrayList<String> id = null;
    ArrayList<String> artistas = null;

    public ArrayList<String> TraeDatos() {
        try {
            st = ConexionBaseDatos.conect.conexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT id_artista, nombre FROM artistas");
            while (rs.next()) {
                String id;
                String nom;
                id = rs.getString("id_artista");
                nom = rs.getString("nombre");
                this.id.add(id);
                this.artistas.add(nom);
                
            }
            for(int i = 0; i < artistas.size(); i++){
                System.out.println(artistas.get(i));
            }

        } catch (Exception ex) {
            Logger.getLogger(CrearAlbumPojo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return artistas;
    }
}
