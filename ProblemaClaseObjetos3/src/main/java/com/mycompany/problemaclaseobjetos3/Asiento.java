/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos3;

/**
 *
 * @author usuario
 */
public class Asiento {
    //ocupado false=no ocupado,clase false=segunda clase
    private boolean ocupado;
    
    Asiento(){
        ocupado=false;
    }
    
    public boolean ocuparAsiento(){
        if(this.ocupado){
            return false;
        }
        else{
            this.ocupado=true;
            return true;
        }
    }
    public boolean getOcupado(){
        return ocupado;
    }
}
