/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopoligono;

/**
 *
 * @author usuario
 */
public abstract class Poligono {
    protected double base,altura;
    Poligono(int b, int a){
        base=b;
        altura=a;
    }
    abstract double area();
    
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    
}
