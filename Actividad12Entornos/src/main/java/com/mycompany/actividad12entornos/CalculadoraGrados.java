/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad12entornos;

/**
 *
 * @author usuario
 */
public class CalculadoraGrados {
    //calculo celsius a farhrenheit
    //(0 °C × 9 / 5) + 32 = 32 °F
    
    //calculo faren a celsius
    //(32 °F − 32) × 5 / 9 =  °C
public double celFaren(double celsius){
    
    return ((celsius*9/5)+32);
}
public double farenCel(double faren){
    return ((faren-32)*5/9);
}
}
