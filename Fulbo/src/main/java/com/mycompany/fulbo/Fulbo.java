/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fulbo;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Fulbo {

    public static void main(String[] args) {
        
        Futbolista[] fulbo=new Futbolista[3];
        
        fulbo[0]=new Futbolista("55555555C","Aurelio",55,2);
        fulbo[1]=new Futbolista("55555555B","Bartolo",65,25);
        fulbo[2]=new Futbolista("55555555A","Carlos",45,52);
        
        FutEdadNombre a = new FutEdadNombre();
        
        Arrays.sort(fulbo);
        System.out.println(Arrays.toString(fulbo));
        
        Arrays.sort(fulbo, a);
        System.out.println(Arrays.toString(fulbo));
        
        
        Liga.liga(fulbo[0]);
    }

}
