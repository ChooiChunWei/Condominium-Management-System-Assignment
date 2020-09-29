/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.ResidentLoginForm.Resident_ID;
import static assignment.DBConnection.con;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Keith
 */
public class ChangePasswordForm extends javax.swing.JFrame {
        static String Hashed_Password=null;
    /**
     * Creates new form ChangePasswordForm
     */
    public ChangePasswordForm() {
        initComponents();
    }
    
    public void Hash_Password(String Password){
        try {
            //*****Encryt the Password*****
            
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(Password.getBytes());
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
            Hashed_Password = sb.toString();
                        
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        OldPasswordLab = new javax.swing.JLabel();
        ChangeBut = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();
        NewPasswordLab = new javax.swing.JLabel();
        ConfirmPasswordLab = new javax.swing.JLabel();
        ConfirmPasswordTxt = new javax.swing.JPasswordField();
        OldPasswordTxt = new javax.swing.JPasswordField();
        NewPasswordTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        ChangePasswordPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        OldPasswordLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        OldPasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        OldPasswordLab.setText("Old Password:");

        ChangeBut.setBackground(new java.awt.Color(0, 0, 0));
        ChangeBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChangeBut.setForeground(new java.awt.Color(255, 204, 204));
        ChangeBut.setText("Change");
        ChangeBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ChangeBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButActionPerformed(evt);
            }
        });

        BackLab.setForeground(new java.awt.Color(255, 204, 204));
        BackLab.setText("Back");
        BackLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabMouseClicked(evt);
            }
        });

        NewPasswordLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        NewPasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        NewPasswordLab.setText("New Password:");

        ConfirmPasswordLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ConfirmPasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        ConfirmPasswordLab.setText("Confirm Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPasswordLab)
                            .addComponent(OldPasswordLab)
                            .addComponent(ConfirmPasswordLab))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfirmPasswordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(NewPasswordTxt)
                            .addComponent(OldPasswordTxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(ChangeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BackLab)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BackLab)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(OldPasswordLab)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewPasswordLab)
                            .addComponent(NewPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmPasswordLab)
                            .addComponent(ConfirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(OldPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(ChangeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

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

        ChangePasswordPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChangePasswordPageLab.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordPageLab.setText("Change Password Page");

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
                .addComponent(ChangePasswordPageLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
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
                    .addComponent(ChangePasswordPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButActionPerformed
        //Connect to database
        DBConnection conn = new DBConnection();
        conn.connection();
        PreparedStatement ps,ps1;

        String Old_Password,New_Password,Confirm_Password;
        Old_Password = String.copyValueOf(OldPasswordTxt.getPassword());
        New_Password = String.valueOf(NewPasswordTxt.getPassword());
        Confirm_Password = String.valueOf(ConfirmPasswordTxt.getPassword());
        
        
        try{
            if(Pattern.matches(".*[A-Z].*",Old_Password) || Pattern.matches(".*[A-Z].*",New_Password) || Pattern.matches(".*[A-Z].*",Confirm_Password)){
            int option = JOptionPane.showConfirmDialog(null,"Case sensitive.\nProceed with the uppercase letter in password?","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
                if(option == 0){
                    if(Old_Password.length() <6 || New_Password.length() <6 ||Confirm_Password.length() <6 ){
                        JOptionPane.showMessageDialog(this,"Password must be more than 6 characters","Validation Message",JOptionPane.ERROR_MESSAGE);
                    }else if(!(New_Password.equals(Confirm_Password))){
                        JOptionPane.showMessageDialog(this,"New Password must be same with Confirm Password","Validation Message",JOptionPane.ERROR_MESSAGE);    
                    }else{
                        Hash_Password(Old_Password);
                        
                        //SQL Select query to check the old password
                        ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Password` =? AND `Resident_ID` = ?");
                        ps.setString(1,Hashed_Password);
                        ps.setString(2,Resident_ID);
                        ResultSet result = ps.executeQuery();

                        if(!(result.next())){
                            //Old Password not correct
                            JOptionPane.showMessageDialog(this,"Invalid Old Password","Validation Message",JOptionPane.ERROR_MESSAGE);
                        }else{
                            Hash_Password(New_Password);
                            
                            //SQL UPDATE Query to update the new password in the Resident table
                            ps1 = con.prepareStatement("UPDATE `resident` SET `Resident_Password`=? WHERE `Resident_ID` =?");
                            ps1.setString(1,Hashed_Password);
                            ps1.setString(2,Resident_ID);
                            ps1.executeUpdate();
                
                            JOptionPane.showMessageDialog(this,"Changed Successfully!","Change Password Message",JOptionPane.INFORMATION_MESSAGE);
                
                            //Open the menu form
                            ResidentMenuForm rmf = new ResidentMenuForm();
                            rmf.setVisible(true);
                            rmf.pack();
                            rmf.setLocationRelativeTo(null);
                            rmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.setVisible(false);
                
                        }
                    }
                }
            }else{
                if(Old_Password.length() <6 || New_Password.length() <6 ||Confirm_Password.length() <6 ){
                    JOptionPane.showMessageDialog(this,"Password must be more than 6 characters","Validation Message",JOptionPane.ERROR_MESSAGE);
                }else if(!(New_Password.equals(Confirm_Password))){
                    JOptionPane.showMessageDialog(this,"New Password must be same with Confirm Password","Validation Message",JOptionPane.ERROR_MESSAGE);    
                }else{
                    Hash_Password(Old_Password);
                    
                    //SQL Select query to check the old password
                    ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Password` =? AND `Resident_ID` = ?");
                    ps.setString(1,Hashed_Password);
                    ps.setString(2,Resident_ID);
                    ResultSet result = ps.executeQuery();

                    if(!(result.next())){
                        //Old Password not correct
                        JOptionPane.showMessageDialog(this,"Invalid Old Password","Validation Message",JOptionPane.ERROR_MESSAGE);
                    }else{
                        Hash_Password(New_Password);
                        
                        //SQL UPDATE Query to update the new password in the Resident table
                        ps1 = con.prepareStatement("UPDATE `resident` SET `Resident_Password`=? WHERE `Resident_ID` =?");
                        ps1.setString(1,Hashed_Password);
                        ps1.setString(2,Resident_ID);
                        ps1.executeUpdate();

                        JOptionPane.showMessageDialog(this,"Changed Successfully!","Change Password Message",JOptionPane.INFORMATION_MESSAGE);

                        //Open the menu form
                        ResidentMenuForm rmf = new ResidentMenuForm();
                        rmf.setVisible(true);
                        rmf.pack();
                        rmf.setLocationRelativeTo(null);
                        rmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.setVisible(false);

                    }
                }    
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_ChangeButActionPerformed

    private void BackLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabMouseClicked
        ResidentMenuForm rmf = new ResidentMenuForm();
        rmf.setVisible(true);
        rmf.pack();
        rmf.setLocationRelativeTo(null);
        rmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_BackLabMouseClicked

    private void CloseLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabMouseClicked
        System.exit(0);//Close Button
    }//GEN-LAST:event_CloseLabMouseClicked

    private void MinLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLabMouseClicked
        this.setState(JFrame.ICONIFIED);//Minimize Button
    }//GEN-LAST:event_MinLabMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePasswordForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLab;
    private javax.swing.JButton ChangeBut;
    private javax.swing.JLabel ChangePasswordPageLab;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel ConfirmPasswordLab;
    private javax.swing.JPasswordField ConfirmPasswordTxt;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel NewPasswordLab;
    private javax.swing.JPasswordField NewPasswordTxt;
    private javax.swing.JLabel OldPasswordLab;
    private javax.swing.JPasswordField OldPasswordTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
