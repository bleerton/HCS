/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Admin;

import GUI.View.General.StartingPage;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Enis
 */
public class AdminWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdminWindow
     */
    public AdminWindow() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        welcomePanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminPortalLabel = new javax.swing.JLabel();
        patientDetailsButton = new javax.swing.JButton();
        addDoctorButton = new javax.swing.JButton();
        addPatientButton = new javax.swing.JButton();
        AppointmentsButton = new javax.swing.JButton();
        patientDetailsButton1 = new javax.swing.JButton();
        myReportsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1103, 683, 683, 683));
        setMinimumSize(new java.awt.Dimension(1103, 659));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(243, 243, 243));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(1103, 659));
        mainPanel.setMinimumSize(new java.awt.Dimension(1103, 659));
        mainPanel.setPreferredSize(new java.awt.Dimension(1103, 659));

        headerPanel.setBackground(new java.awt.Color(33, 176, 195));

        jLabel2.setBackground(new java.awt.Color(33, 176, 195));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Panel");

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 153, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        welcomePanel.setBackground(new java.awt.Color(33, 176, 195));

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("to");

        adminPortalLabel.setFont(new java.awt.Font("Tahoma", 0, 43)); // NOI18N
        adminPortalLabel.setForeground(new java.awt.Color(250, 250, 250));
        adminPortalLabel.setText("Admin Portal ");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminPortalLabel)
                .addGap(20, 20, 20))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminPortalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        patientDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        patientDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/patientdetails.png"))); // NOI18N
        patientDetailsButton.setMaximumSize(new java.awt.Dimension(321, 185));
        patientDetailsButton.setMinimumSize(new java.awt.Dimension(321, 185));
        patientDetailsButton.setPreferredSize(new java.awt.Dimension(321, 185));
        patientDetailsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/patientDetails.png"))); // NOI18N
        patientDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsButtonActionPerformed(evt);
            }
        });

        addDoctorButton.setBackground(new java.awt.Color(255, 255, 255));
        addDoctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/doctorDetails.png"))); // NOI18N
        addDoctorButton.setMaximumSize(new java.awt.Dimension(321, 185));
        addDoctorButton.setMinimumSize(new java.awt.Dimension(321, 185));
        addDoctorButton.setPreferredSize(new java.awt.Dimension(321, 185));
        addDoctorButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/doctorDetails.png"))); // NOI18N
        addDoctorButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/doctorDetails.png"))); // NOI18N
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        addPatientButton.setBackground(new java.awt.Color(255, 255, 255));
        addPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/addPatient.png"))); // NOI18N
        addPatientButton.setMaximumSize(new java.awt.Dimension(321, 185));
        addPatientButton.setMinimumSize(new java.awt.Dimension(321, 185));
        addPatientButton.setPreferredSize(new java.awt.Dimension(321, 185));
        addPatientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/addPatient.png"))); // NOI18N
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        AppointmentsButton.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/appointmentList.png"))); // NOI18N
        AppointmentsButton.setMaximumSize(new java.awt.Dimension(321, 185));
        AppointmentsButton.setMinimumSize(new java.awt.Dimension(321, 185));
        AppointmentsButton.setPreferredSize(new java.awt.Dimension(321, 185));
        AppointmentsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/appointmentsList.png"))); // NOI18N
        AppointmentsButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/appointmentsList.png"))); // NOI18N
        AppointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsButtonActionPerformed(evt);
            }
        });

        patientDetailsButton1.setBackground(new java.awt.Color(255, 255, 255));
        patientDetailsButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/DoctorList.png"))); // NOI18N
        patientDetailsButton1.setMaximumSize(new java.awt.Dimension(321, 185));
        patientDetailsButton1.setMinimumSize(new java.awt.Dimension(321, 185));
        patientDetailsButton1.setPreferredSize(new java.awt.Dimension(321, 185));
        patientDetailsButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/doctorList.png"))); // NOI18N
        patientDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsButton1ActionPerformed(evt);
            }
        });

        myReportsButton.setBackground(new java.awt.Color(255, 255, 255));
        myReportsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/myreports.png"))); // NOI18N
        myReportsButton.setMaximumSize(new java.awt.Dimension(321, 185));
        myReportsButton.setMinimumSize(new java.awt.Dimension(321, 185));
        myReportsButton.setPreferredSize(new java.awt.Dimension(321, 185));
        myReportsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/myreports.png"))); // NOI18N
        myReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myReportsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(patientDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(myReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(AppointmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientDetailsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppointmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPatientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myReportsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
         AddDoctorOrPatientFrame ad = new AddDoctorOrPatientFrame();
         ad.setVisible(true);
         ad.setLocationRelativeTo(null);
         ad.setPatientOrDoctor(2);
    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void AppointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsButtonActionPerformed
        AllAppointments aa = new AllAppointments();
         aa.setVisible(true);
         aa.setLocationRelativeTo(null);
         aa.loadTable();
    }//GEN-LAST:event_AppointmentsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        new StartingPage().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        AddDoctorOrPatientFrame ad = new AddDoctorOrPatientFrame();
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
        ad.getSpecializationLabel().setText("Parent Name:");
        ad.getTitleLabel().setText("Patient Management");
        ad.setPatientOrDoctor(3);
    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void patientDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsButtonActionPerformed
        PatientDetailsFrame pdf = new PatientDetailsFrame();
        pdf.setVisible(true);
        pdf.setLocationRelativeTo(null);
        pdf.loadTable();
    }//GEN-LAST:event_patientDetailsButtonActionPerformed

    private void patientDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsButton1ActionPerformed
       DoctorListFrame dl = new DoctorListFrame();
        dl.setVisible(true);
        dl.setLocationRelativeTo(null);
        dl.loadTable();
    }//GEN-LAST:event_patientDetailsButton1ActionPerformed

    private void myReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myReportsButtonActionPerformed
        MyReportsFrame mr = new MyReportsFrame();
        mr.setVisible(true);
        mr.setLocationRelativeTo(null);
    }//GEN-LAST:event_myReportsButtonActionPerformed

    public void ReportTemplate(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
//    public void hideButtons(){
//        addDoctorButton.setVisible(false);
//         AppointmentsButton.setVisible(false);
//         addPatientButton.setVisible(false);
//         userListButton.setVisible(false);
//         patientDetailsButton.setVisible(false);
//         logoutButton.setVisible(false);
//         headerPanel.setVisible(false);
//         welcomePanel.setVisible(false);
//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsButton;
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JLabel adminPortalLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton myReportsButton;
    private javax.swing.JButton patientDetailsButton;
    private javax.swing.JButton patientDetailsButton1;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
