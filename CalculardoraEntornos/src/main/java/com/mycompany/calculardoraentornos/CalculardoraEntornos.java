/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculardoraentornos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CalculardoraEntornos {

    public static void main(String[] args) {
        int num1,num2,res;

        String op;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Numero 1");
        num1=sc.nextInt();
        
        System.out.println("Operacion?:");
        System.out.println("+,-,*,/");
        op=sc.next();
        
        System.out.println("Numero 2");
        num2=sc.nextInt();

        switch(op){
            case "+"->{
                res=Calc.suma(num1,num2);
            }
            case "-"->{
                res=Calc.resta(num1,num2);
            }
            case "*"->{
                res=Calc.mul(num1,num2);
            }
            case "/"->{
                res=Calc.div(num1,num2);
            }
            default->{
                res=0;
            }
        }
        
        System.out.println("El resultado de: "+num1+op+num2+" es: "+res);
    }
    
}
