/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import static bbdd.Bbdd.lector;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class Consultas {

    public static void menu2() throws SQLException {
        boolean salir = false;
        while (!salir) {
            System.out.println("1.Consultar base de datos");
            System.out.println("2.Actualizar base de datos");
            System.out.println("3.Inserción en la base de datos");
            System.out.println("4.Salir");
            switch (Integer.parseInt(lector.nextLine())) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Vuelva a introducir una opción valida.");
                    break;
            }
        }
    }
}
