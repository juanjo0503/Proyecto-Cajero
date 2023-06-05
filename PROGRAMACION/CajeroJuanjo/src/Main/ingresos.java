/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import static Main.retiros.esMultiplo;
import bd.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author alumnoT
 */
public class ingresos extends javax.swing.JFrame {

    private operaciones operaciones;
    private bienvenidos bienvenidos;
    private Tarjeta t;
    private Cliente c;

    /**
     * Creates new form main
     */
    public ingresos(Tarjeta tarjeta, Cliente cliente) {
        initComponents();
        this.t = tarjeta;
        this.c = cliente;
        initVentana();
        initBD();
    }

    private ingresos() {
        JOptionPane.showMessageDialog(this, "Error, debes iniciar sesion primero", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

    private boolean esNumero(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private void initVentana() {
        System.out.println(t);
        System.out.println(c);
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        lblFecha2.setText(hoy.format(formato));
        lblFecha2.setText(hoy.format(formato));
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String sHora = hora.format(formato1);
        lblHora2.setText(sHora);
        IngresoCliente.setText(c.getNombre());
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime hora = LocalTime.now();
                DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                String sHora = hora.format(formato2);
                lblHora2.setText(sHora);
            }
        });
        timer.start();
    }

    private void initBD() {

        conexion = Conexion.mySQL("cajerojuanjo", "root", "");
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "Error, no se pudo conectar a la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeros = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        nulo1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        nulo2 = new javax.swing.JButton();
        botones = new javax.swing.JPanel();
        btnRetroceder = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblFecha2 = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IngresoCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IngresoConcepto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IngresoImporte = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        IngresoCambiar = new javax.swing.JButton();
        IngresoConfirmar = new javax.swing.JButton();
        IngresoSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(102, 102, 102));
        setLocation(new java.awt.Point(550, 140));
        setMinimumSize(new java.awt.Dimension(800, 720));
        setResizable(false);

        numeros.setLayout(new java.awt.GridLayout(4, 0));

        btn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        numeros.add(btn1);

        btn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        numeros.add(btn2);

        btn3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        numeros.add(btn3);

        btn4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        numeros.add(btn4);

        btn5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        numeros.add(btn5);

        btn6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        numeros.add(btn6);

        btn7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        numeros.add(btn7);

        btn8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        numeros.add(btn8);

        btn9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        numeros.add(btn9);

        nulo1.setEnabled(false);
        numeros.add(nulo1);

        btn0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        numeros.add(btn0);

        nulo2.setEnabled(false);
        numeros.add(nulo2);

        botones.setLayout(new java.awt.GridLayout(3, 0));

        btnRetroceder.setBackground(new java.awt.Color(255, 255, 51));
        btnRetroceder.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRetroceder.setText("RETROCEDER");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        botones.add(btnRetroceder);

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        botones.add(btnBorrar);

        btnConfirmar.setBackground(new java.awt.Color(51, 204, 0));
        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        botones.add(btnConfirmar);

        lblFecha2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblHora2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanel12.setLayout(new java.awt.GridLayout(3, 0, 10, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cliente:");
        jPanel12.add(jLabel4);

        IngresoCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IngresoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(IngresoCliente);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Concepto:");
        jPanel12.add(jLabel7);

        IngresoConcepto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        IngresoConcepto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        IngresoConcepto.setBorder(null);
        jPanel12.add(IngresoConcepto);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Importe:");
        jPanel12.add(jLabel5);

        IngresoImporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IngresoImporte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        IngresoImporte.setBorder(null);
        IngresoImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IngresoImporteFocusLost(evt);
            }
        });
        jPanel12.add(IngresoImporte);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("€");

        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        IngresoCambiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IngresoCambiar.setText("Cambiar Operación");
        IngresoCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoCambiarActionPerformed(evt);
            }
        });
        jPanel6.add(IngresoCambiar);

        IngresoConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IngresoConfirmar.setText("Confirmar");
        IngresoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoConfirmarActionPerformed(evt);
            }
        });
        jPanel6.add(IngresoConfirmar);

        IngresoSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IngresoSalir.setText("Salir");
        IngresoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoSalirActionPerformed(evt);
            }
        });
        jPanel6.add(IngresoSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHora2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Teclado
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

    }//GEN-LAST:event_btn0ActionPerformed
    //Botones del teclado
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void IngresoCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoCambiarActionPerformed
        if (operaciones != null) {
            operaciones.setVisible(true);
            this.dispose();
        } else {
            operaciones = new operaciones(t, c);
            operaciones.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_IngresoCambiarActionPerformed

    private void IngresoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoConfirmarActionPerformed
        if ((esNumero(IngresoImporte.getText()) == false)) {
            JOptionPane.showMessageDialog(this, "Error, solo se pueden escribir numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            IngresoImporte.setText("");
        } else {
            if (esMultiplo(Integer.parseInt(IngresoImporte.getText())) == true) {
                try {
                    sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    String sql = "SELECT * FROM tarjetas WHERE propietario=" + t.getPropietario() + ";";
                    resultado = sentencia.executeQuery(sql);
                    if (resultado.next()) {
                        int ingreso = t.getSaldo() + Integer.parseInt(IngresoImporte.getText());
                        resultado.updateInt("saldo", ingreso);
                        resultado.updateRow();
                        System.out.println("saldo antiguo= " + t.getSaldo() + " ingreso=" + ingreso);
                    }
                    if (operaciones != null) {
                        operaciones.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingreso realizado con exito", "CONFIRMACIÓN", JOptionPane.DEFAULT_OPTION);
                        operaciones = new operaciones(t, c);
                        operaciones.setVisible(true);
                        this.dispose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(retiros.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error, solo se puede escribir multiplos de 5", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_IngresoConfirmarActionPerformed

    private void IngresoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoSalirActionPerformed
        if (bienvenidos != null) {
            bienvenidos.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Vuelva Pronto!!","HASTA LUEGO",JOptionPane.DEFAULT_OPTION);
            bienvenidos = new bienvenidos();
            bienvenidos.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_IngresoSalirActionPerformed

    private void IngresoImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IngresoImporteFocusLost
        if ((esNumero(IngresoImporte.getText()) == false)) {
            JOptionPane.showMessageDialog(this, "Error, solo se pueden escribir numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            IngresoImporte.setText("");
        }
    }//GEN-LAST:event_IngresoImporteFocusLost

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
            java.util.logging.Logger.getLogger(ingresos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresoCambiar;
    private javax.swing.JLabel IngresoCliente;
    private javax.swing.JTextField IngresoConcepto;
    private javax.swing.JButton IngresoConfirmar;
    private javax.swing.JTextField IngresoImporte;
    private javax.swing.JButton IngresoSalir;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JButton nulo1;
    private javax.swing.JButton nulo2;
    private javax.swing.JPanel numeros;
    // End of variables declaration//GEN-END:variables
    Connection conexion;
    Statement sentencia;
    Statement sentencia2;
    ResultSet resultado;
    ResultSet resultado2;
    Tarjeta tarjeta;
    Cliente cliente;
}
