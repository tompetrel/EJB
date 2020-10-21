/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import javax.ejb.Singleton;

/**
 *
 * @author Huu Tai
 */
@Singleton
public class HitCounterBean implements HitCounterBeanRemote, HitCounterBeanLocal {
    int counter = 0;
    @Override
    public int increment() {
        System.out.println("Counter" + counter);
        counter++;
        return counter;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
