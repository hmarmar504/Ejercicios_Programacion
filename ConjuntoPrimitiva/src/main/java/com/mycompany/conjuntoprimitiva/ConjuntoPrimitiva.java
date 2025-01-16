/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conjuntoprimitiva;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class ConjuntoPrimitiva {

    public static void main(String[] args) {
        Conjunto prueba;
        Conjunto lleno;
        Integer[] numeros={5,2,3,6};
        
        prueba = new Conjunto();
        lleno = new Conjunto(numeros);
        int menu=0;
        Scanner sc;
        sc = new Scanner(System.in);
        while(menu<100)
        {
            System.out.println("Introduce una opcion");
            System.out.println("1. Introducir nuevo elemento");
            System.out.println("2. Introducir conjunto de elementos");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Eliminar conjunto de elementos");
            System.out.println("5. Ver cantidad de elementos");
            System.out.println("6. Ver elementos");
            menu=sc.nextInt();
            switch(menu){
                case 1-> {
                    System.out.println("Introduce el valor deseado");
                    
                    if(prueba.insertar((Integer)sc.nextInt())==true)
                    {
                        System.out.println("Numero introducido");
                    }
                    else
                    {
                        System.out.println("No es posible introducir el numero");
                    }
                }
                case 2->{
                    if(prueba.insertar(lleno)==true){
                        System.out.println("Se han introducido los numeros");
                    }
                    else{
                        System.out.println("No se han podido introducir todos los numeros");
                    }
                }
                case 3->{
                    if(prueba.eliminar((Integer)sc.nextInt())==true){
                        System.out.println("Numero borrado");
                    }
                    else{
                        System.out.println("No se ha encontrado el numero indicado");
                    }
                }
                case 4->{
                    if(prueba.eliminar(lleno)==true){
                        System.out.println("Se han eliminado los numeros");
                    }
                    else{
                        System.out.println("No se han podido eliminar todos los numeros");
                    }
                }
                case 5->{
                    Conjunto.incluido(lleno, prueba);
                }
                case 6->{
                    System.out.println(Arrays.toString(prueba.getElementos()));
                }
            }
        }
    }
}
