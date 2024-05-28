/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.das6t.swing.ButtonHeaderMenu;
import com.das6t.event.EventMenu;
import java.util.ArrayList;
import servicios.Observador;

/**
 *
 * @author Ivan Hernandez
 */
public class HabitacionesVista extends javax.swing.JPanel {

    private ArrayList<ButtonHeaderMenu> buttons = new ArrayList<>();

    public HabitacionesVista() {
        initComponents();
        this.setOpaque(false);

        HabitacionesVista_Inicio inicio = new HabitacionesVista_Inicio(this);
        jDesktopPane.add(inicio);
        inicio.setVisible(true);
        Observador.initObservador(inicio);

        //Botones
        buttons.add(new ButtonHeaderMenu("Habitaciones"));
        buttons.add(new ButtonHeaderMenu("Tipo de habitación"));
        buttons.add(new ButtonHeaderMenu("Estado de habitación"));

        EventMenu evt = new EventMenu() {

            @Override
            public void selected(int index) {
                try {
                    switch (index) {
                        case 0:
                            abrirInicio();
                            break;
                        case 1:
                            abrirTipoHabitacion();
                            break;
                        case 2:
                            abrirEstadoHabitacion();
                            break;
                        default:
                            System.out.println("Error al seleccionar un boton");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("Error al cargar la vista");
                }
            }
        };
        headerMenu.initHeaderMenu(evt, buttons);
        headerMenu.setViewName("Habitaciones"); //escriba aqui el nombre de la vista por favor
    }

    //Metodos para Habitaciones, Ver, Crear y Editar --------------------------------------------------------------------------------------
    public void abrirInicio() {
        Observador.closeObservador();
        HabitacionesVista_Inicio inicio = new HabitacionesVista_Inicio(this);
        jDesktopPane.add(inicio);
        inicio.setVisible(true);
        Observador.initObservador(inicio);
    }

    public void abrirCrear() {
        Observador.closeObservador();
        HabitacionesVista_Crear crear = new HabitacionesVista_Crear(HabitacionesVista.this);
        jDesktopPane.add(crear);
        crear.setVisible(true);
        Observador.initObservador(crear);
    }

    public void abrirEditar(String noHabitacion, String tipoHabitacion, String estadoHabitacion) {
        Observador.closeObservador();
        HabitacionesVista_Editar editar = new HabitacionesVista_Editar(this, noHabitacion, tipoHabitacion, estadoHabitacion);
        jDesktopPane.add(editar);
        editar.setVisible(true);
        Observador.initObservador(editar);
    }

    //Metodos para Tipos de Habitación, Ver, Crear y Editar --------------------------------------------------------------------------------------
    public void abrirTipoHabitacion() {
        Observador.closeObservador();
        HabitacionesVista_TipoHabitacion tipoHabitacion = new HabitacionesVista_TipoHabitacion(this);
        jDesktopPane.add(tipoHabitacion);
        tipoHabitacion.setVisible(true);
        Observador.initObservador(tipoHabitacion);
    }

    public void crearTipoHabitacion() {
        Observador.closeObservador();
        HabitacionesVista_TipoHabitacionCrear tipoHabitacionCrear = new HabitacionesVista_TipoHabitacionCrear(this);
        jDesktopPane.add(tipoHabitacionCrear);
        tipoHabitacionCrear.setVisible(true);
        Observador.initObservador(tipoHabitacionCrear);
    }

    public void editarTipoHabitacion(String id, String tipoHab, String detalleHab, String precioHab) {

        Observador.closeObservador();
        HabitacionesVista_TipoHabitacionEditar tipoHabitacionEditar = new HabitacionesVista_TipoHabitacionEditar(this, id, tipoHab, detalleHab, precioHab);
        jDesktopPane.add(tipoHabitacionEditar);
        tipoHabitacionEditar.setVisible(true);
        Observador.initObservador(tipoHabitacionEditar);
    }

    //Metodos para Estado de Habitación, Ver, Crear y Editar --------------------------------------------------------------------------------------
    public void abrirEstadoHabitacion() {
        Observador.closeObservador();
        HabitacionesVista_EstadoHabitacion estadoHabitacion = new HabitacionesVista_EstadoHabitacion(HabitacionesVista.this);
        jDesktopPane.add(estadoHabitacion);
        estadoHabitacion.setVisible(true);
        Observador.initObservador(estadoHabitacion);
    }

    public void crearEstadoHabitacion() {
        Observador.closeObservador();
        HabitacionesVista_EstadoHabitacionCrear estadoHabitacionCrear = new HabitacionesVista_EstadoHabitacionCrear(this);
        jDesktopPane.add(estadoHabitacionCrear);
        estadoHabitacionCrear.setVisible(true);
        Observador.initObservador(estadoHabitacionCrear);
    }

    public void editarEstadoHabitacion(String id, String estadoHab) {

        Observador.closeObservador();
        HabitacionesVista_EstadoHabitacionEditar estadoHabitacionEditar = new HabitacionesVista_EstadoHabitacionEditar(this, id, estadoHab);
        jDesktopPane.add(estadoHabitacionEditar);
        estadoHabitacionEditar.setVisible(true);
        Observador.initObservador(estadoHabitacionEditar);
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
        headerMenu = new com.das6t.component.HeaderMenu();
        jDesktopPane = new javax.swing.JDesktopPane();

        setMaximumSize(new java.awt.Dimension(936, 690));
        setMinimumSize(new java.awt.Dimension(936, 690));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(936, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel1.setBackground(new java.awt.Color(45, 42, 46));
        roundedPanel1.setMaximumSize(new java.awt.Dimension(936, 690));
        roundedPanel1.setMinimumSize(new java.awt.Dimension(936, 690));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(936, 690));

        jDesktopPane.setOpaque(false);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(headerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jDesktopPane)
                .addContainerGap())
        );

        add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.das6t.component.HeaderMenu headerMenu;
    private javax.swing.JDesktopPane jDesktopPane;
    private com.das6t.swing.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
