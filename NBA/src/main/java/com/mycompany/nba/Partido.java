/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nba;

/**
 *
 * @author marti
 */
public class Partido {
    String equipoLocal;
    String equipoVisitante;
    int putosLocal;
    int puntosVisitante;
    String temporada;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public Partido(String equipoLocal, String equipoVisitante, int putosLocal, int puntosVisitante, String temporada) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.putosLocal = putosLocal;
        this.puntosVisitante = puntosVisitante;
        this.temporada = temporada;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getPutosLocal() {
        return putosLocal;
    }

    public void setPutosLocal(int putosLocal) {
        this.putosLocal = putosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
}
