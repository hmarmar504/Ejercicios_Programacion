/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenbarajas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class Baraja {
    //Lista con los tipos de cartas posibles
    String[] tipos={"Palos","Espadas","Oros","Copas"};
    ArrayList<Carta> cartas=new ArrayList<>();
    
    Baraja(){
        for(int a=0;a<4;a++){
            for(int b=0;b<12;b++){
                cartas.add(new Carta(b, tipos[a]));
            }
        }
    }
    
    Baraja(Carta[]iniciales){

        cartas.addAll(Arrays.asList(iniciales));
        
    }
    
    public Carta robar(){
        if(cartas.isEmpty()){
            return null;
        }
        else{
            int n=(int)(Math.random()*cartas.size());
            Carta copia=cartas.get(n);
            cartas.remove(n);
            return copia;
        }
    }
    
    public void mezclar(){
        Collections.shuffle(cartas);
    }
    
    public void barajar(){
        this.mezclar();
    }
    
    public boolean vacia(){
        return cartas.isEmpty();
    }
}
