/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenfiguras;

/**
 *
 * @author usuario
 */
public class ExamenFiguras {

    public static void main(String[] args) {
        Figura coloreado= new Figura("rojo");
        Rectangulo rectangulo=new Rectangulo("Azul",5,2);
        Cuadrado cuadrado= new Cuadrado("Verde",5);
        
        
        System.out.println(coloreado.getColor());
        System.out.println(rectangulo.getArea());
        System.out.println(rectangulo.getColor());
        System.out.println(cuadrado.getArea());
        System.out.println(cuadrado.getColor());
    }
}
