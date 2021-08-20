package com.deli.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deli.server.model.Product;
import com.deli.server.repository.ProductRepository;
import com.deli.server.service.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")   //localhost:8000/deli/product가 매칭
public class productController {
	
	private ProductRepository productRepository;
	@Autowired
	private ProductService productService;
	private Product product;

	@GetMapping("/{id}")
	public Product product(@PathVariable int id) {
		System.out.println("id: "+id);
		product=productService.getProduct(id);
		return product;
	}

}
