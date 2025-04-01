/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    

public Connection conexion_bd;

//datos de conexion a la base de datos puede ser Workbench u Oracle
private final String puerto=" 3306";
private final String bd="db_cajero";
private final String urlConexion= String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC", puerto, bd); 
private final String usuario= "root";
private final String password="diego1234";
private final String jdbc = "com.mysql.cj.jdbc.Driver";



//metodo para abrir la conexion a la bd

 public boolean abrir_conexion() {
        try {
            Class.forName(jdbc);
            conexion_bd = DriverManager.getConnection(urlConexion, usuario, password);
            System.out.println("Conexión exitosa");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar: " + ex.getMessage());
            return false;
        }
    }

//metodo para cerrar la conexiones

public void cerrar_conexion(){
    
    try{
        if (conexion_bd!=null && !conexion_bd.isClosed()){
            conexion_bd.close();
            System.out.println("Conexion cerrada");
        }
    }catch(SQLException ex){
        System.out.println("Error al cerrar la conexion"+ ex.getMessage());
        
    }
}

}

