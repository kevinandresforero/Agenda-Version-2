/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.datos;
import agenda.datos.logica.Seleccionados;
import java.sql.*;       
/**
 *
 * @author JulianFO
 */
public class DBSeleccionados {
    DBConexion2 cn;

    public DBSeleccionados() {
        cn = new DBConexion2();
    }

    public Seleccionados[] getSeleccionados() {
        int registros1 = 0;
        try {
            PreparedStatement pstm = cn.getConexion2().prepareStatement("SELECT count(1) as cont"
                    + " FROM seleccionados ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros1 = res.getInt("cont");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        Seleccionados[] data = new Seleccionados[registros1];
        try {
            PreparedStatement pstm = cn.getConexion2().prepareStatement("SELECT con_id, "
                    + " con_nombre, "
                    + " con_apellido, "
                    + " con_telefono, "
                    + " con_cita_agenda,"
                    + " con_dirección, "
                    + " con_hora "
                    + " FROM seleccionados "
                    + " ORDER BY con_nombre, con_apellido");

            try (ResultSet res = pstm.executeQuery()) {
                int i = 0;
                while (res.next()) {
                    data[i] = new Seleccionados();
                    data[i].setId(res.getInt("con_id"));
                    data[i].setNombre1(res.getString("con_nombre"));
                    data[i].setApellido1(res.getString("con_apellido"));
                    data[i].setTelefono(res.getString("con_telefono"));
                    data[i].setCita(res.getString("con_cita_agenda"));
                    data[i].setDireccion(res.getString("con_dirección"));
                    data[i].setHora(res.getString("con_hora"));
                    i++;
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
}
