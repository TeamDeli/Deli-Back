package com.deli.server.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

// Member와 같은 기능
@Data
@Entity
public class SimilarProduct {
	@Id @GeneratedValue
	@Column(name = "SimilarProduct_ID")
	 private int id;
	
	@ManyToOne
	@JoinColumn(name="Product_ID")
	private Product product;
	
	public void setProduct(Product product) {
		this.product=product;
		
		if(!product.getSimilarProducts().contains(this)) {
			product.getSimilarProducts().add( this);
		}
	}
}
