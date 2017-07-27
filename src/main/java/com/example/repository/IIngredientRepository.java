package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domain.*;

@RepositoryRestResource(collectionResourceRel = "Ingredient", path = "Ingredients")
public interface IIngredientRepository extends CrudRepository<Ingredient, Long>{
	List<Ingredient> findByRecipe(String recipe);
}
