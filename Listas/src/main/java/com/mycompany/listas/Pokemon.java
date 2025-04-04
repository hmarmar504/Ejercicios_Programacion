/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;

/**
 *
 * @author usuario
 */
public class Pokemon implements Comparable {
    protected int experiencia,salud,id;
    protected String entrenador;
    
    Pokemon(String name,int hp,int xp){
        experiencia=xp;
        salud=hp;
        entrenador=name;
    }
    
    public int compareTo(Object obj){
        Pokemon otro=(Pokemon) obj;
        return this.salud-otro.salud;
    }
    public String toString(){
        return("Entrenador: "+this.entrenador);
    }
    public int ataqueRapido(){
        return 15;
    }
    public void mostrar(){
        System.out.println("Nombre del entrenador: "+entrenador);
        System.out.println("Salud del pokemon: "+salud);
        System.out.println("Experiencia actual del pokemon: "+experiencia);
    }
    public int getExperiencia() {
        return experiencia;
    }
    public int getSalud() {
        return salud;
    }
    public String getEntrenador() {
        return entrenador;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
}
