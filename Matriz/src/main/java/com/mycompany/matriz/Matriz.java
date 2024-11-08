/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int turno=0,casilla;
        char jugador;
        boolean ganador=false;
        double alea;
        char matriz [][]=new char[3][3];
        int lista [] =new int[10];
        
        //Primera impresion de tabla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=' ';
            }
        }
        //Inicio de partida
        while(turno<9&&ganador==false){
            
            //Eleccion de jugador
            if (turno%2==0){
                jugador='o';
            }
            else {jugador='x';
            }
            Scanner sc = new Scanner (System.in);
            if (jugador =='x'){
            casilla= sc.nextInt();
            }
            //Eleccion de casilla aleatoria
            else {
                do{
                    alea= Math.random()*9+1;
                    casilla=(int)alea;
                    }
                while(lista[casilla]!=0);
                System.out.println(casilla);
            }
            
            //Eleccion de casilla
             switch(casilla){
                case 1 -> {if (matriz[0][0]==' '){
                    matriz[0][0]=jugador;turno=turno+1;lista[1]=1;}}
                case 2 -> {if (matriz[0][1]==' '){
                    matriz[0][1]=jugador;turno=turno+1;lista[2]=1;}}
                case 3 -> {if (matriz[0][2]==' '){
                    matriz[0][2]=jugador;turno=turno+1;lista[3]=1;}}
                case 4 -> {if (matriz[1][0]==' '){
                    matriz[1][0]=jugador;turno=turno+1;lista[4]=1;}}
                case 5 -> {if (matriz[1][1]==' '){
                    matriz[1][1]=jugador;turno=turno+1;lista[5]=1;}}
                case 6 -> {if (matriz[1][2]==' '){
                    matriz[1][2]=jugador;turno=turno+1;lista[6]=1;}}
                case 7 -> {if (matriz[2][0]==' '){
                    matriz[2][0]=jugador;turno=turno+1;lista[7]=1;}}
                case 8 -> {if (matriz[2][1]==' '){
                    matriz[2][1]=jugador;turno=turno+1;lista[8]=1;}}
                case 9 -> {if (matriz[2][2]==' '){
                    matriz[2][2]=jugador;turno=turno+1;lista[9]=1;}}
                default -> {System.out.println("No hay "+casilla+" casillas, burro");}
                 }

            //Impresion con datos nuevos
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("|" + matriz[i][j] + "|");
                    }
                System.out.println();
            }
            
            //Resultado ganador horizontal
             if(ganador==false){
             for (int fila=0;fila<3;fila++){
                if (matriz[fila][0]==jugador&&matriz[fila][1]==jugador&&matriz[fila][2]==jugador){
                    System.out.println("Gana jugador "+ jugador);
                    fila=3;ganador=true;}
                }
            }
            //Resultado ganador vertical
            if(ganador==false){
                for (int fila=0;fila<3;fila++){
                    if (matriz[0][fila]==jugador&&matriz[1][fila]==jugador&&matriz[2][fila]==jugador){
                        System.out.println("Gana jugador "+ jugador);
                        fila=3;ganador=true;}
                }
            }
            //Resultado ganador diagonal
            if(matriz[0][0]==jugador&&matriz[1][1]==jugador&&matriz[2][2]==jugador&&ganador==false){
                ganador=true;
                System.out.println("Gana jugador "+ jugador);}
            else if(matriz[0][2]==jugador&&matriz[1][1]==jugador&&matriz[2][0]==jugador&&ganador==false){
                ganador=true;
                System.out.println("Gana jugador "+ jugador);}
            
            //Turno final
            if (turno==9&&ganador==false){
                System.out.println("Que malo que eres, por dios");
            }
        }
    }
}