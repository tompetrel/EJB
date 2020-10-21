/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import javax.ejb.Local;

/**
 *
 * @author Huu Tai
 */
@Local
public interface HitCounterBeanLocal {
    int increment();
}
