/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciones;

import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Colecciones {

    public static void main(String[] args) {
        TreeSet<Integer>lista=new TreeSet<>();
        do{
            Integer numero=(Integer)(int)(Math.random()*49+1);

                lista.add(numero);
            System.out.println(lista.toString());
        }while(lista.size()<6);
        
        System.out.println(lista.toString());
        
    }
}
