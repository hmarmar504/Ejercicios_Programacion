/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioobjetos;

/**
 *
 * @author usuario
 */
public class EjercicioObjetos {

    public static void main(String[] args) {
        CuentaCorriente juan;
        juan = new CuentaCorriente("555555J","Juan");
        
        if(juan.sacarDinero(50)==false){
            System.out.println("No es posible sacar dinero");
        }
        
        juan.ingresarDinero(500);
        
        if(juan.sacarDinero(50)==true)
        {
            System.out.println("Es posible sacar dinero");
        }
        juan.info();
    }
}
