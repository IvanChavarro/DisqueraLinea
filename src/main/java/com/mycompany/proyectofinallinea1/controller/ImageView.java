/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyectofinallinea1.controller;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Karen
 */
@Named
@RequestScoped
public class ImageView {

    /*${imageView.statusCode}
    /* web...
    <error-page>
        <error-code>404</error-code>
        <location>/faces/404.xhtml</location>
    </error-page>
    ***********
    <error-page>
        <error-code>500</error-code>
        <location>/faces/500.xhtml</location>
    </error-page>
    
    private String codigo;

    /*constructor */
    /*public String getStatuscode(){mostrar
        String val=String.valueof((Integer) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.status_code"));
    return val;
    }
    
    public String getMessage(){evitarlo y poner una imagen mostrar
    String val = (String) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.message"));
    return val;
    }

    public String getException(){no mostrar
        if(!codigo.equals("404"){
            String val= (String) ((Exception) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.exception")).toStrong;
            return val;
        }else{
            return "";
        }
    }

    public String getExceptionType(){no mostrar
        if(!codigo.equals("404"){
            String val= (String) ((Exception) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.exception")).toStrong;
            return val;
        }else{
            return "";
        }
    }

    public String getRequestURI(){no mostrar
        return (String) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.request_uri");
    
    }

    public String getServletName(){no mostrar
       return (String) FacesContext.getCurrentInstance().getExternalContext().gerRequestMap().get("javax.srvlet.error.servlet_name");
    
    }*/
}
