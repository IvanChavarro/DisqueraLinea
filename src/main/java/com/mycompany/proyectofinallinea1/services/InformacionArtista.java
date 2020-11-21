/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iván
 */
public class InformacionArtista {

    Conexion conexion;
    Statement st;

    public InformacionArtista() {
        conexion = new Conexion();
    }

    public List<String> lista() {
        List<String> lista = null;
        try {
            lista = new ArrayList();
            st = conexion.conexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT id_artista, nombre FROM artistas");
            System.out.println("Consulta realizada");

            while (rs.next()) {
                lista.add(Integer.toString(rs.getInt("id_artista")) + " " + rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            ex.setNextException(ex);
        }
        return lista;
    }
}
