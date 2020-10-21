/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.client;

import com.softech.session.HitCounterBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author Huu Tai
 */
public class MainClass {

    @EJB
    private static HitCounterBeanRemote hitCounterBean;

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Hello Shopping Cart");
        int hit = hitCounterBean.increment();
        System.out.println("Hit Counter: " + hit);
    }
    
}
