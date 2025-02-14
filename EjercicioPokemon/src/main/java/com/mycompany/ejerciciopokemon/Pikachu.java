/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopokemon;

/**
 *
 * @author usuario
 */
public class Pikachu extends Pichu {
    
    Pikachu(String name){
        super(name,75,50);
    }
    Pikachu(String name,int hp, int exp){
        super(name,hp,exp);
    }
    @Override
    public int ataqueRapido(){
        if((int)(Math.random()*2)%2==0){
            return 25;
        }
        else{
            return 15;
        }
    }
    
    public int bolaVoltio(){
        return(int) (Math.random() * 41 + 10);
    }
}
