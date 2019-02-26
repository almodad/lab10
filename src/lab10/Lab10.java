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
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account[] accounts = new Account[1];
        Account object1 = new Account("Alice","Bob",
                1234567,3500, 5000, 1800);
        object1.accDeposit(300);
        object1.accWithdraw(8000);
        accounts[0] = object1;
        //initialize teller class
        Teller object2 = new Teller(1,2000);
        object2.tellerBalance(accounts);
    }
    
}
