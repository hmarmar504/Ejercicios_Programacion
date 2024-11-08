package com.mycompany.pruebas;
import java.util.Scanner;

public class Pruebas {
//Ejercicio arbol de navidad
    public static void main(String[] args) {
        //declaracion de variables//
       int entrada,hueco;
       String espacio = " ", patron = "* ";
       do{
       System.out.println("introduce numero impar");
       
       Scanner sc = new Scanner (System.in);
       entrada = sc.nextInt();}
       while (entrada%2==0);
       
       for(int fila=0;fila<entrada;fila++){
           
           for (hueco=0;hueco<entrada-fila;hueco++){
               System.out.print(espacio);
           }
           for (int punto=0;punto<entrada-hueco+1;punto++){
               System.out.print(patron);
               
           }
           System.out.println();
        }
        for (int i=0;i<entrada;i++){
            System.out.print(espacio);
        }
        System.out.print("|");
    }
}