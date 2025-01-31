/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciohoras;

/**
 *
 * @author usuario
 */
public class HoraExacta extends Hora {
    int segundo;
    
    HoraExacta(int h, int m, int s){
        super(h,m);
        segundo=s;
    }
    public int getSegundo(){
        return segundo;
    }
    public void inc(){
        if(segundo<60){
            segundo++;
        }
        else{
            pasoMinuto();
        }
    }
    public void pasoMinuto(){
        super.inc();
        segundo=0;
    }
    public boolean setSegundo(int s){
        if ((segundo+s)<60){
            segundo=segundo+s;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return super.toString()+":"+segundo;
    }
    @Override
    public boolean equals(Object obj){
        HoraExacta otra;
        otra=(HoraExacta) obj;
        
        return this.compara(otra);
    }
    private boolean compara(HoraExacta otra){
        return (this.getHora()==otra.getHora()&&this.getMinuto()==otra.getMinuto()&&this.getSegundo()==otra.getSegundo());
    }
}
