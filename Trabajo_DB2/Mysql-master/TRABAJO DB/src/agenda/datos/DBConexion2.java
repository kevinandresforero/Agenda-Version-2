/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.datos;

import java.sql.*;

/**
 *
 * @author JulianFO
 */
public class DBConexion2 {

    static String bd2 = "citas";
    static String login = "root";
    static String password = "261120";
    static String url = "jdbc:mysql://localhost/"+bd2;

    Connection conexion2 = null;

    public DBConexion2() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion2 = DriverManager.getConnection(url, login, password);
            if (conexion2 != null) {
                System.out.println("Conexión a base de datos " + bd2 + " OK");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection getConexion2() {
        return conexion2;
    }

    public void desconectar() {
        conexion2 = null;
    }
}
