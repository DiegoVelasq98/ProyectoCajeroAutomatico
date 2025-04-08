/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Victor
 */
public class BancoException extends Exception {
    public BancoException(String mensaje) {
        super(mensaje);
    }
    
    /**
     * Constructor con mensaje y causa del error
     * @param mensaje Descripción del error
     * @param causa Excepción original que causó el error
     */
    public BancoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
    
    /**
     * Constructor con causa del error
     * @param causa Excepción original que causó el error
     */
    public BancoException(Throwable causa) {
        super(causa);
    }
    
}
