/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.CrearAlbumPojo;
import com.mycompany.proyectofinallinea1.services.InformacionArtista;
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
public class CrearAlbumController {

    private String nombreAlbum, precio, artistaSeleccionado;
    private List<String> lista = null;
    String SPartista[];
    String id_artista;

    public CrearAlbumController() {
        InformacionArtista ia = new InformacionArtista();
        lista = ia.lista();
    }

    public void enviar() {
        System.out.println("nombre del album: " + nombreAlbum);
        System.out.println("Precio: " + precio);
        SPartista = artistaSeleccionado.split(" ");
        id_artista = SPartista[0];
        System.out.println("Artista: "+id_artista);
        CrearAlbumPojo cap = new CrearAlbumPojo();
        cap.envioRegistro(id_artista, nombreAlbum, precio);
        try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/administrador.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(ArtistaController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public String getArtistaSeleccionado() {
        return artistaSeleccionado;
    }

    public void setArtistaSeleccionado(String artistaSeleccionado) {
        this.artistaSeleccionado = artistaSeleccionado;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
