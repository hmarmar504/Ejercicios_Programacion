/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Listas {

    public static void main(String[] args) {
        Pokemon a=new Pokemon("Manolin",50,0);
        Pokemon b=new Pokemon("Pepito",50,0);
        ArrayList <Pokemon> lista=new ArrayList<>();
        lista.add(new Pokemon("Pepe",50,0));
        lista.add(new Pokemon("Jose",20,5));
        lista.add(b);
        lista.add(a);
        lista.get(3).setEntrenador("Alfajor");
        System.out.println(lista.toString());
        lista.set(0, new Pokemon("A",5,5));
        System.out.println(lista.toString());
        lista.add(0, new Pokemon("A",5,5));
        System.out.println(lista.toString());
        
        System.out.println(lista.get(3).toString());
        System.out.println(a.toString());
        
    }
    
}
