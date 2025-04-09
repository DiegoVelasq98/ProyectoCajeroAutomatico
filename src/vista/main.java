/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Conexion;


/**
 *
 * @author Diego
 */
public class main {

  public static void main(String[] args) {
    // Primero probamos la conexión a Oracle
    Conexion conexion = new Conexion();
    boolean conectado = conexion.abrir_conexion();
    
    if (conectado) {
        JOptionPane.showMessageDialog(null, "Conexión exitosa a Oracle", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        conexion.cerrar_conexion(); // Cerramos la conexión de prueba
        
        // Si la conexión fue exitosa, mostramos el formulario
        frm_inicio frm = new frm_inicio();
        frm.setVisible(true); // Es mejor usar setVisible(true) que show() (este último está deprecated)
    } else {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a Oracle. Verifique la configuración.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
   
   
  /* frm_prestamos fr = new frm_prestamos();
        fr.setVisible(true);
*/
}
    
}
