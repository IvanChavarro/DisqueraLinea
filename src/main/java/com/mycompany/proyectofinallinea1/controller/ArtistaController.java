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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author Iván
 */
@Named(value = "artistaController")
@SessionScoped
public class ArtistaController implements Serializable {

    private UploadedFile file;
    private String nombre, nacionalidad;
    private byte auxDisabled = 0;
    private String message;
    private Date fecha_nac;
    private String ruta_temporal = "..//LineaDeProfundizacion/";
    private String ruta = "C://Users//ivan_//OneDrive//Documentos//NetBeansProjects//ProyectoFinalLinea1//src//main//webapp//LineaDeProfundizacion/";
    public ArtistaController() {
        
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile uploadedFile = event.getFile();
        String fileName = uploadedFile.getFileName();
        byte[] contents = uploadedFile.getContent();
        try {
            this.ruta += fileName.replace(" ", "");
            this.ruta_temporal+=fileName.replace(" ", "");
            FileOutputStream fos = new FileOutputStream(ruta);
            fos.write(contents);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void enviar(Date fecha_nac) {
        System.out.println("La ruta temporal es: " + ruta_temporal);
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
        this.nombre = null;
        this.nacionalidad = null;
        this.fecha_nac = null;
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

    public String getRuta_temporal() {
        return ruta_temporal;
    }

    public void setRuta_temporal(String ruta_temporal) {
        this.ruta_temporal = ruta_temporal;
    }

}
