/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Patient;
import DAL.HealthException;
import DAL.PatientRepository;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;

/**
 *
 * @author Enis
 */
public class PatientWindow extends javax.swing.JFrame {

    public void changeProfileLabel(String firstname) {
        if (!firstname.trim().isEmpty()) {
            nameLabel.setText(firstname + " ");
        }
    }
    //Atribut qe me rujt ID e profilit qe osht LOGGED-IN per momentin
    private int patient_ID_Profile;
    
    public void setPatientIDProfile(int patientID){
        this.patient_ID_Profile = patientID;
    }

    /**
     * Creates new form PatientWindow
     */
    public PatientWindow() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuBar = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        favouriteButton = new javax.swing.JButton();
        appointmentsButton = new javax.swing.JButton();
        myPatients = new javax.swing.JButton();
        documentButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Background/123.jpg"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }
        };
        profilePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        profileInfoPanel = new javax.swing.JPanel();
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

        sideMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        sideMenuBar.setMaximumSize(new java.awt.Dimension(135, 809));
        sideMenuBar.setMinimumSize(new java.awt.Dimension(135, 809));

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/MenuButton.png"))); // NOI18N
        menuButton.setText("Menu");
        menuButton.setBorder(null);
        menuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButton.setPreferredSize(new java.awt.Dimension(47, 15));
        menuButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/MenuHover.png"))); // NOI18N
        menuButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/MenuClicked.png"))); // NOI18N
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        favouriteButton.setBackground(new java.awt.Color(255, 255, 255));
        favouriteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        favouriteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/FavouriteButton.png"))); // NOI18N
        favouriteButton.setText("       Favourites");
        favouriteButton.setBorder(null);
        favouriteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        favouriteButton.setPreferredSize(new java.awt.Dimension(47, 15));
        favouriteButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/FavouriteHover.png"))); // NOI18N
        favouriteButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/FavouriteClicked.png"))); // NOI18N
        favouriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteButtonActionPerformed(evt);
            }
        });

        appointmentsButton.setBackground(new java.awt.Color(255, 255, 255));
        appointmentsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        appointmentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/NewReportButton.png"))); // NOI18N
        appointmentsButton.setText("          Appointments");
        appointmentsButton.setBorder(null);
        appointmentsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        appointmentsButton.setPreferredSize(new java.awt.Dimension(47, 15));
        appointmentsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/NewReportHover.png"))); // NOI18N
        appointmentsButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/NewReportClicked.png"))); // NOI18N
        appointmentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsButtonMouseClicked(evt);
            }
        });
        appointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsButtonActionPerformed(evt);
            }
        });

        myPatients.setBackground(new java.awt.Color(255, 255, 255));
        myPatients.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myPatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/MyPattientsButton.png"))); // NOI18N
        myPatients.setText("         My Patients");
        myPatients.setBorder(null);
        myPatients.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        myPatients.setPreferredSize(new java.awt.Dimension(47, 15));
        myPatients.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/MyPatientsHover.png"))); // NOI18N
        myPatients.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/MyPatientsClicked.png"))); // NOI18N

        documentButton.setBackground(new java.awt.Color(255, 255, 255));
        documentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        documentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/ButtonBackground/DocumentsButton.png"))); // NOI18N
        documentButton.setText("        Documents");
        documentButton.setBorder(null);
        documentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        documentButton.setPreferredSize(new java.awt.Dimension(47, 15));
        documentButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Hovers/DocumentsHover.png"))); // NOI18N
        documentButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsFolder/Clicked/DocumentsClicked.png"))); // NOI18N
        documentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideMenuBarLayout = new javax.swing.GroupLayout(sideMenuBar);
        sideMenuBar.setLayout(sideMenuBarLayout);
        sideMenuBarLayout.setHorizontalGroup(
            sideMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(favouriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(appointmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(myPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(documentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sideMenuBarLayout.setVerticalGroup(
            sideMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuBarLayout.createSequentialGroup()
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(favouriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(appointmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(myPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(documentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 564, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(250, 250, 250));
        mainPanel.setMaximumSize(new java.awt.Dimension(1079, 809));
        mainPanel.setMinimumSize(new java.awt.Dimension(1079, 809));
        mainPanel.setPreferredSize(new java.awt.Dimension(1079, 809));

        desktopPane.setMaximumSize(new java.awt.Dimension(1079, 809));
        desktopPane.setMinimumSize(new java.awt.Dimension(1079, 809));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        profilePanel.setBackground(new java.awt.Color(250, 250, 250));
        profilePanel.setMaximumSize(new java.awt.Dimension(208, 57));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/doctor.png"))); // NOI18N
        nameLabel.setText("FILAN FILANI");
        nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
        });

        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons Folder/gear.png"))); // NOI18N
        settingsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsLabel)
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profileInfoPanel.setBackground(new java.awt.Color(250, 250, 250));
        profileInfoPanel.setMaximumSize(new java.awt.Dimension(208, 746));
        profileInfoPanel.setMinimumSize(new java.awt.Dimension(208, 746));
        profileInfoPanel.setPreferredSize(new java.awt.Dimension(208, 746));

        javax.swing.GroupLayout profileInfoPanelLayout = new javax.swing.GroupLayout(profileInfoPanel);
        profileInfoPanel.setLayout(profileInfoPanelLayout);
        profileInfoPanelLayout.setHorizontalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        profileInfoPanelLayout.setVerticalGroup(
            profileInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(profileInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonActionPerformed

    private void favouriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteButtonActionPerformed
           
    }//GEN-LAST:event_favouriteButtonActionPerformed

    private void appointmentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsButtonMouseClicked
        PatientAppointments app = new PatientAppointments();
        app.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        app.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        try {
            //qitu e marrim ID e pacientit LOGGED IN qe na vyn te appointments Table List, niher e marrim masnej e loadim table qe me mujt me nxjerr ID
            app.setPatientIDTable(findPatientByID(this.patient_ID_Profile).getPatientID());
            app.loadTable();
            app.loadTable2();
        } catch (HealthException ex) {
            Logger.getLogger(PatientWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        desktopPane.add(app);
        app.show();
    }//GEN-LAST:event_appointmentsButtonMouseClicked

    public Patient findPatientByID(int id) throws HealthException{
        PatientRepository pr = new PatientRepository();
        List<Patient> list = pr.findAll();
        for (int i = 0; i < list.size(); i++) {
           
            if (list.get(i).getPatientID() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    
    
    private void documentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentButtonActionPerformed
            new NotificationFrame().setVisible(true);
    }//GEN-LAST:event_documentButtonActionPerformed

    private void nameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseEntered

    }//GEN-LAST:event_nameLabelMouseEntered

    private void appointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentsButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(PatientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PatientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PatientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PatientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PatientWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton appointmentsButton;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton documentButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton favouriteButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton myPatients;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JPanel profileInfoPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel sideMenuBar;
    // End of variables declaration//GEN-END:variables

}
