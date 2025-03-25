/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.database;

import java.util.Scanner;



/**
CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES 
* CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES 
* CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES 
* CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES 
* CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES CRUD DE JUGADORES 
 */
public class DataBase{

    public static void main(String[] args) 
    {
        DB database= inicio();
        database.consulta("show tables");
        consulta(database);

    }
    public static void consulta(DB base){
        System.out.println("Elije tabla");
        base.consulta("show tables");
        
    }
    
    public static DB inicio(){
        Scanner iN= new Scanner(System.in);
        System.out.println("Seleccione opcion de inicio");
        System.out.println("0.- Valores predeterminados");
        System.out.println("1.- Solo base de datos");
        System.out.println("2.- Base de datos y user");
        System.out.println("3.- Inicio completo");
        int select=iN.nextInt();
        boolean sel=true;
        DB base=null;
        
        while(sel){
            switch(select){
                case 0->{
                    base= new DB();
                    sel=false;
                }
                case 1->{
                    base= new DB(inBase());
                    sel=false;
                }
                case 2->{
                    base= new DB(inBase(),inUser(),inPass());
                    sel=false;
                }
                case 3->{
                    base= new DB(inBase(),inUser(),inPass(),inPort());
                    sel=false;
                }
                default->{
                    System.out.println("Elija un valor valido");
                }
            }
        }
        return base;
    }
    
    public static String inBase(){
        Scanner iB= new Scanner(System.in);
        System.out.println("Seleccione la base de datos");
        String base=iB.next();
        return base;
    }
    
    public static String inUser(){
        Scanner iU= new Scanner(System.in);
        System.out.println("Indique el usuario");
        String base=iU.next();
        return base;
    }
    
    public static String inPass(){
        Scanner iPw= new Scanner(System.in);
        System.out.println("Indique la contraseña");
        String base=iPw.next();
        return base;
    }
    
    public static String inPort(){
        Scanner iPr= new Scanner(System.in);
        System.out.println("Seleccione el puerto");
        String base=iPr.next();
        return base;
    }
}
