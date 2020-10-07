/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.stub;

import com.softech.session.AccountBeanLocal;
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

    AccountBeanLocal accountBean = lookupAccountBeanLocal();

    private AccountBeanLocal lookupAccountBeanLocal() {
        try {
            Context c = new InitialContext();
            return (AccountBeanLocal) c.lookup("java:global/Ebank/Ebank-ejb/AccountBean!com.softech.session.AccountBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    public float withdraw(float amount) {
        return accountBean.withdraw(amount);
    }
    
    
}
