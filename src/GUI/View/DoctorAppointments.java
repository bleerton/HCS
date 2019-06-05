/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Appointment;
import BLL.Request;
import DAL.AppointmentRepository;
import DAL.HealthException;
import DAL.RequestRepository;
import GUI.Model.AppointmentTableModel;
import GUI.Model.RequestTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Enis
 */
public class DoctorAppointments extends javax.swing.JInternalFrame {

    RequestTableModel rtm = new RequestTableModel();
    RequestRepository rr = new RequestRepository();
    AppointmentRepository ar = new AppointmentRepository();
    /**
     * Creates new form DoctorAppointmentsTableList
     */
    private int doctorID_Table;

    public void setDoctorIDTable(int ptd) {
        this.doctorID_Table = ptd;
    }

    public int getDoctorIDTable() {
        return doctorID_Table;
    }

    public DoctorAppointments() {
        initComponents();
    }

    public void loadTable() {
        try {
            List<Request> list = rr.findAll();
            ArrayList<Request> listByID = new ArrayList<>();
            for (Request request : list) {
                if (request.getStatus().equals("Pending") && request.getDoctorID().getDoctorID() == doctorID_Table) {
                    listByID.add(request);
                }
            }
            rtm.addList(listByID);
            table.setModel(rtm);
            rtm.fireTableDataChanged();
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
        confirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1079, 809));
        setMinimumSize(new java.awt.Dimension(1079, 809));
        setPreferredSize(new java.awt.Dimension(1079, 809));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmButton.setText("Confirm Request");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Requested Appointments");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel Request");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        scrollPane.setBackground(new java.awt.Color(250, 250, 250));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Requester Name", "Assigned To", "DueBy", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public Date turnDate(String d){
//        System.out.println(d);
//        Date date1 = null;
//        try { 
//            date1=new SimpleDateFormat("yyyy/MM/dd").parse(d);
//        } catch (ParseException ex) {
//            Logger.getLogger(AppointmentTableModel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return date1;
//    }
    
    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "You didnt select any Request");
        } else {
            Request r = rtm.getRequest(row);
            r.setStatus("Confirmed");
            try {
                rr.edit(r);
                Appointment app = new Appointment();
                app.setFirstNameOfPatient(r.getPatientID().getFirstName());
                app.setLastNameOfPatient(r.getPatientID().getLastName());
                app.setPatientID(r.getPatientID());
                app.setStatus("Confirmed");
                app.setDoctorID(r.getDoctorID());

                app.setDateTime();  /// qitu duhet me qit prej ni textfield datetime
                
                app.setNote("BLertoni is gay");
                app.setLocation("nisi is hoeeeeeeeeeee");

                if (!Appointment.exist(app)) {
                    ar.create(app);
                    rr.delete(r);
                    JOptionPane.showMessageDialog(this, "New Appointment Created");
                } else {
                    JOptionPane.showMessageDialog(this, "U already created an appointment with this ID");
                    rr.delete(r);
                    loadTable();
                    return;
                }
            } catch (HealthException ex) {
                JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
            }
        }
        loadTable();

    }//GEN-LAST:event_confirmButtonActionPerformed


    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "Are you sure you want to cancel?", "Request Cancel",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                Request r = rtm.getRequest(row);
                try {
                    rr.delete(r);
                } catch (HealthException ex) {
                    JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
                }
                loadTable();
            } else {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
