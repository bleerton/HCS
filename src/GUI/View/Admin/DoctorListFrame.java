/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Admin;

import BLL.Appointment;
import BLL.Connection;
import BLL.Doctor;
import BLL.Login;
import DAL.AppointmentRepository;
import DAL.ConnectionRepository;
import DAL.DoctorRepository;
import DAL.HealthException;
import DAL.LoginRepository;
import GUI.Model.DoctorTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Enis
 */
public class DoctorListFrame extends javax.swing.JFrame {

    DoctorRepository dr = new DoctorRepository();
    DoctorTableModel dtm = new DoctorTableModel();
    ConnectionRepository cr = new ConnectionRepository();
    AppointmentRepository ar = new AppointmentRepository();
    LoginRepository lr = new LoginRepository();

    /**
     * Creates new form DoctorListFrame
     */
    public DoctorListFrame() {
        initComponents();
    }

    public void loadTable() {
        try {
            List<Doctor> listByID = dr.findAll();
            dtm.addList(listByID);
            table.setModel(dtm);
            dtm.fireTableDataChanged();
        } catch (HealthException ex) {
            JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
        }
    }

    public void loadTableFromID(int id) {
        try {
            List<Doctor> list = dr.findAll();
            ArrayList<Doctor> listByID = new ArrayList<>();
            for (Doctor doctor : list) {
                if (doctor.getDoctorID() == id) {
                    listByID.add(doctor);
                }
            }
            if (listByID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Doctor with the given ID doesnt exist.");
                loadTable();
            }
            dtm.addList(listByID);
            table.setModel(dtm);
            dtm.fireTableDataChanged();
        } catch (HealthException ex) {
            JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        titleLabel3 = new javax.swing.JLabel();
        xButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        loadAllPatientsButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(842, 570));
        setMinimumSize(new java.awt.Dimension(842, 570));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(842, 570));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(240, 240, 240)));

        jPanel5.setBackground(new java.awt.Color(0, 168, 255));

        titleLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel3.setText(" Doctor List");

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
                .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID.", "First Name", "Last Name", "Date Of Birth", "Sex", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Search by ID:");

        searchButton.setBackground(new java.awt.Color(68, 189, 50));
        searchButton.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        loadAllPatientsButton.setBackground(new java.awt.Color(10, 189, 227));
        loadAllPatientsButton.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        loadAllPatientsButton.setForeground(new java.awt.Color(255, 255, 255));
        loadAllPatientsButton.setText("Load All Doctor");
        loadAllPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllPatientsButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(244, 66, 54));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(loadAllPatientsButton)
                        .addGap(39, 39, 39)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadAllPatientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchText.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Search Field is empty !");
            return;
        }
        try {
            loadTableFromID(Integer.parseInt(searchText.getText()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Only numbers are accepted !");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void loadAllPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllPatientsButtonActionPerformed
        loadTable();
        searchText.setText("");
    }//GEN-LAST:event_loadAllPatientsButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "Are you sure you want to delete this patient?", "Patient deletion",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                Doctor d = dtm.getDoctor(row);
                try {
                    checkForErrorsAtConnections(d);
                    checkForErrorsAtAppointments(d);
                    dr.delete(d);
                    checkForErrorsAtLogin(d);
                } catch (HealthException ex) {
                    JOptionPane.showMessageDialog(this, "Couldnt delete doctor, ERROR: " + ex.getMessage());
                    return;
                }
                loadTable();
            } else {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    public void checkForErrorsAtLogin(Doctor d) throws HealthException {
        List<Login> logins = lr.findAll();
        for (int j = 0; j < logins.size(); j++) {
            if (Objects.equals(logins.get(j).getLoginID(), d.getLoginID().getLoginID())) {
                lr.delete(logins.get(j));
            }
        }
    }

    public void checkForErrorsAtConnections(Doctor d) throws HealthException {
        List<Connection> connections = cr.findAll();
        for (int j = 0; j < connections.size(); j++) {
            if (Objects.equals(connections.get(j).getDoctorID().getDoctorID(), d.getDoctorID())) {
                cr.delete(connections.get(j));
            }
        }
    }

    //Metod qe se len ndatabaz me pas konflikt permes ID kur don me fshi ni pacient
    public void checkForErrorsAtAppointments(Doctor d) throws HealthException {
        List<Appointment> appointments = ar.findAll();
        for (int j = 0; j < appointments.size(); j++) {
            if (Objects.equals(appointments.get(j).getDoctorID().getDoctorID(), d.getDoctorID())) {
                ar.delete(appointments.get(j));
            }
        }
    }

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
            java.util.logging.Logger.getLogger(DoctorListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadAllPatientsButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JButton xButton;
    // End of variables declaration//GEN-END:variables
}
