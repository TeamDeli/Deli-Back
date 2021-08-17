package com.deli.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deli.server.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
