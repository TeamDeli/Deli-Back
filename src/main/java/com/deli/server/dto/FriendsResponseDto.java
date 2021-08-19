package com.deli.server.dto;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.deli.server.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FriendsResponseDto {

	HttpStatus status;
	private List<User> allUserProfiles;
}