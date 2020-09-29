/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;

/**
 *
 * @author Keith
 */
class Overdue {
    private final String Unit_No,Username,Email,Account_Status,Phone_Number;
    private final Date Due_Date;
    
    public Overdue(String Unit_No, String Username, String Phone_Number, String Email, String Account_Status, Date Due_Date){
        this.Unit_No = Unit_No;
        this.Username = Username;
        this.Phone_Number = Phone_Number;
        this.Email = Email;
        this.Account_Status = Account_Status;
        this.Due_Date = Due_Date;
}
    public String getUnit_No(){
        return Unit_No;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public String getPhone_Number(){
        return Phone_Number;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public String getAccount_Status(){
        return Account_Status;
    }
    
    public Date getDue_Date(){
        return Due_Date;
    }
}
