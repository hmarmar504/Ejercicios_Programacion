/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nba;

/**
 *
 * @author usuario
 */
public class ConfigConexion {
    private String puerto;
    private String usuario;
    private String contraseña;
    private String ip;
    private String bd;
    
    ConfigConexion(){
        this.puerto="3306";
        this.usuario="root";
        this.contraseña="";
        this.ip="127.0.0.1";
        this.bd="NBA";
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
    
    public void setValores(String puerto,String usuario,String contraseña, String ip, String bd){
        this.puerto=puerto;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.ip = ip;
        this.bd = bd;
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

