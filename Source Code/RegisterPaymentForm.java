/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.DBConnection.con;
import static assignment.RegisterUnitForm.UnitNo;
import static assignment.RegisterResidentForm.Resident_Name;
import static assignment.RegisterResidentForm.Resident_Password;
import static assignment.RegisterResidentForm.Resident_PhoneNum;
import static assignment.RegisterResidentForm.Resident_Email;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Keith
 */
public class RegisterPaymentForm extends javax.swing.JFrame {
    public static String UnitNoFromRPF,Resident_NameFromRPF;
    /**
     * Creates new form RegisterPaymentForm
     */
    public RegisterPaymentForm() {
        initComponents();
        
        UsernameTxt.setText(Resident_Name);
        UnitNoTxt.setText(UnitNo);
        OutstandingBalanceTxt.setText("200.00");
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
        PayBut = new javax.swing.JButton();
        BackLab = new javax.swing.JLabel();
        HomeLab = new javax.swing.JLabel();
        UnitNoLab = new javax.swing.JLabel();
        OutstandingBalanceLab = new javax.swing.JLabel();
        UnitNoTxt = new javax.swing.JTextField();
        OutstandingBalanceTxt = new javax.swing.JTextField();
        UsernameLab = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        RegisterPaymentPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        PayBut.setBackground(new java.awt.Color(0, 0, 0));
        PayBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PayBut.setForeground(new java.awt.Color(255, 204, 204));
        PayBut.setText("Pay");
        PayBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        PayBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PayBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButActionPerformed(evt);
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

        HomeLab.setForeground(new java.awt.Color(255, 204, 204));
        HomeLab.setText("Home");
        HomeLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabMouseClicked(evt);
            }
        });

        UnitNoLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UnitNoLab.setForeground(new java.awt.Color(255, 204, 204));
        UnitNoLab.setText("Unit No. :");

        OutstandingBalanceLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        OutstandingBalanceLab.setForeground(new java.awt.Color(255, 204, 204));
        OutstandingBalanceLab.setText("Outstanding Balance:");

        UnitNoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        UnitNoTxt.setEnabled(false);

        OutstandingBalanceTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        OutstandingBalanceTxt.setEnabled(false);

        UsernameLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 204, 204));
        UsernameLab.setText("Username:");

        UsernameTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        UsernameTxt.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BackLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeLab)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(150, 150, 150))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UnitNoLab)
                                .addComponent(OutstandingBalanceLab))
                            .addGap(84, 84, 84)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UnitNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OutstandingBalanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UsernameLab)
                        .addGap(84, 84, 84)
                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackLab)
                    .addComponent(HomeLab))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLab)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnitNoLab)
                    .addComponent(UnitNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutstandingBalanceLab)
                    .addComponent(OutstandingBalanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(PayBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

        RegisterPaymentPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterPaymentPageLab.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPaymentPageLab.setText("Register-Payment Page");

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
                .addComponent(RegisterPaymentPageLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(RegisterPaymentPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PayButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButActionPerformed
        //Connect to database
        DBConnection conn = new DBConnection();
        conn.connection();

        PreparedStatement ps,ps1,ps2,ps3,ps4;
        String Active = "Active";

        try{
        //Declare variable for the register date&payment date
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        
        //Declare variable to check the progress of the code
        int check;
        
        //SQL INSERT Query to insert the resident's info into resident table
        ps = con.prepareStatement("INSERT INTO `resident`(`Resident_Name`, `Resident_Phone_Number`, `Resident_Password`, `Resident_Email`,`Account_Status`) VALUES (?,?,?,?,?)");
        ps.setString(1,Resident_Name);
        ps.setString(2,Resident_PhoneNum);
        ps.setString(3,Resident_Password);
        ps.setString(4,Resident_Email);
        ps.setString(5,Active);
        ps.executeUpdate();
        check = 1;
        
        if(check == 1){
        //SQL Select query to get Resident_ID
        ps1 = con.prepareStatement("SELECT `Resident_ID` FROM `resident` WHERE `Resident_Name` = ?");
        ps1.setString(1,Resident_Name);
        ResultSet result = ps1.executeQuery();  

        result.next();
        String RID = result.getString("Resident_ID");

        //SQL UPDATE Query to update the unit's info into unit table
        ps2 = con.prepareStatement("UPDATE `unit` SET `Unit_Register_Date`= ?,`Resident_ID`=?, `Outstanding_Balance`= '200' WHERE `Unit_ID` = ?");
        ps2.setString(1,dateFormat.format(date));
        ps2.setString(2,RID);
        ps2.setString(3,UnitNo); 
        ps2.executeUpdate();
        check = 2;
        
        if(check == 2){
        int Payment_Amount = 200;   
        
        //SQL INSERT Query to insert payment's info into payment table
        ps3 = con.prepareStatement("INSERT INTO `payment`(`Payment_Date`, `Payment_Amount`, `Resident_ID`) VALUES (?,?,?)");
        ps3.setString(1,dateFormat.format(date));
        ps3.setString(2,String.valueOf(Payment_Amount));
        ps3.setString(3,RID);
        ps3.executeUpdate();
        
        //SQL UPDATE Query to update the Outstanding Balance into unit table
        ps4 = con.prepareStatement("UPDATE `unit` SET `Outstanding_Balance`= NULL WHERE `Unit_ID` = ?");
        ps4.setString(1,UnitNo); 
        ps4.executeUpdate();
        check = 3;
        }
        }
        
        if(check == 3){
            JOptionPane.showMessageDialog(this,"Register Successfully!","Register Message",JOptionPane.INFORMATION_MESSAGE);
            
            //Open Receipt Form
            //Pass the value to the UnitNoFromRPF & Resident_NameFromRPF
            UnitNoFromRPF = UnitNo;
            Resident_NameFromRPF = Resident_Name;
            ReceiptForm rf = new ReceiptForm();
            rf.setVisible(true);
            rf.pack();
            rf.setLocationRelativeTo(null);
            rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
        
        }else{
            JOptionPane.showMessageDialog(this,"Register Failed!","Register Message",JOptionPane.ERROR_MESSAGE);
        }

        }catch(SQLException ex){
        Logger.getLogger(StaffLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PayButActionPerformed

    private void CloseLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabMouseClicked
        System.exit(0);//Close Button
    }//GEN-LAST:event_CloseLabMouseClicked

    private void MinLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLabMouseClicked
        this.setState(JFrame.ICONIFIED);//Minimize Button
    }//GEN-LAST:event_MinLabMouseClicked

    private void BackLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabMouseClicked
        //Confirmation Box before going back
        int option = JOptionPane.showConfirmDialog(null,"Want to go back?\nThe data changed are unsaved.","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){
        RegisterResidentForm rrf = new RegisterResidentForm();
        rrf.setVisible(true);
        rrf.pack();
        rrf.setLocationRelativeTo(null);
        rrf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        }
    }//GEN-LAST:event_BackLabMouseClicked

    private void HomeLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabMouseClicked
        //Confirmation Box before go back to Home Page
        int option = JOptionPane.showConfirmDialog(null,"Want to exit this page?\nThe data changed are unsaved.","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){
        //Open Staff Menu Form
        StaffMenuForm smf = new StaffMenuForm();
        smf.setVisible(true);
        smf.pack();
        smf.setLocationRelativeTo(null);
        smf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        }
    }//GEN-LAST:event_HomeLabMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterPaymentForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLab;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel HomeLab;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel OutstandingBalanceLab;
    private javax.swing.JTextField OutstandingBalanceTxt;
    private javax.swing.JButton PayBut;
    private javax.swing.JLabel RegisterPaymentPageLab;
    private javax.swing.JLabel UnitNoLab;
    private javax.swing.JTextField UnitNoTxt;
    private javax.swing.JLabel UsernameLab;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}