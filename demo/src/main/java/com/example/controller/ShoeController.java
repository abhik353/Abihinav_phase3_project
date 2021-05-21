package com.example.controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.model.Shoe;
import com.example.service.ShoeService;

@Controller
@SessionAttributes("name")
public class ShoeController {
	
	@Autowired
	ShoeService service;
	
	@RequestMapping(value = "/list-shoes", method = RequestMethod.GET)
	public String listShoesPage(ModelMap model) {
		String name = (String) model.get("name");
		model.put("shoes", service.getShoes());
		return "list-shoes";
	}
	
	@RequestMapping(value = "/add-shoe", method = RequestMethod.GET)
	public String addShoe(ModelMap model) {
		model.addAttribute("shoe",new Shoe());
		
		//model.addAttribute("shoe",new Shoe(0,"name",
		//		"enter description","category",
		//		0,"5000"));
		return "shoe";
	}
	
	@RequestMapping(value = "/update-shoe", method = RequestMethod.GET)
	public String updateShoe(@RequestParam int id, ModelMap model) {
		Shoe shoe = service.getShoe(id);
		model.put("shoe", shoe);
		return "shoe";
	}
	
	@RequestMapping(value = "/add-shoe", method = RequestMethod.POST)
	public String addShoe(ModelMap model,@ModelAttribute("shoe") Shoe shoe,BindingResult result) {
		if (result.hasErrors()) {
			return "shoe";
		}
		
		service.addShoe(shoe.getName(), shoe.getDesc(),shoe.getCategory(),shoe.getSize(),shoe.getPrice());
		return "redirect:/list-shoes";
	}
	
	@RequestMapping(value = "/update-shoe", method = RequestMethod.POST)
	public String updateShoe(ModelMap model,@ModelAttribute("shoe") Shoe shoe,BindingResult result) {
		if (result.hasErrors()) {
			return "shoe";
		}
		
		service.updateShoe(shoe);
		
		return "redirect:/list-shoes";
	}
	
	@RequestMapping(value = "/delete-shoe", method = RequestMethod.GET)
	public String deleteShoe(@RequestParam int id) {
		service.deleteShoe(id);
		return "redirect:/list-shoes";
	}
	
	@RequestMapping(value = "/search-shoe-category",method = RequestMethod.POST)
	public String searchUsersPage(@RequestParam (value="sc", required= false) String name,Model model) {
		

		model.addAttribute("sc",service.searchShoebyCateogry(name));
		return "filtered-Shoes";
	}
	
	
	@RequestMapping(value="/search-shoe-category", method = RequestMethod.GET)
	public String showSearchUser(ModelMap model){
		return "filtered-Shoes";
	}
	
	@RequestMapping(value = "/search-shoes", method = RequestMethod.GET)
	public String searchShoesPage(ModelMap model) {
		String name = (String) model.get("name");
		model.put("shoes_1", service.getShoes());
		return "search-shoes";
	}
	
	@RequestMapping(value = "/buy-shoe", method = RequestMethod.GET)
	public String deleteShoe(ModelMap model) {
		
		return "buy-shoe";
	}
}
