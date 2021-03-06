/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Keith
 */
import static assignment.DBConnection.con;
import static assignment.RegisterUnitForm.UnitNo;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterResidentForm extends javax.swing.JFrame {
    //Declare variables
    public static String Resident_Name,Resident_Password,Resident_PhoneNum,Resident_Email;
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterResidentForm() {
        initComponents();
        
        UsernameTxt.requestFocus();
        UnitNoTxt.setText(UnitNo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        RegisterResidentPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UsernameLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        RegisterBut = new javax.swing.JButton();
        UnitNoLab = new javax.swing.JLabel();
        PhoneLab = new javax.swing.JLabel();
        EmailLab = new javax.swing.JLabel();
        ConfirmPasswordLab = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        ConfirmPasswordTxt = new javax.swing.JPasswordField();
        backlab = new javax.swing.JLabel();
        HomeLab = new javax.swing.JLabel();
        UnitNoTxt = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 178, 178));

        CloseLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        CloseLab.setForeground(new java.awt.Color(255, 255, 255));
        CloseLab.setText("X");
        CloseLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabMouseClicked(evt);
            }
        });

        RegisterResidentPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterResidentPageLab.setForeground(new java.awt.Color(255, 255, 255));
        RegisterResidentPageLab.setText("Register Resident Page");

        MinLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        MinLab.setForeground(new java.awt.Color(255, 255, 255));
        MinLab.setText("-");
        MinLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(RegisterResidentPageLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(MinLab)
                .addGap(18, 18, 18)
                .addComponent(CloseLab)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MinLab, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(RegisterResidentPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        UsernameLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 204, 204));
        UsernameLab.setText("Username:");

        PasswordLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        PasswordLab.setText("Password:");

        RegisterBut.setBackground(new java.awt.Color(0, 0, 0));
        RegisterBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RegisterBut.setForeground(new java.awt.Color(255, 204, 204));
        RegisterBut.setText("Register");
        RegisterBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        RegisterBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        UnitNoLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UnitNoLab.setForeground(new java.awt.Color(255, 204, 204));
        UnitNoLab.setText("Unit No. :");

        PhoneLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PhoneLab.setForeground(new java.awt.Color(255, 204, 204));
        PhoneLab.setText("Phone:");

        EmailLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        EmailLab.setForeground(new java.awt.Color(255, 204, 204));
        EmailLab.setText("Email:");

        ConfirmPasswordLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ConfirmPasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        ConfirmPasswordLab.setText("Confirm Password:");

        UsernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameTxtKeyTyped(evt);
            }
        });

        PhoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneTxtKeyTyped(evt);
            }
        });

        EmailTxt.setToolTipText("");

        backlab.setForeground(new java.awt.Color(255, 204, 204));
        backlab.setText("Back");
        backlab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabMouseClicked(evt);
            }
        });

        HomeLab.setForeground(new java.awt.Color(255, 204, 204));
        HomeLab.setText("Home");
        HomeLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabMouseClicked(evt);
            }
        });

        UnitNoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        UnitNoTxt.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backlab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeLab)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLab)
                                    .addComponent(EmailLab))
                                .addGap(155, 155, 155)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(ConfirmPasswordLab)
                                    .addGap(74, 74, 74)
                                    .addComponent(ConfirmPasswordTxt))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(PasswordLab)
                                    .addGap(160, 160, 160)
                                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PhoneLab)
                                        .addComponent(UnitNoLab))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UnitNoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backlab)
                    .addComponent(HomeLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLab)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLab)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmPasswordLab)
                    .addComponent(ConfirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnitNoLab)
                    .addComponent(UnitNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneLab))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLab)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabMouseClicked
        System.exit(0);//Close Button
    }//GEN-LAST:event_CloseLabMouseClicked

    private void MinLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLabMouseClicked
        this.setState(JFrame.ICONIFIED);//Minimize Button
    }//GEN-LAST:event_MinLabMouseClicked

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButActionPerformed
        try {
            //Set variables
            Resident_Name = UsernameTxt.getText();
            Resident_PhoneNum = PhoneTxt.getText();
            Resident_Email = EmailTxt.getText();     
            String password = String.valueOf(PasswordTxt.getPassword());
            String ConfirmPassword = String.valueOf(ConfirmPasswordTxt.getPassword());
            PreparedStatement ps,ps1,ps2;
            
            //Validation
            
            //SQL Select query to check the username
            ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Name`= ? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
            ps.setString(1,Resident_Name);
            ResultSet result = ps.executeQuery();
            
            //SQL Select query to check the Phone Number
            ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Phone_Number`=? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
            ps.setString(1,Resident_PhoneNum);
            ResultSet result1 = ps.executeQuery();
            
            //SQL Select query to check the Email
            ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Email`= ? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
            ps.setString(1,Resident_Email);
            ResultSet result2 = ps.executeQuery();
            
            //The username is already registered
            if(result.next()){
                JOptionPane.showMessageDialog(this,"This username is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
            //The phone number is already registered
            }else if(result1.next()){
                JOptionPane.showMessageDialog(this,"This phone number is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
             //The email is already registered
            }else if(result2.next()){
                JOptionPane.showMessageDialog(this,"This email is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Resident_Name.length()>50){
                JOptionPane.showMessageDialog(this,"Username must be less than 50 characters.","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Resident_Name.length()<1){
               JOptionPane.showMessageDialog(this,"Username cannot be null","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(password.length() <6 || ConfirmPassword.length() <6){
                JOptionPane.showMessageDialog(this,"Password must be more than 6 characters","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Resident_PhoneNum.length()>11 ){
                JOptionPane.showMessageDialog(this,"Phone Number cannot longer than 11 number","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Resident_PhoneNum.length()<1){
               JOptionPane.showMessageDialog(this,"Phone Number cannot be null","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Resident_PhoneNum.length()<10){
               JOptionPane.showMessageDialog(this,"Invalid Phone Number","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(!Pattern.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$",Resident_Email)){
                JOptionPane.showMessageDialog(this,"Invalid Email","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(!(password.equals(ConfirmPassword))){
                JOptionPane.showMessageDialog(this,"Password must be same with Confirm Password","Validation Message",JOptionPane.ERROR_MESSAGE);    
            }else{            
            
            
                //*****Encryt the Password*****
                String HashedPassword;
                
                // Create MessageDigest instance for MD5
                MessageDigest md = MessageDigest.getInstance("MD5");
                //Add password bytes to digest
                md.update(password.getBytes());
                //Get the hash's bytes
                byte[] bytes = md.digest();
                //This bytes[] has bytes in decimal format;
                //Convert it to hexadecimal format
                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                //Get complete hashed password in hexadecimal format
                HashedPassword = sb.toString();
                Resident_Password = HashedPassword;
                System.out.println(Resident_Password);    

                //Open Register Payment Form 
                RegisterPaymentForm rpf = new RegisterPaymentForm();
                rpf.setVisible(true);
                rpf.pack();
                rpf.setLocationRelativeTo(null);
                rpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(false);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegisterResidentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterResidentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegisterButActionPerformed

    private void backlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabMouseClicked
        //Confirmation Box before going back
        int option = JOptionPane.showConfirmDialog(null,"Want to go back?\nThe data changed are unsaved.","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){        
        RegisterUnitForm ruf = new RegisterUnitForm();
        ruf.setVisible(true);
        ruf.pack();
        ruf.setLocationRelativeTo(null);
        ruf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        }
    }//GEN-LAST:event_backlabMouseClicked

    private void HomeLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabMouseClicked
        //Confirmation Box before go back to Home Page
        int option = JOptionPane.showConfirmDialog(null,"Want to exit this page?\nThe data changed are unsaved.","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){
        //Open Staff Login Form
        StaffMenuForm smf = new StaffMenuForm();
        smf.setVisible(true);
        smf.pack();
        smf.setLocationRelativeTo(null);
        smf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        }
    }//GEN-LAST:event_HomeLabMouseClicked

    private void PhoneTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneTxtKeyTyped
        //Validate the user can type Digit only
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE )){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Digit Only!","Validation Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PhoneTxtKeyTyped

    private void UsernameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTxtKeyTyped
        //Validate the user can type lowercase Alpabet and space only
        char c = evt.getKeyChar();
        if(!(c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE || Character.isWhitespace(c)|| Character.isLowerCase(c))){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Lower Case Alphabet Only!","Validation Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UsernameTxtKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterResidentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterResidentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterResidentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterResidentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterResidentForm().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel ConfirmPasswordLab;
    private javax.swing.JPasswordField ConfirmPasswordTxt;
    private javax.swing.JLabel EmailLab;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel HomeLab;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JLabel PhoneLab;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton RegisterBut;
    private javax.swing.JLabel RegisterResidentPageLab;
    private javax.swing.JLabel UnitNoLab;
    private javax.swing.JTextField UnitNoTxt;
    private javax.swing.JLabel UsernameLab;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JLabel backlab;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
