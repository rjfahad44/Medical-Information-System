
public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Master_Entry = new javax.swing.JMenu();
        Entry_Ward = new javax.swing.JMenuItem();
        Entry_Room = new javax.swing.JMenuItem();
        Entry_NurseOrWardboy = new javax.swing.JMenuItem();
        Users = new javax.swing.JMenu();
        URegistration = new javax.swing.JMenuItem();
        Change_Password = new javax.swing.JMenuItem();
        Login_Details = new javax.swing.JMenuItem();
        Doctor = new javax.swing.JMenu();
        Profile_Entry = new javax.swing.JMenuItem();
        Patient = new javax.swing.JMenu();
        PRegistration = new javax.swing.JMenuItem();
        Services = new javax.swing.JMenuItem();
        Admit = new javax.swing.JMenu();
        ARoom = new javax.swing.JMenuItem();
        AWard = new javax.swing.JMenuItem();
        Discharge = new javax.swing.JMenu();
        DRoom = new javax.swing.JMenuItem();
        DWard = new javax.swing.JMenuItem();
        Billing = new javax.swing.JMenu();
        BRoom = new javax.swing.JMenuItem();
        BWard = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();
        Contact = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home.jpg"))); // NOI18N

        Master_Entry.setText("Master Entry");

        Entry_Ward.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        Entry_Ward.setText("Ward");
        Entry_Ward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entry_WardActionPerformed(evt);
            }
        });
        Master_Entry.add(Entry_Ward);

        Entry_Room.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Entry_Room.setText("Room");
        Entry_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entry_RoomActionPerformed(evt);
            }
        });
        Master_Entry.add(Entry_Room);

        Entry_NurseOrWardboy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Entry_NurseOrWardboy.setText("Nurse/Wardboy");
        Entry_NurseOrWardboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entry_NurseOrWardboyActionPerformed(evt);
            }
        });
        Master_Entry.add(Entry_NurseOrWardboy);

        jMenuBar1.add(Master_Entry);

        Users.setText("Users");

        URegistration.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        URegistration.setText("Registration");
        URegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URegistrationActionPerformed(evt);
            }
        });
        Users.add(URegistration);

        Change_Password.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Change_Password.setText("Change Password");
        Change_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_PasswordActionPerformed(evt);
            }
        });
        Users.add(Change_Password);

        Login_Details.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        Login_Details.setText("Login Details");
        Login_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_DetailsActionPerformed(evt);
            }
        });
        Users.add(Login_Details);

        jMenuBar1.add(Users);

        Doctor.setText("Doctor");

        Profile_Entry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        Profile_Entry.setText("Profile Entry");
        Profile_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Profile_EntryActionPerformed(evt);
            }
        });
        Doctor.add(Profile_Entry);

        jMenuBar1.add(Doctor);

        Patient.setText("Patient");

        PRegistration.setText("Registration");
        PRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRegistrationActionPerformed(evt);
            }
        });
        Patient.add(PRegistration);

        Services.setText("Services");
        Services.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicesActionPerformed(evt);
            }
        });
        Patient.add(Services);

        Admit.setText("Admit");

        ARoom.setText("Room");
        ARoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARoomActionPerformed(evt);
            }
        });
        Admit.add(ARoom);

        AWard.setText("Ward");
        AWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AWardActionPerformed(evt);
            }
        });
        Admit.add(AWard);

        Patient.add(Admit);

        Discharge.setText("Discharge");

        DRoom.setText("Room");
        DRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRoomActionPerformed(evt);
            }
        });
        Discharge.add(DRoom);

        DWard.setText("Ward");
        DWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DWardActionPerformed(evt);
            }
        });
        Discharge.add(DWard);

        Patient.add(Discharge);

        Billing.setText("Billing");

        BRoom.setText("Room");
        BRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRoomActionPerformed(evt);
            }
        });
        Billing.add(BRoom);

        BWard.setText("Ward");
        BWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWardActionPerformed(evt);
            }
        });
        Billing.add(BWard);

        Patient.add(Billing);

        jMenuBar1.add(Patient);

        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Help.add(About);

        Contact.setText("Contact");
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        Help.add(Contact);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void URegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URegistrationActionPerformed
    UsersRegistration frm = new UsersRegistration();
    frm.setVisible(true); 
    }//GEN-LAST:event_URegistrationActionPerformed

    private void Change_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_PasswordActionPerformed
    ChangePassword frm = new ChangePassword();
    frm.setVisible(true); 
    }//GEN-LAST:event_Change_PasswordActionPerformed

    private void Login_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_DetailsActionPerformed
    LoginDetails frm = new LoginDetails();
    frm.setVisible(true); 
    }//GEN-LAST:event_Login_DetailsActionPerformed

    private void Entry_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entry_RoomActionPerformed
   Room frm = new Room();
   frm.setVisible(true); 
    }//GEN-LAST:event_Entry_RoomActionPerformed

    private void Profile_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Profile_EntryActionPerformed
     Doctor frm= new Doctor();
     frm.setVisible(true);
    }//GEN-LAST:event_Profile_EntryActionPerformed

    private void Entry_WardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entry_WardActionPerformed
     Ward frm= new Ward();
     frm.setVisible(true);
    }//GEN-LAST:event_Entry_WardActionPerformed

    private void AWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AWardActionPerformed
     PatientAdmit_Ward frm= new PatientAdmit_Ward();
     frm.setVisible(true);
    }//GEN-LAST:event_AWardActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
   
    }//GEN-LAST:event_HelpActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
     About frm= new About();
     frm.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void Entry_NurseOrWardboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entry_NurseOrWardboyActionPerformed
     Nurse_Wardboy frm= new Nurse_Wardboy();
     frm.setVisible(true);
    }//GEN-LAST:event_Entry_NurseOrWardboyActionPerformed

    private void PRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRegistrationActionPerformed
    PatientRegistration frm= new PatientRegistration();
    frm.setVisible(true);
    }//GEN-LAST:event_PRegistrationActionPerformed

    private void ARoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARoomActionPerformed
    PatientAdmit_Room frm= new PatientAdmit_Room();
    frm.setVisible(true);
    }//GEN-LAST:event_ARoomActionPerformed

    private void DRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRoomActionPerformed
    PatientDischarge_Room frm= new PatientDischarge_Room();
    frm.setVisible(true);
    }//GEN-LAST:event_DRoomActionPerformed

    private void DWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DWardActionPerformed
    PatientDischarge_Ward frm= new PatientDischarge_Ward();
    frm.setVisible(true);
    }//GEN-LAST:event_DWardActionPerformed

    private void ServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicesActionPerformed
    Services frm= new Services();
    frm.setVisible(true);
    }//GEN-LAST:event_ServicesActionPerformed

    private void BRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRoomActionPerformed
    Bill_Room frm= new Bill_Room();
    frm.setVisible(true);
    }//GEN-LAST:event_BRoomActionPerformed

    private void BWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWardActionPerformed
    Bill_Ward frm= new Bill_Ward();
    frm.setVisible(true);
    }//GEN-LAST:event_BWardActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
     Contact frm = new Contact();
     frm.setVisible(true);
    }//GEN-LAST:event_ContactActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ARoom;
    private javax.swing.JMenuItem AWard;
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu Admit;
    private javax.swing.JMenuItem BRoom;
    private javax.swing.JMenuItem BWard;
    private javax.swing.JMenu Billing;
    private javax.swing.JMenuItem Change_Password;
    private javax.swing.JMenuItem Contact;
    private javax.swing.JMenuItem DRoom;
    private javax.swing.JMenuItem DWard;
    private javax.swing.JMenu Discharge;
    private javax.swing.JMenu Doctor;
    private javax.swing.JMenuItem Entry_NurseOrWardboy;
    private javax.swing.JMenuItem Entry_Room;
    private javax.swing.JMenuItem Entry_Ward;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem Login_Details;
    private javax.swing.JMenu Master_Entry;
    private javax.swing.JMenuItem PRegistration;
    private javax.swing.JMenu Patient;
    private javax.swing.JMenuItem Profile_Entry;
    private javax.swing.JMenuItem Services;
    private javax.swing.JMenuItem URegistration;
    private javax.swing.JMenu Users;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
