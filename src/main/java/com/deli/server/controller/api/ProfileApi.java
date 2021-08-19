package com.deli.server.controller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deli.server.dto.ProfileResponseDto;
import com.deli.server.model.Friends;
import com.deli.server.model.Product;
import com.deli.server.model.User;
import com.deli.server.model.WishList;
import com.deli.server.service.ProfileService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProfileApi {
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/api/profile/{id}")
	public ResponseEntity<ProfileResponseDto> getProfile(@PathVariable int id) {
		
		//사용자 정보
		User user = profileService.getUserInfo(id);
		if (user==null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
		}
		ProfileResponseDto profileResponseDto = new ProfileResponseDto();
		
		//리팩토링 필요
		profileResponseDto.setStatus(HttpStatus.OK);
		profileResponseDto.setUserImage(user.getImage());
		profileResponseDto.setUsername(user.getUsername());
		profileResponseDto.setComment(user.getComment());
		profileResponseDto.setAge(user.getAge());
		profileResponseDto.setGender(user.getGender());
		profileResponseDto.setBirth(user.getBirth());
		
		//사용자 위시리스트
		List<WishList> wishList = profileService.getWishList(id);
		List<Product> productList = new ArrayList<>();
		for (int i=0; i<4; i++) {
			productList.add(wishList.get(i).getProduct());
		}
		profileResponseDto.setWishList(productList);
		
		//사용자 친구
		List<String> friendName = new ArrayList<>();
		List<Friends> friendList = profileService.getFriendList(id);
		
		for (int i=0; i<friendList.size(); i++) {
			friendName.add(friendList.get(i).getFriend().getUsername());
		}
		profileResponseDto.setFriends(friendName);
		
		
		return new ResponseEntity<>(profileResponseDto, HttpStatus.OK); 
	}


	
}

