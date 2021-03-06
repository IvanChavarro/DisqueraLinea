/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Iván
 */
@Named(value = "administradorController")
@RequestScoped
public class AdministradorController {

    /**
     * Creates a new instance of AdministradorController
     */
    public AdministradorController() {
        
    }

    public void registraArtista() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/artista.xhtml");
    }
    
    public void mostrarArtistas() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/artistasCreados.xhtml");
    }

    public void registrarAlbum() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/crearAlbum.xhtml");
    }

    public void registrarCancion() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/crearCanciones.xhtml");
    }
}
