/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Keith
 */
public class DBConnection {
    public static Connection con=null;
    
    public void connection()
    {
        try{
            //connection to database
            // load and register JDBC driver for MySQL 
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassignmentdb?serverTimezone=UTC", "root", "root");

        }catch(Exception e){
            System.out.println(e);
        }
    }
      
}
