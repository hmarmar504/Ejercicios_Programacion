/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personaentorno;

/**
 *
 * @author usuario
 */
public class PersonaEntorno {

    public static void main(String[] args) {
        Empleado manolo=new Empleado("jefe","55555555A","Manolo",1950,5555);
        Empleado pepe=new Empleado("cafetero","55555555B","Pepe",1980,222);

        System.out.println(pepe.compareTo(manolo));
        System.out.println(manolo.calcEdad());
    }
}
