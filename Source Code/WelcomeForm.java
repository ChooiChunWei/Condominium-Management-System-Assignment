/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.JFrame;

/**
 *
 * @author Keith
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
        initComponents();
        this.setLocationRelativeTo(null);//Make the form in the center
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        WelcomePageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        StaffBut = new javax.swing.JButton();
        LoginLab = new javax.swing.JLabel();
        TitleLab = new javax.swing.JLabel();
        ResidentBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
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

        WelcomePageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WelcomePageLab.setForeground(new java.awt.Color(255, 255, 255));
        WelcomePageLab.setText("Welcome Page");

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
                .addComponent(WelcomePageLab)
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
                    .addComponent(WelcomePageLab, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        StaffBut.setBackground(new java.awt.Color(0, 0, 0));
        StaffBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        StaffBut.setForeground(new java.awt.Color(255, 204, 204));
        StaffBut.setText("Staff");
        StaffBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        StaffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StaffBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButActionPerformed(evt);
            }
        });

        LoginLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LoginLab.setForeground(new java.awt.Color(255, 204, 204));
        LoginLab.setText("Login As:");

        TitleLab.setFont(new java.awt.Font("Arial Black", 0, 26)); // NOI18N
        TitleLab.setForeground(new java.awt.Color(255, 255, 255));
        TitleLab.setText("Condominium Management System");
        TitleLab.setToolTipText("");

        ResidentBut.setBackground(new java.awt.Color(0, 0, 0));
        ResidentBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ResidentBut.setForeground(new java.awt.Color(255, 204, 204));
        ResidentBut.setText("Resident");
        ResidentBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ResidentBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResidentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidentButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(TitleLab))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StaffBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResidentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LoginLab)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TitleLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(LoginLab)
                .addGap(18, 18, 18)
                .addComponent(StaffBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResidentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResidentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidentButActionPerformed
        ResidentLoginForm rlf = new ResidentLoginForm();
        rlf.setVisible(true);
        rlf.pack();
        rlf.setLocationRelativeTo(null);
        rlf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_ResidentButActionPerformed

    private void StaffButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButActionPerformed
        StaffLoginForm slf = new StaffLoginForm();
        slf.setVisible(true);
        slf.pack();
        slf.setLocationRelativeTo(null);
        slf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_StaffButActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WelcomeForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLab;
    private javax.swing.JLabel LoginLab;
    private javax.swing.JLabel MinLab;
    private javax.swing.JButton ResidentBut;
    private javax.swing.JButton StaffBut;
    private javax.swing.JLabel TitleLab;
    private javax.swing.JLabel WelcomePageLab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
