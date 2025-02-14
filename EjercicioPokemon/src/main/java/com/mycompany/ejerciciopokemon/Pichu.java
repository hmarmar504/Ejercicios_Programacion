/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopokemon;

/**
 *
 * @author usuario
 */
public class Pichu extends Pokemon {
    
    Pichu(String name){
        super(name,50,0);
    }
    Pichu(String name, int hp, int exp){
        super(name,hp,exp);
    }
    @Override
    public int ataqueRapido(){
        if((int)(Math.random()*2)%2==0){
            return 20;
        }
        else{
            return 10;
        }
    }
    public int bolaRayo(){
        return(int) (Math.random() * 11 + 10);
    }
    
}
