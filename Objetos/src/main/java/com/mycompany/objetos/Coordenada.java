/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author usuario
 */
public class Coordenada {
    private int fila, columna;
    
    public Coordenada (int f, int c)
    {
        setValores(f,c);
    }
    
    public Coordenada()
    {
    }

    public int getFila()
    {
    return fila;
    }
    
    public int getColumna()
    {
        return columna;
    }
    
    public void setFila(int f)
    {
        fila=f;
    }
    
    public void setColumna(int c)
    {
        columna=c;
    }
    
    public void setValores (int f, int c)
    {
        fila=f;
        columna=c;
    }
    public void print()
    {
        System.out.println("-------INFO-------");
        System.out.println("OBJETO COORDENADAS");
        System.out.println("Fila: "+ fila);
        System.out.println("Col: "+ columna);
        System.out.println("------------------");
    }
    public int suma()
    {
        return(fila+columna);
    }
    
    public boolean comparar(Coordenada otra)
    //Comparar si filas y columnas son las mismas
    //Otra--> da acceso a un objeto Coordenada con el que comparar
    //this--> hace referencia al objeto actual
    {
        boolean resul;
        resul = ((otra.columna == columna) && (otra.getFila() == this.getFila()));
        
        return resul;
    }
    
}
