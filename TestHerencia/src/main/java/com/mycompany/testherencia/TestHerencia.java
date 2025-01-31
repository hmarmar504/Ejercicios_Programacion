/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testherencia;

/**
 *
 * @author usuario
 */
public class TestHerencia {

    public static void main(String[] args) {
        ProductoFresco fresco=new ProductoFresco("15/07/2002","Almeria","30/05/2015",15);
        ProductoCongelado congelado=new ProductoCongelado(5.2,"15/07/2005",52);
        ProductoRefrigerado refrigerado=new ProductoRefrigerado(7,"25/04/2024",47);
        
        System.out.println(fresco.muestra());
        System.out.println(congelado.muestra());
        System.out.println(refrigerado.muestra());
    }
}
