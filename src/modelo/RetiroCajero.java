/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;
import vista.frm_menu;
import java.sql.*;


/**
 *
 * @author Diego
 */
public class RetiroCajero {
    
    public static String retiro(double monto) {
        
        
        Conexion cn = new Conexion();
    String mensaje = "";

    // Obtener el idCliente del cliente actual desde la sesión
    String idCliente = SesionUsuario.getClienteActual().getIdCliente();  // Obtener el idCliente

    String idCuenta = null;
    
    if (cn.abrir_conexion()) {
        try {
            // Consultar el idCuenta asociado al idCliente
            String query = "SELECT id_cuenta FROM cuenta WHERE id_cliente = ?";
            PreparedStatement ps = cn.conexion_bd.prepareStatement(query);
            ps.setString(1, idCliente);  // Usamos el idCliente de la sesión
            ResultSet rs = ps.executeQuery();

            // Si se encuentra el idCuenta, lo asignamos
            if (rs.next()) {
                idCuenta = rs.getString("id_cuenta");
            } else {
                mensaje = "Cuenta no encontrada para el cliente.";
                return mensaje;  // Retornar mensaje si no se encuentra la cuenta
            }

            // Ahora que tenemos el idCuenta, llamamos al procedimiento almacenado
            CallableStatement cs = cn.conexion_bd.prepareCall("{call sp_extraccion_caja_ahorro(?, ?, ?)}");

            // Establecer los parámetros de entrada (id_cuenta, monto)
            cs.setString(1, idCuenta);  // id_cuenta
            cs.setDouble(2, monto);     // monto

            // Registrar el parámetro de salida (p_mensaje)
            cs.registerOutParameter(3, java.sql.Types.VARCHAR);  // p_mensaje (salida)

            // Ejecutar el procedimiento
            cs.execute();

            // Obtener el mensaje de salida
            mensaje = cs.getString(3);

            cs.close();  // Cerrar el CallableStatement

        } catch (SQLException ex) {
            mensaje = "Error al realizar el retiro: " + ex.getMessage();
        } finally {
            cn.cerrar_conexion();  // Asegurarse de cerrar la conexión
        }
    } else {
        mensaje = "No se pudo conectar a la base de datos.";
    }

    return mensaje;  // Retornar el mensaje de éxito o error
}
    
}


