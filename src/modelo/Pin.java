/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Pin {
    
    
    private Conexion cn;
    private String usuario;
    private String nuevoPin;
    
    public Pin(){}

    public Pin(String usuario, String nuevoPin) {
        this.usuario = usuario;
        this.nuevoPin = nuevoPin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNuevoPin() {
        return nuevoPin;
    }

    public void setNuevoPin(String nuevoPin) {
        this.nuevoPin = nuevoPin;
    }
    
    
    public int actualizarPin(){
   

        int retorno = 0;
        try {
            cn = new Conexion();
            cn.abrir_conexion();

            String query = "UPDATE usuarios SET pin = ? WHERE nombre_cliente = ?";
            PreparedStatement parametro = cn.conexion_bd.prepareStatement(query);

            parametro.setString(1, getNuevoPin());
            parametro.setString(2, getUsuario());

            retorno = parametro.executeUpdate();
            cn.cerrar_conexion();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = 0;
        }
        return retorno;
    }
    
    
            
}
