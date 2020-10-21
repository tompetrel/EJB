/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import com.softech.entity.Product;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Huu Tai
 */
@Remote
public interface ShoppingCartBeanRemote {

    List<Product> getCart();

    void addToCart(Product product);
    
}
