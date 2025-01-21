/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocalendario;

/**
 *
 * @author usuario
 */
public class Calendario {
    
 private int anio, mes, dia;
 
 Calendario(){
     
     anio=1;
     mes=1;
     dia=1;
 }
 
 Calendario(int a,int b,int c){
     
     anio=a;
     mes=b;
     dia=c;
 }
 
 public void incAnio(){
     
     anio++;
 }
 
 public void incAnio(int a){
     
     for(int i=0;i<a;i++){
         incAnio();
     }
 }
 
 public void incMes(){
     
     if(mes==12){
         mes=1;
         incAnio();
     }
     else{
         mes++;
     }
 }
 
 public void incMes(int a){
     
     for(int i=0;i<a;i++){
         incMes();
     }
 }
 
 public void incDia(){
     
     switch(mes){
         
         case 1,3,5,7,8,10,12 ->{
             
             if(dia==31){
                dia=1;
                incMes();
             }
             else{
                 dia++;
             }
         }
         case 2 ->{
             
             if(bisiesto(anio)){
                 
                 if(dia==29){
                     
                    dia=1;
                    incMes();
                 }
                 else{
                     
                     dia++;
                 }
             }
             else{
                 if(dia==28){
                     
                    dia=1;
                    incMes();
                 }
                 else{
                     
                     dia++;
                 }
             }
         }
         default ->{
             
             if(dia==30){
                 
                 dia=1;
                 incMes();
             }
             else{
                 
                 dia++;
             }
         }
     }
 }
 
 private boolean bisiesto(int fecha){
     
     if(fecha%4==0){
         return true;
     }
     else{
         return false;
     }
 }
 
 public void incDia(int a){
     
     for(int i=0;i<a;i++){
         incDia();
     }
 }
 
 public int getDia(){
     
     return dia;
 }
 
 public int getMes(){
     
     return mes;
 }
 
 public int getAnio(){
     
     return anio;
 }
 
 public void mostrar(){
     
     System.out.println("El dia es "+ dia+", el mes es "+mes+", y el año es "+anio);
 }
 
 public boolean iguales(Calendario otraFecha){
     
     if((otraFecha.getDia()==this.getDia())&&(otraFecha.getMes()==this.getMes())&&(otraFecha.getAnio()==this.getAnio())){
         return true;
     }
     else{
         return false;
     }
 }
 
 public static boolean iguales(Calendario una, Calendario otra){
     
     if((otra.getDia()==una.getDia())&&(otra.getMes()==una.getMes())&&(otra.getAnio()==una.getAnio())){
         return true;
     }
     else{
         return false;
     }
 }
}
