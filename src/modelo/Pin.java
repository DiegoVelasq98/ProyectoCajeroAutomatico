/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Pin {
    private String idCliente;
    private String pin;
    
    public Pin(String idCliente, String pin) {
        this.idCliente = idCliente;
        this.pin = pin;
    }
    
    public int actualizarPin() throws SQLException {
        Conexion conexion = new Conexion();
        if (!conexion.abrir_conexion()) {
            throw new SQLException("No se pudo conectar a la base de datos");
        }
        
        try {
            String query = "UPDATE cliente SET pin = ? WHERE id_cliente = ?";
            PreparedStatement stmt = conexion.prepararStatement(query);
            stmt.setString(1, this.pin);
            stmt.setString(2, this.idCliente);
            
            return stmt.executeUpdate();
        } finally {
            conexion.cerrar_conexion();
        }
    }
}
