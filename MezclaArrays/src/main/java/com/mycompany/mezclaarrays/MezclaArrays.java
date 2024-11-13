/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mezclaarrays;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class MezclaArrays {

    public static void main(String[] args) {
        int cont1=0,cont2=0,cont3=0;
        int tab1 [] = new int[(int)(Math.random()*9+1)];
        int tab2 [] = new int[(int)(Math.random()*9+1)];
        int tab3 [] = new int [tab1.length+tab2.length];

        for(int i=0;i<tab1.length;i++){
            tab1[i] = (int)(Math.random()*100);
        }
            
        for(int i=0;i<tab2.length;i++){
            tab2[i] = (int)(Math.random()*100);            
        }
        
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        
        for(;cont3<tab3.length;){
            
            if (cont1<tab1.length){
                tab3[cont3]=tab1[cont1];
                cont3++;
                cont1++;
            }
            
            if (cont2<tab2.length){
                tab3[cont3]=tab2[cont2];
                cont3++;
                cont2++;
            }          
        }
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        System.out.println(tab3.length);
        System.out.println(Arrays.toString(tab3));
    }
}
