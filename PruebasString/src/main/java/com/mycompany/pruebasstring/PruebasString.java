/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebasstring;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PruebasString {
    
    public static boolean palindromo(String pal){
        
       boolean comp= false, bucle=true;
       int fin=pal.length()-1,ini=0,med=fin/2;
       
       
           
       while(bucle&&ini>=fin)
        {

            if (pal.charAt(ini)!=pal.charAt(fin))
            {
                bucle=false;
            }
            else
            {
                ini++;
                fin--;
            }
        }
       
        if(ini<=fin)
        {
            comp=true;
        }
        
        if (comp==true)
        {
            System.out.println("La palabra es palindromo");
        }
        
        else
        {
            System.out.println("La palabra no es palindromo");
        }
        
        
        return(comp);
    }
    
    public static void lector(String cad){
        
        int longitud,contador=0;
        
        String cadMin=cad.toLowerCase();
        String cadMay=cad.toUpperCase();
        
        
        longitud = cad.length();
        
        for(int i=0;i<longitud;i++)
        {
            
            if (contador%2==0)
            {
            System.out.print(cadMay.charAt(i) +" ");
            }
            
            else
            {
            System.out.print(cadMin.charAt(i) +" ");
            }
            contador++;
        }
    }

    public static void ahorcado(String cad){
        
        String adv=cad;
        int leng, pos;
        boolean bien=false;
        char entrada;
        Scanner sc = new Scanner (System.in);

        leng=cad.length();

        for(int i=0;i<leng;i++)
            {

                adv = adv.replace(adv.charAt(i), '_');
            }

        while(bien==false)
        {
            System.out.println("Introduce una letra");
            entrada = sc.next().toUpperCase().charAt(0);

            pos = cad.indexOf(entrada);

            System.out.println(pos);

            
            if (pos>=0)
            {
                adv = modificar(adv,pos,entrada);

            }

            if (adv.indexOf('_')<0)
            {
                bien = true;
            }

            System.out.println(adv);

        }

        System.out.println(adv);
        }
    
    public static String modificar(String guiones, int pos, char letra)
    {
        String resul;
        
        resul = guiones.substring(0,pos) + letra + guiones.substring(pos + 1);
        
        return resul;
    }
    public static void main(String[] args) {
        
        String entrada;
        int caso;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un texto sin espacios"); 
        entrada = sc.next();
        System.out.println("Introduce un caso");
        caso = sc.nextInt();
        
        switch (caso){
            case 1 ->
            {
                lector(entrada);
            }
            case 2 ->
            {
                palindromo(entrada);
            }
            case 3 ->
            {
                ahorcado(entrada);
            }
            
        }      
    }
    
}
