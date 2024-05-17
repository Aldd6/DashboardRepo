/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.das6t.component;

/**
 *
 * @author Daniel Aldana(DaS6T)
 */

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import com.das6t.swing.ButtonMenu;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import com.das6t.event.EventMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Menu extends javax.swing.JPanel {
    Font robotoPlain = new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13);
    Font robotoBold = new Font(FlatRobotoFont.FAMILY, Font.BOLD, 18);
    
    Color fontColor = new Color(153,153,153);
    
    ImageIcon iconUser = new FlatSVGIcon("com/das6t/icons/account_circle.svg",48,48);
    ImageIcon iconDash = new FlatSVGIcon("com/das6t/icons/dashboard.svg",48,48);
    ImageIcon iconReserv = new FlatSVGIcon("com/das6t/icons/reservaciones.svg",48,48);
    ImageIcon iconCliente = new FlatSVGIcon("com/das6t/icons/clientes.svg",48,48);
    ImageIcon iconFactura = new FlatSVGIcon("com/das6t/icons/facturas.svg",48,48);
    ImageIcon iconLogout = new FlatSVGIcon("com/das6t/icons/logout.svg",48,48);
    ImageIcon iconHab = new FlatSVGIcon("com/das6t/icons/cama.svg",48,48);
    ImageIcon iconUsuario = new FlatSVGIcon("com/das6t/icons/usuarios.svg",48,48);
    
    private EventMenu evt;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]10[]"));
        this.setOpaque(false);
    }
    
    public void initMenu(EventMenu evt){
        this.evt = evt;
        addMenu(iconDash,"Dashboard",0);
        addMenu(iconHab,"Habitaciones",1);
        addMenu(iconReserv,"Reservaciones",2);
        addMenu(iconCliente,"Clientes",3);
        addMenu(iconFactura,"Facturacion",4);
        addMenu(iconUsuario,"Usuarios",5);
        this.addEmpty();
        addMenu(iconLogout,"LogOut",6);
    }
    
    private void addMenu(Icon icon, String text, int index) {
        ButtonMenu menu = new ButtonMenu();
        menu.setIcon(icon);
        menu.setText("  " + text);
        panelMenu.add(menu);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                evt.selected(index);
                setSelected(menu);
            }
        });
    }
    
    private void addEmpty() {
        panelMenu.add(new JLabel(), "push");
    }
    
    private void setSelected(ButtonMenu menu) {
        for(Component comp:panelMenu.getComponents()) {
            if(comp instanceof ButtonMenu) {
                ButtonMenu bt = (ButtonMenu)comp;
                bt.setSelected(false);
            }
        }
        menu.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new com.das6t.swing.RoundedPanel();
        lblUsuarioImg = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        roundedPanel2 = new com.das6t.swing.RoundedPanel();
        panelMenu = new javax.swing.JPanel();

        roundedPanel1.setBackground(new java.awt.Color(61, 61, 61));

        lblUsuarioImg.setIcon(iconUser);

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(robotoBold);
        lblUsuario.setForeground(fontColor);
        lblUsuario.setText("Usuario");
        lblUsuario.setMaximumSize(new java.awt.Dimension(85, 16));
        lblUsuario.setMinimumSize(new java.awt.Dimension(85, 16));
        lblUsuario.setPreferredSize(new java.awt.Dimension(85, 16));

        lblRol.setFont(robotoPlain);
        lblRol.setForeground(fontColor);
        lblRol.setText("Rol");
        lblRol.setMaximumSize(new java.awt.Dimension(85, 16));
        lblRol.setMinimumSize(new java.awt.Dimension(85, 16));
        lblRol.setName(""); // NOI18N
        lblRol.setPreferredSize(new java.awt.Dimension(85, 16));

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioImg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsuarioImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundedPanel2.setBackground(new java.awt.Color(61, 61, 61));

        panelMenu.setBackground(new java.awt.Color(61, 61, 61));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioImg;
    private javax.swing.JPanel panelMenu;
    private com.das6t.swing.RoundedPanel roundedPanel1;
    private com.das6t.swing.RoundedPanel roundedPanel2;
    // End of variables declaration//GEN-END:variables
}