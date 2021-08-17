package com.deli.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deli.server.model.WishList;

public interface WishListRepository extends JpaRepository<WishList, Integer>{

}

