/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.stub;

import com.softech.session.AccountBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Huu Tai
 */
public class AccountBeanStub {
    private AccountBeanRemote accountBeanRemote = lookupAccountBeanRemote();
    private AccountBeanRemote lookupAccountBeanRemote() {
        try {
            Context c = new InitialContext();
            return (AccountBeanRemote) c.lookup("java:comp/env/AccountBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    public float withdraw(float amount) {
        return accountBeanRemote.withdraw(amount);
    }

    
    
}
