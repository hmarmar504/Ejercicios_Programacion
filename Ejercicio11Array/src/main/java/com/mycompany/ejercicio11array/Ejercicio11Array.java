/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11array;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ejercicio11Array {

    public static void main(String[] args) {
        int busqueda,pos,cont=0;
        int bus [] = new int [10];
        int enc [] = new int [0];
        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<bus.length;i++){
            bus[i] = (int)(Math.random()*5+1);
        }
        
        
        System.out.println(Arrays.toString(bus));
        System.out.println(Arrays.toString(enc));
        System.out.println("Busqueda numero del 1 al 5");
        
        busqueda=sc.nextInt();
        
        pos=Arrays.binarySearch(bus, busqueda);
        System.out.println(pos);
        
        for(int i=0; i<bus.length;i++){
            if(bus[i]==busqueda){
                enc=Arrays.copyOf(enc,enc.length+1);
                enc[enc.length - 1]=i;
            }
        }
        System.out.println(Arrays.toString(enc));
    }
}
