
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Bill_Room extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public Bill_Room() {
        initComponents();
        txtBillNo.setVisible(false);
        txtDischargeID.setVisible(false);
        txtAdmitID.setVisible(false);
        setLocationRelativeTo(null);
        Get_Data1();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtRoomNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDischargeDate = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRoomCharges = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtServiceCharges = new javax.swing.JTextField();
        txtBillingDate = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        cmbPaymentMode = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtPaymentModeDetails = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCharges = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotalPaid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDueCharges = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNoOfDays = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTotalRoomCharges = new javax.swing.JTextField();
        txtAdmitID = new javax.swing.JTextField();
        txtBillNo = new javax.swing.JTextField();
        txtDischargeID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing");
        setMinimumSize(new java.awt.Dimension(1255, 720));
        setPreferredSize(new java.awt.Dimension(1255, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Info"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Patient ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("Patient Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel27.setText("Blood Group");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        PatientID.setEditable(false);
        jPanel3.add(PatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 89, 20));

        txtPatientName.setEditable(false);
        jPanel3.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 193, -1));

        txtAdmitDate.setEditable(false);
        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        jPanel3.add(txtAdmitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, -1));

        jLabel29.setText("Gender");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel30.setText("(DD/MM/YYYY)");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtGender.setEditable(false);
        jPanel3.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 194, -1));

        txtBloodGroup.setEditable(false);
        jPanel3.add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 194, -1));

        jLabel31.setText("Disease");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel32.setText("Admit Date");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel33.setText("Room No.");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel34.setText("Doctor ID");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel35.setText("Doctor Name");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        txtDisease.setEditable(false);
        jPanel3.add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 194, -1));

        txtDoctorID.setEditable(false);
        jPanel3.add(txtDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 75, 21));

        txtDoctorName.setEditable(false);
        jPanel3.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 194, -1));

        txtRoomNo.setEditable(false);
        jPanel3.add(txtRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, -1));

        jLabel7.setText("Discharge Date");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        txtDischargeDate.setEditable(false);
        txtDischargeDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jPanel3.add(txtDischargeDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, -1));

        jLabel36.setText("(DD/MM/YYYY)");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText(">");
        jButton1.setPreferredSize(new java.awt.Dimension(41, 21));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 370, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Details"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Room Charges");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 32, -1, -1));

        jLabel1.setText("Billing Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 70, -1, -1));

        jLabel2.setText("Payment Mode");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 108, -1, -1));

        txtRoomCharges.setEditable(false);
        txtRoomCharges.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtRoomChargesInputMethodTextChanged(evt);
            }
        });
        txtRoomCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomChargesActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoomCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 29, 108, -1));

        jLabel3.setText("Service Charges");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 70, -1, -1));

        txtServiceCharges.setEditable(false);
        jPanel1.add(txtServiceCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 67, 93, -1));

        txtBillingDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jPanel1.add(txtBillingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 67, 120, -1));

        jLabel37.setText("(DD/MM/YYYY)");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 70, -1, -1));

        cmbPaymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by Cash", "by DD", "by Check", "by Credit Card", "by Debit Card" }));
        cmbPaymentMode.setSelectedIndex(-1);
        jPanel1.add(cmbPaymentMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 105, 120, -1));

        jLabel4.setText("Payment Mode Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, -1, -1));
        jPanel1.add(txtPaymentModeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 143, 318, -1));

        jLabel9.setText("Total Charges");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 184, -1, -1));

        txtTotalCharges.setEditable(false);
        jPanel1.add(txtTotalCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 181, 90, -1));

        jLabel10.setText("Total Paid");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 184, -1, -1));

        txtTotalPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPaidActionPerformed(evt);
            }
        });
        txtTotalPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPaidKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 181, 85, -1));

        jLabel11.setText("Due Charges");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 184, -1, -1));

        txtDueCharges.setEditable(false);
        jPanel1.add(txtDueCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 181, 90, -1));

        jLabel12.setText("No. Of Days");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, -1));

        txtNoOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfDaysActionPerformed(evt);
            }
        });
        txtNoOfDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoOfDaysKeyTyped(evt);
            }
        });
        jPanel1.add(txtNoOfDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 29, 68, -1));

        jLabel13.setText("Total Room Charges");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 32, -1, -1));

        txtTotalRoomCharges.setEditable(false);
        jPanel1.add(txtTotalRoomCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 101, -1));
        jPanel1.add(txtAdmitID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 90, -1));
        jPanel1.add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 137, -1));
        jPanel1.add(txtDischargeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 137, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 428, 710, 260));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 430, 660));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 73, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 73, -1));

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, 73, -1));

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 73, -1));

        btnGetData.setText("GetData");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });
        jPanel2.add(btnGetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 129, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 20, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 240, 130));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        PatientDischargeRecord_Room1 frm = new PatientDischargeRecord_Room1();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
