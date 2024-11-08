/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenararrays;
import java.util.Arrays;
import java.util.Scanner;


public class OrdenarArrays {
    public static void ordenString(){
    
        String palabra []= new String[5];
        String pruebaPalabra;
        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<5;i++){
            
            System.out.println("Introduce una palabra");
            
            palabra[i]=sc.nextLine();
            char charAt = palabra[i].toUpperCase().charAt(0);
            palabra[i]=charAt+palabra[i].substring(1);
        }
        Arrays.sort(palabra);
        System.out.println(Arrays.toString(palabra));
    }
    
    public static void ordenNumero(){
        int num[];
        int entrada;
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Introduce una cantidad");
        
        entrada=sc.nextInt();
                
        num = new int[entrada]; 
        
        for(int i = 0;i<num.length;i++){
            num[i]=(int)(Math.random()*100);
        }
        Arrays.sort(num);
        for (int j = 0; j < num.length; j++) {
                    System.out.println(num[j]);
        }
        //System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int opc;
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("1.Para orden strinng");
        System.out.println("2.Para numero normal");
        opc = sc.nextInt();
        
        switch(opc){
            case(1) -> ordenString();
            case(2) -> ordenNumero();
        }
        
    }
}
