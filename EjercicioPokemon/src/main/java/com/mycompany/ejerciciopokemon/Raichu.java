/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopokemon;

/**
 *
 * @author usuario
 */
public class Raichu extends Pikachu {
    
    Raichu(String name){
        super(name,100,100);
    }
    Raichu(String name, int hp, int exp){
        super(name,hp,exp);
    }
    @Override
    public int ataqueRapido(){
        
        if((int)(Math.random()*2)%2==0){
            return 40;
        }
        else{
            return 30;
        }
    }
    public int estallidoTrueno(){
        return(int) (Math.random() * 81 + 10);
    }
}
