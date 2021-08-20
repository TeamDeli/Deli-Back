package com.deli.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SimilarProduct {
    @Id @GeneratedValue
    @Column(name = "SimilarProduct_ID")
     private int id;

    @ManyToOne
    @JoinColumn(name="Product_ID")
    @JsonIgnore
    private Product product;

    public void setProduct(Product product) {
        this.product=product;

        if(!product.getSimilarProducts().contains(this)) {
            product.getSimilarProducts().add(this);
        }
    }
}
