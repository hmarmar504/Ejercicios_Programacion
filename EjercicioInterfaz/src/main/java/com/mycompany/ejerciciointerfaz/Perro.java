/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointerfaz;

/**
 *
 * @author usuario
 */
public class Perro implements Voice, Comparable {
    int num,aaa;
    Perro(int n, int a){
        num=n;
        aaa=a;
    }
    
    public int compareTo(Object otro){
        Perro a=(Perro)otro;
        
        return(this.num-a.num);
    }
    
    public void voz(){
        
        System.out.println("guau");
    }
}
