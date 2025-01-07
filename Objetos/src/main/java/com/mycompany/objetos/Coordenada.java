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
    int fila, columna;
    
    Coordenada (int f, int c)
    {
        setValores(f,c);
    }
    
    Coordenada()
    {
    }

    int getFila()
    {
    return fila;
    }
    
    int getColumna()
    {
        return columna;
    }
    
    void setFila(int f)
    {
        fila=f;
    }
    
    void setColumna(int c)
    {
        columna=c;
    }
    
    void setValores (int f, int c)
    {
        fila=f;
        columna=c;
    }
    void print()
    {
        System.out.println("-------INFO-------");
        System.out.println("OBJETO COORDENADAS");
        System.out.println("Fila: "+ fila);
        System.out.println("Col: "+ columna);
        System.out.println("------------------");
    }
}
