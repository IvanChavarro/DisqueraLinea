/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Iván
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {

    private String text;

    /**
     * Creates a new instance of loginController
     */
    public LoginController() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
