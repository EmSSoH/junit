/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testJunit;

/**
 *
 * @author Magnus West Madsen
 */
public class TaxCalculator {
    
    
    public double Tax (double amount){
        
        if(amount <= 0){
            return 0;
        } 
        else if(amount <= 25000){
            return ((amount / 100)* 21);
        }
        else if(amount <= 90000){
            return ((amount / 100)* 31);
        }
        else if(amount <= 200000){
            return ((amount / 100)* 37);
        }
        else if(amount <= 330000){
            return ((amount / 100)* 43);
        }
        else if(amount <= 450000){
            return ((amount / 100)* 52);
        }
        else {
            return ((amount / 100)* 52);
        }
    }
    
}
