/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Tren {
    private String salida, llegada;
    private int precioPrimera=10,precioSegunda=5, ventas=0;
    private ArrayList<Vagon> vagones;
    
    Tren(){
        for(int a=0;a<5;a++){
            if(a%2==0){
                vagones.add(new Vagon(true));
            }
            else{
                vagones.add(new Vagon(false));
            }
        }
    }
    public boolean entrar(){
        int num=(int)(Math.random()*5);
        
        if(num%2==0){
            ventas += precioPrimera;
        }
        else{
            ventas += precioSegunda;
        }
        
        return this.vagones.get(num).sienta();
    }
    
}
