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
class Payment {
    private final Date PaymentDate, DueDate;
    private final int PaymentAmount;
    
    public Payment(Date PaymentDate, Date DueDate, int PaymentAmount){
        this.DueDate = DueDate;
        this.PaymentDate = PaymentDate;
        this.PaymentAmount = PaymentAmount;
    }
    
    public Date getPaymentDate(){
        return PaymentDate;
    }
    
    public Date getDueDate(){
        return DueDate;
    }
    
    public int getPaymentAmount(){
        return PaymentAmount;
    }
}
