/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Domain.*;
import java.awt.Color;

/**
 *
 * @author orlandocamacho
 */
public class AppointmentToConfirm extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentToConfirm
     */
    public AppointmentToConfirm(Appointment appointment) {
        initComponents();
        renderAppointmentToConfirm(appointment);
    }
    
    private void renderAppointmentToConfirm(Appointment appointment){
        
        if (appointment != null) {
            switch (appointment.getaType()) {
                case Nutritional:
                    jLabel1.setText("Nutricional");
                    roundedPanel8.setBackground(new Color(79, 195, 97));
                    break;
                case Esthetic:
                    jLabel1.setText("Estetica");
                    roundedPanel8.setBackground(new Color(251, 225, 97));
                    break;
                case Surgical:
                    jLabel1.setText("Quirurgica");
                    roundedPanel8.setBackground(new Color(253, 78, 137));
                    break;
            }

            jLabel2.setText(appointment.getStartTime().getDate() + "/" + (appointment.getStartTime().getMonth() + 1) + "/" + (appointment.getStartTime().getYear() + 1900));

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

        roundedPanel8 = new Components.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel8.setBackground(new java.awt.Color(244, 243, 243));
        roundedPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 36, 37));
        jLabel1.setText("Sin citas");
        roundedPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 36, 37));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roundedPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 20));

        add(roundedPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 133, 97));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Components.RoundedPanel roundedPanel8;
    // End of variables declaration//GEN-END:variables
}