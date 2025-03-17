/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciobombo;

import java.util.HashSet;


/**
 *
 * @author usuario
 */
public class Carton {
    public HashSet<Integer>nums=new HashSet<>();
    
    Carton(){
        
        while(nums.size()<15){
            
            nums.add((int)(Math.random()*99+1));
        }
    }
    
    public HashSet<Integer> getNums() {
        return nums;
    }
    
    public boolean comprobar(int n){
        
        if(nums.contains(n)){
            nums.remove(n);
            return true;
        }
        return true;
    }
    
    public boolean bingo(){
        
        return(nums.isEmpty());
    }
}
