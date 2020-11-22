/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.LoginPojo;
import java.io.IOException;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Iván
 */
@Named
@SessionScoped
public class LoginController implements Serializable{

    private String usuario, pass;

    

    /**
     * Creates a new instance of loginController
     */
    public LoginController() {
    }

    /**
     * Redirección a páginas JSF
     * @throws IOException 
     */
    public void login() throws IOException {
        LoginPojo loginPojo = new LoginPojo();
        System.out.println("El usuario es: " + usuario);
        if (loginPojo.traeDatos(usuario, pass).equalsIgnoreCase("Admin")) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("../faces/seguridad/administrador.xhtml");
        } else if (loginPojo.traeDatos(usuario, pass).equalsIgnoreCase("Comprador")) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index.xhtml");
        } else {
            System.out.println("error de ingreso de datos");
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
