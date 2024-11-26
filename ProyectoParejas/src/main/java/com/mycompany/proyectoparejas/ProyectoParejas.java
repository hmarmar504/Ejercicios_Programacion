

package com.mycompany.proyectoparejas;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author usuario
 */
public class ProyectoParejas {
    //generar una lista con los tipos de caracteres a introducir
    public static void ascii(char[]tabas){
        
        for(int i=0;i<tabas.length/2;i++){
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
        for(int i=0;i<tabas.length/2;i++){
            if (i<10){
                tabas[i+tabas.length/2] = (char) (i + 48);
            }
            else if(i>=10&&i<34){
                tabas[i+tabas.length/2] = (char) (i+55);
            }
            else{
                tabas[i+tabas.length/2] = (char) (i+63);
            }
        }
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
                            fallo=false;
                        System.out.println("introduzca el tamaño horizontal (maximo 10)");
                        ajustes[0]=sc.nextInt();
                        System.out.println("Introduzca el tamaño vertical (maximo 10)");
                        ajustes[1]=sc.nextInt();
                        
                        //Confirmacion del tamaño del tablero
                        if(((ajustes[0]*ajustes[1])%2==0)&&(ajustes[0]<11)&&(ajustes[1]<11)&&(ajustes[1]>1)&&(ajustes[0]>1)){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                        }while(fallo==false);
                }
                case 2 -> {//Seleccion de dificultad
                    do{
                        fallo=false;
                    System.out.println("Seleccione dificultad");
                    ajustes[2]=sc.nextInt();

                        if(ajustes[2]>-1&&ajustes[2]<3){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                    }while(fallo==false);
                }
                case 3 ->{//Seleccion de zoom
                    do{
                        fallo=false;
                    System.out.println("Seleccione zoom");
                    ajustes[3]=sc.nextInt();

                        if(ajustes[3]>-1&&ajustes[3]<3){
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
                    salida=true;
                }
                case 7->{
                    ajustes[6]=1;
                    salida=true;
                }
                default  ->{
                    System.out.println("Introduzca un numero valido");
                }
            }
        }while(salida!=true);
    }
    //Rellenado y mezcla de la tabla con los valores posibles*2
    public static void genTabla(int[]ajustes,char[][]general,char[]ascii){
        char mem;
        int cont=0,cambio1,cambio2;
        for (int a = 0; a < general.length; a++) {
            for (int b = 0; b < general[0].length; b++) {
                general[a][b]=ascii[cont];
                cont++;
            }
        }
        for(int a=0; a< general.length;a++){
            for(int b=0; b<general[0].length;b++){
                cambio1=(int) (Math.random()*general.length);
                cambio2=(int) (Math.random()*general[0].length);
                mem=general[a][b];
                general[a][b]=general[cambio1][cambio2];
                general[cambio1][cambio2]=mem;
            }
        }
        
    }
    //Rellenado de tabla vacia
    public static void tabVacia(char vacio[][]){
        
    
        for (int a = 0; a < vacio.length; a++) {
            for (int b = 0; b < vacio[0].length; b++) {
                vacio[a][b]=' ';
            }
        }
    }
    //Imprimir tabla con la cuadricula hecha(mas o menos)
    public static void imprimirTablero(char[][]tablero){

        for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    System.out.print("|" + tablero[i][j]);
                }
                System.out.print("|");
            System.out.println();
            for (int j = 0; j < tablero[0].length; j++) {
                    System.out.print("--");
            }
            System.out.print("-");
            System.out.println();
        }
    }
    
    public static void selec(char[][]salida,char[][]general,char[][]mostrados,int[] ajustes){
        boolean selec=false,victoria;
        String casilla1,casilla2;
        int cas1=0,cas11=0,cas2=0,cas22=0,fallosU=0,fallosM=0;
        Scanner sc = new Scanner (System.in);
        do{
            do{//Eleccion de la primera casilla
               
                System.out.println("Selecciona una casilla");
                casilla1=sc.next();
                if (casilla1.length()>1){
                
                    cas1=Character.getNumericValue(casilla1.charAt(0));
                    cas11=Character.getNumericValue(casilla1.charAt(1));

                    if (cas1>0&&cas1<salida.length&&cas11>0&&cas11<salida[0].length){//Filtro para entradas no validas
                        //Sustitucion de la casilla elegida
                        if(salida[cas1][cas11]==' '){

                            mostrados[cas1][cas11]=general[cas1][cas11];
                            salida[cas1][cas11]=general[cas1][cas11];
                            selec=true;
                            imprimirTablero(salida);
                        }

                        else{
                            System.out.println("Esa casilla ya esta elegida");
                        }
                    }
                    else{
                        System.out.println("Introduce valores validos");
                    }
                }
                else{
                    System.out.println("Introduce valores validos");
                }
            }while(selec==false);

            selec=false;

            do{//Eleccion de la segunda casilla

                System.out.println("Selecciona la segunda casilla");
                casilla2=sc.next();
                if (casilla2.length()>1){
                    
                    cas2=Character.getNumericValue(casilla2.charAt(0));
                    cas22=Character.getNumericValue(casilla2.charAt(1));

                    if (cas1>0&&cas2<salida.length&&cas11>0&&cas22<salida[0].length){//Filtro para entradas no validas
                        //Sustitucion de la casilla elegida
                        if(salida[cas2][cas22]==' '){

                            mostrados[cas2][cas22]=general[cas2][cas22];
                            salida[cas2][cas22]=general[cas2][cas22];
                            selec=true;
                            imprimirTablero(salida);
                        }

                        else{
                            System.out.println("Esa casilla ya esta elegida");
                        }
                    }
                    else{
                        System.out.println("Introduce valores validos");
                    }
                }
                else{
                        System.out.println("Introduce valores validos");
                    }
            }while(selec==false);

            selec=false;
            
            //Pareja encontrada
            if(salida[cas2][cas22]==salida[cas1][cas11]){

                System.out.println("Pareja encontrada");
            }
            //fallo
            else{
                System.out.println("Prueba otra vez");
                salida[cas2][cas22]=' ';
                salida[cas1][cas11]=' ';
                imprimirTablero(salida);
                fallosU++;
                System.out.println("Has tenido "+fallosU+" fallos");
            }
            
            //Comprovacion de tablero completado
            victoria=true;
            for (int a = 0; a < salida.length; a++) {
                for (int b = 0; b < salida[0].length; b++) {
                    if(salida[a][b]==' '){
                        victoria=false;
                    }
                }
            }
        }while(victoria==false&&fallosU<ajustes[4]&&fallosM<ajustes[4]);
        if (victoria==true){
            System.out.println("Partida terminado");
        }
        else if(fallosU==ajustes[4]){
            System.out.println("El jugador pierde");
        }
        else if(fallosM==ajustes[4]){
            System.out.println("La maquina pierde");
        }
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
        String nombre;
        long inicio=0, tTotal;
        
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

            if(ajustes[6]==0){//Condicion de juego cerrado

                //Generacion de caracteres de la tabla
                asciiGuardado=new char [ajustes[0]*ajustes[1]];
                ascii(asciiGuardado);
                
                //Inicializacion y rellenado de la tabla general
                general = new char [ajustes[0]][ajustes[1]];
                genTabla(ajustes,general,asciiGuardado);
                
                //Inicializacion y rellenado de las tablas secundarias
                mostrados = new char [ajustes[0]][ajustes[1]];
                salida = new char [ajustes[0]][ajustes[1]];
                tabVacia(mostrados);
                tabVacia(salida);
                imprimirTablero(general);
                imprimirTablero(mostrados);
                //Nombre del jugador
                System.out.println("Introduzca un nombre");
                nombre=sc.next();
                //Insercion de temporizador
                inicio=System.currentTimeMillis();
                //Seleccion de casilla
                selec(salida,general,mostrados,ajustes);
                
            }//Cierre de condicion de juego cerrado
        tTotal=(System.currentTimeMillis()-inicio);
        System.out.println("Tu tiempo ha sido "+tTotal);
        }while(ajustes[6]==0);
        
    }
        
}
