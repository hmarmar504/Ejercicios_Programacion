/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos1;

/**
 *
 * @author usuario
 */
public class Tanque {
    int contenido,maxContenido=5000;
    
    Tanque(int cont){
        contenido=cont;
    }
    public int getContenido(){
        return contenido;
    }
    public boolean agregar(int ag){
        if(contenido+ag>maxContenido){
            return false;
        }
        else{
        contenido+=ag;
        return true;
        }
    }
    public boolean sacar(int sa){
        if(contenido-sa<0){
            return false;
        }
        else{
        contenido-=sa;
        return true;
        }
    }
    public boolean sacarMitad(){
        if(contenido==1){
            return false;
        }
        else{
            return sacar((int)(contenido/2));
        }
    }
}
