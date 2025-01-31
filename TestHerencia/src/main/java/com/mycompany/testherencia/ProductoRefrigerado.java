/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testherencia;

/**
 *
 * @author usuario
 */
public class ProductoRefrigerado extends Producto{
    
    int codigoOrganismo;
    
    ProductoRefrigerado(int organismo,String caduca, int lote){
        super(caduca,lote);
        codigoOrganismo=organismo;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
    
    public String muestra(){
        
        return super.info()+"Codigo del organismo de supervision alimentaria:"+this.codigoOrganismo;
    }
}
