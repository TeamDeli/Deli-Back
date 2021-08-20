package com.deli.server.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deli.server.model.Friends;
import com.deli.server.model.User;

public interface FriendRepository extends JpaRepository<Friends, Integer> {
	List<Friends> findByUserId(int user_id);
}
