/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.ArtistasCreadosPojo;
import com.mycompany.proyectofinallinea1.services.Conexion;
import com.mycompany.proyectofinallinea1.services.InformacionArtista;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Iván
 */
@Named
@SessionScoped
public class ArtistasCreadosController implements Serializable {

    Conexion conexion;
    Statement st;
    private ArrayList<ArtistasCreadosPojo> lista = new ArrayList<>();
    private ArrayList<ArtistaController> listaEliminados = new ArrayList<>();

    InformacionArtista ia;

    public ArtistasCreadosController() {
        ia = new InformacionArtista();
        lista = ia.listaArtista();
    }

    public ArrayList<ArtistasCreadosPojo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ArtistasCreadosPojo> Lista) {
        this.lista = Lista;
    }

    public String eliminar() throws SQLException {
        for(int i = 0; i < lista.size(); i++){
           // System.out.println(lista.get);
        }
        /*for (ArtistasCreadosPojo acp : lista) {
            if (acp.isSelected()) {
                ResultSet rs = st.executeQuery("DELETE FROM artistas where id_artista = '" + 76 + "'");
                System.out.println("DELETE FROM artistas where id_artista = '" + 76 + "'");
            } else {
                lista = ia.listaArtista();
            }
        }*/
        return "/seguridad/artistasCreados.xhtml";
    }
}
