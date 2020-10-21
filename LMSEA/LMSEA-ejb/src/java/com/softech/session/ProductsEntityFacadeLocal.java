/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.session;

import com.softech.entity.ProductsEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HuuTai
 */
@Local
public interface ProductsEntityFacadeLocal {

    void create(ProductsEntity productsEntity);

    void edit(ProductsEntity productsEntity);

    void remove(ProductsEntity productsEntity);

    ProductsEntity find(Object id);

    List<ProductsEntity> findAll();

    List<ProductsEntity> findRange(int[] range);

    int count();
    
}
