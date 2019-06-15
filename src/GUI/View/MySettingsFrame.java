/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Doctor;
import BLL.Patient;
import DAL.DoctorRepository;
import DAL.HealthException;
import DAL.PatientRepository;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Enis
 */
public class MySettingsFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MySettingsFrame
     */
    public MySettingsFrame() {
        initComponents();
    }

    private int patientID_Table;

    public void setPatientIDTable(int ptd) {
        this.patientID_Table = ptd;
    }

    public int getPatientIDTable() {
        return patientID_Table;
    }

    private int doctor_ID_Profile;

    public int getDoctorIDTable(int dtd) {
        return doctor_ID_Profile = dtd;
    }

    public void setDoctorIDProfile(int doctorID) {
        this.doctor_ID_Profile = doctorID;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneNrLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        editNameLabel = new javax.swing.JLabel();
        editEmailAddressLabel = new javax.swing.JLabel();
        editPhoneNrLabel = new javax.swing.JLabel();
        editSexLabel = new javax.swing.JLabel();
        editAddressLabel = new javax.swing.JLabel();
        editPasswordLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setClosable(true);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(842, 548));
        setMinimumSize(new java.awt.Dimension(842, 548));
        setPreferredSize(new java.awt.Dimension(842, 548));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(15544, 454545));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(0, 168, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" General Account Settings");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/patient.png"))); // NOI18N

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText(" Name:");
        jLabel3.setOpaque(true);

        nameLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        nameLabel.setText("Enis Krasniqi");
        nameLabel.setOpaque(true);

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText(" Email Address:");
        jLabel5.setOpaque(true);

        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        emailLabel.setText("eniskraasniqi@gmail.com");
        emailLabel.setOpaque(true);

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText(" Phone Nr. :");
        jLabel7.setOpaque(true);

        phoneNrLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        phoneNrLabel.setText("+38343734831");
        phoneNrLabel.setOpaque(true);

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText(" Sex :");
        jLabel9.setOpaque(true);

        sexLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        sexLabel.setText("Male");
        sexLabel.setOpaque(true);

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText(" Address :");
        jLabel11.setOpaque(true);

        AddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        AddressLabel.setText("Fushe Kosove");
        AddressLabel.setOpaque(true);

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText(" Password");
        jLabel13.setOpaque(true);

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordLabel.setText("************");
        passwordLabel.setOpaque(true);

        editNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editNameLabel.setForeground(new java.awt.Color(25, 42, 86));
        editNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editNameLabel.setText("Edit");
        editNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editNameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editNameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editNameLabelMouseExited(evt);
            }
        });

        editEmailAddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editEmailAddressLabel.setForeground(new java.awt.Color(25, 42, 86));
        editEmailAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editEmailAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editEmailAddressLabel.setText("Edit");
        editEmailAddressLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editEmailAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editEmailAddressLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editEmailAddressLabelMouseExited(evt);
            }
        });

        editPhoneNrLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editPhoneNrLabel.setForeground(new java.awt.Color(25, 42, 86));
        editPhoneNrLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editPhoneNrLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editPhoneNrLabel.setText("Edit");
        editPhoneNrLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editPhoneNrLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPhoneNrLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPhoneNrLabelMouseExited(evt);
            }
        });

        editSexLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editSexLabel.setForeground(new java.awt.Color(25, 42, 86));
        editSexLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editSexLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editSexLabel.setText("Edit");
        editSexLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSexLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editSexLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editSexLabelMouseExited(evt);
            }
        });

        editAddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editAddressLabel.setForeground(new java.awt.Color(25, 42, 86));
        editAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editAddressLabel.setText("Edit");
        editAddressLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editAddressLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editAddressLabelMouseExited(evt);
            }
        });

        editPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        editPasswordLabel.setForeground(new java.awt.Color(25, 42, 86));
        editPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editPasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/pencil.png"))); // NOI18N
        editPasswordLabel.setText("Edit");
        editPasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPasswordLabelMouseExited(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/ConfirmButton.png"))); // NOI18N
        updateButton.setText("   Update");
        updateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/confirmButton.png"))); // NOI18N
        updateButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/confirmButton.png"))); // NOI18N
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/cancelButton.png"))); // NOI18N
        cancelButton.setText("   Cancel");
        cancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/cancelButtonHover.png"))); // NOI18N
        cancelButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/cancelButtonHover.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(619, 619, 619))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(529, 529, 529))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(editNameLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editAddressLabel)
                                    .addComponent(editEmailAddressLabel)
                                    .addComponent(editPhoneNrLabel)
                                    .addComponent(editSexLabel)
                                    .addComponent(editPasswordLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmailAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editPhoneNrLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAddressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadLabelsForPatient() {
        try {
            Patient p = new PatientRepository().findByID(this.patientID_Table);
            nameLabel.setText(p.getFirstName() + " " + p.getLastName());
            emailLabel.setText(p.getEmail());
            phoneNrLabel.setText(p.getPhoneNumber());
            sexLabel.setText(p.getSex());
            AddressLabel.setText(p.getAddress());
        } catch (HealthException ex) {
            Logger.getLogger(MySettingsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadLabelsForDoctor() {
        try {
            Doctor p = new DoctorRepository().findByID(this.doctor_ID_Profile);
            nameLabel.setText(p.getFirstName() + " " + p.getLastName());
            emailLabel.setText(p.getEmail());
            phoneNrLabel.setText(p.getPhoneNumber());
            sexLabel.setText(p.getSex());
            AddressLabel.setText(p.getAddress());
        } catch (HealthException ex) {
            Logger.getLogger(MySettingsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void editNameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameLabelMouseEntered
        Font font = editNameLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editNameLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editNameLabelMouseEntered

    private void editNameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNameLabelMouseExited
        editNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editNameLabelMouseExited

    private void editEmailAddressLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailAddressLabelMouseEntered
        Font font = editEmailAddressLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editEmailAddressLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editEmailAddressLabelMouseEntered

    private void editEmailAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailAddressLabelMouseExited
        editEmailAddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editEmailAddressLabelMouseExited

    private void editPhoneNrLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhoneNrLabelMouseEntered
        Font font = editPhoneNrLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editPhoneNrLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editPhoneNrLabelMouseEntered

    private void editPhoneNrLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhoneNrLabelMouseExited
        editPhoneNrLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editPhoneNrLabelMouseExited

    private void editSexLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSexLabelMouseEntered
        Font font = editSexLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editSexLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editSexLabelMouseEntered

    private void editSexLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSexLabelMouseExited
        editSexLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editSexLabelMouseExited

    private void editAddressLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressLabelMouseEntered
        Font font = editAddressLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editAddressLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editAddressLabelMouseEntered

    private void editAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressLabelMouseExited
        editAddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editAddressLabelMouseExited

    private void editPasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPasswordLabelMouseEntered
        Font font = editPasswordLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        editPasswordLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_editPasswordLabelMouseEntered

    private void editPasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPasswordLabelMouseExited
        editPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }//GEN-LAST:event_editPasswordLabelMouseExited

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        EntityManager em = Persistence.createEntityManagerFactory("HealthCarePU").createEntityManager();
        Patient p = new Patient();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();

    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel editAddressLabel;
    private javax.swing.JLabel editEmailAddressLabel;
    private javax.swing.JLabel editNameLabel;
    private javax.swing.JLabel editPasswordLabel;
    private javax.swing.JLabel editPhoneNrLabel;
    private javax.swing.JLabel editSexLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneNrLabel;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}