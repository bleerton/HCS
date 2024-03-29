/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Patient;

import BLL.Appointment;
import DAL.AppointmentRepository;
import DAL.HealthException;
import GUI.Model.AppointmentTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Enis
 */
public class TodayFramePatient extends javax.swing.JInternalFrame {

    AppointmentTableModel atm = new AppointmentTableModel();
    AppointmentRepository ar = new AppointmentRepository();

    private int patientID_Table;

    //permes qesaj metode me mujt me marr ID e pacientit qe osht logged in te PatientWindow
    public void setPatientIDTable(int ptd) {
        this.patientID_Table = ptd;
    }

    public int getPatientIDTable() {
        return patientID_Table;
    }

    /**
     * Creates new form TodayFramePatient
     */
    public TodayFramePatient() {
        initComponents();
    }

    public boolean checkIfAppointmentIsToday(Appointment a) {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String s = dateformat.format(calendar.getTime());
        String b = dateformat.format(a.getDateTime());
        if (s.equalsIgnoreCase(b)) {
            System.out.println("Enisi so gay !");
            return true;
        }
        return false;
    }

    public void loadTable() {
        try {
            List<Appointment> list = ar.findAll();
            // E KOM KRIJU NI LIST T RE PER ME TA QIT LISTEN E APPOINTMENTS VEQ PER QAT PACIENT QE OSHT LOGGED IN
            ArrayList<Appointment> listByID = new ArrayList<>();
            Appointment mainAppointment = findEarliestAppointment();

            String name = mainAppointment.getPatientID().toString();
            String date = mainAppointment.getDateTime().toString();
            String location = mainAppointment.getLocation();
            fillLabels(name, date, location);

            for (Appointment appointments : list) {
                if (appointments.getPatientID().getPatientID() == this.patientID_Table && checkIfAppointmentIsToday(appointments)) {
                    listByID.add(appointments);
                }
            }
            atm.addList(listByID);
            table.setModel(atm);
            atm.fireTableDataChanged();
        } catch (HealthException ex) {
            JOptionPane.showMessageDialog(this, "Info:" + ex.getMessage());
        }
    }

    public Appointment findEarliestAppointment() throws HealthException {
        List<Appointment> list = ar.findAll();
        Appointment earliest = null;
        for (Appointment appointment : list) {
            if (appointment.getPatientID().getPatientID() == this.patientID_Table) {
                for (Appointment appointment1 : list) {
                    if (appointment1.getPatientID().getPatientID() == this.patientID_Table) {
                        if (earliest == null || appointment1.getDateTime().compareTo(earliest.getDateTime()) < 0) {
                            earliest = appointment1;
                        }
                    }
                }
            }
        }
        if (earliest == null) {
            JOptionPane.showMessageDialog(this, "No Appointment found !");
        }
        return earliest;
    }

    public void fillLabels(String name, String date, String location) {
        nameText.setText(name);
        locationText.setText(location);
        dateText.setText(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        nextAppointmentLabel = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locationText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        todayAppointmentsLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1079, 809));
        setMinimumSize(new java.awt.Dimension(1079, 809));
        setPreferredSize(new java.awt.Dimension(1079, 809));

        headerPanel.setBackground(new java.awt.Color(53, 120, 229));

        nextAppointmentLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nextAppointmentLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextAppointmentLabel.setText("Today's Appointments");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nextAppointmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextAppointmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profilePanel.setBackground(new java.awt.Color(250, 250, 250));
        profilePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/user-avatar-main-picture.png"))); // NOI18N

        nameText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameText.setText("Name Surname");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Location:");

        locationText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        locationText.setText("Place");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Date:");

        dateText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateText.setText("timezone");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        scrollPane.setMaximumSize(new java.awt.Dimension(452, 402));
        scrollPane.setMinimumSize(new java.awt.Dimension(452, 402));

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
        scrollPane.setViewportView(table);

        todayAppointmentsLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        todayAppointmentsLabel.setText("Today's Appointments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todayAppointmentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(todayAppointmentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel locationText;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel nextAppointmentLabel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JLabel todayAppointmentsLabel;
    // End of variables declaration//GEN-END:variables
}
