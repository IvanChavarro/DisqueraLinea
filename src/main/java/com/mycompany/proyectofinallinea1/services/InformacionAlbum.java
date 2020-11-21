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
public class InformacionAlbum {

    Conexion conexion;
    Statement st;

    public InformacionAlbum() {
        conexion = new Conexion();
    }

    public List<String> lista() {
        List<String> lista = null;
        try {
            lista = new ArrayList();
            st = conexion.conexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT id_album, nombre FROM album");
            System.out.println("Consulta realizada");
            if(rs.wasNull()){
                System.out.println("No hay datos weon");
            }
            while (rs.next()) {
                lista.add(Integer.toString(rs.getInt("id_album")) + " " + rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            ex.setNextException(ex);
        }
        return lista;
    }
}
