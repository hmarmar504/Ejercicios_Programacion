/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficheroxml;
import javax.xml.bind.annotation.*;
/**
 *
 * @author usuario
 */
@XmlRootElement (name="Socio") //el elemento raíz se llamará 'socio
@XmlType (propOrder = {"nameS", "direccion", "fechaAlta"})
@XmlAccessorType (XmlAccessType.FIELD)

public class Socio {
    @XmlAttribute(name = "id", required = true)
    private Integer id;
    @XmlElement(name="nombre")
    private String nameS;
    private String direccion;
    @XmlElement(name="alta")
    private String fechaAlta;
    
    Socio(){
        
    }
    Socio(Integer id,String nameS,String direccion,String fechaAlta){
        
        this.id=id;
        this.nameS=nameS;
        this.direccion=direccion;
        this.fechaAlta=fechaAlta;
    }
}
