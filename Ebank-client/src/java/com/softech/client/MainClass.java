/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.client;

import com.softech.stub.AccountBeanStub;

/**
 *
 * @author Huu Tai
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountBeanStub stub = new AccountBeanStub();
        System.out.println("Withdraw: 200: Balance:"  + stub.withdraw(200));
    }
    
}
