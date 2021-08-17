package com.deli.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deli.server.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

