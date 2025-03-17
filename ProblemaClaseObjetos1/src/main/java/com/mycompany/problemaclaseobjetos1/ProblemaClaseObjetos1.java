/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemaclaseobjetos1;

/**
 *
 * @author usuario
 */
public class ProblemaClaseObjetos1 {

    public static void main(String[] args) {
        Tanque t=new Tanque(100);
        while(t.sacarMitad()){
            System.out.println(t.getContenido());
        }
    }
}
