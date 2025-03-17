/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Vagon {
    private int numero;
    private boolean clase;//false=SegundaClase,true=PrimeraClase
    private ArrayList<Asiento> sitios;
    
    Vagon(boolean clas){
        clase=clas;
        for(int a=0;a<40;a++){
        sitios.add(new Asiento());
        }
    }
    
    //Comprobacion de asiento
    public boolean sienta(){
        int sienta=(int)(Math.random()*10);
        
        if(clase==false){
            
            if(sienta<4){
                return this.sentarse();
            }
            else{
                return false;
            }
        }
        
        else{
            
            if(sienta<1){
                return this.sentarse();
            }
            else{
                return false;
            }
        }
    }
    //Sentarse en el primer asiento que encuentre
    private boolean sentarse(){
        
        boolean ocupa=false;
        
        for(int a=0;a<sitios.size();a++){
            if(!sitios.get(a).getOcupado()){
                sitios.get(a).ocuparAsiento();
                ocupa=true;
            }
        }
        return ocupa;
    }
}
