/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopunto;

/**
 *
 * @author usuario
 */
public class Suceso extends Punto3d {
    
    int tiempo;
    String descripcion;
    
    Suceso(double x, double y, double z, int t, String d){
        super(x,y,z);
        tiempo=t;
        descripcion=d;
        
    }
    
    @Override
    public boolean equals (Object obj){
        
        Suceso otro;
        otro=(Suceso) obj;
        return(super.equals(otro)&&this.tiempo==otro.tiempo);
        
        
    }
    
}
