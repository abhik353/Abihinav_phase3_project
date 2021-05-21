package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Shoe;

public interface ShoeDao extends CrudRepository<Shoe, Integer> {

}
