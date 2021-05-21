package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.User;
import com.example.service.UserService;

@Controller
@SessionAttributes("name")
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public String listUsersPage(ModelMap model) {
		String name = (String) model.get("name");
		model.put("users", service.getUsers());
		return "list-users";
	}
	
	@RequestMapping(value = "/register-user", method = RequestMethod.GET)
	public String registerUser(ModelMap model) {
		model.addAttribute("user",new User());
		
		return "register-user";
	}
	
	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public String registerUser(ModelMap model,@ModelAttribute("user") User user,BindingResult result) {
		if (result.hasErrors()) {
			return "register-user";
		}
		
		service.registerUser(user.getUserName(), user.getPassword(),user.getEmail());
		return "redirect:/search-shoes";
	}
	
	
	@RequestMapping(value = "/search-user",method = RequestMethod.POST)
	public String searchUsersPage(@RequestParam (value="cn", required= false) String name,Model model) {
		

		model.addAttribute("cn",service.searchUsers(name));
		return "filtered-Users";
	}
	
	
	@RequestMapping(value="/searched-users", method = RequestMethod.GET)
	public String showSearchUser(ModelMap model){
		return "searched-users";
	}
}
