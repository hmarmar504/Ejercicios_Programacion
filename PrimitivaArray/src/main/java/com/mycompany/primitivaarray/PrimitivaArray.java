/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primitivaarray;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class PrimitivaArray {


    public static void main(String[] args) {
        int combi [] = new int [6];
        int cont = 0;
        int alea;
        boolean comp=false;
        
        for(int i=0;i<6;i++){
            combi[i]=-1;
        }

        
        
        while (cont<6){
            
            alea= (int) (Math.random() * 49 + 1);

            for(int i=0;i<=cont;i++){

                if (alea!=combi[i]){
                   // System.out.print(i);
                    
                    if (i==cont){

                        combi[i]=alea;
                        comp=true;
                        
                    }
                }
            }
            
            if (comp==true){
            
                cont++;
                comp=false;
            }
        }
        Arrays.sort(combi);
          for (int j = 0; j < 6; j++) {
                   System.out.print("|" + combi[j] + "|");
                           }
    }
}
    
