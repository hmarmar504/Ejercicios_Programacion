/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioobjetos;

/**
 *
 * @author usuario
 */
public class Dni {
    private String dni, nombre;
    
    Dni()
    {
        
    }
    
    Dni(String d, String n)
    {
        setValores(d,n);
    }
    public void setValores(String d, String n)
    {
        nombre=n;
        dni=d;
    }
    public void setDni(String d)
    {
        dni=d;
    }
    public void setNombre(String n)
    {
        nombre=n;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getDni()
    {
        return dni;
    }
}
