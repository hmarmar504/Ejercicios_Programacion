/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopokemon;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioPokemon {

    public static void main(String[] args) throws InterruptedException {
        int juego=1;
        Pichu[]pokes=new Pichu[2];
        pokes[0]=new Pichu("paco");
        pokes[1]=new Pichu("Josefa");
        Scanner sc=new Scanner(System.in);
        while(juego!=0){
            pokes=combate(pokes);
            juego=sc.nextInt();
            System.out.println(pokes[0].getClass());
        }
        
    }
    public static Pichu[] combate(Pichu[] poke) throws InterruptedException{
        Scanner sc = new Scanner (System.in);
        //Compobar evolucion del pokemon
        if(poke[1].getExperiencia()>100){
            poke[1]=new Raichu(poke[1].getEntrenador(),poke[1].getSalud(),poke[1].getExperiencia());
        }
        else if(poke[1].getExperiencia()>75){
            poke[1]=new Pikachu(poke[1].getEntrenador(),poke[1].getSalud(),poke[1].getExperiencia());
        }
        
        if(poke[0].getExperiencia()>=100){
            poke[0]=new Raichu(poke[0].getEntrenador(),poke[0].getSalud(),poke[0].getExperiencia());
            System.out.println("2");
        }
        else if(poke[0].getExperiencia()>=75){
            poke[0]=new Pikachu(poke[0].getEntrenador(),poke[0].getSalud(),poke[0].getExperiencia());
            System.out.println("2");
        }
        
        int turno=0;
        int daño=0;
        int dmg;
        while(daño<100){
            
            Thread.sleep(1000);
            if (turno%2==0){
                
                dmg=poke[0].bolaRayo();
                poke[1].setSalud(poke[1].getSalud()-dmg);
                daño=daño+dmg;
                System.out.println("El pokemon 1 ha hecho: "+dmg+" puntos de daño");
                System.out.println("Por ahora has hecho "+daño+" puntos de daño");
                turno++;
            }
            
            else{
                dmg=poke[1].ataqueRapido();
                
                System.out.println("El pokemon 2 ha hecho: "+dmg+" puntos de daño");
                turno++;
            }
        }
        
        poke[0].setExperiencia(poke[0].getExperiencia()+25);
        System.out.println("Tu Pichu ha ganado 25 puntos de experiencia");
        System.out.println("Tu Pichu tiene "+poke[0].getExperiencia()+" puntos de experiencia");
        poke[0].mostrar();
        
        if(poke[0].getExperiencia()>=100){
            poke[0]=new Raichu(poke[0].getEntrenador(),poke[0].getSalud()+25,poke[0].getExperiencia());
            System.out.println("Evolucion a Raichu");
        }
        else if(poke[0].getExperiencia()>=75){
            poke[0]=new Pikachu(poke[0].getEntrenador(),poke[0].getSalud()+25,poke[0].getExperiencia());
            System.out.println("Evolucion a Pikachu");
        }
        return(Arrays.copyOf(poke, poke.length));
    }
    
}
