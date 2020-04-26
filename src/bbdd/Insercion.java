/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import static bbdd.Bbdd.lector;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Insercion {

    public static void insertarCampos() {
        int tabla = seleccionarTabla();
        String textoQuery = "";
        ArrayList<String> textos = new ArrayList<>();
        switch (tabla) {
        }

    }
    public static int seleccionarTabla() {
        int elegida = 0;
        while (elegida < 1 || elegida > 6) {
            System.out.println("Selecciona en qué tabla quieres operar:");
            System.out.println("  1.");
            System.out.println("  2.");
            System.out.println("  3.");
            System.out.println("  4.");
            System.out.println("  5.");
            System.out.println("  6.");
            elegida = Integer.parseInt(lector.nextLine());
        }
        return elegida;
    }
}
