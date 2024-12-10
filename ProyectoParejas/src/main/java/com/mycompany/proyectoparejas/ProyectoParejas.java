

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
    public static void limpiar(){
        
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
            limpiar();
            //Seleccion de los ajustes del juego
            System.out.println("Elija sus opciones de juego");
            System.out.println("1.- Tamaño del tablero");
            System.out.println("2.- Zoom");
            System.out.println("3.- Dificultad");
            System.out.println("4.- Cantidad de errores");
            System.out.println("5.- Tiempo de muestra");
            System.out.println("6.- Salir de los ajustes");
            System.out.println("7.- Salir del juego");
            selec=sc.nextInt();
            switch(selec){
                case 1 -> {//Indicacion del tamaño del tablero
                        System.out.println("Opciones de tamaño");
                        do{
                            limpiar();
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
                case 2 -> {//Seleccion de zoom
                    do{
                        fallo=false;
                        limpiar();
                    System.out.println("Seleccione zoom");
                    ajustes[2]=sc.nextInt();

                        if(ajustes[2]>-1&&ajustes[2]<=3){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                    }while(fallo==false);
                }
                case 3 ->{//Seleccion de dificultad
                    do{
                        fallo=false;
                        limpiar();
                    System.out.println("Seleccione dificultad");
                    ajustes[3]=sc.nextInt();

                        if(ajustes[3]>-1&&ajustes[3]<=3){
                            fallo=true;
                        }
                        else{
                            System.out.println("Los valores introducidos no son validos, introduzcalos otra vez");
                        }
                    }while(fallo==false);
                }
                case 4 ->{//Seleccion cantidad de errores
                    limpiar();
                    System.out.println("Seleccione la cantidad de errores");
                    ajustes[4]=sc.nextInt();
                }
                case 5->{
                    limpiar();
                    System.out.println("Seleccione el tiempo de muestra en ms");
                    ajustes[5]=sc.nextInt();
                }
                case 6->{
                    limpiar();
                    salida=true;
                }
                case 7->{
                    limpiar();
                    ajustes[6]=1;
                    salida=true;
                }
                default  ->{
                    limpiar();
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
    
    public static String[] dificil(char[][] salida, char[][] mostrados, char[][] general, int fallos, String[] encontrados) {
        boolean exito = false;

        // Paso 1: Buscar parejas en la lista "encontrados".
        for (int a = 0; a < encontrados.length; a++) {
            for (int b = 0; b < encontrados.length; b++) {
                if (encontrados[a] != "+" && encontrados[b] != "+" && encontrados[a].charAt(0) == encontrados[b].charAt(0) && a!=b && exito==false) {
                    // Recuperar las coordenadas de las parejas encontradas.
                    int x1 = Character.getNumericValue(encontrados[a].charAt(1));
                    int y1 = Character.getNumericValue(encontrados[a].charAt(2));
                    int x2 = Character.getNumericValue(encontrados[b].charAt(1));
                    int y2 = Character.getNumericValue(encontrados[b].charAt(2));

                    // Revelar las casillas en el tablero.
                    salida[x1][y1] = general[x1][y1];
                    salida[x2][y2] = general[x2][y2];

                    // Marcar las parejas como usadas.
                    encontrados[a] = "+";
                    encontrados[b] = "+";
                    exito = true;
                }
            }
        }

        // Paso 2: Seleccionar casillas vacías si no se encontraron parejas.
        if (exito==false) {
            boolean busquedaVacio = false;

            // Mientras no se encuentre una pareja y haya casillas vacías:
            while (exito==false) {
                boolean casillaSeleccionada = false;

                for (int i = 0; i < mostrados.length; i++) {
                    for (int j = 0; j < mostrados[0].length; j++) {
                        if (mostrados[i][j] == ' ' && casillaSeleccionada==false) {
                            // Seleccionar la casilla vacía.
                            mostrados[i][j] = general[i][j];
                            salida[i][j] = general[i][j];
                            casillaSeleccionada = true;

                            // Agregar la nueva casilla a "encontrados".
                            for(int c=0;c<encontrados.length;c++){
                                if(busquedaVacio==false && encontrados[c]=="+"){
                                    String nuevoValor = general[i][j] + String.valueOf(i) + String.valueOf(j);
                                    encontrados[c] = nuevoValor;
                                    busquedaVacio=true;
                                }
                            }
                            if(busquedaVacio==false){
                                String nuevoValor = general[i][j] + String.valueOf(i) + String.valueOf(j);
                                encontrados = Arrays.copyOf(encontrados, encontrados.length + 1);
                                encontrados[encontrados.length - 1] = nuevoValor;
                            }

                            // Verificar si esta casilla forma una pareja.
                            for (int a = 0; a < encontrados.length - 1; a++) {
                                if (encontrados[a] != null && encontrados[a].charAt(0) == general[i][j]) {
                                    int x = Character.getNumericValue(encontrados[a].charAt(1));
                                    int y = Character.getNumericValue(encontrados[a].charAt(2));

                                    // Revelar la pareja encontrada.
                                    salida[x][y] = general[x][y];
                                    salida[i][j] = general[i][j];

                                    // Marcar las parejas como usadas.
                                    encontrados[a] = "+";
                                    encontrados[encontrados.length - 1] = "+";
                                    exito = true;
                                }
                            }
                        }
                    }
                }

                // Si no se encontró pareja después de seleccionar una casilla, continuar buscando.
                // Salir si no quedan casillas vacías.
            }
        }

        return encontrados;
    }
    public static String[] facil(char [][]salida,char[][]mostrados,char[][]general,int fallos, String []encontrados){
    //Es como la seleccion que hace el usuario, pero en vez de introducir las casillas por teclado, 
    //salen de manera aleatoria teniendo solo en cuenta las dimensiones de la tabla
        int cas1,cas11,cas2,cas22;
        boolean selec=false,encontrado=false;
       do{//Eleccion de la primera casilla
               
            cas1=(int)(Math.random()*salida.length);
            cas11=(int)(Math.random()*salida[0].length);

                    if (cas1>=0&&cas1<salida.length&&cas11>=0&&cas11<salida[0].length){//Filtro para entradas no validas
                        //Sustitucion de la casilla elegida
                        if(salida[cas1][cas11]==' '){
                            
                            if (mostrados[cas1][cas11]==' '){
                                encontrado=true;   
                            }
                            mostrados[cas1][cas11]=general[cas1][cas11];
                            salida[cas1][cas11]=general[cas1][cas11];
                            selec=true;
                            imprimirTablero(salida);
                            
                            if(encontrado==true){
                                    encontrados=Arrays.copyOf(encontrados,encontrados.length+1);
                                    encontrados[encontrados.length-1]= String.valueOf(salida[cas1][cas11]) + String.valueOf(cas1) + String.valueOf(cas11);
                                    encontrado=false;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(encontrados));
            }while(selec==false);
       selec=false;

            do{//Eleccion de la segunda casilla
                    cas2=(int)(Math.random()*salida.length);
                    cas22=(int)(Math.random()*salida[0].length);
                    
                    if (cas2>=0&&cas2<salida.length&&cas22>=0&&cas22<salida[0].length){//Filtro para entradas no validas
                        //Sustitucion de la casilla elegida
                        if(salida[cas2][cas22]==' '){
                            if (mostrados[cas2][cas22]==' '){
                                encontrado=true;
                            }

                            mostrados[cas2][cas22]=general[cas2][cas22];
                            salida[cas2][cas22]=general[cas2][cas22];
                            selec=true;
                            imprimirTablero(salida);
                            
                            if(encontrado==true){
                                    encontrados=Arrays.copyOf(encontrados,encontrados.length+1);
                                    encontrados[encontrados.length-1]= salida[cas2][cas22] + String.valueOf(cas2) + String.valueOf(cas22);
                                    encontrado=false;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(encontrados));
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
                fallos++;
                System.out.println("Has tenido "+fallos+" fallos");
            }
            return encontrados;
    }
            
    public static void selec(char[][]salida,char[][]general,char[][]mostrados,int[] ajustes,String [] encontrados){
        boolean selec=false,victoria,encontrado=false;
        String casilla1,casilla2;
        int cas1=0,cas11=0,cas2=0,cas22=0,fallosU=0,fallosM=0,turno=0,difMid=0;
        Scanner sc = new Scanner (System.in);
        do{
            if(turno%2==0){
                do{//Eleccion de la primera casilla
                    System.out.println("Selecciona una casilla");
                    casilla1=sc.next();
                    if (casilla1.length()>1){

                        cas1=Character.getNumericValue(casilla1.charAt(0));
                        cas11=Character.getNumericValue(casilla1.charAt(1));

                        if (cas1>=0&&cas1<salida.length&&cas11>=0&&cas11<salida[0].length){//Filtro para entradas no validas
                            //Sustitucion de la casilla elegida
                            if(salida[cas1][cas11]==' '){
                                
                                if(mostrados[cas1][cas11]==' '){
                                    encontrado=true;
                                }
                                mostrados[cas1][cas11]=general[cas1][cas11];
                                salida[cas1][cas11]=general[cas1][cas11];
                                selec=true;
                                imprimirTablero(salida);
                                
                                if(encontrado==true){
                                    encontrados=Arrays.copyOf(encontrados,encontrados.length+1);
                                    encontrados[encontrados.length-1]= String.valueOf(salida[cas1][cas11]) + String.valueOf(cas1) + String.valueOf(cas11);
                                    encontrado=false;
                                }
                            }
                            else{
                                System.out.println("Esa casilla ya esta elegida");
                            }
                        }
                        else{
                            System.out.println("Introduce valores n");
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

                        if (cas2>=0&&cas2<salida.length&&cas22>=0&&cas22<salida[0].length){//Filtro para entradas no validas
                            //Sustitucion de la casilla elegida
                            if(salida[cas2][cas22]==' '){
                                if(mostrados[cas2][cas22]==' '){
                                    encontrado=true;
                                }
                                mostrados[cas2][cas22]=general[cas2][cas22];
                                salida[cas2][cas22]=general[cas2][cas22];
                                selec=true;
                                imprimirTablero(salida);
                                
                                if(encontrado==true){
                                    encontrados=Arrays.copyOf(encontrados,encontrados.length+1);
                                    encontrados[encontrados.length-1]= salida[cas2][cas22] + String.valueOf(cas2) + String.valueOf(cas22);
                                    encontrado=false;
                                }
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
                    System.out.println(Arrays.toString(encontrados));
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
                    System.out.println("La maquina ha tenido "+fallosM+" fallos");
                }
                turno++;
            }
            else{//Apartado del bot
                switch (ajustes[3]) {
                    case 0 -> turno++;
                    case 1 -> {//Dificultad facil (seleccion de casillas de forma aleatoria)
                        encontrados=facil(salida,mostrados,general,fallosM,encontrados);
                        turno++;
                    }
                    case 2 -> {//Dificultad media (50% de manera aleatoria, 50% mirando tabla de referencias
                        if (difMid%2==0){
                            encontrados=facil(salida,mostrados,general,fallosM,encontrados);
                            difMid++;
                        }
                        else{
                            encontrados=dificil(salida,mostrados,general,fallosM,encontrados);
                            difMid++;
                        }
                        turno++;
                    }
                    case 3 -> {//Dificultad dificil (mirando tabla de referencias)
                        encontrados=dificil(salida,mostrados,general,fallosM,encontrados);
                        turno++;
                    }
                    default -> {
                    }
                }
                System.out.println(Arrays.toString(encontrados));
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
    public static void tiempo(long ms){//Calculo de la duracion del juego
        
        long tseg,tmin,thrs,seg,min;
        
        tseg = ms/1000;
        seg=tseg%60;
        tmin=tseg/60;
        min=tmin%60;
        thrs=tmin/60;
        System.out.println("Tu tiempo ha sido "+ thrs + ":" + min + ":" + seg );
    }
    
    public static void main(String[] args) {
        //declaracion de varialbes
        //tablas de muestra, tabla entera, y datos mostrados para la maquina
        char general [][];
        char mostrados [][];
        char salida [][];
        
        String encontrados[]=new String [0];
        //variables generales
        char asciiGuardado [];
        int ajustes[] = new int[8];
        //Ajustes predeterminados del juego
            ajustes[0]=4;//Ancho de la tabla Maximo 10
            ajustes[1]=4;//Alto de la tabla Maximo 10
            ajustes[2]=1;//Zoom Maximo 3
            ajustes[3]=0;//Dificultad de la maquina: 0=No maquina, 1=Facil, 2=Medio, 3=Dificil
            ajustes[4]=3;//Cantidad de errores permitidos
            ajustes[5]=3;//Tiempo de muestra mS
            ajustes[6]=0;//Variable de salida del juego: 0=Seguir jugando, otro=Salir del juego
            
        String nombre;
        long inicio=0, ms;
        
        Scanner sc = new Scanner (System.in);
        
        do{
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
                //Nombre del jugador
                System.out.println("Introduzca un nombre");
                nombre=sc.next();
                imprimirTablero(salida);
                //Insercion de temporizador
                inicio=System.currentTimeMillis();
                //Seleccion de casilla
                selec(salida,general,mostrados,ajustes,encontrados);
                
            }//Cierre de condicion de juego cerrado
        //Tiempo de juego
        ms=(System.currentTimeMillis()-inicio);
        tiempo(ms);
        }while(ajustes[6]==0);
    } 
}
