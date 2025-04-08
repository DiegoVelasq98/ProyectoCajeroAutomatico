/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Cliente {
    private String idCliente;  // Cambiado a String para coincidir con la BD
    private String nombre;
    private double saldo;
    private String pinHash;    // Cambiado a String para almacenar el hash
    
    public Cliente(){}

    public Cliente(String idCliente, String nombre, double saldo, String pinHash) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.saldo = saldo;
        this.pinHash = pinHash;
    }

    // Getters y Setters actualizados
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPinHash() {
        return pinHash;
    }

    public void setPinHash(String pinHash) {
        this.pinHash = pinHash;
    }
}
