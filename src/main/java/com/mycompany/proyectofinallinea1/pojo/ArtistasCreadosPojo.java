/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallinea1.pojo;

/**
 *
 * @author Iván
 */
public class ArtistasCreadosPojo {
    private Integer id_artista;
    private String nombre;
    private String nacionalidad;
    private String fecha_nac;
    private String foto;

    private boolean selected = false;
    
    public ArtistasCreadosPojo() {
        
    }

    public ArtistasCreadosPojo(Integer id_artista, String nombre, String nacionalidad, String fecha_nac, String foto) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha_nac = fecha_nac;
        this.foto = foto;
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

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Integer getId_artista() {
        return id_artista;
    }

    public void setId_artista(Integer id_artista) {
        this.id_artista = id_artista;
    }
    
    
    
}

