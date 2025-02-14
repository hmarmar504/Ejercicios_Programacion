/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fulbo;

import java.util.Comparator;
/**
 *
 * @author usuario
 */
public class FutEdadNombre implements Comparator  {
    
    @Override
    public int compare(Object obj1, Object obj2){
        Futbolista a=(Futbolista)obj1;
        Futbolista b=(Futbolista)obj2;
        if(a.edad==b.edad){
            return a.nombre.compareTo(b.nombre);
        }
        else{
            return a.edad-b.edad;
        }
    }
}
