/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Rana Alie
 */
public class Lab3_HomeActivity2_Runner {
    public static void main(String[] args){
        Account a1;
        a1 = new Account();
        a1.deposit(500);
        System.out.println(a1.getBalance());
        a1.withdraw(100);
        System.out.println(a1.getBalance());
    }
}
