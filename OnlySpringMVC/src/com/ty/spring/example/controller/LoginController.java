package com.ty.spring.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.spring.example.entity.User;

@Controller
public class LoginController {

	@RequestMapping(value="/login/loginindex")
	public String login(User users,Model model){
//		User use=new User();
//		use.setPassword(users.getPassword());
//		use.setUsername(users.getUsername());
//		User userRes=new User();
//		userRes.setPassword(user.getPassword());
//		userRes.setUsername(user.getUsername());
		model.addAttribute(users);
	
				return "index";
		
//		return "redirect:/login";
//		return "index";
	} 
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
