package com.SpringProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringProject.model.User;
import com.SpringProject.service.UserService;

@Controller

public class UserController {
    @Autowired
    UserService userService;
	@RequestMapping(value = "/register" ,method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("welcome","Register",new User());
	}
	@RequestMapping(value = "/saveuser",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("Register") User user){
		userService.save(user);
		return "welcome";
	}

 }
