/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos4;

/**
 *
 * @author usuario
 */
public class Candado {
    private int[] clave={0,0,0};
    private int[] actual={0,0,0};
    
    Candado(int uno,int dos, int tres){
        clave[0]=uno;
        clave[1]=dos;
        clave[2]=tres;
    }
    public boolean cambio(int pos, int cant){
        
        if(cant>9||pos>2||pos<0){
            return false;
        }
        else{
            actual[pos]=cant;
            return true;
        }
    }
    public boolean indicarPos(int a,int b,int c){
        if(a>9 || b>9 || c>9){
            return false;
        }
        else{
            actual[0]=a;
            actual[1]=b;
            actual[2]=c;
            return true;
        }
    }
    public boolean abrir(){
        
        return(clave[0]==actual[0]&&clave[1]==actual[1]&&clave[2]==actual[2]);
    }
    public boolean misma(Candado otro){
        
        return(this.actual[0]==otro.actual[0]&&this.actual[1]==otro.actual[1]&&this.actual[2]==otro.actual[2]);
    }
}
