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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffMenuForm extends javax.swing.JFrame {

    /**
     * Creates new form StaffMenuForm
     */
    public StaffMenuForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PageNameLab = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        MenuPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ManageResidentLab = new javax.swing.JLabel();
        FeesLab = new javax.swing.JLabel();
        RegisterBut = new javax.swing.JButton();
        ManageBut = new javax.swing.JButton();
        ChargeBut = new javax.swing.JButton();
        PaymentBut = new javax.swing.JButton();
        OverdueBut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LogoutLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PageNameLab.setBackground(new java.awt.Color(255, 178, 178));

        CloseLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        CloseLab.setForeground(new java.awt.Color(255, 255, 255));
        CloseLab.setText("X");
        CloseLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabMouseClicked(evt);
            }
        });

        MenuPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MenuPageLab.setForeground(new java.awt.Color(255, 255, 255));
        MenuPageLab.setText("Menu Page");

        MinLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        MinLab.setForeground(new java.awt.Color(255, 255, 255));
        MinLab.setText("-");
        MinLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PageNameLabLayout = new javax.swing.GroupLayout(PageNameLab);
        PageNameLab.setLayout(PageNameLabLayout);
        PageNameLabLayout.setHorizontalGroup(
            PageNameLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PageNameLabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MenuPageLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(MinLab)
                .addGap(18, 18, 18)
                .addComponent(CloseLab)
                .addGap(23, 23, 23))
        );
        PageNameLabLayout.setVerticalGroup(
            PageNameLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PageNameLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PageNameLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MinLab, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(MenuPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        ManageResidentLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ManageResidentLab.setForeground(new java.awt.Color(255, 204, 204));
        ManageResidentLab.setText("Manage Resident:");

        FeesLab.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        FeesLab.setForeground(new java.awt.Color(255, 204, 204));
        FeesLab.setText("Fees:");

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

        ManageBut.setBackground(new java.awt.Color(0, 0, 0));
        ManageBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ManageBut.setForeground(new java.awt.Color(255, 204, 204));
        ManageBut.setText("Manage");
        ManageBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ManageBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageButActionPerformed(evt);
            }
        });

        ChargeBut.setBackground(new java.awt.Color(0, 0, 0));
        ChargeBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChargeBut.setForeground(new java.awt.Color(255, 204, 204));
        ChargeBut.setText("Charge");
        ChargeBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ChargeBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChargeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargeButActionPerformed(evt);
            }
        });

        PaymentBut.setBackground(new java.awt.Color(0, 0, 0));
        PaymentBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PaymentBut.setForeground(new java.awt.Color(255, 204, 204));
        PaymentBut.setText("Payment");
        PaymentBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        PaymentBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButActionPerformed(evt);
            }
        });

        OverdueBut.setBackground(new java.awt.Color(0, 0, 0));
        OverdueBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        OverdueBut.setForeground(new java.awt.Color(255, 204, 204));
        OverdueBut.setText("Overdue");
        OverdueBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        OverdueBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverdueBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverdueButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ManageResidentLab)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FeesLab)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ManageBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(ChargeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PaymentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(OverdueBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ManageResidentLab)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(FeesLab)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChargeBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OverdueBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        LogoutLab.setForeground(new java.awt.Color(255, 204, 204));
        LogoutLab.setText("Logout");
        LogoutLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutLab)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(LogoutLab)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PageNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PageNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
        RegisterUnitForm ruf = new RegisterUnitForm();
        ruf.setVisible(true);
        ruf.pack();
        ruf.setLocationRelativeTo(null);
        ruf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
      
    }//GEN-LAST:event_RegisterButActionPerformed

    private void ManageButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageButActionPerformed
        ManageResidentForm1 mrf1 = new ManageResidentForm1();
        mrf1.setVisible(true);
        mrf1.pack();
        mrf1.setLocationRelativeTo(null);
        mrf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_ManageButActionPerformed

    private void ChargeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButActionPerformed
            //*****Charge Fees*****
            PreparedStatement ps,ps1,ps2,ps3,ps4,ps5;

            try{
                //To get the current date
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date Current_date = new Date();
                
                //+7days to the current date to get the due date
                long ltime=Current_date.getTime()+7*24*60*60*1000;
                Date Due_date = new Date(ltime);

                //SQL Select query to check the unit is registered
                //Outstanding balance of the unit is clear, which means the unit havent being charged
                ps = con.prepareStatement("SELECT `Unit_ID`,`Unit_Register_Date` FROM `unit` WHERE `Unit_Register_Date`<> 'NULL' AND `Outstanding_Balance` IS NULL");
                ResultSet result = ps.executeQuery();  
                
                while(result.next()){
                String Unit_ID = result.getString("Unit_ID");
                String Register_date = result.getString("Unit_Register_Date");
                
                //Set the format of the register date
                LocalDate Register_date_format = LocalDate.parse(Register_date);
                //Get the current date
                LocalDate CurrentDate = LocalDate.now();
                
                //Count the difference between register date and current date
                long diffInMonth = ChronoUnit.MONTHS.between(Register_date_format,CurrentDate);
                
                
                //Count the total payment that the user did
                int rowCount = 0;
                                   
                    //SQL Select query to check the payment records
                    ps1 = con.prepareStatement("SELECT `Payment_ID` FROM `payment` JOIN `unit` ON `payment`.`Resident_ID` = `unit`.`Resident_ID`WHERE unit.Unit_ID = ?");
                    ps1.setString(1,Unit_ID);
                    ResultSet result1 = ps1.executeQuery();
                    
                    while(result1.next()){
                        //From the payment records,we can get the total payment that the user did
                        rowCount= rowCount+1;
                    }
                
                //total month stays - total payments
                diffInMonth = diffInMonth - rowCount + 1;
                               
                if(diffInMonth == 1 ){
                    //SQL UPDATE Query to update the outstanding balance's info into unit table
                    ps2 = con.prepareStatement("UPDATE `unit` SET `Outstanding_Balance`= 200, `Due_Date` = ? WHERE `Unit_ID`= ? ");
                    ps2.setString(1,dateFormat.format(Due_date)); 
                    ps2.setString(2,Unit_ID); 
                    ps2.executeUpdate();
                    
                }
                }
                
                //Check and change the account status
                ps3 = con.prepareStatement("SELECT `Resident_ID`,`Due_Date` FROM `unit` WHERE `Outstanding_Balance`<> 'NULL' AND `Due_Date` <> 'NULL'");
                ResultSet result2 = ps3.executeQuery();
                
                ps5 = con.prepareStatement("SELECT `Resident_ID`,`Due_Date` FROM `unit` WHERE `Outstanding_Balance`<> 'NULL' AND `Due_Date` <> 'NULL'");
                ResultSet result3 = ps5.executeQuery();
                
                if(result2.next()){
                    while(result3.next()){
                    String Resident_ID = result3.getString("Resident_ID");
                    Date Due_Date = result3.getDate("Due_Date");
                    
                    //Current Date is after Due Date
                    if(dateFormat.format(Current_date).compareTo(dateFormat.format(Due_Date))>0){

                        //Calculation for the days difference between current date and due date
                        long diffInMillies = Math.abs(Current_date.getTime() - Due_Date.getTime());
                        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                        int division1 = (int) (diff / 7);
                        int division2 = (int) (diff / 22);
                                              
                        //Current date is one week after due date(Need to deactivate the account)
                        if(division1 == 1 || division1 == 2 ){

                            //SQL UPDATE Query to update the account status into resident table
                            ps3 = con.prepareStatement("UPDATE `resident` SET `Account_Status`= \"Deactivated\" WHERE `Resident_ID`= ? ");
                            ps3.setString(1,Resident_ID); 
                            ps3.executeUpdate();

                        //Current date is 3 weeks after due date(Need to update to debt)    
                        }else if(division2 == 1){

                            //SQL UPDATE Query to update the account status into resident table
                            ps3 = con.prepareStatement("UPDATE `resident` SET `Account_Status`= \"Debt\", `Resident_Password` = null WHERE `Resident_ID`= ? ");
                            ps3.setString(1,Resident_ID); 
                            ps3.executeUpdate();

                            //SQL UPDATE Query to update the account info of the unit table
                            ps4 = con.prepareStatement("UPDATE `unit` SET `Unit_Register_Date`= null ,`Resident_ID`= null ,`Outstanding_Balance`= null,`Due_Date`= null WHERE `Resident_ID` = ? ");
                            ps4.setString(1,Resident_ID); 
                            ps4.executeUpdate();
                        }

                    }
                    }
                }
                
                //Charged successfully message
                JOptionPane.showMessageDialog(this,"Charged Successfully!","Charge Fees Message",JOptionPane.INFORMATION_MESSAGE);
                
            }catch(SQLException ex){
            Logger.getLogger(StaffLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_ChargeButActionPerformed

    private void PaymentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButActionPerformed
        PaymentForm1 pf1 = new PaymentForm1();
        pf1.setVisible(true);
        pf1.pack();
        pf1.setLocationRelativeTo(null);
        pf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_PaymentButActionPerformed

    private void LogoutLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLabMouseClicked
        //Confirmation Box before Logout
        int option = JOptionPane.showConfirmDialog(null,"Want to Logout?","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(option == 0){
        StaffLoginForm slf = new StaffLoginForm();
        slf.setVisible(true);
        slf.pack();
        slf.setLocationRelativeTo(null);
        slf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        }
    }//GEN-LAST:event_LogoutLabMouseClicked

    private void OverdueButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverdueButActionPerformed
        OverdueRecordForm orf = new OverdueRecordForm();
        orf.setVisible(true);
        orf.pack();
        orf.setLocationRelativeTo(null);
        orf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_OverdueButActionPerformed

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
            java.util.logging.Logger.getLogger(StaffMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StaffMenuForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChargeBut;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel FeesLab;
    private javax.swing.JLabel LogoutLab;
    private javax.swing.JButton ManageBut;
    private javax.swing.JLabel ManageResidentLab;
    private javax.swing.JLabel MenuPageLab;
    private javax.swing.JLabel MinLab;
    private javax.swing.JButton OverdueBut;
    private javax.swing.JPanel PageNameLab;
    private javax.swing.JButton PaymentBut;
    private javax.swing.JButton RegisterBut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}