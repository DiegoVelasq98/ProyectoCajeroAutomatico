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
    
     private static String usuarioActual;

    public static void setUsuarioActual(String usuario) {
        usuarioActual = usuario;
    }

    public static String getUsuarioActual() {
        return usuarioActual;
    }
}
