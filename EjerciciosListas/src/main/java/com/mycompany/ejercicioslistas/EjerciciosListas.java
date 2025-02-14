/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioslistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjerciciosListas {

    public static void main(String[] args) {
        
        switch (menu()){
            case 1 ->{
                ArrayList<Integer>vector=new ArrayList<>();
                for(int a=0;a<100;a++){
                    vector.add(a);
                }
                for(int a=0;a<vector.size();a++){
                    System.out.print(vector.get(a)+" ");
                }
            }
            case 2 ->{
                Scanner sc = new Scanner (System.in);
                String palabra;
                ArrayList<String>lista=new ArrayList<>();
                

                    System.out.println("Introduce palabra");
                    palabra=sc.nextLine();

                    lista.addAll(Arrays.asList(palabra.split(" ")));
                    System.out.println(lista.toString());

                
                boolean tiene=true;
                while (tiene){
                    for(int n=0;n<lista.size();n++){
                        tiene=false;
                        if(lista.get(n).contains("a")){
                            tiene=true;
                            lista.remove(lista.get(n));
                        }
                    }
                }
                System.out.println(lista.toString());
            }
            case 3 ->{
                ArrayList<Integer> lista1 = new ArrayList<>();
                ArrayList<Integer> lista2 = new ArrayList<>();
                ArrayList<Integer> lista3 = new ArrayList<>();
                for(int a=0;a<10;a++){
                    lista1.add((int)(Math.random()*101));
                    lista2.add((int)(Math.random()*101));
                }
                for(int a=0;a<lista1.size();a++){
                    if(lista1.get(a).compareTo(lista2.get(a))>0){
                        lista3.add(lista1.get(a));
                    }
                    else{
                        lista3.add(lista2.get(a));
                    }
                }
                Integer num=0;
                for(int a=0;a<lista3.size();a++){
                    num=num+lista3.get(a);
                }
                System.out.println(num/lista3.size());
            }
            case 4->{
                int contador=0,cantidad=0;
                ArrayList<Integer>lista=new ArrayList<>();
                ArrayList<Integer>repes=new ArrayList<>();
                for(int a=0;a<20;a++){
                    lista.add((int)(Math.random()*10+1));
                }
                Collections.sort(lista);
                for(int a=0;a<lista.size();a++){
                    contador=lista.get(a);
                            cantidad=0;
                            System.out.println(contador);
                    for(int b=0;b<a;b++){
                        if(lista.get(b)==contador){
                            cantidad++;
                            System.out.println(cantidad);
                            
                            }
                        }
                    System.out.println("-----");
                    if(contador==cantidad+1){
                        repes.add(contador);
                        System.out.println("entra");
                    }
                    else if (repes.contains(contador)){
                        repes.remove(contador);
                    }
                    
                }
                System.out.println(lista.toString());
                System.out.println(repes.toString());
            }
            case 5->{
                ArrayList<Integer>lista=new ArrayList<>();
                for(int a=0;a<8;a++){
                    lista.add((int)(Math.random()*100+1));
                }
                //System.out.println(lista.toString());
                for (int b=0;b<lista.size();b++){
                    for(int a=0;a<lista.size()-1;a++){
                        if(lista.get(a).compareTo(lista.get(a+1))>0){
                            Collections.swap(lista, a, a+1);
                        }
                    }
                }  
                System.out.println("ya");
            }
            case 6->{
                Scanner sc = new Scanner (System.in);
                int numero;
                ArrayList<Integer>lista=new ArrayList<>();
                ArrayList<Integer>primo=new ArrayList<>();
                for(int a=0;a<100;a++){
                    lista.add((int)(Math.random()*100+1));
                }
                System.out.println("Introduce un numero");
                numero=sc.nextInt();
                
                for(int a=0;a<lista.size();a++){
                    int cont=0;
                    boolean pr=false;
                    for(int b=1;b<lista.get(a);b++){
                        
                        if(lista.get(a)%b==0){
                            cont++;
                        }
                    }
                    if(cont<2){
                        pr=true;
                    }
                    if(pr==true && lista.get(a)<numero && primo.contains(lista.get(a))==false){
                           primo.add(lista.get(a));
                    }
                }
                Collections.sort(primo);
                System.out.println(primo.toString());
            }
            
            case 7->{
                
                ArrayList<ArrayList<Double>>lista1=new ArrayList<>();
                
                ArrayList<Double>f1=new ArrayList<>();
                f1.add(5.0);
                f1.add(3.0);
                f1.add(7.0);
                
                ArrayList<Double>f2=new ArrayList<>();
                f2.add(2.0);
                f2.add(8.0);
                f2.add(4.0);
                
                lista1.add(f1);
                lista1.add(f2);
                 
                ArrayList<ArrayList<Double>>lista2=new ArrayList<>();
                
                ArrayList<Double>f3=new ArrayList<>();
                f3.add(2.0);
                f3.add(3.0);
                
                ArrayList<Double>f4=new ArrayList<>();
                f4.add(4.0);
                f4.add(2.0);
                
                ArrayList<Double>f5=new ArrayList<>();
                f5.add(8.0);
                f5.add(9.0);
                
                lista2.add(f3);
                lista2.add(f4);
                lista2.add(f5);
               
                ArrayList<ArrayList<Double>>lista3=new ArrayList<>();
                
                ArrayList<Double>mem;
                
                for(int a=0;a<lista1.size();a++){
                    mem=new ArrayList<>();
                    double suma=0;
                    //recorre la lista1 tantas veces como listas en la lista1
                    for (int b=0;b<lista2.size();b++){
                        //recorre la lista1 tantas veces como variables haya en sus listas
                        for(int c=0;c<lista1.get(a).size();c++){
                            //recorre las listas de lista1 tantas veces como listas haya en la lista2
                            suma=suma+lista1.get(a).get(c)*lista2.get(b).get(c);
                        }
                        mem.add(suma);
                    }
                    lista3.add(mem);
                }
                
            }
            default->{
                System.out.println("todavia no esta");
            }
        }
    }
    public static int menu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Selecciona el ejercicio");
        
        return sc.nextInt();
    }
}
