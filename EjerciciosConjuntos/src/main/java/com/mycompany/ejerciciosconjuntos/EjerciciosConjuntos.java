/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosconjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjerciciosConjuntos {

    public static void main(String[] args) {
        int ej;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce ejercicio");
        ej=sc.nextInt();
        switch(ej){
            
            case 1 ->{
                String palabra;
                HashSet<String>palabras=new HashSet<>();
                do{
                    System.out.println("Introduce palabra");
                    palabra=sc.next();
                    palabras.add(palabra);
                }while(palabra.equals("0"));
                System.out.println(palabras.toString());
            }
            case 2->{
                HashSet<Integer>nums=new HashSet<>();
                ArrayList<Integer>nonums=new ArrayList<>();
                for(int a=0;a<50;a++){
                    nums.add((int)(Math.random()*100+1));
                }
                for(int a=1;a<101;a++){
                    if(!nums.contains(a)){
                        nonums.add(a);
                    }
                }
                System.out.println(nums.toString());
                System.out.println(nonums.toString());
            }
            case 3->{
                Scanner str=new Scanner(System.in);
                int numinst;
                ArrayList<String>Instrucciones=new ArrayList<>();
                HashSet<Integer>nums=new HashSet<>();
                
                System.out.println("Cantidad de instrucciones");
                numinst=sc.nextInt();
                
                
                for(int a=0;a<numinst;a++){
                    System.out.println("Instruccion");
                    
                    Instrucciones.add(str.nextLine());
                }
                for(int a=0;a<Instrucciones.size();a++){
                    
                    switch(Instrucciones.get(a).charAt(0)){
                        
                        case '1'->{
                            nums.add(Integer.valueOf(Instrucciones.get(a).charAt(1)));
                        }
                        case '2'->{
                            
                            if(nums.contains(Integer.valueOf(Instrucciones.get(a).charAt(1)))){
                                nums.remove(Integer.valueOf(Instrucciones.get(a).charAt(1)));
                            }
                        }
                        
                        case '3'->{
                            if(nums.contains(Integer.valueOf(Instrucciones.get(a).charAt(1)))){
                                System.out.println("Yes");
                            }
                            else{
                                System.out.println("No");
                            }
                        }
                    }
                }
                System.out.println(nums.toString());
                System.out.println(Instrucciones.toString());
            }
            
        }
    }
}
