package com.love_calculator.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

import lombok.Data;

@Component
@Entity
@Data
public class Lovers {
	private String yourName;
	private String gfName;
}
