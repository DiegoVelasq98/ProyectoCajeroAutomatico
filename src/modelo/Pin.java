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
    private String pinHash;
    
    public Pin(String idCliente, String pin) {
        this.idCliente = idCliente;
        this.pinHash = generarHash(pin);
    }
    
    private String generarHash(String pin) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pin.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar hash", e);
        }
    }
    
    public int actualizarPin() throws SQLException {
        Conexion conexion = new Conexion();
        if (!conexion.abrir_conexion()) {
            throw new SQLException("No se pudo conectar a la base de datos");
        }
        
        try {
            String query = "UPDATE cliente SET pin_hash = ? WHERE id_cliente = ?";
            PreparedStatement stmt = conexion.prepararStatement(query);
            stmt.setString(1, this.pinHash);
            stmt.setString(2, this.idCliente);
            
            return stmt.executeUpdate();
        } finally {
            conexion.cerrar_conexion();
        }
    }

    
       
    
    
            
}
