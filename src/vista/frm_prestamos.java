/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Prestamos;
import modelo.SesionUsuario;

/**
 *
 * @author Diego
 */
public class frm_prestamos extends javax.swing.JFrame {

    /**
     * Creates new form frm_prestamos
     */
    public frm_prestamos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_interes = new javax.swing.JLabel();
        lbl_monto = new javax.swing.JLabel();
        lbl_couta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_interes = new javax.swing.JTextField();
        txt_plazo = new javax.swing.JTextField();
        txt_monto = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        lbl_plazo = new javax.swing.JLabel();
        txt_cuota = new javax.swing.JLabel();
        txt_total = new javax.swing.JLabel();
        btn_aceptarPrestamo = new java.awt.Button();
        btn_proyeccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel1.setText("Solicitud de prestamo");

        lbl_interes.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        lbl_interes.setText("Interes");

        lbl_monto.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        lbl_monto.setText("Monto");

        lbl_couta.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        lbl_couta.setText("Cuota mensual");

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        txt_interes.setEditable(false);
        txt_interes.setText("20%");
        txt_interes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_interesActionPerformed(evt);
            }
        });

        txt_plazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plazoActionPerformed(evt);
            }
        });

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        lbl_plazo.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        lbl_plazo.setText("Plazo (Se realiza max 12 meses)");

        txt_cuota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_total.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_aceptarPrestamo.setBackground(new java.awt.Color(102, 255, 51));
        btn_aceptarPrestamo.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        btn_aceptarPrestamo.setLabel("Aceptar Préstamo");
        btn_aceptarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarPrestamoActionPerformed(evt);
            }
        });

        btn_proyeccion.setText("Proyeccion de Cuotas");
        btn_proyeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proyeccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_couta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_plazo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_interes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_interes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_atras)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_proyeccion)
                        .addGap(41, 41, 41)
                        .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aceptarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_atras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_interes)
                            .addComponent(txt_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_monto)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_plazo)
                            .addComponent(txt_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_couta)
                            .addComponent(txt_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_proyeccion)
                            .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reiniciar))
                        .addGap(27, 27, 27)
                        .addComponent(btn_aceptarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
      
            try {
        double monto = Double.parseDouble(txt_monto.getText());
        int plazo = Integer.parseInt(txt_plazo.getText());

        if (plazo > 12 || plazo <= 0) {
            JOptionPane.showMessageDialog(this, "El plazo debe estar entre 1 y 12 meses.");
            return;
        }

        Prestamos prestamos = new Prestamos(monto, plazo);

        double cuota = prestamos.calcularCuota();
        double total = prestamos.calcularTotal();

        txt_cuota.setText(String.format("%.2f", cuota));
        txt_total.setText(String.format("%.2f", total));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.");
    }
        
       
        
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed

    txt_monto.setText("");
    txt_plazo.setText("");
    txt_cuota.setText("");  
    txt_total.setText(""); 
    }//GEN-LAST:event_btn_reiniciarActionPerformed

    private void btn_proyeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proyeccionActionPerformed
     try {
        double monto = Double.parseDouble(txt_monto.getText());
        int plazo = Integer.parseInt(txt_plazo.getText());

        if (plazo > 12 || plazo <= 0) {
            JOptionPane.showMessageDialog(this, "El plazo debe estar entre 1 y 12 meses.");
            return;
        }

        // Obtener el idCliente desde la sesión actual
        Cliente cliente = SesionUsuario.getClienteActual();
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "No se ha iniciado sesión correctamente.");
            return;
        }
        
        String idCliente = cliente.getIdCliente();  // Ahora obtenemos el idCliente de la sesión

        // Crear un nuevo préstamo
        Prestamos prestamos = new Prestamos(monto, plazo);  // El idCliente ahora se maneja dentro del constructor

        // Calculamos la cuota y el total
        double cuota = prestamos.calcularCuota();
        double total = prestamos.calcularTotal();

        // Construimos la proyección de cuotas
        StringBuilder proyeccion = new StringBuilder();
        proyeccion.append("🧾 Proyección de cuotas:\n\n");
        proyeccion.append(String.format("Monto: Q%.2f\n", monto));
        proyeccion.append(String.format("Interés: %.2f%%\n", 20.0));  // Interés fijo del 20%
        proyeccion.append(String.format("Plazo: %d meses\n\n", plazo));
        proyeccion.append("Cuotas:\n");

        // Proyección de cada cuota
        for (int i = 1; i <= plazo; i++) {
            proyeccion.append(String.format("  Cuota %d: Q%.2f\n", i, cuota));
        }

        proyeccion.append(String.format("\nTotal a pagar: Q%.2f", total));

        // Mostrar la proyección al usuario
        JOptionPane.showMessageDialog(this, proyeccion.toString(), "Proyección de Cuotas", JOptionPane.INFORMATION_MESSAGE);

        // Aquí puedes agregar el préstamo a la base de datos si es necesario
        // Si deseas guardar el préstamo, asegúrate de agregarlo a la base de datos
        // Ejemplo: PrestamosDAO.guardarPrestamo(prestamo);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.");
    }


    }//GEN-LAST:event_btn_proyeccionActionPerformed

    private void txt_interesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_interesActionPerformed
       
        txt_interes.setText("20%");
txt_interes.setEditable(false);

    }//GEN-LAST:event_txt_interesActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        
         frm_menu fr = new frm_menu();
        fr.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_aceptarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarPrestamoActionPerformed

        
        try {
        // Obtener los valores del formulario
        double monto = Double.parseDouble(txt_monto.getText());
        int plazo = Integer.parseInt(txt_plazo.getText());

        // Validar el plazo
        if (plazo > 12 || plazo <= 0) {
            JOptionPane.showMessageDialog(this, "El plazo debe estar entre 1 y 12 meses.");
            return;
        }

        // Obtener el idCliente desde la sesión actual
        Cliente cliente = SesionUsuario.getClienteActual();
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "No se ha iniciado sesión correctamente.");
            return;
        }
        
        String idCliente = cliente.getIdCliente();  // Obtener el idCliente de la sesión

        // Crear un objeto Prestamo con los datos ingresados
        Prestamos prestamo = new Prestamos(monto, plazo); // idCliente ahora se pasa al constructor

        // Llamar al método agregar() para realizar la inserción en la base de datos
        if (prestamo.agregar()) {  // El método agregar() se encarga de insertar el préstamo
            JOptionPane.showMessageDialog(this, "Préstamo registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al registrar el préstamo.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.");
    }
            

    }//GEN-LAST:event_btn_aceptarPrestamoActionPerformed

    private void txt_plazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plazoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_prestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_aceptarPrestamo;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_proyeccion;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_couta;
    private javax.swing.JLabel lbl_interes;
    private javax.swing.JLabel lbl_monto;
    private javax.swing.JLabel lbl_plazo;
    private javax.swing.JLabel txt_cuota;
    private javax.swing.JTextField txt_interes;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_plazo;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables
}
