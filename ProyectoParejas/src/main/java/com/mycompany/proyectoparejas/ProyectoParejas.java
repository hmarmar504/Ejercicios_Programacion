/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoparejas;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ProyectoParejas {
    //generar una lista con los tipos de caracteres a introducir
    public static void ascii(char[]tabas,int cant){
        
        for(int i=0;i<tabas.length;i++){
            if (i<10){
                tabas[i] = (char) (i + 48);
            }
            else if(i>10&&i<35){
                tabas[i] = (char) (i+55);
            }
            else{
                tabas[i] = (char) (i+87);
            }
        }
        System.out.println(Arrays.toString(tabas));
    }

    public static void main(String[] args) {
        //declaracion de varialbes
        //tablas de muestra, tabla entera, y datos mostrados para la maquina
        char general [][];
        char intentos [][];
        char muestra [][];
        //variables generales
        char ascii;
        char asciiGuardado [];
        char asciiIntro[];
        int dimx,dimy,fallos,cant;
        
        Scanner sc = new Scanner (System.in);
        cant=sc.nextInt();
        asciiGuardado = new char[cant];
        
        
        ascii(asciiGuardado,cant);
        System.out.println(Arrays.toString(asciiGuardado));
    }
}
