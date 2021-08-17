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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 30)
	private String productname;
	
	@Column(nullable = true)
	private int star;
	
	@Column(nullable = false)
	private int gender;
	
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
	
	@ManyToOne
    @JoinColumn
    private Product similarProducts = this;

    @OneToMany(mappedBy = "similarProducts")
    private List<Product> similarProductList = new ArrayList<Product>();
    
}
