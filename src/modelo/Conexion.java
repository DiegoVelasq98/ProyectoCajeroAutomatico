/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
 public Connection conexion_bd;

    // Datos de conexión para Oracle
    private final String host = "localhost"; // o la IP del servidor Oracle
    private final String puerto = "1521"; // Puerto por defecto de Oracle
    private final String sid = "orcl"; // Nombre del SID de tu instancia Oracle
    private final String urlConexion = String.format("jdbc:oracle:thin:@%s:%s:%s", host, puerto, sid); 
    private final String usuario = "CAJERO";
    private final String password = "CAJERO";
    private final String jdbc = "oracle.jdbc.OracleDriver";

    // Método para abrir la conexión a la bd
    public boolean abrir_conexion() {
        try {
            Class.forName(jdbc);
            conexion_bd = DriverManager.getConnection(urlConexion, usuario, password);
            System.out.println("Conexión exitosa a Oracle");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar a Oracle: " + ex.getMessage());
            return false;
        }
    }

    // Método para cerrar la conexiones
    public void cerrar_conexion() {
        try {
            if (conexion_bd != null && !conexion_bd.isClosed()) {
                conexion_bd.close();
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion: " + ex.getMessage());
        }
    }
    
    public PreparedStatement prepararStatement(String sql) throws SQLException {
        if (conexion_bd == null || conexion_bd.isClosed()) {
            throw new SQLException("Conexión no establecida");
        }
        return conexion_bd.prepareStatement(sql);
    }
}

