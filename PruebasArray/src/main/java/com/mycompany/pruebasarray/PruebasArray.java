/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebasarray;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class PruebasArray {
    
    
    public static void cambio(int edades[]){
        
        for(int i=0;i<edades.length;i++){
            edades[i]=i*5;
        }
    
    }
            

    public static void main(String[] args) {
        int edades[]=new int [5];
        
        
        for(int i=0;i<edades.length;i++){
            edades[i]=i;
        }
        
        for (int j = 0; j < edades.length; j++) {
            System.out.print("|" + edades[j] + "|");
        }
        
        cambio(edades);
        
        System.out.println();
        
        for (int j = 0; j < edades.length; j++) {
            System.out.print("|" + edades[j] + "|");
        }
        
        System.out.println();
        System.out.println(Arrays.toString(edades));

    }
}
