/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conjuntoprimitiva;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class ConjuntoPrimitiva {

    public static void main(String[] args) {
        Conjunto prueba;
        Conjunto lleno;
        Integer[] numeros={};
        
        prueba = new Conjunto();


        while(prueba.numeroElementos()<6){
            prueba.insertar((Integer)(int)(Math.random()*49)+1);
        }
        numeros=prueba.getElementos();
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
