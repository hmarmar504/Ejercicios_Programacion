/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosmapas;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjerciciosMapas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>lista=new HashMap<>();
        HashMap<Integer,List<String>>repes=new HashMap<>();
        String palabra;
        
        System.out.println("Introduce la primera palabra");
        palabra=sc.next();
        
        while(!palabra.equals("0")){

            if(lista.containsKey(palabra)){
                    lista.put(palabra,lista.get(palabra)+1);
            }
            else{
                    lista.put(palabra,1);
            }
            System.out.println("Introduce palabra");
            palabra=sc.next();
        }
        System.out.println(lista.toString());
    }
}
