/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
import java.sql.*;

public class ConsultaSaldos {
    
   // Método para obtener el saldo de la cuenta
    public double obtenerSaldo(String idCliente) {
        double saldo = 0.0;
        Conexion cn = new Conexion();

        if (cn.abrir_conexion()) {
            try {
                String query = "SELECT saldo FROM cuenta WHERE id_cliente = ?";
                PreparedStatement ps = cn.conexion_bd.prepareStatement(query);
                ps.setString(1, idCliente);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    saldo = rs.getDouble("saldo");
                }

                rs.close();
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al consultar el saldo: " + ex.getMessage());
            } finally {
                cn.cerrar_conexion();
            }
        }

        return saldo; 
    }
    
}
