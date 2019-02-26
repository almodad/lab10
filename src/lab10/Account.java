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
public class Account{
    String firstName, secondName;
    int idNumber;
    float balanceBF, deposits, withdrawals;
    public Account(String fname, String lname, int id,
            float bBF, float dep, float withd){
        this.firstName = fname;
        this.secondName = lname;
        this.idNumber = id;
        this.balanceBF = bBF;
        this.deposits = dep;
        this.withdrawals = withd;
    }
    
    public void accDeposit(float amt){
        if(amt > 0){
            deposits += amt;
        }
    }
    
    public void accWithdraw(float amt){
        if(deposits+balanceBF >= amt){
            withdrawals += amt;
        }
    }
    
    public float accBalance(){
        return (deposits+balanceBF)-withdrawals;
    }
}
