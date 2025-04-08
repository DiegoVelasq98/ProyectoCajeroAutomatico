package modelo;

public class Prestamos {

    private double monto;
    private double interes;
    private int plazo;

    public Prestamos(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }

    // Calcular cuota mensual usando interés simple
    public double calcularCuota() {
        double interesDecimal = interes / 100;
        double interesTotal = monto * interesDecimal * plazo;
        return (monto + interesTotal) / plazo;
    }

    // Calcular total a pagar usando interés simple
    public double calcularTotal() {
        double interesDecimal = interes / 100;
        double interesTotal = monto * interesDecimal * plazo;
        return monto + interesTotal;
    }
}
