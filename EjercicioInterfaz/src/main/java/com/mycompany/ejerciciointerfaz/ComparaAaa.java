/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciointerfaz;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class ComparaAaa implements Comparator {
    
    public int compare(Object ob1, Object ob2){
        Perro a=(Perro)ob1;
        Perro b=(Perro)ob2;
        return(a.aaa-b.aaa);
    }
}
