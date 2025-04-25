/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francico Javier Cabrerizo Membrilla
 * editado por Hector Martinez Martinez
 */
public class Main {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mi cuenta cambiado por cuenta1
        CCuenta cuenta1;
        double saldoActual;
        int opcion=0;
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        
        do{
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println("1 - Ingresar");
                System.out.println("2 - Retirar");
                System.out.println("3 - Finalizar");
                opcion=Integer.parseInt(dato.readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuánto desea ingresar?: ");
                        float ingresar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,ingresar,opcion);
                        break;
                    case 2:
                        System.out.println("¿Cuátno desea retirar?: ");
                        float retirar=Integer.parseInt(dato.readLine());
                        operativa_cuenta(cuenta1,retirar,opcion);
                        break;
                    case 3:
                        System.out.println("Finalizamos la ejecución");
                        break;
                    default:
                        System.err.println("Opción errónea");
                        break;
                }
            } 
            catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (opcion!=3);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    //Metodo operativa_cuenta
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad,int opcion){
        if(opcion==2){
            try 
            {
                cuenta1.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
