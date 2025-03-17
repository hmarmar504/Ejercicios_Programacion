/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos5;

/**
 *
 * @author usuario
 */
public class Password {
    String clave;
    int longitud;
    boolean encriptada;
    Password(){
        generar((int)(Math.random()*19+1));
    }
    Password(int lon){
        longitud=lon;
        generar(lon);
    }
    private void generar(int l){
        
    clave=Character.toString(0);
        
        for(int i=0;i<l;i++){
            
            int n =(int)(Math.random()*58+1);
            if (n<10){
                clave =clave+(char) (n + 48);
                
            }
            else if(n>=10&&n<34){
                clave =clave+(char) (n+55);
            }
            else if(n>=34&&n<59){
                clave =clave+ (char) (n+63);
            }
        }
    }
    public boolean esFuerte(){
        int cont=0;
        
        for(int a=0;a<clave.length();a++){
            if(Character.isLetter(clave.charAt(a))){
                if(Character.isUpperCase(clave.charAt(a))){
                    cont++;
                }
            }
            else{
                cont++;
            }
        }
        
            return (cont>7);
        
    }
    public String getClave(){
        
        return clave;
    }
}
