package com.deli.server.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.deli.server.dto.FriendsResponseDto;
import com.deli.server.model.User;
import com.deli.server.model.WishList;
import com.deli.server.service.AddFriendsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class addFriendsController {

	@Autowired
	private AddFriendsService addFriendsService;

	@GetMapping("/api/addFriends")
	public ResponseEntity<?> getFriends() {

		List<User> allUserProfiles = addFriendsService.getAllUserInfo();

		return new ResponseEntity<>(allUserProfiles, HttpStatus.OK);
	}
	
	@GetMapping("/api/WishOfFriend/{id}")
	public ResponseEntity<?> getWishOfFriend(@PathVariable int id){
		//사용자 정보
		List<WishList> wishList = addFriendsService.getWishList(id);
		if (wishList==null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
		}
		return new ResponseEntity<>(wishList, HttpStatus.OK);
	}

}
