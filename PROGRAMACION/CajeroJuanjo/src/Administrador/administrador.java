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

    private void initBD() {
        conexion = Conexion.mySQL("cajerojuanjo", "root", "");
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "Error, no se pudo conectar a la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablas = new javax.swing.JTabbedPane();
        clientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        tarjetas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTarjetas = new javax.swing.JTable();
        movimientos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        bajas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBajas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 140));
        setMinimumSize(new java.awt.Dimension(817, 330));
        setPreferredSize(new java.awt.Dimension(817, 330));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        tablas.addTab("Clientes", clientes);

        tablaTarjetas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Propietario", "PIN", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaTarjetas);
        if (tablaTarjetas.getColumnModel().getColumnCount() > 0) {
            tablaTarjetas.getColumnModel().getColumn(0).setResizable(false);
            tablaTarjetas.getColumnModel().getColumn(1).setResizable(false);
            tablaTarjetas.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout tarjetasLayout = new javax.swing.GroupLayout(tarjetas);
        tarjetas.setLayout(tarjetasLayout);
        tarjetasLayout.setHorizontalGroup(
            tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        tarjetasLayout.setVerticalGroup(
            tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarjetasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        tablas.addTab("Tarjetas", tarjetas);

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaBajas);
        if (tablaBajas.getColumnModel().getColumnCount() > 0) {
            tablaBajas.getColumnModel().getColumn(0).setResizable(false);
            tablaBajas.getColumnModel().getColumn(1).setResizable(false);
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
            .addGroup(bajasLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        tablas.addTab("Bajas", bajas);

        getContentPane().add(tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            //tabla Tarjetas
            modelo = (DefaultTableModel) tablaTarjetas.getModel();
            int numero, propietario, pin, saldo;
            Object[] linea1 = new Object[4];
            modelo.setRowCount(0);
            sentencia = conexion.createStatement();
            String SQL1 = "SELECT * FROM tarjetas";
            resultado = sentencia.executeQuery(SQL1);
            while (resultado.next()) {
                numero = resultado.getInt("numero");
                propietario = resultado.getInt("propietario");
                pin = resultado.getInt("pin");
                saldo = resultado.getInt("saldo");
                linea1[0] = numero;
                linea1[1] = propietario;
                linea1[2] = pin;
                linea1[3] = saldo;
                modelo.addRow(linea1);
            }
            //tabla Movimientos
            modelo = (DefaultTableModel) tablaMovimientos.getModel();
            int identificador,propietariomov,importe;
            String concepto,tipo;
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
                //concepto = resultado.getString("concepto");
                importe = resultado.getInt("importe");
                fecha = resultado.getDate("fecha");
                linea2[0] = identificador;
                linea2[1] = propietariomov;
                linea2[2] = tipo;
                linea2[3] = "";
                linea2[4] = importe;
                linea2[5] = fecha;
                modelo.addRow(linea2);
            }
            //tabla Bajas
            modelo = (DefaultTableModel) tablaBajas.getModel();
            int identificadorbaja,cliente;
            String motivo,observaciones;
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
    private javax.swing.JPanel bajas;
    private javax.swing.JPanel clientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel movimientos;
    private javax.swing.JTable tablaBajas;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTable tablaTarjetas;
    private javax.swing.JTabbedPane tablas;
    private javax.swing.JPanel tarjetas;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
}
