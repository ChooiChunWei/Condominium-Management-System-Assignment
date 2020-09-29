/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.ResidentLoginForm.Resident_ID;
import static assignment.DBConnection.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keith
 */
public class PaymentRecordForm extends javax.swing.JFrame {

    /**
     * Creates new form PaymentRecordForm
     */
    public PaymentRecordForm() {
        initComponents();
        display_Payment();
    }
    
    public ArrayList<Payment> paymentList(){
        ArrayList<Payment> paymentList = new ArrayList<>(); 
        try{
            //Connect to database
            DBConnection conn = new DBConnection();
            conn.connection();
            PreparedStatement ps;
            
            //SQL Select query to get the info from payment table
            ps = con.prepareStatement("SELECT * FROM `payment` WHERE `Resident_ID`= ? ORDER BY `Payment_Date` DESC ");
            ps.setString(1,Resident_ID);
            ResultSet result = ps.executeQuery();
            Payment payment;
            
            while(result.next()){
                payment = new Payment(result.getDate("Payment_Date"),result.getDate("Due_Date"),result.getInt("Payment_Amount"));
                paymentList.add(payment);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PaymentRecordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paymentList;
    }
    
    public final void display_Payment(){
        ArrayList<Payment> list = paymentList();
        DefaultTableModel model = (DefaultTableModel)DisplayPaymentRecordTable.getModel();
        Object[] row = new Object[5];
        for(int i = 0; i<list.size(); i++){
            row[0] = i + 1;
            row[1] = list.get(i).getPaymentDate();
            
            if(list.get(i).getDueDate() == null){
                row[2] = "               ---";
            }else{
                row[2] = list.get(i).getDueDate();
            }
            
            row[3] = list.get(i).getPaymentAmount();
            
            if(list.get(i).getPaymentAmount() >200){
                row[4] = "50";
            }else{
                row[4] = "0";
            }
            model.addRow(row);
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
        DoneBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayPaymentRecordTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        PaymentRecordPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        DoneBut.setBackground(new java.awt.Color(0, 0, 0));
        DoneBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DoneBut.setForeground(new java.awt.Color(255, 204, 204));
        DoneBut.setText("Done");
        DoneBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        DoneBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoneBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButActionPerformed(evt);
            }
        });

        DisplayPaymentRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Payment Date", "Due Date", "Payment Amount", "Fine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DisplayPaymentRecordTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DoneBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(DoneBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

        PaymentRecordPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PaymentRecordPageLab.setForeground(new java.awt.Color(255, 255, 255));
        PaymentRecordPageLab.setText("Payment Record Page");

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
                .addComponent(PaymentRecordPageLab)
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
                    .addComponent(PaymentRecordPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void DoneButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButActionPerformed
        //Open Staff Menu Form
        ResidentMenuForm rmf = new ResidentMenuForm();
        rmf.setVisible(true);
        rmf.pack();
        rmf.setLocationRelativeTo(null);
        rmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_DoneButActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PaymentRecordForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLab;
    private javax.swing.JTable DisplayPaymentRecordTable;
    private javax.swing.JButton DoneBut;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel PaymentRecordPageLab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
