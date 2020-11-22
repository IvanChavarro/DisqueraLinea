package com.mycompany.proyectofinallinea1.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.proyectofinallinea1.pojo.ArtistaPojo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author Iván
 */
@Named(value = "artistaController")
@RequestScoped
public class ArtistaController {

    private UploadedFile file;
    private String nombre, nacionalidad;
    private byte auxDisabled = 0;
    private String message;
    private Date fecha_nac;
    String ruta_temporal;

    public ArtistaController() {
        this.file = null;
        this.nombre = null;
        this.nacionalidad = null;
        this.auxDisabled = 0;
        this.message = null;
        this.fecha_nac = null;
        this.ruta_temporal = "C://xampp//LineaDeProfundizacion/";
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile uploadedFile = event.getFile();
        String fileName = uploadedFile.getFileName();
        byte[] contents = uploadedFile.getContent();
        try {
            this.ruta_temporal += fileName.replace(" ", "");
            FileOutputStream fos = new FileOutputStream(ruta_temporal);
            fos.write(contents);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviar(Date fecha_nac) {
        System.out.println("El nombre es " + this.ruta_temporal);
        SimpleDateFormat formato = new SimpleDateFormat("YYY-MM-dd");
        String fec;
        fec = (formato.format(fecha_nac));
        ArtistaPojo artista = new ArtistaPojo();
        artista.envioRegistro(nombre, nacionalidad, fec, ruta_temporal);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("../seguridad/administrador.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ArtistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UploadedFile getFile() {
        auxDisabled = 1;
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
        auxDisabled = 1;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public byte getAuxDisabled() {
        return auxDisabled;
    }

    public void setAuxDisabled(byte auxDisabled) {
        this.auxDisabled = auxDisabled;
    }

}
