/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import static bbdd.Bbdd.lector;
import static bbdd.Bbdd.url;
import static bbdd.GuardarInfo.guardarConsulta;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sergio
 */
public class Consultas {

    public static void menu2() {
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
    public static void menuConsulta() {
        boolean salir2 = false;
        while (salir2 == false) {

            System.out.println("1. Bares más gustados");
            System.out.println("2. Cerveza preferida");
            System.out.println("3. Tipos de Cerveza");
            System.out.println("4. Volver al menú principal");
            switch (Integer.parseInt(lector.nextLine())) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 0:
                    salir2 = true;
                    break;
                default:
                    System.out.println("  Opción imposible.");
            }
        }
    }
    public static void consultarClientes() throws IOException, SQLException {
        System.out.println("¿En qué bar?");
        System.out.println("1. Todos los bares");
        System.out.println("2. The Edge");
        System.out.println("3. Satisfaction");
        System.out.println("4. James Joyce Pub");
        System.out.println("5. Talk of the Town");
        System.out.println("6. Down Under Pub");
        System.out.println("Introduce número:");
        String opcionBar = lector.nextLine();

        try (Connection con = DriverManager.getConnection(url, "root", "alualualu");) {
            Statement stat = con.createStatement();
            switch (opcionBar) {
                case "1":
                    ResultSet resultado1 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents;");
                    guardarConsulta("Clientes de todos los bares", resultado1, "tipoString", "drinker");
                    break;
                case "2":
                    ResultSet resultado2 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents WHERE bar = 'The Edge';");
                    guardarConsulta("Clientes de 'The Edge'", resultado2, "tipoString", "drinker");
                    break;
                case "3":
                    ResultSet resultado3 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents WHERE bar = 'Satisfaction';");
                    guardarConsulta("Clientes de 'Satisfaction'", resultado3, "tipoString", "drinker");
                    break;
                case "4":
                    ResultSet resultado4 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents WHERE bar = 'James Joyce Pub';");
                    guardarConsulta("Clientes de 'James Joyce Pub'", resultado4, "tipoString", "drinker");
                    break;
                case "5":
                    ResultSet resultado5 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents WHERE bar = 'Talk of the Town';");
                    guardarConsulta("Clientes de 'Talk of the Town'", resultado5, "tipoString", "drinker");
                    break;
                case "6":
                    ResultSet resultado6 = stat.executeQuery("SELECT DISTINCT drinker FROM frequents WHERE bar = 'Down Under Pub';");
                    guardarConsulta("Clientes de 'Down Under Pub'", resultado6, "tipoString", "drinker");
                    break;
                default:
                    System.out.println("No ha escogido una opción correcta.");
            }
            if (stat != null) {
                stat.close();
            }
        } finally {
            System.out.println("Se ha acabado la consulta");
        }
    }
}
