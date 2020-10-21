/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.stub;

import com.softech.entity.ProductsEntity;
import com.softech.session.ProductsEntityFacadeLocal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author HuuTai
 */
public class ProductsEntityFacadeStub {

    ProductsEntityFacadeLocal productsEntityFacade = lookupProductsEntityFacadeLocal();

    private ProductsEntityFacadeLocal lookupProductsEntityFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (ProductsEntityFacadeLocal) c.lookup("java:global/LMSEA/LMSEA-ejb/ProductsEntityFacade!com.softech.session.ProductsEntityFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    public void create(ProductsEntity productsEntity) {
        productsEntityFacade.create(productsEntity);
    }

    public void edit(ProductsEntity productsEntity) {
        productsEntityFacade.edit(productsEntity);
    }

    public void remove(ProductsEntity productsEntity) {
        productsEntityFacade.remove(productsEntity);
    }

    public ProductsEntity find(Object id) {
        return productsEntityFacade.find(id);
    }

    public List<ProductsEntity> findAll() {
        return productsEntityFacade.findAll();
    }

    public List<ProductsEntity> findRange(int[] range) {
        return productsEntityFacade.findRange(range);
    }

    public int count() {
        return productsEntityFacade.count();
    }
    
    
}
