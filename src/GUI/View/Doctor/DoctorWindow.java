/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Doctor;

import GUI.View.Doctor.TodayFrame;
import GUI.View.Doctor.DoctorReportForm;
import GUI.View.Doctor.MyPatientsFrame;
import GUI.View.Doctor.SchedulerFrame;
import BLL.Doctor;
import DAL.DoctorRepository;
import DAL.HealthException;
import GUI.View.General.MySettingsFrame;
import GUI.View.General.StartingPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Enis
 */
public class DoctorWindow extends javax.swing.JFrame {

    public void loadLabels(String name, String username, String address, Date date, String email, String phoneNr) throws HealthException {
        if (name.trim().isEmpty() || username.trim().isEmpty() || address.trim().isEmpty() || date == null || email.trim().isEmpty() || phoneNr.trim().isEmpty()) {
            throw new HealthException("Missing statements");
        } else {
            nameLabel.setText(name);
            usernameLabel1.setText(username);
            DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String formatedDate = dateformat.format(date);
            dateOfBirthLabel.setText(formatedDate);
            emailLabel.setText(email);
            addressLabel.setText(address);
            phoneNumberLabel.setText(phoneNr);
        }

    }
    
    /**
     * Creates new form DoctorWindow1
     */
    public DoctorWindow() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void changeProfileLabel(String firstname) {
        if (!firstname.trim().isEmpty()) {
            nameLabel.setText(firstname + " ");
        }
    }
    // permes qetij atributi dihet kush osht logged in per momentin, per me pa ku inicializohet shko te loggini edhe e sheh sa her t inicializohet doctorwindow e ka metoden aty setDrID.
    private int doctor_ID_Profile;

    public void setDoctorIDProfile(int doctorID) {
        this.doctor_ID_Profile = doctorID;
    }
    
