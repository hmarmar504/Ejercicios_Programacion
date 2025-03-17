/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciomapas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioMapas {

    public static void main(String[] args) {
        Scanner scb=new Scanner(System.in);
        HashMap<Integer, Jugador>fulbo=new HashMap<>();
        int var=9;
        
        while(var!=0){
            menu();
            var=scb.nextInt();
            
            switch (var){
                case 1->{
                    
                    System.out.println("Que dorsal quieres dar de alta?");
                    int alt=scb.nextInt();
                    Jugador.altaJugador(fulbo, alt);
                }
                case 2->{
                    System.out.println("Que dorsal quieres dar de baja?");
                    int alt=scb.nextInt();
                    Jugador.eliminarJugador(fulbo, alt);
                    
                }
                case 3->{
                    Jugador.mostrar(fulbo);
                }
                case 4->{
                    System.out.println("Que posicion quieres mostrar");
                    String posicion=scb.next();
                    Jugador.mostrar(fulbo, posicion);
                }
                case 5->{
                    System.out.println("Que dorsal quieres editar?");
                    int alt=scb.nextInt();
                    if(Jugador.editarJugador(fulbo, alt)==true){
                        System.out.println("Jugador editado");
                    }
                    else{
                        System.out.println("No ha sido posible editar el jugador");
                    }
                }
            }
        }
    }
    public static void menu(){
        System.out.println("1.- Alta Jugador");
        System.out.println("2.- Eliminar Jugador");
        System.out.println("3.- Mostrar");
        System.out.println("4.- Mostrar posicioin");
        System.out.println("5.- Editar Jugador");
    }
}
