package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

public interface UserDao extends CrudRepository<User, Integer> {

}
