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
        Statement stmnt = conexion.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT^ * FROM partidos");
        
        List<Partido> partidos = new ArrayList<>();
        while(rs.next()){
            String equipoLocal = rs.getString("equipo_local");
            String equipoVisitante = rs.getString("equipo_visitante");
            String temporada = rs.getString("temporada");
            int puntosLocal = rs.getInt("puntos_local");
            int puntosVisitante = rs.getInt("puntos_visitante");
            Partido partido = new Partido(equipoLocal,equipoVisitante,puntosLocal,puntosVisitante,temporada);
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
            ps.setInt(3,partido.getPutosLocal());
            ps.setInt(4,partido.getPuntosVisitante());
            ps.setString(5,partido.getTemporada());
        }
    }
}
