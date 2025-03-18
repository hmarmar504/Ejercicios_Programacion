/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leerfichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author usuario
 */
public class Fichero {
    private HashMap<String,String>ajustes=new HashMap<>();
    private File archivo=new File("C:\\Users\\usuario\\Desktop\\inicial.ini");
    private FileWriter escribir = null;
    private FileReader leer = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    
    Fichero(){
        if(archivo.exists()&&!archivo.isDirectory()){
            try {
                
                leer=new FileReader(archivo);
                br= new BufferedReader(leer);
                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void inAjuste(String name,String value){
        ajustes.put(name, value);
    }
    public void escribirAjustes(){
        try {
            escribir=new FileWriter(archivo);
            bw= new BufferedWriter(escribir);
            for(Map.Entry<String,String> entry:ajustes.entrySet()){
                bw.write(entry.toString());
                bw.newLine();
            }
            
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void iniciar(){
        
        if(archivo.exists()){
            this.leerAjustes();
        }
        else{
            try {
                archivo.createNewFile();
                this.escribirAjustes();
            } catch (Exception ex) {
            System.out.println(ex.getMessage());
            }
        }
    }
    public void leerAjustes(){
        try {

            if(archivo.canRead()){
                String a;
                while((a=br.readLine())!=null){

                    ajustes.put(a.split("=")[0], a.split("=")[1]);
                }
            }
            System.out.println(this.ajustes.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
