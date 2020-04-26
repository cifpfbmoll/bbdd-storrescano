/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import static bbdd.Consultas.menu2;
import java.util.Scanner;

public class Bbdd {

    static Scanner lector = new Scanner(System.in);
    static String url = "jdbc: mysql: // localhost: 3306 / daw";
    
    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            System.out.println("1.Consultar base de datos");
            System.out.println("2.Actualizar base de datos");
            System.out.println("3.Inserción en la base de datos");
            System.out.println("4.Salir");
            switch (Integer.parseInt(lector.nextLine())) {
                case 1:
                    menu2();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }

    }

}
