/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosclase;
import java.util.Scanner;


public class EjerciciosClase {

    //MENU
    public static void menu(){
        
        System.out.println("1. Distancia");
        System.out.println("2. Num alea");
        System.out.println("3. Area");
    }
    
    // CUADRADO/RECTANGULO
    public static int area (int lado1, int lado2){
        
        return(lado1*lado2);
        
    }
    
    public static int area (int lado){
        
        return(area(lado,lado));
    }
    
    //ALEATORIO
    public static boolean alea(int cantidad, int mayor, int menor){
        boolean resul=true;
        int al;
        
        if (cantidad<0){
            resul=false;
        }
        else if (mayor<menor){
            resul=false;
        }
        else {
            for(int i=0;i<cantidad;i++){
                
                al=(int)(Math.random()*mayor);
                
                do{
                    al++;
                }while(al<menor); 
                
                System.out.print(al + " ");
            }                
                
        }
   
        return resul;
    }
    
    //DISTANCIA
    public static double distancia(double x1,double y1,double x2,double y2){
       
        double distancia, potencia1,potencia2;
        
        potencia1 = Math.pow(x1 - x2, 2);
        potencia2 = Math.pow(y1 - y2, 2);
        
        distancia = Math.sqrt(potencia1 + potencia2);
        return distancia;
    }
    
    public static void main(String[] args) {
        
        int num1, num2, num3, num4;
        
        int funcion;
        
        Scanner sc = new Scanner (System.in);
        
        menu();

        System.out.println("Elige una funcion");
        funcion= sc.nextInt();
        switch (funcion){
            case 1 -> {
        
                System.out.println("Introduce el primer valor");
                num1= sc.nextInt();

                System.out.println("Introduce el segundo valor");
                num2= sc.nextInt();

                System.out.println("Introduce el tercer valor");
                num3= sc.nextInt();

                System.out.println("Introduce el cuarto valor");
                num4= sc.nextInt();

                System.out.println(distancia(num1,num2,num3,num4));
            }
            
            case 2 ->{
                
                System.out.println("introduce la cantidad de numeros");
                num1= sc.nextInt();
                
                System.out.println("Introduce el valor maximo");
                num2= sc.nextInt();
                
                System.out.println("Introduce el valor minimo");
                num3= sc.nextInt();
                System.out.println(alea(num1, num2, num3));
                
            }
            
            case 3 ->{
                
                System.out.println("introduce el primer lado");
                num1= sc.nextInt();
                
                System.out.println("introduce el segundo lado");
                num2= sc.nextInt();
                
                System.out.println(area(num1, num2));
                
            }
        }
    }
}
