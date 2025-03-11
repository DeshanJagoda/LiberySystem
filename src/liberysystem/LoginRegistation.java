
package liberysystem;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginRegistation extends javax.swing.JFrame {
  String selectedImagePath="src\\library-accounts.jpg";
  PreparedStatement pst;
  ResultSet rs;
  DataBaseConnection db=new DataBaseConnection();
  
    public LoginRegistation() {
       initComponents();
       db.DBConnection();
       txtUsername.requestFocus();
       txtEmpId.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCansel = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblImage1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistation = new javax.swing.JButton();
        btnCanse = new javax.swing.JButton();
        lblImage2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
                New1WindowActivated(evt);
                New2WindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 104, 33));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 104, 34));

        txtUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 346, 33));

        btnLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/309058_key_login_private_protect_protection_icon.png"))); // NOI18N
        btnLogin.setText("login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, 46));

        btnCansel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCansel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/211650_close_circled_icon.png"))); // NOI18N
        btnCansel.setText("Cansel");
        btnCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanselActionPerformed(evt);
            }
        });
        jPanel1.add(btnCansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 139, 46));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 346, 34));
        jPanel1.add(lblImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -31, 710, 360));

        jTabbedPane1.addTab("Login", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("EMP ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 49, 134, 28));

        txtEmpId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyPressed(evt);
            }
        });
        jPanel2.add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 51, 245, 28));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 97, 134, 27));

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 98, 245, 27));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("User Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 143, 134, 30));

        txtUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 145, 245, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 193, 134, 30));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 193, 245, 30));

        btnRegistation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegistation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-add.png"))); // NOI18N
        btnRegistation.setText("Registation");
        btnRegistation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistationActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistation, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 257, 170, 40));

        btnCanse.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCanse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/211650_close_circled_icon.png"))); // NOI18N
        btnCanse.setText("Cansel");
        btnCanse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanseActionPerformed(evt);
            }
        });
        jPanel2.add(btnCanse, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 257, 170, 40));
        jPanel2.add(lblImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -28, 710, 360));

        jTabbedPane1.addTab("Registation", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 364));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      ImageIcon imageicon=new ImageIcon(selectedImagePath);
      Image readyImage=imageicon.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH);    
      lblImage.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_formWindowActivated

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void New1WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New1WindowActivated
//       ImageIcon imageicon=new ImageIcon(selectedImagePath);
//       Image readyImage=imageicon.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH); 
//       lblImage1.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New1WindowActivated

    private void New2WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New2WindowActivated
//      ImageIcon imageicon=new ImageIcon(selectedImagePath);
//      Image readyImage=imageicon.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(), Image.SCALE_SMOOTH);
//      lblImage2.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New2WindowActivated

    private void btnCanseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanseActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCanseActionPerformed

    private void btnCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCanselActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      try {
          String msg="select * from  login where UserName=? and Password=?";
          pst=db.con.prepareStatement(msg);
          pst.setString(1, txtUserName.getText().toLowerCase());
          pst.setString(2, txtPassword.getText());
          rs=pst.executeQuery();
         
          LibraySystem MyObj=new LibraySystem();
            MyObj.setVisible(true);
            this.setVisible(false); 
            
        } catch (SQLException ex) {
          Logger.getLogger(LoginRegistation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistationActionPerformed
      try {
          String msg="insert login (EmpID,Name,UserName,Password)values(?,?,?,?)";
          pst=db.con.prepareStatement(msg);
          
          pst.setString(1, txtEmpId.getText());
          pst.setString(2, txtName.getText());
          pst.setString(3, txtUserName.getText());
          pst.setString(4, txtPassword.getText());
          pst.execute();
          
           txtEmpId.setText("");
           txtName.setText("");
           txtUserName.setText("");
           txtPassword.setText("");
          JOptionPane.showMessageDialog(null, "Registation OK");    
          
        } catch (SQLException ex) {
          Logger.getLogger(LoginRegistation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistationActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        try {
          String msg="select * from  login where UserName=? and Password=?";
          pst=db.con.prepareStatement(msg);
          pst.setString(1, txtUserName.getText().toLowerCase());
          pst.setString(2, txtPassword.getText());
          rs=pst.executeQuery();

          LibraySystem MyObj=new LibraySystem();
           MyObj.setVisible(true);
           this.setVisible(false);
 
        } catch (SQLException ex) {
          Logger.getLogger(LoginRegistation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        char Key=evt.getKeyChar();
        if(Key==KeyEvent.VK_ENTER){
          jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyPressed
        char Key=evt.getKeyChar();
        if(Key==KeyEvent.VK_ENTER){
          txtName.requestFocus();
        }
    }//GEN-LAST:event_txtEmpIdKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
       char Key=evt.getKeyChar();
        if(Key==KeyEvent.VK_ENTER){
          txtUserName.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        char Key=evt.getKeyChar();
        if(Key==KeyEvent.VK_ENTER){
          txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        char Key=evt.getKeyChar();
        if(Key==KeyEvent.VK_ENTER){
           try {
              String msg="insert login (EmpID,Name,UserName,Password)values(?,?,?,?)";
              pst=db.con.prepareStatement(msg);
          
              pst.setString(1, txtEmpId.getText());
              pst.setString(2, txtName.getText());
              pst.setString(3, txtUserName.getText());
              pst.setString(4, txtPassword.getText());
              pst.execute();
          
              txtEmpId.setText("");
              txtName.setText("");
              txtUserName.setText("");
              txtPassword.setText("");  
               JOptionPane.showMessageDialog(null, "Registation OK");
            } catch (SQLException ex) {
              Logger.getLogger(LoginRegistation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegistation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      //</editor-fold>
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegistation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanse;
    private javax.swing.JButton btnCansel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImage2;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
