/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import com.mycompany.proyectofinallinea1.pojo.LoginPojo;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Iván
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {

    private String usuario, pass;

    /**
     * Creates a new instance of loginController
     */
    public LoginController() {
    }

    
    public void login() throws IOException {
        LoginPojo loginPojo = new LoginPojo();
        System.out.println("El usuario es: " + usuario);
        if (loginPojo.traeDatos(usuario, pass).equalsIgnoreCase("Admin")) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index.xhtml");
        } else if (loginPojo.traeDatos(usuario, pass).equalsIgnoreCase("Comprador")) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/artista.xhtml");
        } else {
            System.out.println("error");
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
