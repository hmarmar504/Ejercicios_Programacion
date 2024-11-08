package com.mycompany.numeros_pares;
import java.util.Scanner;

public class Numeros_pares {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int num,alea,ext=0;
                
        boolean comp;
        
        
        do{
        System.out.println("Itroduzca un numero entre 1 y 20");
            //Comprovacion de entrada
            do {
                Scanner sc = new Scanner (System.in);        
                num= sc.nextInt();
                comp= num>20||num<0;
                if (comp){
                    System.out.println("Numero no valido");
                }
            }
            while (comp);

            //Numero introducido
            System.out.print(num+" ");

            //Numero alea
            alea=(int)(Math.random()*num+1);
            System.out.print(alea+" ");

            //Cantidad=num
            for(int i=0;i<num;i++){
                if (ext>9){ext=1;}
                System.out.print(ext);
                ext++;
            }
            ext=0;
            System.out.print('#');

            //Cantidad=alea
            for(int i=0;i<alea;i++){
                if (ext>9){ext=1;}
                System.out.print(ext);
                ext++;
            }
            ext=0;
            //Salto de linea
            System.out.println();
        }
        while (num !=0);
                
    }
}
    

