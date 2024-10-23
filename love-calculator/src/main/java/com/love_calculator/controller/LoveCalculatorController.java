package com.love_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.love_calculator.dto.Lovers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/")
	@ResponseBody
	public String insertUserDetails()
	{
		return "homePage";
	}
//	
//	@RequestMapping("/register")
//	public String getHomePage(@ModelAttribute("userreg") UserRegister user) {
//		return "homePage";
//	}
//	
//	@RequestMapping("/homepage")
//	public String getCalculate(@ModelAttribute("lover")Lovers lovers,HttpServletRequest req) {
//		
//		HttpSession session	=req.getSession();
//		session.setAttribute("yourName",lovers.getYourName());
//		
//		return "result";
//	}
//	
}
