/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocubos;

/**
 *
 * @author usuario
 */
public class Diamante extends Bloque {
    
    Diamante(String n, String t, String d){
        super(n,t,d);
    }
    Diamante(){
        
    }
    @Override
    public void destruir(){
        System.out.println("Illo que me rompo, diamante pa ti");
    }
    
}
