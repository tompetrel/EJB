/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.stub;

import com.softech.session.ShoppingCartBeanLocal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Huu Tai
 */
public class ShoppingCartBeanStub {

    public static ShoppingCartBeanStub instance = newInstance();
    
    private static ShoppingCartBeanStub newInstance(){
        return new ShoppingCartBeanStub();
    }
    
    ShoppingCartBeanLocal shoppingCartBean = lookupShoppingCartBeanLocal();

    private ShoppingCartBeanLocal lookupShoppingCartBeanLocal() {
        try {
            Context c = new InitialContext();
            return (ShoppingCartBeanLocal) c.lookup("java:global/ShoppingCartEA/ShoppingCartEA-ejb/ShoppingCartBean!com.softech.session.ShoppingCartBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    public List<com.softech.entity.Product> getCart() {
        return shoppingCartBean.getCart();
    }

    public void addToCart(com.softech.entity.Product product) {
        shoppingCartBean.addToCart(product);
    }
    
    
}
