package com.deli.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deli.server.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
