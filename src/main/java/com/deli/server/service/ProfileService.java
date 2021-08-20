package com.deli.server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.deli.server.model.Friends;
import com.deli.server.model.User;
import com.deli.server.model.WishList;
import com.deli.server.repository.FriendRepository;
import com.deli.server.repository.UserRepository;
import com.deli.server.repository.WishListRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfileService {
	
	private final UserRepository userRepository;
	private final WishListRepository wishListRepository;
	private final FriendRepository friendRepository;

	//프로필에 띄울 사용자 가져오기
	@Transactional
	public User getUserInfo(int id) {
		User user = userRepository.findById(id).orElseThrow(()->{
			return new IllegalArgumentException("해당 사용자는 없습니다.");
		});
		return user;
	}
	
	//친구리스트 가져오기
	@Transactional
	public List getFriendList(int id) {
		List<Friends> friendList = (List<Friends>) friendRepository.findByUserId(id);
		return friendList;
	}
	
	//위시리스트 가져오기
	@Transactional
	public List getWishList(int id) {
		List<WishList> wishList = (List<WishList>) wishListRepository.findByUserId(id);
		return wishList;
	}
}
