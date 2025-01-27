/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopunto;

/**
 *
 * @author usuario
 */
public class EjercicioPunto {

    public static void main(String[] args) {
        Punto3d p=new Punto3d(5,6,8);
        Punto3d j=new Punto3d(5,6,8);
        
        String malo;
        
        
        System.out.println(p.toString());
        if(p.equals(j)){
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }
    }
    
}
