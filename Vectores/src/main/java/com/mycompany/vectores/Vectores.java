/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

/**
 *
 * @author usuario
 */
public class Vectores {

    public static void main(String[] args) {
        Vector2D v1=new Vector2D(5,6);
        Vector2D v2=new Vector2D(4,3);
        
        Vector2D suma=v1.add(v2);
        Vector2D resta=v1.subtract(v2);
        System.out.println(suma.toString());
        System.out.println(resta.toString());
    }
}
