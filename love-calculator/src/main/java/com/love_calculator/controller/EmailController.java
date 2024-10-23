package com.love_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love_calculator.dto.Email;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmailController {

	
	@RequestMapping("sendemail")
	public String sendEmail(@ModelAttribute("email")Email email,HttpServletRequest req) {

	  HttpSession session	=req.getSession();
	  System.out.println(session.getAttribute("yourName"));
		return "sendemail";
	}
	
	@RequestMapping("processemail")
	public String processEmail(@ModelAttribute("email") Email email) {

		return "process";
	}
	
}
