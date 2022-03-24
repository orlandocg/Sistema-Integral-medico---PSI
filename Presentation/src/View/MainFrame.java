/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import SIM.App;
import SIM.AppState;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import javax.swing.JPanel;

/**
 *
 * @author orlandocamacho
 */
public class MainFrame extends javax.swing.JFrame {

    private int mouseX;
    private int mouseY;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        String separator = File.separator;
        
        if (separator.equals("/")) {
            setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 22, 22));
            this.DisposeButtonW.setVisible(false);
            this.MinimizeButtonW.setVisible(false);
            this.FullScreenButtonW.setVisible(false);
        } else {
            setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 0, 0));
            this.DisposeButton.setVisible(false);
            this.MinimizeButton.setVisible(false);
            this.FullScreenButton.setVisible(false);
        }
        setLocationRelativeTo(null);
    }
    
    public void setContent(JPanel content){

        this.content.removeAll();
        this.content.invalidate();
        this.content.add(content);
        this.content.revalidate();
        
        System.out.println(content.getClass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        DisposeButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        FullScreenButton = new javax.swing.JLabel();
        MinimizeButtonW = new javax.swing.JLabel();
        DisposeButtonW = new javax.swing.JLabel();
        FullScreenButtonW = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lateralMenu = new javax.swing.JPanel();
        manageApointments = new Components.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        scheduleApointments = new Components.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        editApointment = new Components.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        cancelApointment = new Components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBar.setBackground(new java.awt.Color(232, 240, 254));
        topBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarMousePressed(evt);
            }
        });
        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisposeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DisposeButton.png"))); // NOI18N
        DisposeButton.setMaximumSize(new java.awt.Dimension(14, 14));
        DisposeButton.setMinimumSize(new java.awt.Dimension(14, 14));
        DisposeButton.setPreferredSize(new java.awt.Dimension(14, 14));
        DisposeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DisposeButtonMouseMoved(evt);
            }
        });
        DisposeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DisposeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DisposeButtonMousePressed(evt);
            }
        });
        topBar.add(DisposeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 35));

        MinimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MinimizeButton.png"))); // NOI18N
        MinimizeButton.setMaximumSize(new java.awt.Dimension(14, 14));
        MinimizeButton.setMinimumSize(new java.awt.Dimension(14, 14));
        MinimizeButton.setPreferredSize(new java.awt.Dimension(14, 14));
        MinimizeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseMoved(evt);
            }
        });
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizeButtonMousePressed(evt);
            }
        });
        topBar.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 35));

        FullScreenButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FullScreenButton.png"))); // NOI18N
        FullScreenButton.setMaximumSize(new java.awt.Dimension(14, 14));
        FullScreenButton.setMinimumSize(new java.awt.Dimension(14, 14));
        FullScreenButton.setPreferredSize(new java.awt.Dimension(14, 14));
        FullScreenButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FullScreenButtonMouseMoved(evt);
            }
        });
        FullScreenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FullScreenButtonMouseExited(evt);
            }
        });
        topBar.add(FullScreenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 35));

        MinimizeButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MinimizeButtonW.png"))); // NOI18N
        MinimizeButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMouseMoved(evt);
            }
        });
        MinimizeButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMousePressed(evt);
            }
        });
        topBar.add(MinimizeButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 2, 55, 33));

        DisposeButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DisposeButtonW.png"))); // NOI18N
        DisposeButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DisposeButtonWMouseMoved(evt);
            }
        });
        DisposeButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DisposeButtonWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DisposeButtonWMousePressed(evt);
            }
        });
        topBar.add(DisposeButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(1223, 2, 55, 33));

        FullScreenButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FullScreenButtonW.png"))); // NOI18N
        FullScreenButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FullScreenButtonWMouseMoved(evt);
            }
        });
        FullScreenButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FullScreenButtonWMouseExited(evt);
            }
        });
        topBar.add(FullScreenButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 2, 55, 33));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 36, 37));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clinica Dra Brenda Cañedo");
        topBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 280, 35));

        getContentPane().add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 35));

        lateralMenu.setBackground(new java.awt.Color(232, 240, 254));
        lateralMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));
        lateralMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageApointments.setBackground(new java.awt.Color(232, 240, 254));
        manageApointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Administrar citas");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        manageApointments.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        lateralMenu.add(manageApointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        scheduleApointments.setBackground(new java.awt.Color(232, 240, 254));
        scheduleApointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agendar cita");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        scheduleApointments.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        lateralMenu.add(scheduleApointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 30));

        editApointment.setBackground(new java.awt.Color(232, 240, 254));
        editApointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Reagendar cita");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        editApointment.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        lateralMenu.add(editApointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 30));

        cancelApointment.setBackground(new java.awt.Color(232, 240, 254));
        cancelApointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cancelar cita");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        cancelApointment.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        lateralMenu.add(cancelApointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 30));

        getContentPane().add(lateralMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 200, 685));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 35, 1080, 685));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisposeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMouseMoved
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DisposeButton2.png")));
    }//GEN-LAST:event_DisposeButtonMouseMoved

    private void DisposeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMouseExited
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DisposeButton.png")));
    }//GEN-LAST:event_DisposeButtonMouseExited

    private void DisposeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMousePressed
        if (evt.getClickCount() >= 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_DisposeButtonMousePressed

    private void MinimizeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseMoved
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizeButton2.png")));
    }//GEN-LAST:event_MinimizeButtonMouseMoved

    private void MinimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseExited
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizeButton.png")));
    }//GEN-LAST:event_MinimizeButtonMouseExited

    private void MinimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMousePressed
        if (evt.getClickCount() >= 0) {
            this.setExtendedState(1);
        }
    }//GEN-LAST:event_MinimizeButtonMousePressed

    private void FullScreenButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonMouseMoved
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FullScreenButton2.png")));
    }//GEN-LAST:event_FullScreenButtonMouseMoved

    private void FullScreenButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonMouseExited
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FullScreenButton.png")));
    }//GEN-LAST:event_FullScreenButtonMouseExited

    private void MinimizeButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMouseMoved
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizeButtonW2.png")));
    }//GEN-LAST:event_MinimizeButtonWMouseMoved

    private void MinimizeButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMouseExited
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MinimizeButtonW.png")));
    }//GEN-LAST:event_MinimizeButtonWMouseExited

    private void MinimizeButtonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMousePressed
        if (evt.getClickCount() >= 0) {
            this.setExtendedState(1);
        }
    }//GEN-LAST:event_MinimizeButtonWMousePressed

    private void DisposeButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMouseMoved
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DisposeButtonW2.png")));
    }//GEN-LAST:event_DisposeButtonWMouseMoved

    private void DisposeButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMouseExited
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DisposeButtonW.png")));
    }//GEN-LAST:event_DisposeButtonWMouseExited

    private void DisposeButtonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMousePressed
        if (evt.getClickCount() >= 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_DisposeButtonWMousePressed

    private void FullScreenButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonWMouseMoved
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FullScreenButtonW2.png")));
    }//GEN-LAST:event_FullScreenButtonWMouseMoved

    private void FullScreenButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonWMouseExited
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FullScreenButtonW.png")));
    }//GEN-LAST:event_FullScreenButtonWMouseExited

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();

        setLocation(X - mouseX, Y - mouseY + 1);
    }//GEN-LAST:event_topBarMouseDragged

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (evt.getClickCount() >= 0) {
            App.GetSingleton().setState(AppState.MANAGEAPPOINTMENTS);
            manageApointments.setBackground(new Color(204,204,204));
            scheduleApointments.setBackground(new Color(232,240,254));
            editApointment.setBackground(new Color(232,240,254));
            cancelApointment.setBackground(new Color(232,240,254));
        } 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (evt.getClickCount() >= 0) {
            App.GetSingleton().setState(AppState.SCHEDULEAPPOINTMENTS);
            manageApointments.setBackground(new Color(232,240,254));
            scheduleApointments.setBackground(new Color(204,204,204));
            editApointment.setBackground(new Color(232,240,254));
            cancelApointment.setBackground(new Color(232,240,254));
        } 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (evt.getClickCount() >= 0) {
            App.GetSingleton().setState(AppState.RESCHEDULEAPPOINTMENTS);
            manageApointments.setBackground(new Color(232,240,254));
            scheduleApointments.setBackground(new Color(232,240,254));
            editApointment.setBackground(new Color(204,204,204));
            cancelApointment.setBackground(new Color(232,240,254));
        } 
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (evt.getClickCount() >= 0) {
            App.GetSingleton().setState(AppState.CANCELAPPOINTMENTS);
            manageApointments.setBackground(new Color(232,240,254));
            scheduleApointments.setBackground(new Color(232,240,254));
            editApointment.setBackground(new Color(232,240,254));
            cancelApointment.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisposeButton;
    private javax.swing.JLabel DisposeButtonW;
    private javax.swing.JLabel FullScreenButton;
    private javax.swing.JLabel FullScreenButtonW;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JLabel MinimizeButtonW;
    private Components.RoundedPanel cancelApointment;
    private javax.swing.JPanel content;
    private Components.RoundedPanel editApointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel lateralMenu;
    private Components.RoundedPanel manageApointments;
    private Components.RoundedPanel scheduleApointments;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}