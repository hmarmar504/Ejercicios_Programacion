/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenbarajas;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Jugador {
    ArrayList<Carta>mano= new ArrayList<>();
    
    Jugador(Baraja baraja){
        
        for(int a=0;a<5;a++){
            this.tomar(baraja);
        }
    }
    public void tomar(Baraja baraja){
        if(mano.size()<5){
            mano.add(baraja.robar());
        }
    }
}
