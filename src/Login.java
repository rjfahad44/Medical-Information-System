
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public Login() {
        initComponents();
        //setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserName = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        setMinimumSize(new java.awt.Dimension(738, 416));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 150, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 320, 50));

        jScrollPane1.setViewportView(UserName);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 320, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 740, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed

        if (UserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        con=Connect.ConnectDB();
        String sql= "select * from users where UserName= '" + 
                UserName.getText() + "' and user_Password ='" +
                Password.getText() + "'";
            try
            {
                pst=con.prepareStatement(sql);
                rs= pst.executeQuery();
                if (rs.next()){
                    this.hide();
                    MainMenu frm=new MainMenu();
                    frm.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
                    UserName.setText("");
                    Password.setText("");
                    UserName.requestDefaultFocus();
                }
            }catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jbtnLoginActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextPane UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnLogin;
    // End of variables declaration//GEN-END:variables
}
