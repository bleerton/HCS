/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Appointment;
import BLL.Doctor;
import BLL.Patient;
import BLL.Request;
import DAL.AppointmentRepository;
import DAL.DoctorRepository;
import DAL.HealthException;
import DAL.PatientRepository;
import DAL.RequestRepository;
import GUI.Model.AppointmentTableModel;
import GUI.Model.RequestTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Enis
 */
public class PatientAppointments extends javax.swing.JInternalFrame {

    AppointmentRepository ar = new AppointmentRepository();
    AppointmentTableModel atm = new AppointmentTableModel();
    DoctorRepository dr = new DoctorRepository();
    RequestTableModel rtm = new RequestTableModel();
    RequestRepository rr = new RequestRepository();

    private int patientID_Table;

    //permes qesaj metode me mujt me marr ID e pacientit qe osht logged in te PatientWindow
    public void setPatientIDTable(int ptd) {
        this.patientID_Table = ptd;
    }

    public int getPatientIDTable() {
        return patientID_Table;
    }

    /**
     * Creates new form AppointmentsTableList
     */
    public PatientAppointments() {
        initComponents();
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
////                  EntityName en = entm.getEntityName(selectedIndex);
//                    Appointment p = atm.getAppointment(selectedIndex);
//
//                    doctorComboBox.setSelectedItem(p.getAppointmentID());
//                    doctorComboBox.repaint();
//
//                }
//            }
//        });
//    }

    public void loadTable() {
        try {
            List<Appointment> list = ar.findAll();
            // E KOM KRIJU NI LIST T RE PER ME TA QIT LISTEN E APPOINTMENTS VEQ PER QAT PACIENT QE OSHT LOGGED IN
            ArrayList<Appointment> listByID = new ArrayList<>();
            for (Appointment appointment : list) {
                if ((appointment.getPatientID().getPatientID()) == this.patientID_Table) {
                    listByID.add(appointment);
                }
            }
            atm.addList(listByID);
            table.setModel(atm);
            atm.fireTableDataChanged();
        } catch (HealthException ex) {
            JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
        }
    }

    public void loadTable2() {
        try {
            List<Request> list = rr.findAll();
            // E KOM KRIJU NI LIST T RE PER ME TA QIT LISTEN E APPOINTMENTS VEQ PER QAT PACIENT QE OSHT LOGGED IN
            ArrayList<Request> listByID = new ArrayList<>();
            for (Request request : list) {
                if ((request.getPatientID().getPatientID()) == this.patientID_Table && request.getStatus().equalsIgnoreCase("Pending")) {
                    listByID.add(request);
                }
            }
            rtm.addList(listByID);
            table2.setModel(rtm);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        HealthCarePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("HealthCarePU").createEntityManager();
        doctorQuery = java.beans.Beans.isDesignTime() ? null : HealthCarePUEntityManager.createQuery("SELECT d FROM Doctor d");
        doctorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : doctorQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        requestButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        doctorComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bottomTable = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        cancelRequestButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1079, 809));
        setMinimumSize(new java.awt.Dimension(1079, 809));
        setPreferredSize(new java.awt.Dimension(1079, 809));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        requestButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestButton.setText("Request an Appointment");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("My Appointments");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel Appointment");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, doctorList, doctorComboBox);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Choose My Doctor");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Confirmed Appointments");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrollPane.setBackground(new java.awt.Color(250, 250, 250));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "AppointmentID", "First Name", "Last Name", "Location", "Date", "Doctor", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        bottomTable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Requested Appointments");

        javax.swing.GroupLayout bottomTableLayout = new javax.swing.GroupLayout(bottomTable);
        bottomTable.setLayout(bottomTableLayout);
        bottomTableLayout.setHorizontalGroup(
            bottomTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomTableLayout.setVerticalGroup(
            bottomTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        scrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Requester Name", "Assigned To", "Requested in ", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(3).setResizable(false);
        }

        cancelRequestButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelRequestButton.setText("Cancel Request");
        cancelRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane)
            .addComponent(bottomTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bottomTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cancelRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Patient findPatientByID(int id) throws HealthException {
        PatientRepository pr = new PatientRepository();
        for (Patient patient : pr.findAll()) {
            if (patient.getPatientID() == id) {
                return patient;
            }
        }
        return null;
    }

    public Date getCurrentTime() throws ParseException {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String now = dateformat.format(calendar.getTime());
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(now);
    }


    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        try {
            List<Appointment> allAppointments = ar.findAll();

            Patient p = findPatientByID(this.patientID_Table);
            Request r = new Request();
            r.setDoctorID(((Doctor) doctorComboBox.getSelectedItem()));
            r.setDate(getCurrentTime());
            r.setPatientID(p);
            r.setStatus("Pending");
            for (Appointment app : allAppointments) {
                if ((app.getDoctorID().getDoctorID() == r.getDoctorID().getDoctorID()) && (app.getPatientID().getPatientID() == r.getPatientID().getPatientID())) {
                    JOptionPane.showMessageDialog(this, "Can t create a new request while u have an appointment with this ID");
                    return;
                }
            }
            if (!Request.exists(r)) {
                rr.create(r);
            } else {
                JOptionPane.showMessageDialog(this, "U already requested to this doctor !");
                return;
            }
            JOptionPane.showMessageDialog(this, "You ve sent a request to the doctor!");
        } catch (HealthException ex) {
            Logger.getLogger(PatientAppointments.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PatientAppointments.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable2();
    }//GEN-LAST:event_requestButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "Are you sure you want to cancel?", "Appointment Cancel",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                Appointment p = atm.getAppointment(row);
                try {
                    ar.delete(p);
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

    private void cancelRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRequestButtonActionPerformed
        int row = table2.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "Are you sure you want to cancel the request?", "Request Cancel",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                Request r = rtm.getRequest(row);
                try {
                    rr.delete(r);
                } catch (HealthException ex) {
                    JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
                }
                loadTable2();
            } else {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_cancelRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager HealthCarePUEntityManager;
    private javax.swing.JPanel bottomTable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelRequestButton;
    private javax.swing.JComboBox<String> doctorComboBox;
    private java.util.List<BLL.Doctor> doctorList;
    private javax.persistence.Query doctorQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton requestButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
