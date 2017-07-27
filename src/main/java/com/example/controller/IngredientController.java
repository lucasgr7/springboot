package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Ingredient;
import com.example.repository.IIngredientRepository;

@RestController
public class IngredientController {
	
	@Autowired
	private IIngredientRepository repository;
	
	@RequestMapping("/all")
	public Iterable<Ingredient> find() {
		return repository.findAll();
	}
}
