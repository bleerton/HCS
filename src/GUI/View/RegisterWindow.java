/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Login;
import BLL.Patient;
import DAL.HealthException;
import DAL.LoginRepository;
import DAL.PatientRepository;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Enis
 */
public class RegisterWindow extends javax.swing.JFrame {

    PatientRepository pr = new PatientRepository();
    LoginRepository lr = new LoginRepository();

    /**
     * Creates new form RegisterWindow
     */
    public RegisterWindow() {
        initComponents();
        setVisible(true);
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
        loginFormLabel = new javax.swing.JLabel();
        xButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        dateOfBirthLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        addressLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        repeatedPasswordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        repeatedPasswordText = new javax.swing.JPasswordField();
        dateChooser = new datechooser.beans.DateChooserCombo();
        parentNameText = new javax.swing.JTextField();
        firstNameLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 168, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        loginFormLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        loginFormLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginFormLabel.setText("Register Window");

        xButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/xButtonBlue.png"))); // NOI18N
        xButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/xHoverButton.png"))); // NOI18N
        xButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/xHoverButton.png"))); // NOI18N
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/minusButtonBlue.png"))); // NOI18N
        minusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minusButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/minusHoverButton.png"))); // NOI18N
        minusButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/minusHoverButton.png"))); // NOI18N
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginFormLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginFormLabel)
                .addGap(429, 429, 429))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(223, 230, 233));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 168, 255)));

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameLabel.setText("First Name:");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameLabel.setText("Last Name:");

        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        lastNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameLabel.setText("Username :");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        dateOfBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateOfBirthLabel.setText("Date of Birth:");

        sexLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexLabel.setText("Sex :");

        maleButton.setBackground(new java.awt.Color(223, 230, 233));
        maleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setBackground(new java.awt.Color(223, 230, 233));
        femaleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        femaleButton.setText("Female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLabel.setText("Address :");

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNumberLabel.setText("Phone NR. :");

        addressText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setText("Password  :");

        repeatedPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        repeatedPasswordLabel.setText("Repeat :");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setText("Email :");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(46, 134, 222));
        registerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(232, 65, 24));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        repeatedPasswordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        parentNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        parentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentNameTextActionPerformed(evt);
            }
        });

        firstNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameLabel1.setText("Parent Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameText))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(repeatedPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(repeatedPasswordText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailText)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstNameLabel1)
                                .addGap(11, 11, 11)
                                .addComponent(parentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatedPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repeatedPasswordLabel))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfBirthLabel)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(maleButton)
                    .addComponent(femaleButton))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        femaleButton.setSelected(false);
    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        maleButton.setSelected(false);
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    public String turnPasswordFieldToString(JPasswordField passwordField) {
        char[] chars = passwordField.getPassword();
        String a = "";
        for (int i = 0; i < chars.length; i++) {
            a += "" + chars[i];
        }
        return a;
    }

    // me nda kodin masi pom vyn 2 her qikjop metod 
    public boolean annyIsEmpty() {
        if (usernameText.getText().trim().isEmpty() || firstNameText.getText().trim().isEmpty() || lastNameText.getText().trim().isEmpty() || passwordText.getPassword().equals("") || emailText.getText().trim().isEmpty()
                || repeatedPasswordText.getPassword().equals("") || addressText.getText().trim().isEmpty() || phoneNumberText.getText().trim().isEmpty() || parentNameText.getText().trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public Date setTime(Calendar c) throws ParseException {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String now = dateformat.format(c.getTime());
        return new SimpleDateFormat("yyyy-MM-dd").parse(now);
    }


    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String gender = null;
        if (annyIsEmpty()) {
//            new SystemMessage("Fill all the fields !");
        } else if (!turnPasswordFieldToString(passwordText).equalsIgnoreCase(turnPasswordFieldToString(repeatedPasswordText))) {
            JOptionPane.showMessageDialog(this, "Passwords dont match !");
            passwordText.setText("");
            repeatedPasswordText.setText("");
        } else {
//            String gender = maleButton.isSelected() ? "Male" : "Female";

            if (maleButton.isSelected()) {
                gender = "Male";
            } else if (femaleButton.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Gender is not selected");
            }
        }

        Patient patient = new Patient();
        Login login = new Login();

        ////Krijimi i pacientit n databaze
        patient.setUsername(usernameText.getText());
        patient.setFirstName(firstNameText.getText());
        patient.setLastName(lastNameText.getText());
        patient.setPassword(new String(passwordText.getPassword()));
        try {
            patient.setDateOfBirth(setTime(dateChooser.getCurrent()));
        } catch (ParseException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        patient.setPhoneNumber(phoneNumberText.getText());
        patient.setEmail(emailText.getText());
        patient.setAddress(addressText.getText());
        patient.setSex(gender);
        patient.setParentName(parentNameText.getText());

        try {
            login.setUsername(usernameText.getText());
            login.setPassword(new String(passwordText.getPassword()));
            login.setRoli(3);
            lr.create(login);
            patient.setLoginId(login);
        } catch (HealthException ex) {
            Logger.getLogger(RegisterWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            pr.create(patient);
            if (!annyIsEmpty()) {
                this.dispose();
                JOptionPane.showMessageDialog(this, "You ve registered succesfully!");
            }

        } catch (HealthException e) {
            e.printStackTrace();
        }
//        try {
//            if (patientExists(one)) {
//                new SystemMessage("This account is already registered");
//                this.dispose();
//                return;
//            } else if (annyIsEmpty()) {
//                new SystemMessage("Cant create a user with empty fields!");
//                return;
//            }
//{
//                pr.create(one);
//            }
//        } catch (HealthException e) {
//            e.printStackTrace();
//        }
//
//        ///Krijimi i loginit sipas pacientit ne databaze,, i kom kriju dy tries qe me mujt me ja marr ID e pacientit kur te krijoj Loginin me qat ID
//        two.setUsername(usernameText.getText());
//        two.setLoginID(one.getPatientID());
//        two.setPassword(new String(passwordText.getPassword()));
//        two.setRoli(3);
//        try {
//            if (loginExists(two)) {
//                new SystemMessage("This account is already registered");
//                this.dispose();
//                return;
//            } else {
//                lr.create(two);
//            }
//        } catch (HealthException e) {
//            e.printStackTrace();
//        }
//        if (!annyIsEmpty()) {
//            this.dispose();
//            new SystemMessage("You have been registered succesfully");
//        }

    }//GEN-LAST:event_registerButtonActionPerformed

    public boolean patientExists(Patient a) throws HealthException {
        List<Patient> lista = pr.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(a)) {   //// Metoden equals te pacienti edhe logini e kom ndryshu per shkak databazes qe me mujt mi krahasu jo permes ID se databaza osht keq
                return true;
            }
        }
        return false;
    }

    public boolean loginExists(Login a) throws HealthException {
        List<Login> lista = lr.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(a)) {
                return true;
            }
        }
        return false;
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_xButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void parentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentNameTextActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton cancelButton;
    private datechooser.beans.DateChooserCombo dateChooser;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel loginFormLabel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JTextField parentNameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel repeatedPasswordLabel;
    private javax.swing.JPasswordField repeatedPasswordText;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JButton xButton;
    // End of variables declaration//GEN-END:variables
}
