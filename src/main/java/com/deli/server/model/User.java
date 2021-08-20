package com.deli.server.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 10)
	private int age;
	
	@Column(nullable = false, length = 30, unique = true)
	private String email;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(nullable = false, length = 30, unique = true)
	private String username;
	
	@Column(nullable = true)
	private String image;
	
	@Column(nullable = false, length = 10)
	private String gender;
	
	@Column(nullable = false, length = 100)
	private String birth;
	
	@Column(nullable = true, length = 80)
	private String comment;
}
