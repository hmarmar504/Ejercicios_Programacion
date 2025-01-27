/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlrobothector;

/**
 *
 * @author usuario
 */
public class ControlRobotHector {

    public static void main(String[] args) {
        Robot[] maquina;
        int[] carrera;
        carrera=new int[4];
        maquina = new Robot[4];
        int max,act,fecha;
        for(int a=0;a<4;a++){
            max=(int) (Math.random()*15+25);
            act=(int) (Math.random()*(max/2)+(max/2));
            fecha=(int)(Math.random()*100);
            maquina[a]=new Robot(max,act,fecha,(int)(Math.random()*10),"name"+a);
        }
        oldest(maquina).mostrar();
        race(maquina,(int)(Math.random()*10+10));
    }
    public static Robot oldest(Robot[] cacharro){
        int cant=0;
        boolean mayor=true;
        for(int a=0;a<4;a++){
            mayor=true;
            for(int b=0;b<4;b++){
                
                if(cacharro[a].comparar(cacharro[b])){
                    mayor=false;
                }
            }
            if(mayor==true){
                cant=a;
            }
        }
        return(cacharro[cant]);
    }
    public static void race(Robot[] carrera, int recorrido){
        int[]turnos;
        turnos=new int[4];
        boolean win=false;
        
        for(int a=0;a<4;a++){
            turnos[a]=0;
        }
        
        while(win==false){
            for(int a=0;a<4;a++){
                
                if(carrera[a].getDist()<recorrido){
                turnos[a]++;
                carrera[a].mover(1);
                } 
            }
            if (carrera[0].getDist()==recorrido&&carrera[1].getDist()==recorrido&&carrera[2].getDist()==recorrido&&carrera[3].getDist()==recorrido){
                win=true;
            }
        }
        imprimir(turnos,carrera,recorrido);
    }
    public static void imprimir(int[]carrera,Robot[]maquinas, int dist){
        for(int a =0;a<4;a++){
            System.out.println("El robot "+maquinas[a].getName()+"("+maquinas[a].getCargMax()+","+maquinas[a].getCargaAct()+
                    ") ha usado "+carrera[a]+" turnos para recorrer "+dist+" distancia");
        }
    }
}

