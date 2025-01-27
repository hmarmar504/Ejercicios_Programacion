/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuraentornos;

/**
 *
 * @author usuario
 */
public class Cuadrado extends Rectangulo {
    int lado;
    Cuadrado(){
        
    }
    Cuadrado(int l){
        super(l,l);
        lado=l;
        
    }
    public int getLado(){
        return lado;
    }
}
