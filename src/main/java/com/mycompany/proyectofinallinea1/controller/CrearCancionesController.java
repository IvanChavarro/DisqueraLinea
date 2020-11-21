/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.CrearCancionesPojo;
import com.mycompany.proyectofinallinea1.services.InformacionAlbum;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Iván
 */
@Named
@RequestScoped
public class CrearCancionesController {

    /**
     * Creates a new instance of CrearCancionesController
     */
    private String nombreCancion, precio, albumSeleccionado;
    private List<String> lista = null;
    String SPalbum[];
    String id_album;

    public CrearCancionesController() {
        InformacionAlbum ia = new InformacionAlbum();
        lista = ia.lista();
    }
    
    public void enviar() {
        System.out.println("nombre de la canción: " + nombreCancion);
        System.out.println("Precio: " + precio);
        SPalbum = albumSeleccionado.split(" ");
        id_album = SPalbum[0];
        System.out.println("Artista: "+id_album);
        CrearCancionesPojo cap = new CrearCancionesPojo();
        cap.envioRegistro(id_album, nombreCancion, precio);
        try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/administrador.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(ArtistaController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAlbumSeleccionado() {
        return albumSeleccionado;
    }

    public void setAlbumSeleccionado(String albumSeleccionado) {
        this.albumSeleccionado = albumSeleccionado;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public String[] getSPalbum() {
        return SPalbum;
    }

    public void setSPalbum(String[] SPalbum) {
        this.SPalbum = SPalbum;
    }

    public String getId_album() {
        return id_album;
    }

    public void setId_album(String id_album) {
        this.id_album = id_album;
    }


}
