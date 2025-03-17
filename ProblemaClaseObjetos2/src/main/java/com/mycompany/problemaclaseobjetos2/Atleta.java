/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos2;

/**
 *
 * @author usuario
 */
public class Atleta implements Comparable{
    int tiempo,numero;
    String nacionalidad,nombre;
    
    Atleta(int t,int num,String nac,String nom){
        tiempo=t;
        numero=num;
        nacionalidad=nac;
        nombre=nom;
    }
    
    @Override
    public int compareTo(Object obj){
        Atleta otro=(Atleta)obj;
    return otro.tiempo-this.tiempo;
    }
}
