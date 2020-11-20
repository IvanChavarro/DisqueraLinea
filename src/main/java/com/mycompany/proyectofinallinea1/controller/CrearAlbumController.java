/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.CrearAlbumPojo;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Iván
 */
@Named
@RequestScoped
public class CrearAlbumController {

    private String nombreAlbum, precio;

    public void enviar(){
        CrearAlbumPojo crearAlbumPojo = new CrearAlbumPojo();
        crearAlbumPojo.TraeDatos();
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
