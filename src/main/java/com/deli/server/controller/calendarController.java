package com.deli.server.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deli.server.model.Anniversary;
import com.deli.server.repository.AnniversaryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/calendar")
public class calendarController {
	
	@Autowired
	private AnniversaryRepository anniversaryrepository;
	
	@CrossOrigin
	@GetMapping(value="/get") //친구 캘린더(user_id)는 다시 공부 후 구현
	public List<Anniversary> getAllEvents() {
		return anniversaryrepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping(value="/post")
	public Anniversary save(@RequestBody Anniversary anniversary) {
		return anniversaryrepository.save(anniversary);
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		try {
			anniversaryrepository.deleteById(id);
		}catch(EmptyResultDataAccessException e){
			return "삭제실패했습니다.";
		}
		
		return "삭제";
	}
}