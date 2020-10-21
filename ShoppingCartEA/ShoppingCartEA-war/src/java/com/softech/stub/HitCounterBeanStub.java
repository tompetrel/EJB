/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.stub;

import com.softech.session.HitCounterBeanLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Huu Tai
 */
public class HitCounterBeanStub {

    HitCounterBeanLocal hitCounterBean = lookupHitCounterBeanLocal();

    private HitCounterBeanLocal lookupHitCounterBeanLocal() {
        try {
            Context c = new InitialContext();
            return (HitCounterBeanLocal) c.lookup("java:global/ShoppingCartEA/ShoppingCartEA-ejb/HitCounterBean!com.softech.session.HitCounterBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    public int increment() {
        return hitCounterBean.increment();
    }
    
    
}
