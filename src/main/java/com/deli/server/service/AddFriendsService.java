package com.deli.server.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deli.server.model.User;
import com.deli.server.model.WishList;
import com.deli.server.repository.UserRepository;
import com.deli.server.repository.WishListRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddFriendsService {
	
	private final UserRepository userRepository;
	private final WishListRepository wishListRepository;
	
	//모든 사용자 프로필정보 정보 불러오기
	@Transactional
	public List<User> getAllUserInfo() {
		List<User> AllUserProfiles = userRepository.findAll();
		return AllUserProfiles;
	}
	
	//위시리스트 가져오기
	public List<WishList> getWishList(int id) {
		List<WishList> wishList = (List<WishList>) wishListRepository.findByUserId(id);
		return wishList;
	}
}
