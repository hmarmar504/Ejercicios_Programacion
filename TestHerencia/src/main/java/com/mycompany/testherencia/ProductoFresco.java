/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testherencia;

/**
 *
 * @author usuario
 */
public class ProductoFresco extends Producto {
    
    String fechaEnvasado,paisOrigen;
    
    ProductoFresco(String envasado, String origen, String caduca, int lote){
        super(caduca,lote);
        fechaEnvasado=envasado;
        paisOrigen=origen;
        
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public String muestra(){
        
        return super.info()+"Fecha de envasado:"+this.fechaEnvasado+" Pais de origen:"+this.paisOrigen;
    }
}
