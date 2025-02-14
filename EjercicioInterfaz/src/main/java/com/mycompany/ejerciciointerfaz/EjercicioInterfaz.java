/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciointerfaz;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class EjercicioInterfaz {

    public static void main(String[] args) {

        Perro[] f=new Perro[2];
        f[0]=new Perro(7,5);
        f[1]=new Perro(5,8);
        ComparaNum c=new ComparaNum();
        ComparaAaa ca=new ComparaAaa();
        System.out.println(f[0].compareTo(f[1]));
        System.out.println(c.compare(f[0], f[1]));
        System.out.println(ca.compare(f[0], f[1]));        
        
        Arrays.sort(f,c);
        System.out.println(Arrays.toString(f));
    }
}
