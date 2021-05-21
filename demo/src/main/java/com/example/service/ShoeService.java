package com.example.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ShoeDao;
import com.example.model.Shoe;
import com.example.model.User;

@Service
public class ShoeService {
	
	private static int shoeCount = 1;
	@Autowired
	private ShoeDao shoeDao;
	
	public void addShoe(String name, String desc, String category, int size, String price) {
		shoeDao.save(new Shoe(++shoeCount, name,desc,category,size,price));
	}
	
	public List<Shoe> getShoes(){
		List<Shoe> shoes = new ArrayList<Shoe>();
		shoeDao.findAll().forEach(x -> shoes.add(x));
		return shoes;
	}
	
	public Shoe getShoe(int id) {
		return shoeDao.findById(id).get();		 
	}
	
	public void updateShoe(Shoe shoe) {
		shoeDao.save(shoe);
	}
	
	public void deleteShoe(int id) {
		shoeDao.deleteById(id);
	}
	
	public List<Shoe> searchShoebyCateogry(String name){
		List<Shoe> shoes = new ArrayList<Shoe>();
		shoeDao.findAll().forEach(x ->{
		if((x.getCategory()).equals(name)) 
		{
			shoes.add(x);
		}
		});
		return shoes;
	}
}
