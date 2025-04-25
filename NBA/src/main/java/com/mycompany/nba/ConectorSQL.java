/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nba;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class ConectorSQL {
    private Connection conexion;
    
    public ConectorSQL(String ip, String puerto, String bd, String usuario, String contraseña) throws SQLException{
        conexion = DriverManager.getConnection("jdbc:mysql://"+ip+":"+puerto+"/"+bd+"?useSSL=false", usuario, contraseña);
    }
    
    public void cerrar() throws SQLException{
        if(conexion!= null){
            conexion.close();
        }
    }
    public List getEquipos() throws SQLException{
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT DISTINCT equipo_local from partidos;");
        
        List<String> equipos = new ArrayList<>();
        equipos.add("TODOS");
        while(rs.next()){
            equipos.add(rs.getString("equipo_local"));
        }
        
        return equipos;
    }
    public List getConferencia() throws SQLException{
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT DISTINCT conferencia from equipos;");
        
        List<String> conferencias = new ArrayList<>();
        conferencias.add("TODOS");
        while(rs.next()){
            conferencias.add(rs.getString("conferencia"));
        }
        
        return conferencias;
    }
    public List getTemporada() throws SQLException{
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT DISTINCT temporada from partidos;");
        
        List<String> temporadasd = new ArrayList<>();
        temporadasd.add("TODOS");
        while(rs.next()){
            temporadasd.add(rs.getString("temporada"));
        }
        
        return temporadasd;
    }
    public List getPartidos() throws SQLException{
        Statement stmnt = conexion.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT  \n" +
"partidos.equipo_local as equipo_local,\n" +
"partidos.equipo_visitante as equipo_visitante,\n" +
"partidos.puntos_local as puntos_local,\n" +
"partidos.puntos_visitante as puntos_visitante,\n" +
"partidos.temporada as temporada,\n" +
"equipoLocal.Conferencia as conferencia_local,\n" +
"equipoVisitante.Conferencia as conferencia_visitante\n" +
"\n" +
"FROM `partidos` join `equipos` as equipoLocal JOIN `equipos` as equipoVisitante\n" +
"\n" +
"WHERE partidos.equipo_local=equipoLocal.Nombre and partidos.equipo_visitante=equipoVisitante.Nombre");
        
        List<Partido> partidos = new ArrayList<>();
        while(rs.next()){
            String equipoLocal = rs.getString("equipo_local");
            String equipoVisitante = rs.getString("equipo_visitante");
            String temporada = rs.getString("temporada");
            String conferenciaLocal = rs.getString("conferencia_local");
            String conferenciaVisitante = rs.getString("conferencia_visitante");
            int puntosLocal = rs.getInt("puntos_local");
            int puntosVisitante = rs.getInt("puntos_visitante");
            Partido partido = new Partido(equipoLocal,equipoVisitante,conferenciaLocal,conferenciaVisitante,puntosLocal,puntosVisitante,temporada);
            partidos.add(partido);
        }
        rs.close();
        stmnt.close();
        return partidos;
    }
    public void setEquipos(List<Partido>partidos) throws SQLException{
        //Borrado de datos antiguos
        Statement stmnt = conexion.createStatement();
        stmnt.executeUpdate("DELETE FROM partidos");
        stmnt.close();
        
        //Preparacion para datos nuevos
        String query = "INSERT INTO partidos(equipo_local,equipo_visitante,puntos_local,puntos_visitante,temporada) VALUES (?,?,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(query);
        
        //Añadir cada partido
        for(Partido partido : partidos){
            ps.setString(1, partido.getEquipoLocal());
            ps.setString(2,partido.getEquipoVisitante());
            ps.setInt(3,partido.getPuntosLocal());
            ps.setInt(4,partido.getPuntosVisitante());
            ps.setString(5,partido.getTemporada());
        }
    }
}
