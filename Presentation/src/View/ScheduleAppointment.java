/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Domain.Appointment;
import Domain.AppointmentType;
import Domain.Medicine;
import Domain.Patient;
import Domain.Payment;
import Domain.Type;
import control.AppointmentControl;
import control.PatientControl;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author orlandocamacho
 */
public class ScheduleAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleAppointment
     */
    public ScheduleAppointment() {
        initComponents();
        this.loadPatients();

        Date date = new Date();
        int year = date.getYear() - 1;
        int month = date.getMonth();
        int day = date.getDate() - 1;

        this.fillComboBoxDay(month+1, year+1901);
        this.fillComboBoxMonthYear();

        cbDay.setSelectedIndex(day);
        cbMonth.setSelectedIndex(month);
        cbYear.setSelectedIndex(year);
    }

    private void loadPatients() {
        for (Patient patient : PatientControl.getInstance().getPatients()) {
            cbPatient.addItem(patient);
        }
        cbPatient.setSelectedIndex(-1);
    }

    private void fillComboBoxDay(int month, int year) {
        Calendar mycal = new GregorianCalendar(year, month, 0);
        int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);

        ArrayList<String> days = new ArrayList<String>();

        for (int i = 0; i < daysInMonth; i++) {
            days.add(String.valueOf(i + 1));
        }

        cbDay.setModel(new DefaultComboBoxModel<String>(days.toArray(new String[0])));
    }

    private void fillComboBoxMonthYear() {
        ArrayList<String> months = new ArrayList<String>();
        ArrayList<String> years = new ArrayList<String>();

        for (int i = 0; i < 12; i++) {
            months.add(String.valueOf(i + 1));
        }

        Date date = new Date();
        int year = date.getYear();

        for (int i = 0; i < year; i++) {
            years.add(String.valueOf(i + 1901));
        }

        cbMonth.setModel(new DefaultComboBoxModel<String>(months.toArray(new String[0])));
        cbYear.setModel(new DefaultComboBoxModel<String>(years.toArray(new String[0])));
    }

    private void updateHour() {
        if (cbService.getSelectedItem().toString().equals("Nutricional") || cbService.getSelectedItem().toString().equals("Estetica")) {
            if (cbMinuteBeginning.getSelectedIndex() == 0 || cbMinuteBeginning.getSelectedIndex() == 1 || cbMinuteBeginning.getSelectedIndex() == 2) {
                cbHourEnding.setSelectedIndex(cbHourBeginning.getSelectedIndex());
                cbMinuteEnding.setSelectedIndex(cbMinuteBeginning.getSelectedIndex() + 1);
            } else {
                cbHourEnding.setSelectedIndex(cbHourBeginning.getSelectedIndex() + 1);
                cbMinuteEnding.setSelectedIndex(0);
            }    
        } else {
            cbHourEnding.setSelectedIndex(cbHourBeginning.getSelectedIndex() + 1);
            cbMinuteEnding.setSelectedIndex(cbMinuteBeginning.getSelectedIndex());
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

        title = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jLPatient = new javax.swing.JLabel();
        jLNotes = new javax.swing.JLabel();
        containerEnding = new Components.RoundedPanel();
        cbMinuteEnding = new javax.swing.JComboBox<>();
        containerService = new Components.RoundedPanel();
        cbService = new javax.swing.JComboBox<>();
        containerBeginning = new Components.RoundedPanel();
        cbMinuteBeginning = new javax.swing.JComboBox<>();
        containerMonth = new Components.RoundedPanel();
        cbMonth = new javax.swing.JComboBox<>();
        jLDate = new javax.swing.JLabel();
        containerDay = new Components.RoundedPanel();
        cbDay = new javax.swing.JComboBox<>();
        containerYear = new Components.RoundedPanel();
        cbYear = new javax.swing.JComboBox<>();
        jLEnding = new javax.swing.JLabel();
        containerPatient = new Components.RoundedPanel();
        cbPatient = new javax.swing.JComboBox<>();
        jLService = new javax.swing.JLabel();
        containerReason = new Components.RoundedPanel();
        tAReason = new javax.swing.JTextArea();
        jLBeginning = new javax.swing.JLabel();
        containerBtnSchedule = new Components.RoundedPanel();
        btnSchedule = new javax.swing.JButton();
        containerBeginning1 = new Components.RoundedPanel();
        cbHourBeginning = new javax.swing.JComboBox<>();
        containerEnding1 = new Components.RoundedPanel();
        cbHourEnding = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 685));
        setPreferredSize(new java.awt.Dimension(1080, 685));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(35, 36, 37));
        jLTitle.setText("Agendar cita");
        title.add(jLTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        jLPatient.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLPatient.setForeground(new java.awt.Color(35, 36, 37));
        jLPatient.setText("Paciente:");
        add(jLPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 10));

        jLNotes.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLNotes.setForeground(new java.awt.Color(35, 36, 37));
        jLNotes.setText("Notas:");
        add(jLNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 10));

        containerEnding.setBackground(new java.awt.Color(232, 240, 255));
        containerEnding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbMinuteEnding.setBackground(new java.awt.Color(232, 240, 255));
        cbMinuteEnding.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbMinuteEnding.setForeground(new java.awt.Color(35, 36, 37));
        cbMinuteEnding.setMaximumRowCount(12);
        cbMinuteEnding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        cbMinuteEnding.setBorder(null);
        cbMinuteEnding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMinuteEnding.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbMinuteEnding.setEnabled(false);
        cbMinuteEnding.setFocusable(false);
        containerEnding.add(cbMinuteEnding, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 30));

        add(containerEnding, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 220, 55, 30));

        containerService.setBackground(new java.awt.Color(232, 240, 255));
        containerService.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbService.setBackground(new java.awt.Color(232, 240, 255));
        cbService.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbService.setForeground(new java.awt.Color(35, 36, 37));
        cbService.setMaximumRowCount(12);
        cbService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nutricional", "Quirurgica", "Estetica" }));
        cbService.setSelectedIndex(-1);
        cbService.setBorder(null);
        cbService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbService.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbService.setFocusable(false);
        cbService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServiceActionPerformed(evt);
            }
        });
        containerService.add(cbService, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 30));

        add(containerService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 30));

        containerBeginning.setBackground(new java.awt.Color(232, 240, 255));
        containerBeginning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbMinuteBeginning.setBackground(new java.awt.Color(232, 240, 255));
        cbMinuteBeginning.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbMinuteBeginning.setForeground(new java.awt.Color(35, 36, 37));
        cbMinuteBeginning.setMaximumRowCount(12);
        cbMinuteBeginning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));
        cbMinuteBeginning.setBorder(null);
        cbMinuteBeginning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMinuteBeginning.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbMinuteBeginning.setFocusable(false);
        cbMinuteBeginning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbMinuteBeginningFocusLost(evt);
            }
        });
        containerBeginning.add(cbMinuteBeginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 30));

        add(containerBeginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 220, 55, 30));

        containerMonth.setBackground(new java.awt.Color(232, 240, 255));
        containerMonth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbMonth.setBackground(new java.awt.Color(232, 240, 255));
        cbMonth.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbMonth.setForeground(new java.awt.Color(35, 36, 37));
        cbMonth.setMaximumRowCount(12);
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMonth.setBorder(null);
        cbMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMonth.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbMonth.setFocusable(false);
        containerMonth.add(cbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(containerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 30));

        jLDate.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLDate.setForeground(new java.awt.Color(35, 36, 37));
        jLDate.setText("Fecha:");
        add(jLDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 10));

        containerDay.setBackground(new java.awt.Color(232, 240, 255));
        containerDay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbDay.setBackground(new java.awt.Color(232, 240, 255));
        cbDay.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbDay.setForeground(new java.awt.Color(35, 36, 37));
        cbDay.setMaximumRowCount(12);
        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDay.setBorder(null);
        cbDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbDay.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbDay.setFocusable(false);
        containerDay.add(cbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(containerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 30));

        containerYear.setBackground(new java.awt.Color(232, 240, 255));
        containerYear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbYear.setBackground(new java.awt.Color(232, 240, 255));
        cbYear.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbYear.setForeground(new java.awt.Color(35, 36, 37));
        cbYear.setMaximumRowCount(12);
        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbYear.setBorder(null);
        cbYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbYear.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbYear.setFocusable(false);
        containerYear.add(cbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(containerYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 30));

        jLEnding.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLEnding.setForeground(new java.awt.Color(35, 36, 37));
        jLEnding.setText("Final:");
        add(jLEnding, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 10));

        containerPatient.setBackground(new java.awt.Color(232, 240, 255));
        containerPatient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbPatient.setBackground(new java.awt.Color(232, 240, 255));
        cbPatient.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbPatient.setForeground(new java.awt.Color(35, 36, 37));
        cbPatient.setMaximumRowCount(12);
        cbPatient.setBorder(null);
        cbPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPatient.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbPatient.setFocusable(false);
        containerPatient.add(cbPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 30));

        add(containerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        jLService.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLService.setForeground(new java.awt.Color(35, 36, 37));
        jLService.setText("Servicio:");
        add(jLService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 10));

        containerReason.setBackground(new java.awt.Color(232, 240, 255));
        containerReason.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAReason.setBackground(new java.awt.Color(232, 240, 255));
        tAReason.setColumns(20);
        tAReason.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tAReason.setForeground(new java.awt.Color(35, 36, 37));
        tAReason.setLineWrap(true);
        tAReason.setRows(7);
        tAReason.setTabSize(4);
        tAReason.setIgnoreRepaint(true);
        tAReason.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tAReasonKeyTyped(evt);
            }
        });
        containerReason.add(tAReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 140));

        add(containerReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, 160));

        jLBeginning.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLBeginning.setForeground(new java.awt.Color(35, 36, 37));
        jLBeginning.setText("Inicio:");
        add(jLBeginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 10));

        containerBtnSchedule.setBackground(new java.awt.Color(37, 119, 241));
        containerBtnSchedule.setLayout(new java.awt.BorderLayout());

        btnSchedule.setBackground(new java.awt.Color(37, 119, 241));
        btnSchedule.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btnSchedule.setText("Agendar cita");
        btnSchedule.setBorderPainted(false);
        btnSchedule.setContentAreaFilled(false);
        btnSchedule.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSchedulenMouseMoved(evt);
            }
        });
        btnSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScheduleMouseExited(evt);
            }
        });
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });
        containerBtnSchedule.add(btnSchedule, java.awt.BorderLayout.CENTER);

        add(containerBtnSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 260, 40));

        containerBeginning1.setBackground(new java.awt.Color(232, 240, 255));
        containerBeginning1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbHourBeginning.setBackground(new java.awt.Color(232, 240, 255));
        cbHourBeginning.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbHourBeginning.setForeground(new java.awt.Color(35, 36, 37));
        cbHourBeginning.setMaximumRowCount(12);
        cbHourBeginning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "16", "17", "18" }));
        cbHourBeginning.setBorder(null);
        cbHourBeginning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbHourBeginning.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbHourBeginning.setFocusable(false);
        cbHourBeginning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbHourBeginningFocusLost(evt);
            }
        });
        containerBeginning1.add(cbHourBeginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 30));

        add(containerBeginning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 55, 30));

        containerEnding1.setBackground(new java.awt.Color(232, 240, 255));
        containerEnding1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbHourEnding.setBackground(new java.awt.Color(232, 240, 255));
        cbHourEnding.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbHourEnding.setForeground(new java.awt.Color(35, 36, 37));
        cbHourEnding.setMaximumRowCount(12);
        cbHourEnding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "16", "17", "18", "19" }));
        cbHourEnding.setBorder(null);
        cbHourEnding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbHourEnding.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        cbHourEnding.setEnabled(false);
        cbHourEnding.setFocusable(false);
        containerEnding1.add(cbHourEnding, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 30));

        add(containerEnding1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 55, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 36, 37));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 220, 10, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 36, 37));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 220, 10, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tAReasonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAReasonKeyTyped
        if (tAReason.getText().length() == 200)
            evt.consume();
    }//GEN-LAST:event_tAReasonKeyTyped

    private void btnSchedulenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSchedulenMouseMoved
        containerBtnSchedule.setBackground(new Color(35, 111, 229));
    }//GEN-LAST:event_btnSchedulenMouseMoved

    private void btnScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseExited
        containerBtnSchedule.setBackground(new Color(37, 119, 241));
    }//GEN-LAST:event_btnScheduleMouseExited

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        Timestamp startTime = Timestamp.valueOf((cbYear.getSelectedIndex() + 1901) + "-" + (cbMonth.getSelectedIndex() + 1) + "-" + (cbDay.getSelectedIndex() + 1) + " " + cbHourBeginning.getSelectedItem().toString() + ":" + cbMinuteBeginning.getSelectedItem().toString() + ":00");
        Patient patient = (Patient) cbPatient.getSelectedItem();
        AppointmentType type;
        if (cbService.getSelectedIndex() == 0) {
            type = AppointmentType.Nutritional;
        } else if (cbService.getSelectedIndex() == 1) {
            type = AppointmentType.Surgical;
        } else {
            type = AppointmentType.Esthetic;
        }
        
        System.out.println(AppointmentControl.getInstance().addAppointment(new Appointment(startTime, patient, new Medicine(14), new Payment(8), type, Type.New, false, tAReason.getText())));
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void cbServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServiceActionPerformed
        this.updateHour();
    }//GEN-LAST:event_cbServiceActionPerformed

    private void cbHourBeginningFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbHourBeginningFocusLost
        this.updateHour();
    }//GEN-LAST:event_cbHourBeginningFocusLost

    private void cbMinuteBeginningFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbMinuteBeginningFocusLost
        this.updateHour();
    }//GEN-LAST:event_cbMinuteBeginningFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSchedule;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbHourBeginning;
    private javax.swing.JComboBox<String> cbHourEnding;
    private javax.swing.JComboBox<String> cbMinuteBeginning;
    private javax.swing.JComboBox<String> cbMinuteEnding;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<Patient> cbPatient;
    private javax.swing.JComboBox<String> cbService;
    private javax.swing.JComboBox<String> cbYear;
    private Components.RoundedPanel containerBeginning;
    private Components.RoundedPanel containerBeginning1;
    private Components.RoundedPanel containerBtnSchedule;
    private Components.RoundedPanel containerDay;
    private Components.RoundedPanel containerEnding;
    private Components.RoundedPanel containerEnding1;
    private Components.RoundedPanel containerMonth;
    private Components.RoundedPanel containerPatient;
    private Components.RoundedPanel containerReason;
    private Components.RoundedPanel containerService;
    private Components.RoundedPanel containerYear;
    private javax.swing.JLabel jLBeginning;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLEnding;
    private javax.swing.JLabel jLNotes;
    private javax.swing.JLabel jLPatient;
    private javax.swing.JLabel jLService;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea tAReason;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
