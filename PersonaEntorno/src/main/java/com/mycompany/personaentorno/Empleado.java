/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personaentorno;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona implements Comparable {
    String cargo;
    Integer sueldo;
    
    
    Empleado(String cargo, String dni, String nombre, int anio,int sueldo){
        super(dni,nombre,anio);
        this.sueldo=(Integer)sueldo;
        this.cargo=cargo;
    }
    @Override
    public int compareTo(Object obj){
        Empleado otro=(Empleado)obj;
        return (sueldo.compareTo(otro.sueldo));
        
    }
}
