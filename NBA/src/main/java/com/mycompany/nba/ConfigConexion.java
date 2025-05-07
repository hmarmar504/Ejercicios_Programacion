/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nba;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author usuario
 */
    @XmlRootElement(name="Configuracion")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class ConfigConexion {
        
    @XmlElement(name = "Puerto")
    private String puerto;
    
    @XmlElement(name ="Usuario")
    private String usuario;
    
    @XmlElement(name ="Contraseña")
    private String contraseña;
    
    @XmlElement(name ="IP")
    private String ip;
    
    @XmlElement(name ="BaseDeDatos")
    private String bd;
    
    private boolean victoria;
    
    public ConfigConexion(){
        this.puerto="3306";
        this.usuario="root";
        this.contraseña="";
        this.ip="127.0.0.1";
        this.bd="nba";
    }

    public String getPuerto() {
        return puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getIp() {
        return ip;
    }

    public String getBd() {
        return bd;
    }
    
    public void setValores(String puerto,String usuario,String contraseña, String ip, String bd, boolean victoria){
        this.puerto=puerto;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.ip = ip;
        this.bd = bd;
        this.victoria = victoria;
    }

    public boolean getVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }
    
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
    
}

