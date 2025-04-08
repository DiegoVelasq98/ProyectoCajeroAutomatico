/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class SesionUsuario {
    
    private static Cliente clienteActual;
    
    public static void setClienteActual(Cliente cliente) {
        clienteActual = cliente;
    }
    
    public static Cliente getClienteActual() {
        return clienteActual;
    }
    
    public static void cerrarSesion() {
        clienteActual = null;
    }
}
