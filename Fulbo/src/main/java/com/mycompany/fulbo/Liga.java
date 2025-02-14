/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fulbo;

/**
 *
 * @author usuario
 */
public interface Liga {
    
    public static void liga(Object obj){
        Futbolista a=(Futbolista) obj;
        System.out.println(a.getNombre());
        System.out.println("LIGA DE FULBO");
    }
}
