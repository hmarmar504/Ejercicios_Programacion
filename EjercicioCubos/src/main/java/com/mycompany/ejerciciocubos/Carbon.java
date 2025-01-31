/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocubos;

/**
 *
 * @author usuario
 */
public class Carbon extends Bloque {
    
    Carbon(String n, String t, String d){
        super(n,t,d);
    }
    Carbon(){
        
    }
    @Override
    public void destruir(){
        System.out.println("Illo que me rompo,Carbon pa ti");
    }
}
