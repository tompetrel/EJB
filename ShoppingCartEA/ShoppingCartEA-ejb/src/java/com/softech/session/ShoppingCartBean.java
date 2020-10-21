/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import com.softech.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Huu Tai
 */
@Stateful
public class ShoppingCartBean implements ShoppingCartBeanRemote, ShoppingCartBeanLocal {
    private List<Product> cart;
    
    public ShoppingCartBean() {
        this.cart = new ArrayList<>();
    }
    @Override
    public void addToCart(Product product){
        System.out.println("Add to Cart");
        cart.add(product);
    }
    
    @Override
    public List<Product> getCart() {
        return cart;
    }
    
}
