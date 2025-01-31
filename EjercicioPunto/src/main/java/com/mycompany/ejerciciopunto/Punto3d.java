/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopunto;

/**
 *
 * @author usuario
 */
public class Punto3d extends Punto2d {
    
    private double ejeZ;
    
    Punto3d(){
        this.setValores(0, 0, 0);
    }
    Punto3d(double x, double y, double z){
        super(x,y);
        setZ(z);
        
    }
    public void setZ(double z){
        this.ejeZ=z;
    }
    public void setValores(double x, double y, double z){
        super.setValores(x, y);
        this.setZ(z);
    }
    public double getZ(){
        return(this.ejeZ);
    }
    public void desplazaZ(double dz){
        this.setZ(this.getZ()+dz);
    }
    public void desplaza(double dx, double dy, double dz){
        super.desplaza(dx, dy);
        this.desplazaZ(dz);
    }
    public void muestra(){
        super.muestra();
        System.out.println(this.getZ());
    }
    public double distancia(Punto3d otro){
        double cantidad;
        
        cantidad=Math.sqrt(
                (Math.pow(this.getX()-otro.getX(),2))+
                (Math.pow(this.getY()-otro.getY(),2))+
                (Math.pow(this.getZ()-otro.getZ(),2)));
        return cantidad;
    }
    
    @Override
    public String toString(){
        String palabra;
        palabra=("Las coordenadas son: X:"+this.getX()+" Y:"+this.getY()+" Z:"+this.getZ());
        return palabra;
    }
    
    @Override
    public boolean equals (Object obj){
        
        Punto3d otro;
        otro=(Punto3d) obj;
        
        return this.getX()==otro.getX()&&this.getY()==otro.getY()&&this.getZ()==otro.getZ();
    }
}
