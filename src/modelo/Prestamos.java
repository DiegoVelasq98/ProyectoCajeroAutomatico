package modelo;

import java.sql.*;

public class Prestamos {
    private double monto;
    private double interes; 
    private int plazo;
    private Conexion cn;

    public Prestamos(double monto, int plazo) {
        this.monto = monto;
        this.interes = 20.0; // Interés fijo
        this.plazo = plazo;
    }


    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public int getPlazo() {
        return plazo;
    }

   public double obtenerInteresDecimal() {
    return (interes / 100) / 12; 
}


    // Calcular cuota mensual usando interés simple
    public double calcularCuota() {
        double interesDecimal = obtenerInteresDecimal();
        double interesTotal = monto * interesDecimal * plazo;
        return (monto + interesTotal) / plazo;
    }

    // Calcular total a pagar usando interés simple
    public double calcularTotal() {
        double interesDecimal = obtenerInteresDecimal();
        double interesTotal = monto * interesDecimal * plazo;
        return monto + interesTotal;
    }

    public int agregar(Prestamos prestamo) {
        int retorno = 0;
        try {
            cn = new Conexion();
            PreparedStatement parametro;
            String query = "INSERT INTO prestamos(monto, interes, plazo, cuotas, total) VALUES (?, ?, ?, ?, ?)";

            double cuota = prestamo.calcularCuota();
            double total = prestamo.calcularTotal();

            cn.abrir_conexion();
            parametro = cn.conexion_bd.prepareStatement(query);

            parametro.setDouble(1, prestamo.getMonto());
            parametro.setDouble(2, prestamo.getInteres());
            parametro.setInt(3, prestamo.getPlazo());
            parametro.setDouble(4, cuota);
            parametro.setDouble(5, total);

            retorno = parametro.executeUpdate();
            cn.cerrar_conexion();

        } catch (SQLException ex) {
            System.out.println("Error al guardar préstamo: " + ex.getMessage());
            retorno = 0;
        }
        return retorno;
    }
}
