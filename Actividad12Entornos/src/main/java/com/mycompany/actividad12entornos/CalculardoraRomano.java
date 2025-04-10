/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad12entornos;

/**
 *
 * @author usuario
 */
public class CalculardoraRomano {
    
    public String numRom(int num){
         int m;
         String res="";
        String unidad[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; //Declaro un array el cual pongo los numero romano los cuales voy a usar
        String decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String miles = "";

        int resto = num;
        m = resto / 1000; //3950/1000=3
        resto = resto % 1000;  //950

        int c = resto / 100; //9
        resto = resto % 100; // 50

        int d = resto / 10; //5
        resto = resto % 10; // 0

        int u = resto;
        for (int i = 1; i <= m; i++) {
            miles += "M";
        }
        if (num >= 1000) {
            res=miles + centena[c] + decena[d] + unidad[u];
        } else if (num >= 100) {
            res=centena[c] + decena[d] + unidad[u];
        } else {
            if (num >= 10) {
                res=decena[d] + unidad[u];
            } else {
                res=unidad[num];
            }
        }
        return res;
    }
    public int romNum(String rom){
        int res=0;
        for(int a=0;a<rom.length();a++){
            switch(rom.charAt(a)){
                case'I'->{
                    res = switch (rom.charAt(a+1)) {
                    case 'V' -> res+4;
                    case 'X' -> res+9;
                    default -> res+1;
                };
                }
                case'V'->{
                    res=res+5;
                }
                case'X'->{
                    res = switch (rom.charAt(a+1)) {
                    case 'L' -> res+40;
                    case 'C' -> res+90;
                    default -> res+10;
                    };
                }
                case'L'->{
                    res=res+50;
                }
                case'C'->{
                    res = switch (rom.charAt(a+1)) {
                    case 'D' -> res+400;
                    case 'M' -> res+900;
                    default -> res+100;
                    };
                }
                case'D'->{
                    res=res+500;  
                }
                case'M'->{
                    res=res+1000;
                }
            }
        }
        
        return res;
    }
}
