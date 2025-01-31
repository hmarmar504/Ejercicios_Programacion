/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testherencia;

/**
 *
 * @author usuario
 */
public class ProductoCongelado extends Producto {
    
    double temperatura;
    ProductoCongelado(double temp,String caduca,int lote){
        super(caduca,lote);
        temperatura=temp;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public String muestra(){
        
        return super.info()+"Temperatura de conserva:"+this.temperatura;
    }
    
}
