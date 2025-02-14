/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasclase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class ListasClase {

    public static void main(String[] args) {
        ArrayList<Integer>lista=new ArrayList<>();
        for(int a=0;a<100;a++){
        lista.add((int)(Math.random()*10+1));
        }
        Collections.sort(lista);
        
        System.out.println(lista.toString());
        
        while(lista.remove((Integer)5)==true){
            lista.remove((Integer)5);
        }
        Collections.shuffle(lista);
        System.out.println(lista.toString());
        
        Integer[]lis=lista.toArray(new Integer[0]);
        Arrays.sort(lis);
        System.out.println(Arrays.toString(lis));
        
        ArrayList<Integer>lista2=new ArrayList<>();
        lista2.addAll(Arrays.asList(lis));
        Collections.reverse(lista2);
        
        System.out.println(lista2.toString());
    }
}
