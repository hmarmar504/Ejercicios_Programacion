/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocubos;

/**
 *
 * @author usuario
 */
public abstract class Bloque {
    String nombre,textura,dimensiones;
    
    Bloque(String n, String t, String d){
        nombre=n;
        textura=t;
        dimensiones=d;
    }
    Bloque(){
        
    }
    public void destruir(){
        System.out.println("Illo que me rompo");
    }
}
