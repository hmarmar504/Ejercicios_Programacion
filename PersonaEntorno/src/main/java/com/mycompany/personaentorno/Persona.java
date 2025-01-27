/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personaentorno;

/**
 *
 * @author usuario
 */
public class Persona {
    String dni,nombre;
    int anio;
    Persona(){
        
    }
    Persona(String dni,String nombre,int anio){
        this.anio=anio;
        this.dni=dni;
        this.nombre=nombre;
    }
    public int calcEdad(){
        
        return(2025-anio);
    }
}
