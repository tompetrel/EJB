/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import com.softech.entity.ProductsEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HuuTai
 */
@Stateless
public class ProductsEntityFacade extends AbstractFacade<ProductsEntity> implements ProductsEntityFacadeLocal {

    @PersistenceContext(unitName = "LMSEA-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductsEntityFacade() {
        super(ProductsEntity.class);
    }
    
}
