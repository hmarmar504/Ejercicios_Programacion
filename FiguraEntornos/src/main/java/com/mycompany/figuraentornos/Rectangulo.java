/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuraentornos;

/**
 *
 * @author usuario
 */
public class Rectangulo  {
    int base,altura,area;
    
    Rectangulo(){
        
    }
    Rectangulo(int b, int a){
        base=b;
        altura=a;
        area=b*a;
    }
    public int getArea(){
        return (area);
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    
}
