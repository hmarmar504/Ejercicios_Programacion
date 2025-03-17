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
                int m=3,n=2,q=4;
                
                ArrayList<ArrayList<Double>>lista1=new ArrayList<>();
                for(int a=0;a<n;a++){
                    lista1.add(new ArrayList<>());
                    for (int b=0;b<m;b++){
                        lista1.get(a).add(Math.random()*10+1);
                    }
                }
                ArrayList<ArrayList<Double>>lista2=new ArrayList<>();
                
                for(int a=0;a<q;a++){
                    lista2.add(new ArrayList<>());
                    for (int b=0;b<m;b++){
                        lista2.get(a).add(Math.random()*10+1);
                    }
                }
                ArrayList<ArrayList<Double>>lista3=new ArrayList<>();
                
                
                for(int a=0;a<n;a++){
                    lista3.add(new ArrayList<>());
                    for(int b=0;b<q;b++){
                        double sum=0;
                        for(int c=0;c<m;c++){
                            sum=+lista1.get(a).get(c)*lista2.get(b).get(c);
                        }
                        lista3.get(a).add(sum);
                    }
                }
                System.out.println(lista3.toString());
            }
            
            case 8->{
                ArrayList<Integer>par=new ArrayList<>();
                ArrayList<Integer>imp=new ArrayList<>();
                
                for(int a=0;a<100;a++){
                    if((a+1)%2==0){
                        par.add(a+1);
                    }
                    else{
                        imp.add(a+1);
                    }
                }
                
                System.out.println(par.toString());
                System.out.println(imp.toString());
                
                par.addAll(imp);
                Collections.sort(par);

                boolean comp=true;
                for(int a=0;a<100;a++){
                    if(par.get(a)!=a+1){
                        comp=false;
                    }
                }
                if (!comp){
                    System.out.println("Ta mal");
                }
                else{
                    System.out.println("Ta bien");
                }
            }
            
            case 10->{
                ArrayList<Integer>nums=new ArrayList<>();
                
                for(int a=0;a<500;a++){
                    nums.add((int)(Math.random()*50+1));
                }
                Collections.sort(nums);
                System.out.println(nums.toString());
                int cant=0;
                while(cant+1!=nums.size()){
                    if(nums.get(cant).equals(nums.get(cant+1))){
                        nums.remove(cant+1);
                    }
                    else{
                        cant++;
                    }
                }
                System.out.println(nums.toString());
            }
            case 11->{
                ArrayList<Integer>lista1=new ArrayList<>();
                ArrayList<Integer>lista2=new ArrayList<>();

                for(int a=0;a<100;a++){
                    lista1.add((int)(Math.random()*100+1));
                }
                lista2.addAll(lista1);
                Collections.shuffle(lista1);
                System.out.println(lista1);
                lista1=ordenar(lista1);
                System.out.println(lista1);
                if(lista1.containsAll(lista2)){
                    System.out.println("tiene todo");
                }
            }
            default->{
                System.out.println("todavia no esta");
            }
        }
    }
    public static ArrayList<Integer> ordenar(ArrayList<Integer> lista){
        
        if(lista.size()<=1){
            return lista;
        }
        else{
            int pivote=lista.get(0);
            lista.remove(0);
            ArrayList<Integer>mayor=new ArrayList<>();
            ArrayList<Integer>menor=new ArrayList<>();
            
            System.out.println(lista);
            for (int a=0;a<lista.size();a++){
                if(lista.get(a)>pivote){
                    mayor.add(lista.get(a));
                }
                else{
                    menor.add(lista.get(a));
                }
            }
            lista.removeAll(lista);
            mayor=ordenar(mayor);
            menor=ordenar(menor);
            lista.addAll(menor);
            lista.add(pivote);
            lista.addAll(mayor);
                System.out.println(lista);
                
            return lista;
        }
    }
    
    
    public static int menu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Selecciona el ejercicio");
        
        return sc.nextInt();
    }
}
