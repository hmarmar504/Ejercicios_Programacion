/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testherencia;

/**
 *
 * @author usuario
 */
public class Producto {
    protected String fechaCaducidad;
    protected int numeroLote;
    
    Producto(String fecha, int numero){
        fechaCaducidad=fecha;
        numeroLote=numero;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    public String info(){
        
        return "Fecha de caducidad:"+this.fechaCaducidad+" Numero de lote:"+this.numeroLote+" ";
    }
}
