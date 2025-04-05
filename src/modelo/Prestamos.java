/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Prestamos {
    
    
    private double monto;
    private double interes;
    private int plazo;

    public Prestamos(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }
    
    
   public double CalcularCouta(){
       double interesMensual = interes/100;
       return (monto* interesMensual)/ (1-Math.pow(1+ interesMensual, -plazo));
   }
   
   public double CalcularTotal(){
       
       return CalcularCouta()*plazo;
   }
}
