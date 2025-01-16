package com.mycompany.objetos;

/**
 *
 * @author usuario
 */
public class Objetos {

    public static void main(String[] args) {
        
        //Definir una variable de tipo coordenada
        Coordenada c1;
        Coordenada c2;
        //Reservar espacio para c1
        c1 = new Coordenada();
        c2 = new Coordenada(5,6);
        
        c1.setValores(3, 4);
        
        c1.print();
        
        System.out.println(c1.suma());

        if(comparar(c1,c2))
        {
            System.out.println("Los objetos son iguales");
        }
        
        else
        {
            System.out.println("Los objetos no son iguales");
        }
    }
    public static boolean comparar(Coordenada cor1, Coordenada cor2)
    {
        
        boolean resul;
        resul=((cor1.getFila()==cor2.getFila())&&(cor1.getColumna()==cor2.getColumna()));
        return resul;
    }
}
