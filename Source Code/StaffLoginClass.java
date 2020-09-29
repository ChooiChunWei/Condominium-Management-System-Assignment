/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.DBConnection.con;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Keith
 */
public class StaffLoginClass {
    PreparedStatement ps=null;

    StaffLoginClass(String Username,String Password){
        try {
            
            //*****Encryt the Password*****
            String HashedPassword;
            
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
            HashedPassword = sb.toString();
            
            
            
            //SQL Select query to check the username and password
            ps = con.prepareStatement("SELECT `Staff_Name`, `Staff_Password` FROM `staff` WHERE `Staff_Name`=? AND `Staff_Password`=?");
            ps.setString(1,Username);
            ps.setString(2,String.valueOf(HashedPassword));
            ResultSet result = ps.executeQuery();
                       
            if(result.next()){
                //Login successfully message
                JOptionPane.showMessageDialog(null,"Login Successfully!","Login Message",JOptionPane.INFORMATION_MESSAGE);
                
                //Open the next form
                StaffMenuForm smf = new StaffMenuForm();
                smf.setVisible(true);
                smf.pack();
                smf.setLocationRelativeTo(null);
                smf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
                
            }else{
                //Error message for invalid username/password
                JOptionPane.showMessageDialog(null,"Wrong Username or Password!","Login Message",JOptionPane.ERROR_MESSAGE);
                
                //Reopen the login form
                StaffLoginForm slf = new StaffLoginForm();
                slf.setVisible(true);
                slf.pack();
                slf.setLocationRelativeTo(null);
                slf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffLoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(StaffLoginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
