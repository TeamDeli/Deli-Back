package com.deli.server.repository;

import com.deli.server.dto.ProductListDto;
import org.springframework.data.jpa.repository.JpaRepository;

import com.deli.server.model.Product;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>,ProductRepositoryCustom, QuerydslPredicateExecutor<Product> {
    List<ProductListDto> findByProductnameContaining(String keyword);

}