    public Doctor findDoctorByID(int id) throws HealthException {
        DoctorRepository pr = new DoctorRepository();
        List<Doctor> list = pr.findAll();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getDoctorID() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    
    //mos me lon me shume se nje jinternalframe n screen
    public void terminateFrames() {
        JInternalFrame[] allFrames = desktoPane.getAllFrames();
        for (int i = 0; i < allFrames.length; i++) {
            allFrames[i].dispose();
            desktoPane.remove(allFrames[i]);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuBar = new javax.swing.JPanel();
        todayButton = new javax.swing.JButton();
        requestButton = new javax.swing.JButton();
        newReportButton = new javax.swing.JButton();
        myPatientsButton = new javax.swing.JButton();
        schedulerButton = new javax.swing.JButton();
        usernamePanel1 = new javax.swing.JPanel();
        usernameLabel1 = new javax.swing.JLabel();
        userSettings = new javax.swing.JButton();
        profileInfoPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ddddd = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        labelb = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Background/123.jpg"));
        Image image = icon.getImage();
        desktoPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1411, 830));
        setSize(new java.awt.Dimension(1422, 830));

        sideMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        sideMenuBar.setMaximumSize(new java.awt.Dimension(135, 809));
        sideMenuBar.setMinimumSize(new java.awt.Dimension(135, 809));

        todayButton.setBackground(new java.awt.Color(255, 255, 255));
        todayButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        todayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/MenuButton.png"))); // NOI18N
        todayButton.setText("      Today");
        todayButton.setBorder(null);
        todayButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        todayButton.setPreferredSize(new java.awt.Dimension(47, 15));
        todayButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/MenuHover.png"))); // NOI18N
        todayButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/MenuClicked.png"))); // NOI18N
        todayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayButtonActionPerformed(evt);
            }
        });

        requestButton.setBackground(new java.awt.Color(255, 255, 255));
        requestButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        requestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/requestsButton.png"))); // NOI18N
        requestButton.setText("      Requests");
        requestButton.setBorder(null);
        requestButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        requestButton.setPreferredSize(new java.awt.Dimension(47, 15));
        requestButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/requestedHoverButton.png"))); // NOI18N
        requestButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/requestButton.png"))); // NOI18N
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        newReportButton.setBackground(new java.awt.Color(255, 255, 255));
        newReportButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/NewReportButton.png"))); // NOI18N
        newReportButton.setText("         New Report");
        newReportButton.setBorder(null);
        newReportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newReportButton.setPreferredSize(new java.awt.Dimension(47, 15));
        newReportButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/NewReportHover.png"))); // NOI18N
        newReportButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/NewReportClicked.png"))); // NOI18N
        newReportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newReportButtonMouseClicked(evt);
            }
        });
        newReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReportButtonActionPerformed(evt);
            }
        });

        myPatientsButton.setBackground(new java.awt.Color(255, 255, 255));
        myPatientsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myPatientsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/MyPattientsButton.png"))); // NOI18N
        myPatientsButton.setText("         My Patients");
        myPatientsButton.setBorder(null);
        myPatientsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myPatientsButton.setPreferredSize(new java.awt.Dimension(47, 15));
        myPatientsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/MyPatientsHover.png"))); // NOI18N
        myPatientsButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/MyPatientsClicked.png"))); // NOI18N
        myPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myPatientsButtonActionPerformed(evt);
            }
        });

        schedulerButton.setBackground(new java.awt.Color(255, 255, 255));
        schedulerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        schedulerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/scheduleButton.png"))); // NOI18N
        schedulerButton.setText("      Scheduler");
        schedulerButton.setBorder(null);
        schedulerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        schedulerButton.setPreferredSize(new java.awt.Dimension(47, 15));
        schedulerButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/schedulerHover.png"))); // NOI18N
        schedulerButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/schedulerButton.png"))); // NOI18N
        schedulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMenuBarLayout = new javax.swing.GroupLayout(sideMenuBar);
        sideMenuBar.setLayout(sideMenuBarLayout);
        sideMenuBarLayout.setHorizontalGroup(
            sideMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(newReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(myPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(schedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sideMenuBarLayout.setVerticalGroup(
            sideMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuBarLayout.createSequentialGroup()
                .addComponent(todayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(newReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(myPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(schedulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 564, Short.MAX_VALUE))
        );

        usernamePanel1.setBackground(new java.awt.Color(250, 250, 250));
        usernamePanel1.setMaximumSize(new java.awt.Dimension(208, 57));

        usernameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/doctor.png"))); // NOI18N
        usernameLabel1.setText("FILAN FILANI");
        usernameLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameLabel1MouseEntered(evt);
            }
        });

        userSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/logginButton.png"))); // NOI18N
        userSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userSettings.setMaximumSize(new java.awt.Dimension(44, 32));
        userSettings.setMinimumSize(new java.awt.Dimension(44, 32));
        userSettings.setPreferredSize(new java.awt.Dimension(44, 32));
        userSettings.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/logginButton.png"))); // NOI18N
        userSettings.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/login2.png"))); // NOI18N
        userSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usernamePanel1Layout = new javax.swing.GroupLayout(usernamePanel1);
        usernamePanel1.setLayout(usernamePanel1Layout);
        usernamePanel1Layout.setHorizontalGroup(
            usernamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanel1Layout.createSequentialGroup()
                .addComponent(usernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usernamePanel1Layout.setVerticalGroup(
            usernamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(usernamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        profileInfoPanel.setBackground(new java.awt.Color(250, 250, 250));
        profileInfoPanel.setMaximumSize(new java.awt.Dimension(208, 746));
        profileInfoPanel.setMinimumSize(new java.awt.Dimension(208, 746));
        profileInfoPanel.setPreferredSize(new java.awt.Dimension(208, 746));

        logoutButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/shutdown.png"))); // NOI18N
        logoutButton.setText(" Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" Name:");
        jLabel1.setOpaque(true);

        nameLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nameLabel.setText("Boss Bossi");

        jLabel1.setBackground(Color.LIGHT_GRAY);
        ddddd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ddddd.setText(" Date of Birth:");
        ddddd.setOpaque(true);

        dateOfBirthLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dateOfBirthLabel.setText("03.06.1999");

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText(" Address:");
        jLabel5.setOpaque(true);

        addressLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        addressLabel.setText("Fushe Kosove");

        jLabel1.setBackground(Color.LIGHT_GRAY);
        labelb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelb.setText(" Email:");
        labelb.setOpaque(true);

        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        emailLabel.setText("eniskraasniqi@gmail.com");

        jLabel1.setBackground(Color.LIGHT_GRAY);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Phone Number:");
        jLabel2.setOpaque(true);

        phoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        phoneNumberLabel.setText("083-353-985");

        javax.swing.GroupLayout profileInfoPanelLayout = new javax.swing.GroupLayout(profileInfoPanel);
        profileInfoPanel.setLayout(profileInfoPanelLayout);
        profileInfoPanelLayout.setHorizontalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ddddd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profileInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        profileInfoPanelLayout.setVerticalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInfoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ddddd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setMaximumSize(new java.awt.Dimension(1079, 809));
        jPanel1.setMinimumSize(new java.awt.Dimension(1079, 809));

        desktoPane.setMaximumSize(new java.awt.Dimension(1079, 809));
        desktoPane.setMinimumSize(new java.awt.Dimension(1079, 809));

        javax.swing.GroupLayout desktoPaneLayout = new javax.swing.GroupLayout(desktoPane);
        desktoPane.setLayout(desktoPaneLayout);
        desktoPaneLayout.setHorizontalGroup(
            desktoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        desktoPaneLayout.setVerticalGroup(
            desktoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("View");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setText("Window");
        menuBar.add(jMenu1);

        jMenu2.setText("Help");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernamePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usernamePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(profileInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayButtonActionPerformed
        TodayFrame t = new TodayFrame();
        terminateFrames();                                                                           ///Renditjen sbon me prish 
        t.setDoctorIDTable(this.doctor_ID_Profile);
        desktoPane.add(t);
        t.loadTable();
        t.show();
    }//GEN-LAST:event_todayButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
       DoctorAppointments d = new DoctorAppointments();
        terminateFrames();
        d.setDoctorIDTable(this.doctor_ID_Profile);                                                                           ///Renditjen sbon me prish 
        desktoPane.add(d);
        d.loadTable();
        d.show();
    }//GEN-LAST:event_requestButtonActionPerformed

    private void newReportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newReportButtonMouseClicked
        DoctorReportForm d = new DoctorReportForm();
        d.setDoctorIDTable(this.doctor_ID_Profile);
        terminateFrames();
        desktoPane.add(d);
        d.loadComboBox();
        try {                                                                           ///Renditjen sbon me prish 
            d.loadLabels();
        } catch (HealthException ex) {
            return;
        }
        d.show();
    }//GEN-LAST:event_newReportButtonMouseClicked

    private void newReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newReportButtonActionPerformed

    private void myPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myPatientsButtonActionPerformed
       MyPatientsFrame a = new MyPatientsFrame();
            terminateFrames();
            a.setDoctorIDTable(this.doctor_ID_Profile);                                                                           ///Renditjen sbon me prish 
            desktoPane.add(a);
            a.show();
            a.loadTable();
    }//GEN-LAST:event_myPatientsButtonActionPerformed

    private void schedulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedulerButtonActionPerformed
      SchedulerFrame d = new SchedulerFrame();
        terminateFrames();                                                                           ///Renditjen sbon me prish 
        desktoPane.add(d);
        d.show();
    }//GEN-LAST:event_schedulerButtonActionPerformed

    private void usernameLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameLabel1MouseEntered

    }//GEN-LAST:event_usernameLabel1MouseEntered

    private void userSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSettingsActionPerformed
            MySettingsFrame ms = new MySettingsFrame();
        ms.setDoctorIDProfile(this.doctor_ID_Profile);
                terminateFrames();
        desktoPane.add(ms);
        ms.loadLabelsForDoctor();
        putJInternalFrameInCenter(ms);
        ms.show();
    }//GEN-LAST:event_userSettingsActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        new StartingPage().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

     public void putJInternalFrameInCenter(JInternalFrame ms){
        Dimension desktopSize = desktoPane.getSize();
        Dimension jInternalFrameSize = ms.getSize();
        ms.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
//            java.util.logging.Logger.getLogger(DoctorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
////        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new DoctorWindow().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JLabel ddddd;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktoPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelb;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton myPatientsButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newReportButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JPanel profileInfoPanel;
    private javax.swing.JButton requestButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton schedulerButton;
    private javax.swing.JPanel sideMenuBar;
    private javax.swing.JButton todayButton;
    private javax.swing.JButton userSettings;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JPanel usernamePanel1;
    // End of variables declaration//GEN-END:variables
}
