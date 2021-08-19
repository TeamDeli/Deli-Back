package com.deli.server.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 참고 1) https://jacojang.github.io/jpa/java/hibernate/2016/12/27/jpa-chapter6-%EB%8B%A4%EC%96%91%ED%95%9C_%EC%97%B0%EA%B4%80%EA%B4%80%EA%B3%84_%EB%A7%A4%ED%95%91.html
// 참고 2) https://victorydntmd.tistory.com/208

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_ID")
	private int id;
	
	@Column(nullable = false, length = 30)
	private String productname;
	
	@Column(nullable = true)
	private int star;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false, length = 30)
	private String hash1;
	
	@Column(nullable = true, length = 30)
	private String hash2;
	
	@Column(nullable = true, length = 30)
	private String hash3;
	
	@Column(nullable = false, length = 200)
	private String info;
	
	@Column(nullable = true)
	private int price;
	
	@Column(nullable = false)
	private String imageUrl;
	
	/*
	@OneToMany()
	@JoinColumn(name="Product_ID")
	private List<SimilarProduct> similarProducts;
	
	public void addSimilarProduct(SimilarProduct similarProduct) {
		this.similarProducts.add(similarProduct);
		
		if(similarProduct.getProduct()!=this) {
			similarProduct.setProduct(this);
		}
	}*/
	
	/*
	@ManyToOne
    @JoinColumn
    private Product similarProducts = this;

    @OneToMany(mappedBy = "similarProducts")
    private List<Product> similarProductList = new ArrayList<Product>();
    
    public void addSimmilarProduct(Product product) {
    	this.similarProductList.add(this);
    }
    */
    
}
