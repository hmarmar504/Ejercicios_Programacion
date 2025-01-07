package com.mycompany.objetos;

/**
 *
 * @author usuario
 */
public class Objetos {

    public static void main(String[] args) {
        
        //Definir una variable de tipo coordenada
        Coordenada c1;
        
        //Reservar espacio para c1
        c1 = new Coordenada();
        
        //Dar valores a c1
        c1.setValores(3, 4);
        c1.print();
    }
}
