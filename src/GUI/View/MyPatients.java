/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Appointment;
import BLL.Patient;
import DAL.AppointmentRepository;
import DAL.HealthException;
import DAL.PatientRepository;
import GUI.Model.MyPatientsTableModel;
    import GUI.Model.MyPatientsTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author bleer
 */
public class MyPatients extends javax.swing.JInternalFrame {

    PatientRepository prr = new PatientRepository();
    AppointmentRepository arr = new AppointmentRepository();
    MyPatientsTableModel ptm = new MyPatientsTableModel() ;
    private int Doctor_ID;

    public MyPatients() {
        initComponents();
        loadTable();
    }

    public void setDoctor_ID(int id) {
        this.Doctor_ID = id;
    }

    public int getDoctor_ID() {
        return this.Doctor_ID;
    }

//    private void tabelaSelectedIndexChange() {
//        final ListSelectionModel rowSM = table.getSelectionModel();
//        rowSM.addListSelectionListener(new ListSelectionListener() {
//            public void valueChanged(ListSelectionEvent Ise) {
//                if (Ise.getValueIsAdjusting()) {
//                    return;
//                }
//                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
//                int selectedIndex = rowSM.getAnchorSelectionIndex();
//                if (selectedIndex > -1) {
//                }
//            }
//        });
//    }
    public void loadTable() {
        try {
            List<Patient> patientList = prr.findAll();
            List<Appointment> appointmentList = arr.findAll();
            // E KOM KRIJU NI LIST T RE PER ME TA QIT LISTEN E APPOINTMENTS VEQ PER QAT PACIENT QE OSHT LOGGED IN
            ArrayList<Patient> listByID = new ArrayList<>();
            ArrayList<Appointment> appontmentsListByID = new ArrayList<>();
            for (Patient p : patientList) {
                for (Appointment appointment : appointmentList) {
                    if (appointment.getDoctorID().getDoctorID() == this.Doctor_ID && appointment.getPatientID().getPatientID() == p.getPatientID()) {
                        listByID.add(p);
                    }
                }
            }
            ptm.addList(listByID);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        } catch (HealthException ex) {
            JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Patients");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
