/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Admin;

/**
 *
 * @author Enis
 */
public class MyReportsFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyReportsFrame
     */
    public MyReportsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")//provo
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        titleLabel3 = new javax.swing.JLabel();
        xButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        malePattientsButton = new javax.swing.JButton();
        second3MonthsButton = new javax.swing.JButton();
        third3MonthsButton = new javax.swing.JButton();
        fourth3MonthsButton = new javax.swing.JButton();
        youngPatientsButton = new javax.swing.JButton();
        femalePatientsButton = new javax.swing.JButton();
        first3MonthsButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(842, 570));
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 204)));

        jPanel5.setBackground(new java.awt.Color(0, 168, 255));

        titleLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel3.setText(" Reports");

        xButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/xButtonBlue.png"))); // NOI18N
        xButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/xHoverButton.png"))); // NOI18N
        xButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/xHoverButton.png"))); // NOI18N
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        malePattientsButton.setBackground(new java.awt.Color(255, 255, 255));
        malePattientsButton.setText("Male Patients");
        malePattientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malePattientsButtonActionPerformed(evt);
            }
        });

        second3MonthsButton.setBackground(new java.awt.Color(255, 255, 255));
        second3MonthsButton.setText("April-June Appointments");
        second3MonthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                second3MonthsButtonActionPerformed(evt);
            }
        });

        third3MonthsButton.setBackground(new java.awt.Color(255, 255, 255));
        third3MonthsButton.setText("July-September Appointments");
        third3MonthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                third3MonthsButtonActionPerformed(evt);
            }
        });

        fourth3MonthsButton.setBackground(new java.awt.Color(255, 255, 255));
        fourth3MonthsButton.setText("October-November Appointments");
        fourth3MonthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourth3MonthsButtonActionPerformed(evt);
            }
        });

        youngPatientsButton.setBackground(new java.awt.Color(255, 255, 255));
        youngPatientsButton.setText("Young Patients");
        youngPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                youngPatientsButtonActionPerformed(evt);
            }
        });

        femalePatientsButton.setBackground(new java.awt.Color(255, 255, 255));
        femalePatientsButton.setText("Female Patients");
        femalePatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalePatientsButtonActionPerformed(evt);
            }
        });

        first3MonthsButton.setBackground(new java.awt.Color(255, 255, 255));
        first3MonthsButton.setText("January-March Appointments");
        first3MonthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first3MonthsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(malePattientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(second3MonthsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(third3MonthsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourth3MonthsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(youngPatientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(femalePatientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(first3MonthsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(femalePatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(malePattientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(youngPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(first3MonthsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(second3MonthsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(third3MonthsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fourth3MonthsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        dispose();
    }//GEN-LAST:event_xButtonActionPerformed

    private void malePattientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malePattientsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Patient WHERE Sex = 'Male'" ;
        String path = "C:\\\\Users\\\\bleer\\\\Desktop\\\\HCS\\\\src\\\\reports\\\\MalePatients.jrxml" ;
        aw.ReportTemplateAll(sql,path);
    }//GEN-LAST:event_malePattientsButtonActionPerformed

    private void youngPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_youngPatientsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Patient WHERE Date_Of_Birth BETWEEN '1984-01-01' AND '1999-12-31'" ;
        String path = "C:\\\\Users\\\\bleer\\\\Desktop\\\\HCS\\\\src\\\\reports\\\\YoungPatients.jrxml" ;
        aw.ReportTemplateAll("SELECT * FROM Patient WHERE Sex = 'Female' " , "C:\\Users\\bleer\\Desktop\\HCS\\src\\reports\\FemalePatients.jrxml");
    }//GEN-LAST:event_youngPatientsButtonActionPerformed

    private void femalePatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalePatientsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Patient WHERE Sex = 'Female'" ;
        String path = "C:\\\\Users\\\\bleer\\\\Desktop\\\\HCS\\\\src\\\\reports\\\\FemalePatients.jrxml" ;
        aw.ReportTemplateAll(sql,path);
    }//GEN-LAST:event_femalePatientsButtonActionPerformed

    private void first3MonthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first3MonthsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Appointment WHERE DateTime BETWEEN '2019-01-01' AND '2019-03-31'" ;
        String path = "C:\\Users\\bleer\\Desktop\\HCS\\src\\reports\\First3MonthAppointments.jrxml" ;
        aw.ReportTemplateAll(sql , path);
    }//GEN-LAST:event_first3MonthsButtonActionPerformed

    private void second3MonthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_second3MonthsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Appointment WHERE DateTime BETWEEN '2019-04-01' AND '2019-06-30'" ;
        String path = "C:\\Users\\bleer\\Desktop\\HCS\\src\\reports\\Second3MonthAppointments.jrxml" ;
        aw.ReportTemplateAll(sql , path);
    }//GEN-LAST:event_second3MonthsButtonActionPerformed

    private void third3MonthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_third3MonthsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Appointment WHERE DateTime BETWEEN '2019-07-01' AND '2019-09-30'" ;
        String path = "C:\\Users\\bleer\\Desktop\\HCS\\src\\reports\\Third3MonthAppointments.jrxml" ;
        aw.ReportTemplateAll(sql , path);
    }//GEN-LAST:event_third3MonthsButtonActionPerformed

    private void fourth3MonthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourth3MonthsButtonActionPerformed
        AdminWindow aw = new AdminWindow() ;
        String sql = "SELECT * FROM Appointment WHERE DateTime BETWEEN '2019-10-01' AND '2019-12-31'" ;
        String path = "C:\\Users\\bleer\\Desktop\\HCS\\src\\reports\\Fourth3MonthAppointments.jrxml" ;
        aw.ReportTemplateAll(sql , path);
    }//GEN-LAST:event_fourth3MonthsButtonActionPerformed

    

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
            java.util.logging.Logger.getLogger(MyReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyReportsFrame().setVisible(true);
            }//ku ke qajo klasa qe ke ka don me bo raport
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton femalePatientsButton;
    private javax.swing.JButton first3MonthsButton;
    private javax.swing.JButton fourth3MonthsButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton malePattientsButton;
    private javax.swing.JButton second3MonthsButton;
    private javax.swing.JButton third3MonthsButton;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JButton xButton;
    private javax.swing.JButton youngPatientsButton;
    // End of variables declaration//GEN-END:variables
}
