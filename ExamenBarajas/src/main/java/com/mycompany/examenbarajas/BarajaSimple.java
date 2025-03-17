/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenbarajas;

/**
 *
 * @author usuario
 */
public class BarajaSimple extends Baraja {
    BarajaSimple(){
        
        super();
        
        //Falla en esta parte
        for (Carta carta : this.cartas) {
            if(carta.getValor()==9||carta.getValor()==8){
            cartas.remove(carta);
            }
        }
    }
    
    public void mostrar(){
        for (Carta carta : this.cartas) {
            carta.mostrar();
        }
    }
}
