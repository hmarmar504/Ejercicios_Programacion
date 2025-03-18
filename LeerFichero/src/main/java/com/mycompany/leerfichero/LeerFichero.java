/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerfichero;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class LeerFichero {

    public static void main(String[] args) {
        Fichero arc = new Fichero();

            arc.iniciar();
            arc.inAjuste("aaaaa", "55");
            arc.inAjuste("bbb","123");
            arc.inAjuste("ccc", "32");
            arc.escribirAjustes();
    }
}
