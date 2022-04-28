/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Components.AppointmentNERP;
import Components.AppointmentSRP;
import Components.CustomScrollBarUI;
import Domain.Appointment;
import Domain.AppointmentType;
import Domain.Patient;
import control.AppointmentControl;
import control.PatientControl;
import java.awt.Color;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import javax.swing.JSeparator;


/**
 *
 * @author orlandocamacho
 */
public class ManageAppointments extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleAppointment
     */
    public ManageAppointments() {
        
        initComponents();
        AppointmentsScrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        scrollAppointments.setSize(1080, 1029);
        scrollAppointments.setPreferredSize(new java.awt.Dimension(1080, 1029));
        revalidate();
        renderAppointments();
    }
    
    private void renderAppointments(){   
        Timestamp currentTime = Timestamp.from(Instant.now());
        Object[] appointments = AppointmentControl.getInstance().getAppointmentByWeek(currentTime);
        int coorX = 20;
        
        for (Object appointment : appointments) {           
            List<Appointment> appointmentsByDay = (List<Appointment>) appointment;
            if (appointmentsByDay != null) {
                for (Appointment appointmentByDay : appointmentsByDay) {
                    int hour = appointmentByDay.getStartTime().getHours() - 11;
                    int min = appointmentByDay.getStartTime().getMinutes()/15;
                    int coorY = (hour * 128) + (min * 32) + 2;
                    
                    if (appointmentByDay.getaType() == AppointmentType.Surgical) {
                        AppointmentSRP appointmentS = new AppointmentSRP(appointmentByDay);
                        scrollAppointments.add(appointmentS, new org.netbeans.lib.awtextra.AbsoluteConstraints(coorX, coorY, -1, -1));
                    } else {
                        AppointmentNERP appointmentSP1 = new AppointmentNERP(appointmentByDay);
                        scrollAppointments.add(appointmentSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(coorX, coorY, -1, -1));
                    }
                }
            }
            coorX += 150;
        }
        
        int sepY = 123;
        for (int i = 0; i < 8; i++) {
            JSeparator jSeparator = new javax.swing.JSeparator();
            jSeparator.setForeground(new java.awt.Color(204, 204, 204));
            scrollAppointments.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, sepY, 1040, -1));
            sepY += 128;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLSun = new javax.swing.JLabel();
        jLMon = new javax.swing.JLabel();
        jLTue = new javax.swing.JLabel();
        jLWed = new javax.swing.JLabel();
        jLThu = new javax.swing.JLabel();
        jLFri = new javax.swing.JLabel();
        jLSat = new javax.swing.JLabel();
        AppointmentsScrollPane = new javax.swing.JScrollPane();
        scrollAppointments = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 685));
        setPreferredSize(new java.awt.Dimension(1080, 685));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 36, 37));
        jLabel2.setText("Agenda semanal");
        title.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSun.setBackground(new java.awt.Color(255, 255, 255));
        jLSun.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLSun.setForeground(new java.awt.Color(35, 36, 37));
        jLSun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSun.setText("Dom");
        jLSun.setToolTipText("");
        jPanel1.add(jLSun, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        jLMon.setBackground(new java.awt.Color(255, 255, 255));
        jLMon.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLMon.setForeground(new java.awt.Color(35, 36, 37));
        jLMon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMon.setText("Lun");
        jLMon.setToolTipText("");
        jPanel1.add(jLMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 30));

        jLTue.setBackground(new java.awt.Color(255, 255, 255));
        jLTue.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLTue.setForeground(new java.awt.Color(35, 36, 37));
        jLTue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTue.setText("Mar");
        jLTue.setToolTipText("");
        jPanel1.add(jLTue, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, 30));

        jLWed.setBackground(new java.awt.Color(255, 255, 255));
        jLWed.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLWed.setForeground(new java.awt.Color(35, 36, 37));
        jLWed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLWed.setText("Mie");
        jLWed.setToolTipText("");
        jPanel1.add(jLWed, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 30));

        jLThu.setBackground(new java.awt.Color(255, 255, 255));
        jLThu.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLThu.setForeground(new java.awt.Color(35, 36, 37));
        jLThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLThu.setText("Jue");
        jLThu.setToolTipText("");
        jPanel1.add(jLThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 140, 30));

        jLFri.setBackground(new java.awt.Color(255, 255, 255));
        jLFri.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLFri.setForeground(new java.awt.Color(35, 36, 37));
        jLFri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFri.setText("Vie");
        jLFri.setToolTipText("");
        jPanel1.add(jLFri, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 140, 30));

        jLSat.setBackground(new java.awt.Color(255, 255, 255));
        jLSat.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLSat.setForeground(new java.awt.Color(35, 36, 37));
        jLSat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSat.setText("Sab");
        jLSat.setToolTipText("");
        jPanel1.add(jLSat, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 140, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 50));

        AppointmentsScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentsScrollPane.setBorder(null);
        AppointmentsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        AppointmentsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        AppointmentsScrollPane.setPreferredSize(new java.awt.Dimension(1080, 575));

        scrollAppointments.setBackground(new java.awt.Color(255, 255, 255));
        scrollAppointments.setPreferredSize(new java.awt.Dimension(1080, 575));
        scrollAppointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 36, 37));
        jLabel1.setText("12:00");
        scrollAppointments.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 20, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 36, 37));
        jLabel3.setText("14:00");
        scrollAppointments.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, 20, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 36, 37));
        jLabel4.setText("13:00");
        scrollAppointments.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 20, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 36, 37));
        jLabel5.setText("15:00");
        scrollAppointments.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 507, 20, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 36, 37));
        jLabel6.setText("16:00");
        scrollAppointments.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 635, 20, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 36, 37));
        jLabel7.setText("17:00");
        scrollAppointments.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 763, 20, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 36, 37));
        jLabel8.setText("18:00");
        scrollAppointments.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 891, 20, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 36, 37));
        jLabel9.setText("19:00");
        scrollAppointments.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1019, 20, -1));

        AppointmentsScrollPane.setViewportView(scrollAppointments);

        add(AppointmentsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1080, -1));
        AppointmentsScrollPane.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AppointmentsScrollPane;
    private javax.swing.JLabel jLFri;
    private javax.swing.JLabel jLMon;
    private javax.swing.JLabel jLSat;
    private javax.swing.JLabel jLSun;
    private javax.swing.JLabel jLThu;
    private javax.swing.JLabel jLTue;
    private javax.swing.JLabel jLWed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel scrollAppointments;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
