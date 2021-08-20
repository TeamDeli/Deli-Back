package com.deli.server.repository;

import com.deli.server.dto.ProductListDto;
import com.deli.server.dto.ProductSearchCondition;

import java.util.List;

public interface ProductRepositoryCustom {
    List<ProductListDto> search(ProductSearchCondition condition);
}
