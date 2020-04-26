/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class GuardarInfo {
    public static void guardarConsulta(String consulta, ResultSet resultado, String tipo, String concepto) throws SQLException, IOException {
        try (BufferedWriter Escritura = new BufferedWriter(new FileWriter("LogConsultas.txt", true))) {
            Escritura.write("********************************");
            Escritura.write(consulta);
            Escritura.newLine();
            System.out.println(consulta + ":");
            while (resultado.next()) {
                if (tipo.equals("tipoString")) {
                    Escritura.write("  -" + concepto);
                    Escritura.newLine();
                    System.out.println("  -" + concepto);
                } else if (tipo.equals("tipoInt")) {

                    Escritura.write("  -" + concepto);
                    Escritura.newLine();
                    System.out.println("  -" + concepto);
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
