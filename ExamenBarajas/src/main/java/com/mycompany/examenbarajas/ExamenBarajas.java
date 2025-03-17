/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenbarajas;

/**
 *
 * @author usuario
 */
public class ExamenBarajas {

    public static void main(String[] args) {
        //Creacion de la variables que se van a utilizar para el juego
        Baraja baraja=new Baraja();
        Jugador pepito=new Jugador(baraja);
        Jugador manolin=new Jugador(baraja);
        
        //Muestra sencilla de como funcionaria el juego
        //Se podria hacer la clase juego para simplificar mas el main
        int carta1=(int)(Math.random()*5);
        int carta2=(int)(Math.random()*5);
        //Mezcla la baraja para tener aleatoriedad en el resultado del juego
        baraja.barajar();
        
        int comparacion=pepito.mano.get(carta1).compareTo(manolin.mano.get(carta2));
        
        if(comparacion<0){
            System.out.println("Gana pepito");
        }
        else if (comparacion>0){
            System.out.println("Gana manolin");
        }
        else{
            System.out.println("Empate");
        }

    }
}
