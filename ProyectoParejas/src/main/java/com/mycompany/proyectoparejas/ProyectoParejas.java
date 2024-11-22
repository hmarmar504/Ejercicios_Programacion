

package com.mycompany.proyectoparejas;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ProyectoParejas {
    //generar una lista con los tipos de caracteres a introducir
    public static void ascii(char[]tabas,int cant){
        
        for(int i=0;i<tabas.length;i++){
            if (i<10){
                tabas[i] = (char) (i + 48);
            }
            else if(i>=10&&i<34){
                tabas[i] = (char) (i+55);
            }
            else{
                tabas[i] = (char) (i+63);
            }
        }
        System.out.println(Arrays.toString(tabas));
    }
    
    public static void menuInicial(int[]ajustes){
        int selec;
        boolean fallo=false;
        Scanner sc = new Scanner (System.in);
        do{
        System.out.println("Elija sus opciones de juego");
        System.out.println("1.- Iniciar con ajustes predefinidos");
        System.out.println("2.- Cambiar configuracion");
        System.out.println("3.- Terminar el juego");
        
        selec=sc.nextInt();
        
            switch(selec){
                case 1 -> {
                    fallo=true;
                }
                case 2->{
                    menuOpciones(ajustes);
                    fallo=true;
                }
                case 3->{
                    ajustes[6]=1;
                    fallo=true;
                }
                default  ->{
                    System.out.println("Introduzca un numero valido");
                }
            }
        }while(fallo==false);
    }
    //Menu principal de opciones
    public static void menuOpciones(int[]ajustes){
        
        int selec;
        boolean fallo=false,salida=false;
        Scanner sc = new Scanner (System.in);
        do{
            //Seleccion de los ajustes del juego
            System.out.println("Elija sus opciones de juego");
            System.out.println("1.- Tamaño del tablero");
            System.out.println("2.- Dificultad");
            System.out.println("3.- Zoom");
            System.out.println("4.- Cantidad de errores");
            System.out.println("5.- Tiempo de muestra");
            System.out.println("6.- Salir de los ajustes");
            System.out.println("7.- Salir del juego");

            selec=sc.nextInt();
            switch(selec){
                case 1 -> {//Indicacion del tamaño del tablero
                        System.out.println("Opciones de tamaño");
                        do{
                        System.out.println("introduzca el tamaño horizontal");
                        ajustes[0]=sc.nextInt();
                        System.out.println("Introduzca el tamaño vertical");
                        ajustes[1]=sc.nextInt();

                        if((ajustes[0]%ajustes[1]==0)||(ajustes[1]%ajustes[0]==0)){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                        }while(fallo==false);
                }
                case 2 -> {//Seleccion de dificultad
                    do{
                    System.out.println("Seleccione dificultad");
                    ajustes[2]=sc.nextInt();

                        if(ajustes[2]>-1||ajustes[2]<3){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                    }while(fallo==false);
                }
                case 3 ->{//Seleccion de zoom
                    do{
                    System.out.println("Seleccione zoom");
                    ajustes[3]=sc.nextInt();

                        if(ajustes[3]>-1||ajustes[3]<3){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                    }while(fallo==false);
                }
                case 4 ->{//Seleccion cantidad de errores
                    System.out.println("Seleccione la cantidad de errores");
                    ajustes[4]=sc.nextInt();
                }
                case 5->{
                    System.out.println("Seleccione el tiempo de muestra en ms");
                    ajustes[5]=sc.nextInt();
                }
                case 6->{
                    salida=false;
                }
                case 7->{
                    ajustes[6]=1;
                }
                default  ->{
                    System.out.println("Introduzca un numero valido");
                }
            }
        }while(salida);
    }

    public static void genTabla(int[]ajustes,char[][]general){
        
    }
    public static void main(String[] args) {
        //declaracion de varialbes
        //tablas de muestra, tabla entera, y datos mostrados para la maquina
        char general [][];
        char mostrados [][];
        char salida [][];
        //variables generales
        char asciiGuardado [];
        int ajustes[] = new int[8];
        int dimx,dimy,fallos,totalCasi;
        Scanner sc = new Scanner (System.in);
        do{
            //Ajustes predeterminados del juego
        ajustes[0]=4;//Ancho de la tabla Maximo 10
        ajustes[1]=4;//Alto de la tabla Maximo 10
        ajustes[2]=1;//Zoom Maximo 3
        ajustes[3]=0;//Dificultad de la maquina: 0=No maquina, 1=Facil, 2=Medio, 3=Dificil
        ajustes[4]=3;//Cantidad de errores permitidos
        ajustes[5]=3;//Tiempo de muestra mS
        ajustes[6]=0;//Variable de salida del juego: 0=Seguir jugando, otro=Salir del juego
        
        //Llamada a los apartados del menu
        menuInicial(ajustes);
        
        //Inicializacion de la tabla
        general = new char [ajustes[0],ajustes[1]];
        
        //Rellenado de la tabla
        genTabla(ajustes,general);
        
        }while(ajustes[6]!=0);
    }
        
}
