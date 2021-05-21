package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/")
public class UsertestController {

	@Autowired
	private UserService service;
	
	@GetMapping(value="/{name}")
	public List<User> findUser(@PathVariable("name")String name){
		List<User> users = service.searchUsers(name);
		return users;
	}
	
	@GetMapping(value="/")
	public List<User> getUsers(){
		List<User> users = service.getUsers();
		return users;
	}
	
	/*
	@RequestMapping(value = "search-user",method = RequestMethod.POST)
	public List<User> searchUsersPage(@RequestParam (value="cn", required= false) String name,Model model) {
		
		
	
		model.addAttribute("cn",service.searchUsers(name));
		
		return service.searchUsers(name);
	}*/
}
