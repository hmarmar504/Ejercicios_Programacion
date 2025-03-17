/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leerfichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;



/**
 *
 * @author usuario
 */
public class Fichero {
    HashMap<String,String>ajustes=new HashMap<>();
    File archivo=new File("C:\\Users\\usuario\\Desktop\\quijote.txt");
    FileWriter escribir = null;
    FileReader leer = null;
    
    Fichero(){
        if(archivo.exists()&&!archivo.isDirectory()){
            
            try {
                escribir=new FileWriter(archivo);
                leer=new FileReader(archivo);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
