package modelo;

import java.sql.*;
import java.time.LocalDate;

public class Prestamos {
    private String idPrestamo;
    private double monto;
    private double interes; 
    private int plazo;
    private Conexion cn;
    private String idCliente; 

    public Prestamos(double monto, int plazo) {
        this.monto = monto;
        this.interes = 20.0; // Interés fijo
        this.plazo = plazo;

        Cliente cliente = SesionUsuario.getClienteActual();  
        if (cliente != null) {
            this.idCliente = cliente.getIdCliente();  // Suponiendo que Cliente tiene un método getIdCliente()
        }
        
        
    }

    public String getIdPrestamo() {
        return idPrestamo;
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

    public String getIdCliente() {
        return idCliente;
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

   public boolean agregar() {
    int retorno = 0;
    try {
        // Crear conexión
        cn = new Conexion();
        PreparedStatement parametro;

        // Primero obtenemos el NEXTVAL de la secuencia
        String secuenciaQuery = "SELECT secuencia_prestamos.NEXTVAL FROM dual";
        cn.abrir_conexion();
        Statement stmt = cn.conexion_bd.createStatement();
        ResultSet rs = stmt.executeQuery(secuenciaQuery);

        String idPrestamo = null;
        if (rs.next()) {
            int secuenciaValor = rs.getInt(1);  // Obtenemos el siguiente valor de la secuencia
            idPrestamo = "P" + String.format("%03d", secuenciaValor);  // Concatenamos con el prefijo "P"
        }
        rs.close();
        stmt.close();

        // Consulta SQL para insertar el préstamo
        String query = "INSERT INTO prestamo (id_prestamo, monto, tasa_interes, numero_cuotas, fecha_inicio, fecha_vencimiento, estado, id_cliente) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Abrir la conexión y preparar la consulta
        parametro = cn.conexion_bd.prepareStatement(query);

        // Establecer los parámetros de la consulta
        parametro.setString(1, idPrestamo);  // id_prestamo con el valor generado
        parametro.setDouble(2, monto);  // Monto
        parametro.setDouble(3, interes);  // Interés
        parametro.setInt(4, plazo);  // Número de cuotas (plazo)
        parametro.setDate(5, Date.valueOf(LocalDate.now()));  // Fecha de inicio
        parametro.setDate(6, Date.valueOf(LocalDate.now().plusMonths(plazo)));  // Fecha de vencimiento calculada
        parametro.setString(7, "Vigente");  // Estado del préstamo
        parametro.setString(8, idCliente);  

        // Ejecutar la actualización
        retorno = parametro.executeUpdate();
        cn.cerrar_conexion();

    } catch (SQLException ex) {
        // Manejar el error de SQL
        System.out.println("Error al guardar préstamo: " + ex.getMessage());
        retorno = 0;
    }

    // Si la inserción fue exitosa, retornamos true
    return retorno > 0;
}

}
