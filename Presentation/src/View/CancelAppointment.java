/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Domain.Patient;
import control.PatientControl;

/**
 *
 * @author orlandocamacho
 */
public class CancelAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleAppointment
     */
    public CancelAppointment() {
        initComponents();
        this.loadPatients();
    }
    
    private void loadPatients(){
//        for (Patient patient : PatientControl.getInstance().getPatients()) {
//            cbPatient.addItem(patient);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Patient = new javax.swing.JLabel();
        cbPatient = new javax.swing.JComboBox<>();
        Date = new javax.swing.JLabel();
        cbDate = new javax.swing.JComboBox<>();
        Hour = new javax.swing.JLabel();
        cbHour = new javax.swing.JComboBox<>();
        service = new javax.swing.JLabel();
        cbService = new javax.swing.JComboBox<>();
        description = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentDescription = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 685));
        setPreferredSize(new java.awt.Dimension(1080, 685));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 36, 37));
        jLabel2.setText("Cancelar cita");
        title.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        Patient.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        Patient.setForeground(new java.awt.Color(35, 36, 37));
        Patient.setText("Paciente:");
        add(Patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cbPatient.setBackground(new java.awt.Color(204, 204, 204));
        cbPatient.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbPatient.setForeground(new java.awt.Color(35, 36, 37));
        cbPatient.setMaximumRowCount(12);
        cbPatient.setBorder(null);
        cbPatient.setFocusable(false);
        add(cbPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 30));

        Date.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(35, 36, 37));
        Date.setText("Fecha:");
        add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        cbDate.setBackground(new java.awt.Color(204, 204, 204));
        cbDate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbDate.setForeground(new java.awt.Color(35, 36, 37));
        cbDate.setMaximumRowCount(12);
        cbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDate.setBorder(null);
        cbDate.setFocusable(false);
        cbDate.setIgnoreRepaint(true);
        cbDate.setLightWeightPopupEnabled(false);
        add(cbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 30));

        Hour.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        Hour.setForeground(new java.awt.Color(35, 36, 37));
        Hour.setText("Hora:");
        add(Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        cbHour.setBackground(new java.awt.Color(204, 204, 204));
        cbHour.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbHour.setForeground(new java.awt.Color(35, 36, 37));
        cbHour.setMaximumRowCount(12);
        cbHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbHour.setBorder(null);
        cbHour.setFocusable(false);
        cbHour.setIgnoreRepaint(true);
        cbHour.setLightWeightPopupEnabled(false);
        add(cbHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 30));

        service.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        service.setForeground(new java.awt.Color(35, 36, 37));
        service.setText("Servicio:");
        add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cbService.setBackground(new java.awt.Color(204, 204, 204));
        cbService.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbService.setForeground(new java.awt.Color(35, 36, 37));
        cbService.setMaximumRowCount(12);
        cbService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService.setBorder(null);
        cbService.setFocusable(false);
        cbService.setIgnoreRepaint(true);
        cbService.setLightWeightPopupEnabled(false);
        add(cbService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, 30));

        description.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        description.setForeground(new java.awt.Color(35, 36, 37));
        description.setText("Descripción:");
        add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        AppointmentDescription.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentDescription.setColumns(19);
        AppointmentDescription.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        AppointmentDescription.setForeground(new java.awt.Color(35, 36, 37));
        AppointmentDescription.setRows(5);
        jScrollPane1.setViewportView(AppointmentDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 250, 140));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AppointmentDescription;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Hour;
    private javax.swing.JLabel Patient;
    private javax.swing.JComboBox<String> cbDate;
    private javax.swing.JComboBox<String> cbHour;
    private javax.swing.JComboBox<Patient> cbPatient;
    private javax.swing.JComboBox<String> cbService;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel service;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
