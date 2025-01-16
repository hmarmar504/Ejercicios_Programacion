/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conjuntoprimitiva;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Conjunto {
    Integer [] elementos;
    
    Conjunto()
    {
        elementos=new Integer[0];
    }
    
    Conjunto(Integer[] numEntrada)
    {
        elementos=Arrays.copyOf(numEntrada, numEntrada.length);
    }
    
    public int numeroElementos()
    {
        return(elementos.length);
    }
    
    Integer[] getElementos()
    {
        
        return(Arrays.copyOf(elementos, elementos.length));
    }
    
    public boolean insertar(Integer numero)
    {
        boolean posible = true;
        
        if (pertenece(numero)==false)
        {
            elementos = Arrays.copyOf(elementos,elementos.length+1);
            elementos[elementos.length-1]=numero;
        }
        else
        {
            posible=false;
        }
        return (posible);
    }
    public boolean insertar(Conjunto insercion)
    {
        boolean posible = true;
        Integer[] prueba = Arrays.copyOf(insercion.getElementos(),insercion.getElementos().length );
        
        for(int c = 0; c<prueba.length;c++)
        {
            if (insertar(prueba[c])==false)
            {
                posible = false;
            }
        }
        return (posible);
    }
    public boolean eliminar(Integer elemento)
    {
        boolean posible=false;
        for(int a = 0;a<elementos.length;a++)
        {
            if(pertenece(elemento)==true)
            {
               elementos[a]=elementos[elementos.length-1];
               elementos=Arrays.copyOf(elementos, elementos.length -1);
               posible=true;
            }
        }
        return posible;
    }
    public boolean eliminar(Conjunto borra)
    {
        boolean posible = false;
        Integer[] prueba = Arrays.copyOf(borra.getElementos(),borra.getElementos().length );
        
        for(int a = 0;a<prueba.length;a++)
        {
           if (eliminar(prueba[a])==true)
           {
             posible=true;  
           }
           
        }
        return posible;
    }
    public boolean pertenece(Integer elemento)
    {
        boolean esta=false;
                
        for(int a = 0;a<elementos.length;a++)
        {
            if (elementos[a].equals(elemento))
            {
               esta=true;
            }
        }
        return esta;
    }
    public static boolean incluido(Conjunto c1,Conjunto c2){
        boolean posible=false;
        int contador=0;
        Integer[] prueba = Arrays.copyOf(c2.getElementos(),c2.getElementos().length);
        for(int a=0;a<prueba.length;a++){
            
            if(c1.pertenece(prueba[a])==true){
                contador++;
            }
        }
        return posible;
    }
    public static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto mem;
        mem = new Conjunto();
        mem.insertar(c1);
        mem.insertar(c2);
        return mem;
    }
}
