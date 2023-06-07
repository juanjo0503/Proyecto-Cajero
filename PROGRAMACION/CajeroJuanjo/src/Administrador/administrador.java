/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import bd.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class administrador extends javax.swing.JFrame {

    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        initBD();
        initTabla();
    }

    private boolean esNumero(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private void initBD() {
        conexion = Conexion.mySQL("cajerojuanjo", "root", "");
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "Error, no se pudo conectar a la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void initTabla() {
        try {
            //tabla Clientes
            modelo = (DefaultTableModel) tablaClientes.getModel();
            int id,
                    tarjeta;
            String nombre,
                    direccion,
                    IBAN;
            Object[] linea = new Object[5];
            modelo.setRowCount(0);
            Statement sentencia = conexion.createStatement();
            String SQL = "SELECT * FROM clientes";
            ResultSet resultado = sentencia.executeQuery(SQL);
            while (resultado.next()) {
                id = resultado.getInt("id");
                tarjeta = resultado.getInt("numtarjeta");
                IBAN = resultado.getString("IBAN");
                nombre = resultado.getString("nombre");
                direccion = resultado.getString("direccion");
                linea[0] = id;
                linea[1] = tarjeta;
                linea[2] = IBAN;
                linea[3] = nombre;
                linea[4] = direccion;
                modelo.addRow(linea);
            }
            //tabla Movimientos
            modelo = (DefaultTableModel) tablaMovimientos.getModel();
            int identificador, propietariomov, importe;
            String concepto, tipo;
            Date fecha;
            Object[] linea2 = new Object[6];
            modelo.setRowCount(0);
            sentencia = conexion.createStatement();
            String SQL2 = "SELECT * FROM movimientos";
            resultado = sentencia.executeQuery(SQL2);
            while (resultado.next()) {
                identificador = resultado.getInt("id_movimiento");
                propietariomov = resultado.getInt("id_cliente");
                tipo = resultado.getString("tipo");
                concepto = resultado.getString("concepto");
                importe = resultado.getInt("importe");
                fecha = resultado.getDate("fecha");
                linea2[0] = identificador;
                linea2[1] = propietariomov;
                linea2[2] = tipo;
                linea2[3] = concepto;
                linea2[4] = importe;
                linea2[5] = fecha;
                modelo.addRow(linea2);
            }
            //tabla Bajas
            modelo = (DefaultTableModel) tablaBajas.getModel();
            int identificadorbaja, cliente;
            String motivo, observaciones;
            Object[] linea3 = new Object[4];
            modelo.setRowCount(0);
            sentencia = conexion.createStatement();
            String SQL3 = "SELECT * FROM bajas";
            resultado = sentencia.executeQuery(SQL3);
            while (resultado.next()) {
                identificadorbaja = resultado.getInt("id_baja");
                cliente = resultado.getInt("cliente");
                motivo = resultado.getString("motivo");
                observaciones = resultado.getString("observaciones");
                //el dinero se le da en mano en el banco
                linea3[0] = identificadorbaja;
                linea3[1] = cliente;
                linea3[2] = motivo;
                linea3[3] = observaciones;
                modelo.addRow(linea3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablas = new javax.swing.JTabbedPane();
        clientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        movimientos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        bajas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBajas = new javax.swing.JTable();
        darBaja = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BajaCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BajaTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BajaIBAN = new javax.swing.JTextField();
        BajaConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 140));
        setMinimumSize(new java.awt.Dimension(801, 458));
        setPreferredSize(new java.awt.Dimension(801, 458));
        setResizable(false);

        clientes.setMinimumSize(new java.awt.Dimension(801, 419));
        clientes.setPreferredSize(new java.awt.Dimension(801, 419));

        tablaClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tarjeta", "IBAN", "Nombre", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setMinimumSize(new java.awt.Dimension(75, 130));
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes);
        clientes.setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        tablas.addTab("Clientes", clientes);

        tablaMovimientos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Propietario", "Tipo", "Concepto", "Importe", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaMovimientos);
        if (tablaMovimientos.getColumnModel().getColumnCount() > 0) {
            tablaMovimientos.getColumnModel().getColumn(0).setResizable(false);
            tablaMovimientos.getColumnModel().getColumn(1).setResizable(false);
            tablaMovimientos.getColumnModel().getColumn(2).setResizable(false);
            tablaMovimientos.getColumnModel().getColumn(3).setResizable(false);
            tablaMovimientos.getColumnModel().getColumn(4).setResizable(false);
            tablaMovimientos.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout movimientosLayout = new javax.swing.GroupLayout(movimientos);
        movimientos.setLayout(movimientosLayout);
        movimientosLayout.setHorizontalGroup(
            movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimientosLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        movimientosLayout.setVerticalGroup(
            movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimientosLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tablas.addTab("Movimientos", movimientos);

        bajas.setMinimumSize(new java.awt.Dimension(0, 0));

        tablaBajas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaBajas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificador", "Cliente", "Motivo", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaBajas);
        if (tablaBajas.getColumnModel().getColumnCount() > 0) {
            tablaBajas.getColumnModel().getColumn(0).setResizable(false);
            tablaBajas.getColumnModel().getColumn(1).setResizable(false);
            tablaBajas.getColumnModel().getColumn(2).setResizable(false);
            tablaBajas.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout bajasLayout = new javax.swing.GroupLayout(bajas);
        bajas.setLayout(bajasLayout);
        bajasLayout.setHorizontalGroup(
            bajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajasLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bajasLayout.setVerticalGroup(
            bajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        tablas.addTab("Bajas", bajas);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("ID de cliente:");
        jPanel1.add(jLabel1);

        BajaCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(BajaCliente);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Número de tarjeta:");
        jPanel1.add(jLabel4);

        BajaTarjeta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(BajaTarjeta);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("IBAN:");
        jPanel1.add(jLabel5);

        BajaIBAN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(BajaIBAN);

        BajaConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BajaConfirmar.setText("Confirmar");
        BajaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout darBajaLayout = new javax.swing.GroupLayout(darBaja);
        darBaja.setLayout(darBajaLayout);
        darBajaLayout.setHorizontalGroup(
            darBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darBajaLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(BajaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        darBajaLayout.setVerticalGroup(
            darBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BajaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tablas.addTab("Dar de Baja", darBaja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BajaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaConfirmarActionPerformed
        try {
            int id, numtarjeta;
            String IBAN;
            id = Integer.parseInt(BajaCliente.getText());
            numtarjeta = Integer.parseInt(BajaTarjeta.getText());
            IBAN = BajaIBAN.getText();

            if (esNumero(BajaCliente.getText()) == true && esNumero(BajaTarjeta.getText()) == true) {
                String sql = "DELETE FROM clientes WHERE id=? and IBAN=? ;";
                String sql2 = "DELETE FROM tarjetas WHERE numero=? ;";
                String sql3 = "DELETE FROM movimientos WHERE id_cliente=? ;";
                sentencia = conexion.prepareStatement(sql3);
                sentencia.setInt(1, id);
                sentencia.executeUpdate();
                sentencia = conexion.prepareStatement(sql2);
                sentencia.setInt(1, numtarjeta);
                sentencia.executeUpdate();
                sentencia = conexion.prepareStatement(sql);
                sentencia.setInt(1, id);
                sentencia.setString(2, IBAN);
                sentencia.executeUpdate();
                JOptionPane.showMessageDialog(this, "Borrado realizado con exito", "CONFIRMACIÓN", JOptionPane.DEFAULT_OPTION);
            }else {
                JOptionPane.showMessageDialog(this, "Has escrito letras donde no debes","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BajaConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BajaCliente;
    private javax.swing.JButton BajaConfirmar;
    private javax.swing.JTextField BajaIBAN;
    private javax.swing.JTextField BajaTarjeta;
    private javax.swing.JPanel bajas;
    private javax.swing.JPanel clientes;
    private javax.swing.JPanel darBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel movimientos;
    private javax.swing.JTable tablaBajas;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTabbedPane tablas;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;
}
