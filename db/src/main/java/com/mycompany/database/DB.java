/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class DB {
        private String driver= "jdbc:mysql";
        private String IP= "localhost";
        private String port="3306"; 
        private String nombreBD; 
        private String user="root"; 
        private String password="";
        
        private Connection con = null;
        private ResultSet rs = null;
        private ResultSetMetaData rsmd= null;
        private Statement sentencia = null;
        private String consultaSQL="";
        
        DB(){
        this.nombreBD="nba";
        }
        DB(String name){
            //Constructor solo para el nombre, resto de valores predeterminados
            //Usuario raiz sin contraseña
            //Puerto 3306
        this.nombreBD=name;
        }
        DB(String name,String user,String pass){
            //Constructor para nombre y usuario
            //Puerto 3306
            this.user=user;
            this.nombreBD=name;
            this.password=pass;
        }
        DB(String name,String user,String pass,String port){
            //Constructor completo: nombre, usuario, y puerto
            this.user=user;
            this.nombreBD=name;
            this.password=pass;
            this.port=port;
        }
        
    public void consulta(String consulta){
     
        
        try
        {
            String url = driver + "://" + IP + ":" + port + "/" + nombreBD ;
            con = DriverManager.getConnection(url,user,password);            
            
            sentencia = (Statement) con.createStatement();

            consultaSQL = consulta;
            
            rs = sentencia.executeQuery("Select * from jugadores");
            rsmd =rs.getMetaData();
            

            while(rs.next())
            {
                int numCol = rsmd.getColumnCount();
                
                for(int a = 0;a<numCol;a++){
                System.out.print(rs.getString(a+1)+" ");
                }
                System.out.println();
                
            }
        }
        catch (SQLException e)
        {
            System.out.println("Revise la conexión a la base de datos");
        }
        finally
        {
            if(con != null)
            {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
        }
        
    }
}
