/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopunto;

/**
 *
 * @author usuario
 */
public class EjercicioPunto {

    public static void main(String[] args) {
        Suceso p=new Suceso(5,6,8,5,"bb");
        Suceso j=new Suceso(5,6,8,5,"aa");
        
        String malo;       
        
        System.out.println(p.toString());
        if(p.equals(j)){
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }
    }
}
