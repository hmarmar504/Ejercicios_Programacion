/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.autoevaluacion2;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class AutoEvaluacion2 {

    public static double aleaRango(int rangoI, int rangoS){
        
        return (Math.random()*(rangoS-rangoI) + rangoI);
        }
    
    public static int funcionABC(int cantidad, int rangoL, int rangoS, int min) {
        
        int descartados=0;
                int alea;

        for(int i=0; i<cantidad ; i++)
        {
            alea = (int) aleaRango(rangoS, rangoL);
            
                if(alea>min)
                {
                System.out.println(alea);
                }
                
                else
                {
                descartados++;
            }
        }

        return descartados;
        }
            
    public static int funcionD(int cantidad) {
             
        int descartes = 0;
        
        for (int i = 0; i < cantidad; i++) {
            
            int num1 = (int)(Math.random()*101); 
            int num2 = (int)(Math.random()*101); 

            if (num1 < 50 && num2 < 50 && num1 < num2) {
                
                System.out.println("Pareja : " + num1 + " y " + num2);
            }
            
            else {
                descartes++;
            }
        }
        return descartes;
    }
         
    public static void funcionE() {
        double aleatorio = Math.random();

        if (aleatorio >= 0.4 && aleatorio <= 0.6) {
            funcionABC(10,14,8,0);  //Llamada A
            funcionABC((int) aleaRango(5, 9),9,5,0);    //Llamada B
            funcionABC((int) aleaRango(0, 100),100,0,50);   //Llamada C
            funcionD((int) aleaRango(0, 100));
            
        } 
        else if (aleatorio < 0.25 || aleatorio > 0.75) {
            
            if (aleatorio < 0.5) {
                funcionABC(10,14,8,0);  //Llamada A
                funcionABC((int) aleaRango(5, 9),9,5,0);    //Llamada B
            }
        } 
        else {
            funcionABC((int) aleaRango(0, 100),100,0,50);   //Llamada C
            funcionD((int) aleaRango(0, 100));
        }
    }
    
    public static int funcionF(int min, int max) {
        Scanner sc = new Scanner (System.in);
        int media,intentos=0,numero;
         
       

        media = (max + min) / 2;

        System.out.println("Buscando el valor medio de " + media);
        do {
            numero =(int) (aleaRango(max, min));
            intentos++;
            System.out.println(numero);
        } while (numero != media);
        
        return intentos;
        
        //System.out.println("Se genero el numero medio despues de " + intentos + " intentos.");
    }
       
    public static void Menu() {
        System.out.println("Menu de opciones:");
        System.out.println("A. 10 Aleatorios [8-14]");
        System.out.println("B. Mostrar entre 5 y 9 aleatorios");
        System.out.println("C. Mostrar entre 0 y 100 aleatorios >50");
        System.out.println("D. Parejas de aleatorios con condicion");
        System.out.println("E. Aleatorio para opciones anteriores");
        System.out.println("F. Iteraciones hasta encontrar la media.");
        System.out.println("G. Salir");
        System.out.print("Elige una opcion: ");
    }

    public static void main(String[] args){
        char seleccion;
        int rangS,rangL;
        Scanner sc = new Scanner (System.in);
        
        do{
            Menu();
             seleccion=sc.next().toLowerCase().charAt(0);
              switch (seleccion) {
                case 'a' -> { 
              
                    funcionABC(10,14,8,0);}
                case 'b' -> { 
              
                    funcionABC((int) aleaRango(5, 9),100,0,0);}            
                case 'c' -> { 
                    {
                        funcionABC((int) aleaRango(0, 100),100,0,50);}
                    int descartes=funcionABC((int) aleaRango(0, 100),100,0,50);

                    System.out.println("La cantidad de descartes ha sido "+ descartes);
}
                
                case 'd' -> { 
                    int descartes;
                    descartes = funcionD((int) aleaRango(0, 100));
                System.out.println("La cantidad de numeros descartados ha sido "+ descartes);}
                case 'e' -> { funcionE();}
                case 'f' -> { 
                    
                    int descartes;
                    System.out.print("Introduce el valor minimo");
                    rangS = sc.nextInt();

                    System.out.print("Introduce el valor maximo");
                    rangL = sc.nextInt();
                    
                    descartes = funcionF(rangL,rangS);
                    System.out.println("Se genero el numero medio despues de " + descartes + " intentos.");}
                
                case 'g' -> { System.out.println("Programa terminado");}
                default -> { System.out.println("Opcion no valida Intenta otra vez");}
              }
        
              }while(seleccion!= 'g');
    }
}
