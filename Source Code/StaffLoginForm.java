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
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form StaffLoginForm
     */
    public StaffLoginForm() {
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

        jPanel1 = new javax.swing.JPanel();
        CloseLab = new javax.swing.JLabel();
        StaffLoginPageLab = new javax.swing.JLabel();
        MinLab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UsernameLab = new javax.swing.JLabel();
        TitleLab = new javax.swing.JLabel();
        PasswordLab = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        LoginBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        ClearBut = new javax.swing.JButton();
        ShowPassChk = new javax.swing.JCheckBox();

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

        StaffLoginPageLab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StaffLoginPageLab.setForeground(new java.awt.Color(255, 255, 255));
        StaffLoginPageLab.setText("Staff Login Page");

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
                .addComponent(StaffLoginPageLab)
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
                    .addComponent(StaffLoginPageLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        UsernameLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        UsernameLab.setForeground(new java.awt.Color(255, 204, 204));
        UsernameLab.setText("Username :");

        TitleLab.setFont(new java.awt.Font("Arial Black", 0, 26)); // NOI18N
        TitleLab.setForeground(new java.awt.Color(255, 255, 255));
        TitleLab.setText("Welcome To Staff Login Page");
        TitleLab.setToolTipText("");

        PasswordLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PasswordLab.setForeground(new java.awt.Color(255, 204, 204));
        PasswordLab.setText("Password :");

        UsernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameTxtKeyTyped(evt);
            }
        });

        LoginBut.setBackground(new java.awt.Color(0, 0, 0));
        LoginBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LoginBut.setForeground(new java.awt.Color(255, 204, 204));
        LoginBut.setText("Login");
        LoginBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        LoginBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButActionPerformed(evt);
            }
        });

        BackBut.setBackground(new java.awt.Color(0, 0, 0));
        BackBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BackBut.setForeground(new java.awt.Color(255, 204, 204));
        BackBut.setText("Back");
        BackBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        BackBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        ClearBut.setBackground(new java.awt.Color(0, 0, 0));
        ClearBut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ClearBut.setForeground(new java.awt.Color(255, 204, 204));
        ClearBut.setText("Clear");
        ClearBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        ClearBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        ShowPassChk.setBackground(new java.awt.Color(0, 0, 0));
        ShowPassChk.setForeground(new java.awt.Color(255, 204, 204));
        ShowPassChk.setText("Show Password");
        ShowPassChk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowPassChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassChkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitleLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LoginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLab)
                            .addComponent(UsernameLab))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowPassChk)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PasswordTxt)
                                .addComponent(UsernameTxt)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleLab)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLab)
                    .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLab)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowPassChk)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
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

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        WelcomeForm wf = new WelcomeForm();
        wf.setVisible(true);
        wf.pack();
        wf.setLocationRelativeTo(null);
        wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_BackButActionPerformed

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButActionPerformed
        StaffLoginForm slf = new StaffLoginForm();
        slf.setVisible(true);
        slf.pack();
        slf.setLocationRelativeTo(null);
        slf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ClearButActionPerformed

    private void LoginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButActionPerformed
        
            //Connect to database
            DBConnection conn = new DBConnection();
            conn.connection();
                      
            //Using Constructor Method to login
            String username, password;
            username = UsernameTxt.getText();
            password = String.valueOf(PasswordTxt.getPassword());
            
            if(Pattern.matches(".*[A-Z].*",password)){
                int option = JOptionPane.showConfirmDialog(null,"Case sensitive.\nProceed with the uppercase letter in password?","Confirmation Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
                if(option == 0){
                StaffLoginClass slc = new StaffLoginClass(username,password);
                this.setVisible(false);
                }
            }else{
                StaffLoginClass slc = new StaffLoginClass(username,password);
                this.setVisible(false);
            }   
            
            
            
                                           
    }//GEN-LAST:event_LoginButActionPerformed

    private void ShowPassChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassChkActionPerformed
        if(ShowPassChk.isSelected()){
           PasswordTxt.setEchoChar((char)0); 
        }else{
           PasswordTxt.setEchoChar('*'); 
        }
        
    }//GEN-LAST:event_ShowPassChkActionPerformed

    private void UsernameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTxtKeyTyped
        //Validate the user can type Alpabet and space only
        char c = evt.getKeyChar();
        if(!(Character.isLowerCase(c) || c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE || Character.isWhitespace(c))){
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
            java.util.logging.Logger.getLogger(StaffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StaffLoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ClearBut;
    private javax.swing.JLabel CloseLab;
    private javax.swing.JButton LoginBut;
    private javax.swing.JLabel MinLab;
    private javax.swing.JLabel PasswordLab;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JCheckBox ShowPassChk;
    private javax.swing.JLabel StaffLoginPageLab;
    private javax.swing.JLabel TitleLab;
    private javax.swing.JLabel UsernameLab;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
