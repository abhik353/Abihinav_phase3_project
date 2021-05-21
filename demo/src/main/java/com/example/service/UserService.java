package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class UserService {
	private static int userCount = 1;
	
	@Autowired
	private UserDao userDao;
	
	public void registerUser(String userName, String password, String email) {
		userDao.save(new User(++userCount,userName,password,email));
	}
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		userDao.findAll().forEach(x -> users.add(x));
		return users;
	}
	
	public List<User> searchUsers(String name){
		List<User> users = new ArrayList<User>();
		userDao.findAll().forEach(x ->{
		if((x.getUserName()).equals(name)) 
		{
			users.add(x);
		}
		});
		return users;
	}
}
