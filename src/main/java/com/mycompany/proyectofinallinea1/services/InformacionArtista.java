/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.services;

import com.mycompany.proyectofinallinea1.pojo.ArtistasCreadosPojo;
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

    public ArrayList<ArtistasCreadosPojo> listaArtista() {
        ArrayList<ArtistasCreadosPojo> listaArtista = new ArrayList<>();
        try {
            String nombre, nacion, fecha, foto;
            Integer id_artista;
            st = conexion.conexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT id_artista, nombre, nacionalidad, fecha_nacimiento, Foto FROM artistas");
            while (rs.next()) {
                id_artista = rs.getInt("id_artista");
                nombre = rs.getString("nombre");
                nacion = rs.getString("nacionalidad");
                fecha = rs.getString("fecha_nacimiento");
                foto = rs.getString("Foto");
                listaArtista.add(new ArtistasCreadosPojo(id_artista, nombre, nacion, fecha, foto));
            }
            System.out.println(listaArtista.size());
            for (int i = 0; i < listaArtista.size(); i++) {
                System.out.println("elecmento " + i + " " + listaArtista.get(i));
            }
        } catch (SQLException ex) {
            ex.setNextException(ex);
        }

        return listaArtista;
    }

    public void eliminarArtista(Integer id_artista, ArrayList lista) throws SQLException {
        st = conexion.conexion().createStatement();
        for (int i = 0; i < lista.size(); i++) {
            ResultSet rs = st.executeQuery("DELETE FROM artistas where id_artista = '"+id_artista+"'");
            System.out.println("DELETE FROM artistas where id_artista = '"+id_artista+"'");
        }
    }

}
