/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopunto;

/**
 *
 * @author usuario
 */
public class Punto2d {
    private double ejeX, ejeY;
    
    Punto2d(){
        this.setValores(0,0);
    }
    Punto2d(double x, double y){
        setValores(x,y);
    }
    public void desplazaX (double dx){
        this.setX(this.getX()+dx);
    }
    public void desplazaY(double dy){
        this.setY(this.getY()+dy);
    }
    public void desplaza(double dx, double dy){
        desplazaX(dx);
        desplazaY(dy);
    }
    public double distanciaEuclidea(Punto2d otro){
        double distancia=0;
        distancia=(Math.sqrt(
                Math.pow((this.getX()-otro.getX()), 2)+
                Math.pow((this.getY()-otro.getY()), 2)));
        return distancia;
    }
    public double getX(){
        return (this.ejeX);
    }
    public double getY(){
        return(this.ejeY);
    }
    public void setX(double x){
        this.ejeX=x;
    }
    public void setY(double y){
        this.ejeY=y;
    }
    public void setValores(double x, double y){
        this.ejeX=x;
        this.ejeY=y;
    }
    public void muestra(){
        System.out.println(this.getX());
        System.out.println(this.getY());
    }
    
}
