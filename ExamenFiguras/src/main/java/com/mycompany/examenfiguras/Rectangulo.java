/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfiguras;



/**
 *
 * @author usuario
 */
public class Rectangulo extends Figura {
    int base, altura, area;
    Rectangulo(String c, int b, int a){
        super(c);
        base=b;
        altura=a;
        area=base*altura;
        
    }
    Rectangulo(String c,int a){
        super(c);
        base=a;
        altura=a;
        area=base*altura;
    }
    public int getArea(){
        return area;
    }
}
