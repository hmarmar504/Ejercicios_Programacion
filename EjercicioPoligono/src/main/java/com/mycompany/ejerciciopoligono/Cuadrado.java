/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopoligono;

/**
 *
 * @author usuario
 */
public class Cuadrado extends Poligono{
    
    Cuadrado(int b, int a){
        super(b,a);
    }
    
    @Override
    public double area(){
        
        return(this.altura*this.base);
    }
}