private void Reset()
{
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    txtRoomNo.setText("");
    txtServiceCharges.setText("");
    txtRoomCharges.setText("");
    txtPaymentModeDetails.setText("");
    txtTotalCharges.setText("");
    txtTotalPaid.setText("");
    txtDueCharges.setText("");
    txtBillingDate.setText("");
    cmbPaymentMode.setSelectedIndex(-1);
    txtDischargeDate.setText("");
    txtNoOfDays.setText("");
    txtTotalRoomCharges.setText("");
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String val =jTable1.getModel().getValueAt(row,2).toString();
            txtServiceCharges.setText(val);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtRoomChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomChargesActionPerformed
              
    }//GEN-LAST:event_txtRoomChargesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Bill_Room where BillNo = " + txtBillNo.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtRoomChargesInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtRoomChargesInputMethodTextChanged
      
    }//GEN-LAST:event_txtRoomChargesInputMethodTextChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      try{
            con=Connect.ConnectDB();
              if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfDays.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter no. of days","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve service charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtBillingDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter billing date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalPaid.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter total paid","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                double add1 = Double.parseDouble(txtTotalCharges.getText());
                double add2 = Double.parseDouble(txtTotalPaid.getText());
             if (add2 > add1) {
                JOptionPane.showMessageDialog( this, "Total Paid is more than total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        Statement stmt;
       stmt= con.createStatement();
       String sql1="Select DischargeID from Bill_Room where DischargeID= " + txtDischargeID.getText() + "";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
     
            String sql= "insert into Bill_Room(DischargeID,BillingDate,RoomCharges,ServiceCharges,PaymentMode,PaymentModeDetails,ChargesPaid,DueCharges,TotalCharges,NoOfDays,TotalRoomCharges)values(" + txtDischargeID.getText() + ",'"+ txtBillingDate.getText() + "',"+ txtRoomCharges.getText() + ","+ txtServiceCharges.getText() + ",'" + cmbPaymentMode.getSelectedItem()+ "','" + txtPaymentModeDetails.getText() + "',"+ txtTotalPaid.getText() + ","+ txtDueCharges.getText() + ","+ txtTotalCharges.getText() +","+ txtNoOfDays.getText() + "," + txtTotalRoomCharges.getText() +")";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            con=Connect.ConnectDB();
            String sql= "update Bill_Room set DischargeID="+ txtDischargeID.getText() + ",BillingDate='"+ txtBillingDate.getText() + "',RoomCharges="+ txtRoomCharges.getText() + ",ServiceCharges="+ txtServiceCharges.getText() + ",PaymentMode='" + cmbPaymentMode.getSelectedItem()+ "',PaymentModeDetails='" + txtPaymentModeDetails.getText() + "',ChargesPaid="+ txtTotalPaid.getText() + ",DueCharges="+ txtDueCharges.getText() + ",TotalCharges="+ txtTotalCharges.getText() + ",NoOfDays="+ txtNoOfDays.getText() +",TotalRoomCharges=" + txtTotalRoomCharges.getText() + " where BillNo= " + txtBillNo.getText() +"";  pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNoOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfDaysActionPerformed
             
                double add1 = Double.parseDouble(txtRoomCharges.getText());
                double add = Double.parseDouble(txtNoOfDays.getText());
                double add2= add * add1;
                String add3= Double.toString(add2);
                txtTotalRoomCharges.setText(add3);      
                double add4=Double.parseDouble(txtTotalRoomCharges.getText());
                double add5 = Double.parseDouble(txtServiceCharges.getText());
                double add6= add4 + add5;
                 String add7= Double.toString(add6);
                txtTotalCharges.setText(add7);
    }//GEN-LAST:event_txtNoOfDaysActionPerformed

    private void txtTotalPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPaidActionPerformed
                double add1 = Double.parseDouble(txtTotalCharges.getText());
                double add = Double.parseDouble(txtTotalPaid.getText());
                double add2= add1 - add;
                String add3= Double.toString(add2);
                txtDueCharges.setText(add3);  
    }//GEN-LAST:event_txtTotalPaidActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
  this.hide();
  Bill_RoomRecord frm= new Bill_RoomRecord();
  frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void txtNoOfDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfDaysKeyTyped
      char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }//GEN-LAST:event_txtNoOfDaysKeyTyped
    }
    private void txtTotalPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPaidKeyTyped
     char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
      }
                       
    }//GEN-LAST:event_txtTotalPaidKeyTyped

    private void Get_Data1(){
      try{
        con=Connect.ConnectDB();
       String sql="select PatientRegistration.PatientID as 'Patient ID', PatientName as 'Patient Name',sum(serviceCharges) as 'Service Charges' from Services,PatientRegistration where Services.PatientID=PatientRegistration.PatientID group by PatientRegistration.PatientID,PatientName order by PatientName";
         pst=con.prepareStatement(sql);
         rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Room().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField PatientID;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbPaymentMode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JFormattedTextField txtAdmitDate;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtBillNo;
    public javax.swing.JFormattedTextField txtBillingDate;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JFormattedTextField txtDischargeDate;
    public javax.swing.JTextField txtDischargeID;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtDueCharges;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtNoOfDays;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextField txtPaymentModeDetails;
    public javax.swing.JTextField txtRoomCharges;
    public javax.swing.JTextField txtRoomNo;
    public javax.swing.JTextField txtServiceCharges;
    public javax.swing.JTextField txtTotalCharges;
    public javax.swing.JTextField txtTotalPaid;
    public javax.swing.JTextField txtTotalRoomCharges;
    // End of variables declaration//GEN-END:variables
}
