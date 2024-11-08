package com.mycompany.pruebafunciones;
import java.util.Scanner;

public class PruebaFunciones {
public static void ciclarDigitos(int veces) {
        int ext=0;
        
        for(int i=0;i<veces;i++){
                if (ext>9){ext=1;}
                System.out.print(ext);
                ext++;
        }
    }
public static boolean mayor(int num1,int num2){
    boolean resul;
    resul= num1>num2;
    return resul;
}
        
    public static void main(String[] args) {
        int num=0, ext=0;
        
        System.out.println("Numero?");
        
         Scanner sc = new Scanner (System.in);        
        num= sc.nextInt();
        
        System.out.println("Otro numero?");
              
        ext= sc.nextInt();
                
                
        System.out.println(mayor(num,ext));
    }
}
