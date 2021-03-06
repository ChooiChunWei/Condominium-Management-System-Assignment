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
import static assignment.ResidentLoginForm.Resident_ID;
import static assignment.ResidentLoginForm.Unit_ID;
import static assignment.ResidentLoginForm.Due_Date;
import static assignment.ResidentLoginForm.Outstanding_Balance;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ResidentMenuForm extends javax.swing.JFrame {
    String Resident_Name,Resident_Email,Resident_PhoneNumber;
    /**
     * Creates new form ResidentMenuForm
     */
    public ResidentMenuForm() {
            initComponents();
            
        try {
                        
            PreparedStatement ps;
                       
            //SQL Select query to get all the resident info
            ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_ID`=?");
            ps.setString(1,Resident_ID);
            ResultSet result = ps.executeQuery();
            
            if(result.next()){
                Resident_Name = result.getString("Resident_Name");
                Resident_PhoneNumber = result.getString("Resident_Phone_Number");
                Resident_Email = result.getString("Resident_Email");
                
                UsernameTxt.setText(Resident_Name);
                EmailTxt.setText(Resident_Email);
                PhoneTxt.setText(Resident_PhoneNumber);
                
                if(Due_Date == null){
                    DueDateTxt.setText("                  ---");
                }else{
                    DueDateTxt.setText(String.valueOf(Due_Date));
                }
            
            }else{
                //Error message for result not found
                JOptionPane.showMessageDialog(null,"Result not found!","Error Message",JOptionPane.ERROR_MESSAGE);
            }
                        
            OutstandingTxt.setText(Integer.toString(Outstanding_Balance));
            UnitNoTxt.setText(Unit_ID);
            
        } catch (SQLException ex) {
            Logger.getLogger(ResidentMenuForm.class.getName()).log(Level.SEVERE, null, ex);
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
        UsernameLab = new javax.swing.JLabel();
        EditBut = new javax.swing.JButton();
        UnitNoLab = new javax.swing.JLabel();
        PhoneLab = new javax.swing.JLabel();
        EmailLab = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        LogoutLab = new javax.swing.JLabel();
        ChangePasswordBut = new javax.swing.JButton();
        BalanceLab = new javax.swing.JLabel();
        OutstandingTxt = new javax.swing.JTextField();
        OutstandingLab = new javax.swing.JLabel();
        DueDateLab = new javax.swing.JLabel();
        DueDateTxt = new javax.swing.JTextField();
        UnitNoTxt = new javax.swing.JTextField();
        PaymentRecordBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        ResidentMenuPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        UsernameLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 204, 204));
        UsernameLab.setText("Username:");

        EditBut.setBackground(new java.awt.Color(0, 0, 0));
        EditBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        EditBut.setForeground(new java.awt.Color(255, 204, 204));
        EditBut.setText("Edit Profile");
        EditBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        EditBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButActionPerformed(evt);
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

        UsernameTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        UsernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameTxtKeyTyped(evt);
            }
        });

        PhoneTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PhoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneTxtKeyTyped(evt);
            }
        });

        EmailTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        LogoutLab.setForeground(new java.awt.Color(255, 204, 204));
        LogoutLab.setText("Logout");
        LogoutLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabMouseClicked(evt);
            }
        });

        ChangePasswordBut.setBackground(new java.awt.Color(0, 0, 0));
        ChangePasswordBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChangePasswordBut.setForeground(new java.awt.Color(255, 204, 204));
        ChangePasswordBut.setText("Change Password");
        ChangePasswordBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ChangePasswordBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePasswordBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordButActionPerformed(evt);
            }
        });

        BalanceLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BalanceLab.setForeground(new java.awt.Color(255, 204, 204));
        BalanceLab.setText("Balance:");

        OutstandingTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        OutstandingTxt.setEnabled(false);

        OutstandingLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        OutstandingLab.setForeground(new java.awt.Color(255, 204, 204));
        OutstandingLab.setText("Outstanding");

        DueDateLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DueDateLab.setForeground(new java.awt.Color(255, 204, 204));
        DueDateLab.setText("Due Date:");

        DueDateTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DueDateTxt.setEnabled(false);

        UnitNoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        UnitNoTxt.setEnabled(false);

        PaymentRecordBut.setBackground(new java.awt.Color(0, 0, 0));
        PaymentRecordBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PaymentRecordBut.setForeground(new java.awt.Color(255, 204, 204));
        PaymentRecordBut.setText("Payment Record");
        PaymentRecordBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        PaymentRecordBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentRecordBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentRecordButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLab)
                                    .addComponent(PhoneLab)
                                    .addComponent(EmailLab))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UnitNoLab)
                                    .addComponent(BalanceLab)
                                    .addComponent(DueDateLab))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DueDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnitNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OutstandingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PaymentRecordBut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(EditBut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(ChangePasswordBut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(LogoutLab, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OutstandingLab)
                .addGap(203, 203, 203))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LogoutLab)
                .addGap(18, 18, 18)
                .addComponent(OutstandingLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameLab)
                            .addComponent(BalanceLab)
                            .addComponent(OutstandingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PhoneLab)
                                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DueDateLab)
                                    .addComponent(DueDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmailLab)
                                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnitNoLab)
                                    .addComponent(UnitNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentRecordBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangePasswordBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        ResidentMenuPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResidentMenuPageLab.setForeground(new java.awt.Color(255, 255, 255));
        ResidentMenuPageLab.setText("Menu Page");

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
                .addComponent(ResidentMenuPageLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
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
                    .addComponent(ResidentMenuPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButActionPerformed
        //Connect to database
        DBConnection conn = new DBConnection();
        conn.connection();
        PreparedStatement ps,ps1,ps2,ps3;
        
        //Declare variables
        String Username,PhoneNumber,Email;
        int Check_Username = 0,Check_PhoneNumber = 0,Check_Email = 0;
        Username = UsernameTxt.getText();
        PhoneNumber = PhoneTxt.getText();
        Email = EmailTxt.getText();
        
        //Confirmation Box before Edit
        int option = JOptionPane.showConfirmDialog(this,"Edit these records?","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if(option == 0){
            //Validation
            if(Username.length()>50){
                JOptionPane.showMessageDialog(this,"Username must be less than 50 characters.","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(Username.length()<1){
                JOptionPane.showMessageDialog(this,"Username cannot be null","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(PhoneNumber.length()>11 ){
                JOptionPane.showMessageDialog(this,"Phone Number cannot longer than 11 number","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(PhoneNumber.length()<1){
                JOptionPane.showMessageDialog(this,"Phone Number cannot be null","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(PhoneNumber.length()<10){
                JOptionPane.showMessageDialog(this,"Invalid Phone Number","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else if(!Pattern.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$",Email)){
                JOptionPane.showMessageDialog(this,"Invalid Email","Validation Message",JOptionPane.ERROR_MESSAGE);
            }else{
                
                //To check the changes on username
                //Username Changed
                if(!(Username.equals(Resident_Name))){
                                   
                    try{
                        //SQL Select query to check the availability of the new username 
                        ps = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Name`=? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
                        ps.setString(1,Username);
                        ResultSet result = ps.executeQuery();
                        
                        if(result.next()){
                            Check_Username = 1;
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ResidentMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //To check the changes on phone number
                //Phone Number Changed
                if(!(PhoneNumber.equals(Resident_PhoneNumber))){
                                   
                    try{
                        //SQL Select query to check the availability of the new phone number
                        ps1 = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Phone_Number`=? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
                        ps1.setString(1,PhoneNumber);
                        ResultSet result1 = ps1.executeQuery();
                        
                        if(result1.next()){
                            Check_PhoneNumber = 2;
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ResidentMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //To check the changes on email
                //Email Changed
                if(!(Email.equals(Resident_Email))){
                                    
                    try{
                        //SQL Select query to check the availability of the new email
                        ps2 = con.prepareStatement("SELECT * FROM `resident` WHERE `Resident_Email`=? AND (`Account_Status` = \"Active\" OR `Account_Status` = \"Deactivated\")");
                        ps2.setString(1,Email);
                        ResultSet result2 = ps2.executeQuery();
                        
                        if(result2.next()){
                            Check_Email = 3;
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ResidentMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
                
                System.out.println(Check_Username);
                System.out.println(Check_PhoneNumber);
                System.out.println(Check_Email);
                if(Check_Username == 1){
                    JOptionPane.showMessageDialog(this,"This username is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
                }else if(Check_PhoneNumber == 2){
                    JOptionPane.showMessageDialog(this,"This phone number is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
                }else if(Check_Email == 3){
                    JOptionPane.showMessageDialog(this,"This email is registered.","Validation Message",JOptionPane.ERROR_MESSAGE);
                }else{
                    try {
                        //SQL UPDATE Query to update the info in the Resident table
                        ps3 = con.prepareStatement("UPDATE `resident` SET `Resident_Name`=?,`Resident_Phone_Number`=?,`Resident_Email`=? WHERE `Resident_ID` =?");
                        ps3.setString(1,Username);
                        ps3.setString(2,PhoneNumber);
                        ps3.setString(3,Email);
                        ps3.setString(4,Resident_ID);
                        ps3.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this,"Edit Successfully!","Edit Message",JOptionPane.INFORMATION_MESSAGE);
                        
                        //Reopen the Resident Menu Form
                        this.setVisible(false);                    
                        ResidentMenuForm rmf = new ResidentMenuForm();
                        rmf.setVisible(true);
                        rmf.pack();
                        rmf.setLocationRelativeTo(null);
                        rmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ResidentMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }              
                
                
                
            }
        }

    }//GEN-LAST:event_EditButActionPerformed

    private void LogoutLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabMouseClicked
        //Confirmation Box before Logout
        int option = JOptionPane.showConfirmDialog(null,"Want to Logout?","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){
        ResidentLoginForm rlf = new ResidentLoginForm();
        rlf.setVisible(true);
        rlf.pack();
        rlf.setLocationRelativeTo(null);
        rlf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_LogoutLabMouseClicked

    private void ChangePasswordButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordButActionPerformed
        ChangePasswordForm cff = new ChangePasswordForm();
        cff.setVisible(true);
        cff.pack();
        cff.setLocationRelativeTo(null);
        cff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ChangePasswordButActionPerformed

    private void PaymentRecordButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentRecordButActionPerformed
        PaymentRecordForm prf = new PaymentRecordForm();
        prf.setVisible(true);
        prf.pack();
        prf.setLocationRelativeTo(null);
        prf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_PaymentRecordButActionPerformed

    private void CloseLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabMouseClicked
        System.exit(0);//Close Button
    }//GEN-LAST:event_CloseLabMouseClicked

    private void MinLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLabMouseClicked
        this.setState(JFrame.ICONIFIED);//Minimize Button
    }//GEN-LAST:event_MinLabMouseClicked

    private void UsernameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTxtKeyTyped
        //Validate the user can type lowercase Alpabet and space only
        char c = evt.getKeyChar();
        if(!(c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE || Character.isWhitespace(c)|| Character.isLowerCase(c))){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Lower Case Alphabet Only!","Validation Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UsernameTxtKeyTyped

    private void PhoneTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneTxtKeyTyped
        //Validate the user can type Digit only
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE )){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Digit Only!","Validation Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PhoneTxtKeyTyped

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
            java.util.logging.Logger.getLogger(ResidentMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ResidentMenuForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceLab;
    private javax.swing.JButton ChangePasswordBut;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel DueDateLab;
    private javax.swing.JTextField DueDateTxt;
    private javax.swing.JButton EditBut;
    private javax.swing.JLabel EmailLab;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel LogoutLab;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel OutstandingLab;
    private javax.swing.JTextField OutstandingTxt;
    private javax.swing.JButton PaymentRecordBut;
    private javax.swing.JLabel PhoneLab;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JLabel ResidentMenuPageLab;
    private javax.swing.JLabel UnitNoLab;
    private javax.swing.JTextField UnitNoTxt;
    private javax.swing.JLabel UsernameLab;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
