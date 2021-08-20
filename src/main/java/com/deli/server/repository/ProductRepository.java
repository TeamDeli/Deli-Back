package com.deli.server.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.deli.server.dto.ProductListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import com.deli.server.model.Product;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>,ProductRepositoryCustom, QuerydslPredicateExecutor<Product> {
    List<ProductListDto> findByProductnameContaining(String keyword);
}
