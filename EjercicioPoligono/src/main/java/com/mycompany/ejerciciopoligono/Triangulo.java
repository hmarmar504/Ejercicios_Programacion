/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopoligono;

/**
 *
 * @author usuario
 */
public class Triangulo extends Poligono {
    
    Triangulo(int b, int a){
        super(b,a);
    }
    
    @Override
    public double area(){
        
        return ((this.base*this.altura)/2);
    }
    
    @Override
    public double getBase(){
        return this.base;
    }
    
    @Override
    public double getAltura(){
        return this.altura;
    }
 
}
