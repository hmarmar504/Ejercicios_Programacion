/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fulbo;

/**
 *
 * @author usuario
 */
public class Futbolista implements Comparable, Liga {
    String dni,nombre;
    int edad, goles;
    
    Futbolista(String dni, String nombre, int edad, int goles){
    
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.goles=goles;
    }
    @Override
    public int compareTo(Object obj){
        
        Futbolista otro=(Futbolista)obj;
        return this.dni.compareTo(otro.dni);
    }
    @Override
    public String toString(){
        
        return("Jugador: "+ nombre+ " dni: "+dni+ " edad: "+edad+" goles: "+goles);
        
    }
    
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    
}
