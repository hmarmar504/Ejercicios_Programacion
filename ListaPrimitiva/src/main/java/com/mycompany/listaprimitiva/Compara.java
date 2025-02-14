/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaprimitiva;

import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class Compara implements Comparator {
    
    @Override
    public int compare(Object obj1,Object obj2){
        Integer un=(Integer)obj1;
        Integer dos=(Integer)obj2;
        return un.compareTo(dos);
    }
}
