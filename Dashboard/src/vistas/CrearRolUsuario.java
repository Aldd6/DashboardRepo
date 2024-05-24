/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import servicios.Usuarios;

/**
 *
 * @author DELL
 */
public class CrearRolUsuario extends javax.swing.JInternalFrame {
    
    Font robotoPlain = new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13);
    Font robotoBold = new Font(FlatRobotoFont.FAMILY, Font.BOLD, 18);
    DefaultTableModel modeloTabla;
    List<String> roles;
    DefaultTableCellRenderer render = new DefaultTableCellRenderer();
   
    public CrearRolUsuario() {
        initComponents();
        render.setHorizontalAlignment(JLabel.CENTER);
        try{
            roles = Usuarios.getRoles();
            modeloTabla = (DefaultTableModel)tblRoles.getModel();
            
            for(String rol:roles) {
                modeloTabla.addRow(new Object[] {
                    rol
                });
            }
        }catch(NamingException | SQLException ex) {
            ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCargo = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(916, 613));
        setMinimumSize(new java.awt.Dimension(916, 613));

        jLabel1.setFont(robotoBold);
        jLabel1.setText("Nuevo Rol");

        lblCargo.setFont(robotoPlain);
        lblCargo.setText("Nombre de nuevo rol");

        txtRol.setPreferredSize(new java.awt.Dimension(68, 30));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRoles);
        if (tblRoles.getColumnModel().getColumnCount() > 0) {
            tblRoles.getColumnModel().getColumn(0).setResizable(false);
            tblRoles.getColumnModel().getColumn(0).setCellRenderer(render);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCargo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnGuardar))
                                .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addGap(13, 13, 13)
                        .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        boolean fieldFilled = (!(txtRol.getText().isEmpty()));
        if(fieldFilled){
            int affectedRows = Usuarios.crearRol(txtRol.getText());
            JOptionPane.showMessageDialog(this, "Se han insertado " + affectedRows + " registro(s)","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            tableDataChanged();
        }else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos","Alerta",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tableDataChanged(){
        render.setHorizontalAlignment(JLabel.CENTER);
        try{
            roles = Usuarios.getRoles();
            modeloTabla.setRowCount(0);
            tblRoles.revalidate();
            for(String rol:roles) {
                modeloTabla.addRow(new Object[] {
                    rol
                });
            }
        }catch(NamingException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblRoles;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}