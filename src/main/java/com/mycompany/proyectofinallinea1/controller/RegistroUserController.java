/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.RegistroUserPojo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Iván
 */
@Named(value = "registroUserController")
@RequestScoped
public class RegistroUserController{

    /**
     * Creates a new instance of RegistroUserController
     */
    private String nombre, apellido, correo, username, password;

    public RegistroUserController() {
    }

    public void enviar(){        
        RegistroUserPojo pojoUser = new RegistroUserPojo();
        pojoUser.envioRegistro(nombre, apellido, correo, username, password);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
