/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciomapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Jugador {
    private String dni,nombre,posicion;
    double estatura;

    Jugador(String dni, String nombre, String posicion, double estatura){
        this.dni=dni;
        this.nombre=nombre;
        this.posicion=posicion;
        this.estatura=estatura;
    }
    public double getEstatura(){
        return estatura;
    }
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    //Parte estatica
    public static void altaJugador(HashMap<Integer,Jugador>plantilla,Integer dorsal){
        Scanner sc=new Scanner(System.in);
        String dni,nombre,posicion;
        double altura;
        System.out.println("DNI");
        dni=sc.next();
        System.out.println("Nombre");
        nombre=sc.next();
        System.out.println("Posicion");
        posicion=sc.next();
        System.out.println("Altura");
        altura=sc.nextDouble();
        plantilla.put(dorsal, new Jugador(dni,nombre,posicion,altura));
    }
    public static void eliminarJugador(HashMap<Integer,Jugador>plantilla,Integer dorsal){
        plantilla.remove(dorsal);
    }
    public static void mostrar(HashMap<Integer,Jugador>plantilla){
        System.out.println(plantilla.toString());
    }
    public static void mostrar(HashMap<Integer,Jugador>plantilla,String posicion){
        Set<Map.Entry<Integer,Jugador>>e=plantilla.entrySet();
        for(Map.Entry<Integer,Jugador>pareja:e){
            if(pareja.getValue().getPosicion().equals(posicion)){
                System.out.println(pareja.getKey()+" "+pareja.getValue());
            }
        }
    }
    public static boolean editarJugador(HashMap<Integer,Jugador>plantilla,Integer dorsal){
        
        if(plantilla.get(dorsal)!=null){
            Scanner sca=new Scanner(System.in);
            System.out.println("Nombre");
            String nombre=sca.next();
            plantilla.get(dorsal).setNombre(nombre);
            System.out.println("Posicion");
            String posicion=sca.next();
            plantilla.get(dorsal).setPosicion(posicion);
            System.out.println("Estatura");
            double estatura=sca.nextDouble();
            plantilla.get(dorsal).setEstatura(estatura);  
            return true;
        }
        else{
            return false;
        } 
    } 
}
