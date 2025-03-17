/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemaclaseobjetos2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Carrera {
    int distancia;
    Atleta ganador;
    ArrayList<Atleta>competidores;
    
    Carrera(int dis,ArrayList<Atleta> comp){
        distancia=dis;
        competidores=comp;
    }
    
    public void setGanador(Atleta gan){
        ganador=gan;
    }
}
