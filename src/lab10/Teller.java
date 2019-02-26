/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Almodad
 */
public class Teller{
    int tellerID;
    float initialAmt;
    public Teller(int tID, float initialAmount){
        tellerID = tID;
        initialAmt = initialAmount;
    }
    public void tellerBalance(Account[] accounts){
        float totalBal = 0;
        for(int i = 0; i < accounts.length; i++){
            totalBal += accounts[i].accBalance();
        }
        totalBal += initialAmt;
        System.out.println("Balance: "+totalBal);
    }
}
