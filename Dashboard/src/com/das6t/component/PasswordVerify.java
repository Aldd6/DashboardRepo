/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.das6t.component;

/**
 *
 * @author Daniel Aldana(DaS6T)
 */

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class PasswordVerify extends javax.swing.JPanel {
    
    public static int checkPasswordLevel(String pass) {
        int strLevel = 0;
        boolean hasRequiredLength = pass.length()>8;
        if(hasRequiredLength) {
            strLevel++;
        }
        boolean hasUpperCase = !pass.equals(pass.toLowerCase());
        if(hasUpperCase) {
            strLevel++;
        }
        boolean hasLowerCase = !pass.equals(pass.toUpperCase());
        if(hasLowerCase) {
            strLevel++;
        }
        boolean hasNumbers = pass.matches(".*\\d.*");
        if(hasNumbers) {
            strLevel++;
        }
        boolean hasSpecialCharacter = !pass.matches("[a-zA-Z0-9]*");
        if(hasSpecialCharacter) {
            strLevel++;
        }
        if(strLevel<3) {
            return 1;
        }else if(strLevel<5) {
            return 2;
        } else {
            return 3;
        }
    }
    
    private JPasswordField passField;
    private JLabel lvlText;
    private DocumentListener docLst;
    private int lvl;

    /**
     * Creates new form PasswordVerify
     */
    public PasswordVerify() {
        initComponents();
        this.putClientProperty(FlatClientProperties.STYLE, "" + "Background:null");
        this.setLayout(new MigLayout("fill, insets 0","3[100,fill,grow0][]","[fill,grow 0]"));
        lvlText = new JLabel();
        lvlText.setVisible(true);
        this.add(lvlText);
    }
    
    private Color getLevelColor(int lvl) {
        if(lvl==1) {
            return Color.decode("#FF4D4D");
        }else if(lvl==2) {
            return Color.decode("#FFB84D");
        }else {
            return Color.decode("#58C359");
        }
    }
    
    private void checkPass(String pass) {
        this.lvl = pass.isEmpty() ? 0:checkPasswordLevel(pass);
        if(lvl==0) {
            lvlText.setText("ninguno");
            lvlText.setVisible(false);
        }else{
            lvlText.setVisible(true);
            if(lvl==1) {
                lvlText.setText("Muy debil");
            }else if(lvl==2) {
                lvlText.setText("Debil");
            }else {
                lvlText.setText("Fuerte");
            }
            lvlText.setForeground(getLevelColor(lvl));
        }
        this.repaint();
    }
    
    public void initPassListener(JPasswordField pass) {
        if(docLst==null) {
            docLst = new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent ev) {
                    checkPass(String.valueOf(pass.getPassword()));
                }
                @Override
                public void removeUpdate(DocumentEvent ev) {
                    checkPass(String.valueOf(pass.getPassword()));
                }
                @Override
                public void changedUpdate(DocumentEvent ev) {
                    checkPass(String.valueOf(pass.getPassword()));
                }
            };
        }
        if(passField!=null) {
            passField.getDocument().removeDocumentListener(docLst);
        }
        pass.getDocument().addDocumentListener(docLst);
        passField = pass;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}