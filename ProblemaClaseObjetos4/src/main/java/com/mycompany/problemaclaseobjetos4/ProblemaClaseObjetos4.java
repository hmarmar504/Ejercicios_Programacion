/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemaclaseobjetos4;

/**
 *
 * @author usuario
 */
public class ProblemaClaseObjetos4 {

    public static void main(String[] args) {
        Candado c1=new Candado(1,5,2);
        Candado c2=new Candado(5,3,6);
        
        c2.cambio(2, 6);
        c1.indicarPos(2,5,6);
        
        if(c1.abrir()){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
        
        if(c1.misma(c2)){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
        
        c2.indicarPos(2, 5, 6);
        
        if(c1.misma(c2)){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
        
        c1.indicarPos(1,5,2);
        
        if(c1.abrir()){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
    }
}
