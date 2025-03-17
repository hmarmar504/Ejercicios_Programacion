/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciobombo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EjercicioBombo {

    public static void main(String[] args) {
        
        Bombo b=new Bombo();
        ArrayList<Carton>carton=new ArrayList<>();
        boolean gana=false;
        
        for(int a=0;a<5;a++){
            carton.add(new Carton());
        }
        
        int ganador=5000;
        
        while(!gana){
            
            int num=b.sacaNum();
            
            for(int a=0;a<carton.size()-1;a++){
                carton.get(a).comprobar(num);
               
                if(carton.get(a).bingo()){
                    
                    ganador=a;
                    gana=true;
                }
            }
        }
        System.out.println("gana el carton: "+ganador);
    }
}
