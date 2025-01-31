/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciohoras;

/**
 *
 * @author usuario
 */
public class Hora {
    int hora,minuto;
    Hora(int h, int m){
        hora=h;
        minuto=m;
    }
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setHora(int h){
        hora=h;
    }

    public void inc(){
        
        if(minuto<60){
            minuto++;
        }
        else{
            pasoHora();
        }
    }
    public boolean setMinutos(int m){
        if ((minuto+m)<60){
            minuto=minuto+m;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        
        return hora+":"+minuto;
    }
    private void pasoHora(){
        if(hora<24){
        hora++;   
        }
        else{
            horaVacio();
        }
        minuto=0;
    }
    private void horaVacio(){
        hora=0;
    }
}
