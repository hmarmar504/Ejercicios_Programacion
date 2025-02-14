/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teleco;

/**
 *
 * @author usuario
 */
public class Llamada {
    int tlfCliente,tlfInter,nZona;
    boolean saliente;
    double horaInicio,horaFin;
    Zona zona;
    
    Llamada(int cliente, int inter,boolean s,double inicio, double fin, int z){
        tlfCliente=cliente;
        tlfInter=inter;
        saliente=s;
        horaInicio=inicio;
        horaFin=fin;
        switch(z){
            case 1->zona=Zona.Africa;
            case 2->zona=Zona.America;
            case 3->zona=Zona.Asia;           
            case 4->zona=Zona.Oceania;
            default->zona=Zona.Europa;
            
        }
        
    }
    public void inicioLlamada(){
        horaInicio=System.currentTimeMillis();
    }
    
    public int colgar(){
        switch(zona){
            case Zona.Africa->{
                return finLlamada()*3;
            }
            case Zona.America->{
                return finLlamada()*5;
            }
            case Zona.Asia->{
                return finLlamada()*4;
            }
            case Zona.Oceania->{
                return finLlamada()*6;
            }
            default->{
                return finLlamada()*2;
            }
        }
    }
    public int finLlamada(){
        horaFin=System.currentTimeMillis();
        return (int)(horaFin-horaInicio);
    }
}
