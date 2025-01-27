/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlrobothector;

/**
 *
 * @author usuario
 */
public class Robot {
    private int cargaMax,cargaAct,anio,dist;
    private String nombre;
    Robot(){
        
    }
    Robot(int max, int act,int fecha, int dista, String name){
        cargaMax=max;
        cargaAct=act;
        anio=fecha;
        dist=dista;
        nombre=name;
    }
    Robot(String name){
        nombre=name;
    }
    public void mover(int move){
        dist=dist+move;
    }
    public int getAnio(){
    return anio;
    }
    public int getDist(){
        return dist;
    }
    public String getName(){
        return nombre;
    }
    public int getCargMax(){
        return cargaMax;
    }
    public int getCargaAct(){
        return cargaAct;
    }
    public void setAnio(int fecha){
        anio=fecha;
    }
    public void setDist(int recorr){
        dist=recorr;
    }
    public void setName(String name){
        nombre=name;
    }
    public void setCargaMax(int carg){
        cargaMax=carg;
    }
    public void setCargaAct(int carg){
        cargaAct=carg;
    }
    
    public boolean comparar(Robot otro){
        if(otro.getAnio()>this.getAnio()){
            return true;
        }
        else{
            return false;
        }
    }
    public void mostrar(){
        System.out.println("El nombre del robot es: "+nombre);
        System.out.println("Su fecha es: "+anio);
        System.out.println("Su carga maxima es: "+cargaMax);
        System.out.println("Su carga actual es: "+cargaAct);
        System.out.println("Su distancia recorrida es: "+dist);
    }
    
}
