package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Users;
import com.services.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/")
	public String registered(Model model) {
		
		model.addAttribute("RegistrationForm", new Users());
		
		return "register";
	}
	@PostMapping("/register")
   public String register(@ModelAttribute("RegistrationForm") Users users) {
		
		if(users.getPassword().equals(users.getCpassword())) {
			 userServiceImpl.addUser(users);
			 return "home";
		}
		return "error";
		
		
	}
	

}
