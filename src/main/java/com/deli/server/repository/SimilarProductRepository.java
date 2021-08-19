package com.deli.server.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deli.server.model.SimilarProduct;

public interface SimilarProductRepository extends JpaRepository<SimilarProduct, Integer>{
	List<SimilarProduct> findByUserId(int id);

}
