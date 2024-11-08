package com.mycompany.primos;
import java.util.Scanner;
public class Primos {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int i,calc,o;
        boolean primo=false;
        System.out.println("Introduce un numero");
        
        
        Scanner sc = new Scanner (System.in);        
        i= sc.nextInt();
        
        for (int a=2;a<i;a++){
            if (i%a==0){
                primo=true;
            }
        }
        
        if (primo==false){
            System.out.println("El numero es primo");
        }
        else{ System.out.println("El numero no es primo");}
    }
}
