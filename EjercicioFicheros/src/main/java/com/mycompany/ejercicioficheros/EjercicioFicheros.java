/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class EjercicioFicheros {

    public static void main(String[] args) throws IOException{

        File quijote= new File("C:\\Users\\usuario\\Desktop\\quijote.txt");
        FileWriter gh=new FileWriter(quijote,true);
        try{
            if(quijote.canWrite()){
                String cad="En un lugar de la mancha ";
                gh.write(cad);
                
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            gh.close();
        }
        
    }
}
