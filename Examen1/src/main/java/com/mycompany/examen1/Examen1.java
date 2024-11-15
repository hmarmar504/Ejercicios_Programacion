/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Examen1 {
    
    //Menu de seleccion
    public static void menu(){
        System.out.println("Elige el programa deseado");
        System.out.println("1 Seleccion de palabras");
        System.out.println("2 Argumentos URL");
    }
    //Segundo ejercicio de la prueba
    public static void url(){
        
        //Declaracion de variables
        String entrada,para;
        String[] parametros = new String[0];
        String[] pos2;
        Scanner sc = new Scanner (System.in);
        int pos=0;
        boolean hay = false;
        
        System.out.println("Introduce una URL");
        
        entrada=sc.next();
       
        //Busqueda de la interrogacion
        for(int i=0;i<entrada.length();i++)
           
            if(entrada.charAt(i)=='?'){
               pos=i+1;
               hay=true;
            }
        
        //Parametros encontrados
        if(hay==true){
            para=entrada.substring(pos);
            pos2=para.split("&");
            
            repe(pos2);
            
            System.out.println(Arrays.toString(pos2));
        }
        
        //Parametros no encontrados
        else{
            System.out.println("No hay parametros que introducir en la URL indicada");
        }
    }
    
    public static void repe(String[] repe){
        
        for(int i=0;i<repe.length;i++){
            
            for(int l=0;l<repe.length;l++){
                
                if(repe[i].equals(repe[l])){
                    
                    repe[i]=repe[repe.length-1];
                    
                    repe=Arrays.copyOf(repe, repe.length-1);
                }
            }
        }
    }
    
    //Primer ejercicio de la prueba
    public static void palabras(){
        
        //Declaracion de variables iniciales
        String[] entrada = new String[0];
        String[] salida = new String[0];
        String dEnt;
        boolean comp=true;
        int cont=0;
        Scanner sc = new Scanner (System.in);
        
        //Introduccion de palabras
        while(comp==true){
            
            System.out.println("Introduce una palabra");
            dEnt = sc.next();
            dEnt=dEnt.toLowerCase();
            
            //Salida del bucle
            if (dEnt.equals("fin")){
                
                comp=false;
            }
            
            else{
                
                entrada=Arrays.copyOf(entrada,entrada.length+1);
                entrada[cont]=dEnt;
                
                System.out.println(Arrays.toString(entrada));
                cont++;
            }
        }
        cont=0;
        
        //Paso de palabras buenas a otra tabla
        for (int i=0 ; i<entrada.length ; i++){
            
           if (entrada[i].length()>3){
              
               salida=Arrays.copyOf(salida, salida.length+1);               
               salida[cont]=entrada[i];              
               
               cont++;
           } 
        }
        
        //Salida de tablas
        if(entrada.length>0){
            
        System.out.println("Las palabras introducidas son: "+ Arrays.toString(entrada));
        System.out.println("Las palabras de salida son: "+ Arrays.toString(salida));
        }
        
        else{
            
            System.out.println("No hay datos introducidos");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int selec;
        menu();
        selec=sc.nextInt();
        switch(selec){
            
            case 1 -> {palabras();
            }
            
            case 2 -> {url();
            }
        }
    }
}
