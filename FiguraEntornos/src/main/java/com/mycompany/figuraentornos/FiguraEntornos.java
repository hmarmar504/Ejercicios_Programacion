/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuraentornos;

/**
 *
 * @author usuario
 */
public class FiguraEntornos {

    public static void main(String[] args) {
        int lado1=5,lado2=2,lado3=3;
        Cuadrado cuadrado=new Cuadrado(lado1);

        
        Rectangulo rectangulo=new Rectangulo(lado2,lado3);
        
        System.out.println(rectangulo.getArea());
        System.out.println(cuadrado.getArea());
    }
}
