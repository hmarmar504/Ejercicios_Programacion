/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.database;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Jugador {
    ArrayList<String>datos=new ArrayList<>();
    
    Jugador(){
        
    }
    public void setDato(String dato){
        datos.add(dato);
    }
    @Override
    public String toString(){
        return datos.toString();
    }
}
