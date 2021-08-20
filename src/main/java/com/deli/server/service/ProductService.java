package com.deli.server.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.deli.server.model.Product;
import com.deli.server.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
	@Transactional
	public Product getProduct(int id) {
		return productRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Product id를 확인해주세요."));
	}

}
