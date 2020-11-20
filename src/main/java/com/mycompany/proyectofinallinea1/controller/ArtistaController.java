package com.mycompany.proyectofinallinea1.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.proyectofinallinea1.pojo.ArtistaPojo;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
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
@SessionScoped
public class ArtistaController implements Serializable {

    /* private Date date9;
     private Date dateDe;
     private Date dateTimeDe;
     private List<Date> multi;
     private List<Date> range;
     private List<Date> invalidDates;
     private List<Integer> invalidDays;
     private Date minDate;
     private Date maxDate;
     private Date minTime;
     private Date maxTime;
     private Date minDateTime;
     private Date maxDateTime;
     */
    private UploadedFile file;
    private String nombre, nacionalidad;
    private byte auxDisabled = 0;
    String so = System.getProperty("os.name");
    String ruta_temporal = "C://xampp//LineaDeProfundizacion/";

    public ArtistaController() {

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

    public void enviar() {
        System.out.println("El nombre es " + this.ruta_temporal);
        ArtistaPojo artista = new ArtistaPojo();
        artista.envioRegistro(nombre, nacionalidad, ruta_temporal);
    }

    public UploadedFile getFile() {
        auxDisabled = 1;
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
        auxDisabled = 1;
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

/*@PostConstruct
 public void init() {
 invalidDates = new ArrayList<>();
 Date today = new Date();
 invalidDates.add(today);
 long oneDay = 24 * 60 * 60 * 1000;
 for (int i = 0; i < 5; i++) {
 invalidDates.add(new Date(invalidDates.get(i).getTime() + oneDay));
 }

 invalidDays = new ArrayList<>();
 invalidDays.add(0);
        
 invalidDays.add(3);

 minDate = new Date(today.getTime() - (365 * oneDay));
 maxDate = new Date(today.getTime() + (365 * oneDay));

 Calendar tmp = Calendar.getInstance();
 tmp.set(Calendar.HOUR_OF_DAY, 9);
 tmp.set(Calendar.MINUTE, 0);
 tmp.set(Calendar.SECOND, 0);
 tmp.set(Calendar.MILLISECOND, 0);
 minTime = (Date) tmp.getTime();

 tmp = Calendar.getInstance();
 tmp.set(Calendar.HOUR_OF_DAY, 17);
 tmp.set(Calendar.MINUTE, 0);
 tmp.set(Calendar.SECOND, 0);
 tmp.set(Calendar.MILLISECOND, 0);
 maxTime = (Date) tmp.getTime();

 minDateTime = new Date(today.getTime() - (7 * oneDay));
 maxDateTime = new Date(today.getTime() + (7 * oneDay));

 dateDe = (Date) GregorianCalendar.getInstance().getTime();
 dateTimeDe = (Date) GregorianCalendar.getInstance().getTime();
 }

 public void onDateSelect(SelectEvent<Date> event) {
 FacesContext facesContext = FacesContext.getCurrentInstance();
 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
 facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
 }

 public void click() {
 PrimeFaces.current().ajax().update("form:display");
 PrimeFaces.current().executeScript("PF('dlg').show()");
 }

 public Date getDate9() {
 return date9;
 }

 public void setDate9(Date date9) {
 this.date9 = date9;
 }

 }
 */
