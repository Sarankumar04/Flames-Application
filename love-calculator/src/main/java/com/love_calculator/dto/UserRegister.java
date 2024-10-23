package com.love_calculator.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Data;

@Component
@Entity
@Data
public class UserRegister {

	private String name;
	private String userName;
	private String password;
	private String country;
	private String gender;
	
}
