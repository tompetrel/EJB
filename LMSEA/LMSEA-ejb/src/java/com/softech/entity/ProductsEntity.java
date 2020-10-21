/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HuuTai
 */
@Entity
@Table(name = "Products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsEntity.findAll", query = "SELECT p FROM ProductsEntity p")
    , @NamedQuery(name = "ProductsEntity.findByProductId", query = "SELECT p FROM ProductsEntity p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductsEntity.findByName", query = "SELECT p FROM ProductsEntity p WHERE p.name = :name")})
public class ProductsEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductId")
    private Integer productId;
    @Size(max = 50)
    @Column(name = "Name")
    private String name;

    public ProductsEntity() {
    }

    public ProductsEntity(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsEntity)) {
            return false;
        }
        ProductsEntity other = (ProductsEntity) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softech.entity.ProductsEntity[ productId=" + productId + " ]";
    }
    
}
