/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenbarajas;


/**
 *
 * @author usuario
 */
public class Carta implements Comparable {
    
    int valor;
    String palo;
    
    Carta(int v,String p){
        valor=v;
        palo=p;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
    
    public void mostrar(){
        System.out.println("Valor: "+valor+" Palo: "+palo);
    }

    @Override
    public int compareTo(Object o){
        Carta c=(Carta)o;
        return this.valor-c.valor;
    }
}
