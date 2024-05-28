/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.text.NumberFormat;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import servicios.EstadoHabitacionServicio;
import servicios.TipoHabitacionServicio;

/**
 *
 * @author Salvador Hernández
 */
public class HabitacionesVista_EstadoHabitacion extends javax.swing.JInternalFrame {

    private HabitacionesVista habitacionesVista;

    DefaultTableModel modeloTabla;

    public HabitacionesVista_EstadoHabitacion(HabitacionesVista habitacionesVista) {
        initComponents();
        this.habitacionesVista = habitacionesVista;

        ImageIcon iconoNuevo = new FlatSVGIcon("com/das6t/icons/nuevoCirculo.svg", 16, 16);
        btnNuevo.setIcon(iconoNuevo);

        modeloTabla = new DefaultTableModel(new String[]{"Id", "Descripción"}, 0);
        jTableDatos.setModel(modeloTabla);
        llenarTabla();

    }

    private void llenarTabla() {
        modeloTabla.setRowCount(0);

        try {
            EstadoHabitacionServicio estadoHabitacionServicio = new EstadoHabitacionServicio();
            List<EstadoHabitacionServicio> estadoHabitaciones = estadoHabitacionServicio.obtenerTodosLosEstados();

            for (EstadoHabitacionServicio estadoHabitacion : estadoHabitaciones) {
                
                modeloTabla.addRow(new Object[]{
                    estadoHabitacion.getId_estado_habitacion(),
                    estadoHabitacion.getDetalle_estado()
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(919, 629));
        setMinimumSize(new java.awt.Dimension(919, 629));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(919, 629));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDatos.setOpaque(false);
        jTableDatos.setShowGrid(false);
        jTableDatos.setShowVerticalLines(true);
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Estado de Habitaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
        int filaSeleccionada = jTableDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String id = jTableDatos.getValueAt(filaSeleccionada, 0).toString();
            String detalleEstado = jTableDatos.getValueAt(filaSeleccionada, 1).toString();
            
            habitacionesVista.editarEstadoHabitacion(id, detalleEstado);
        }


    }//GEN-LAST:event_jTableDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habitacionesVista.crearEstadoHabitacion();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
