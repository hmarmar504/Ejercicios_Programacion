/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaprimitiva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class ListaPrimitiva{

    public static void main(String[] args) {
        ArrayList<Integer>lista=new ArrayList<>();
        do{
            Integer numero=(Integer)(int)(Math.random()*49+1);
            if(lista.contains(numero)==false){
                lista.add(numero);
            }
        }while(lista.size()<6);
        
        Collections.sort(lista);
        for(int a=0;a<lista.size();a++){
            System.out.print(lista.get(a)+",");
        }
        Collections.reverse(lista);
        
        System.out.println();
        System.out.println(Arrays.toString(lista.toArray()));
        System.out.println(lista.toString());
    }
}
