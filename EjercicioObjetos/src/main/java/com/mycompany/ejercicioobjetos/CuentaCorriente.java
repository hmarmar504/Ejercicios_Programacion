/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioobjetos;

/**
 *
 * @author usuario
 */
public class CuentaCorriente {
    private String nombre,dni;
    private int saldo=0;
    
    Dni dniUsuario = new Dni();

    
    public CuentaCorriente()
        {
        }
    public CuentaCorriente(String d,String n)
    {
        setValores(d,n);
    }
    public void setValores(String d,String n)
    {
        dniUsuario.setDni(d);
        dniUsuario.setNombre(n);
        dni=d;
        nombre=n;
    }
    public void setDni(String d)
    {
        dniUsuario.setDni(d);
    }
    public void setNombre(String n)
    {
        nombre=n;
    }
    public boolean sacarDinero(int cant)
    {
        boolean sacar;
        
        if (saldo<cant)
                {
                    sacar=false;
                }
        else
        {
            sacar=true;
            saldo=saldo-cant;
        }
        return sacar;
    }
    public void ingresarDinero(int cant)
    {
        saldo=saldo+cant;
    }
    public void info()
    {
        System.out.println("--------Info--------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("DNI: "+ dniUsuario.getDni());
        System.out.println("Saldo: "+saldo);
        System.out.println("--------------------");
    }
}
