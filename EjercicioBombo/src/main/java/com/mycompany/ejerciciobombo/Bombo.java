/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciobombo;

import java.util.ArrayList;



/**
 *
 * @author usuario
 */
public class Bombo {
     ArrayList<Integer>bombo=new ArrayList<>();
    public ArrayList<Integer>fuera= new ArrayList<>();
    
    Bombo(){
        for(int a=0;a<99;a++){
            bombo.add(a+1);
        }
    }
    
    public int sacaNum(){
        
        int num=((int)(Math.random()*bombo.size()-1));
        int n;

        n=bombo.get(num);
        bombo.remove(num);
        fuera.add(num);
        
        return n;
    }
    
    public boolean bingo(Carton crt){
        
        return (fuera.containsAll(crt.getNums()));
    }
}
