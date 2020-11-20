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
@Named(value = "indexController")
@RequestScoped
public class IndexController {

    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }
    public String login() {
        return "faces/login.xhtml";
    }
    public String registro() {
        return "faces/registroUser.xhtml";
    }

}
