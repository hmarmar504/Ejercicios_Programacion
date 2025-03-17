/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemaclaseobjetos2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class ProblemaClaseObjetos2 {

    public static void main(String[] args) {
        ArrayList<Atleta>comp=new ArrayList<>();
        for(int a=0;a<20;a++){
            
            int tiempo=(int)(Math.random()*100);
            comp.add(new Atleta(tiempo,a,"Nacionalidad"+a,"Nombre"+a));
        }
        
        Carrera car = new Carrera(1000,comp);
        Collections.sort(comp);
        car.setGanador(comp.get(0));
    }
}
