/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author Huu Tai
 */
@Stateless
public class AccountBean implements AccountBeanRemote, AccountBeanLocal {
    private float balance = 600;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public float withdraw(float amount) {
        System.out.println("Widthdraw");
        balance = balance - amount;
        return balance;
    }
    @PostConstruct
    public void postconstruct(){
        System.out.println("Post");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }
    
}
