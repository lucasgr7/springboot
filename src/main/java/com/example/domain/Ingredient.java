package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crawler_dataingredient")
public class Ingredient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="ingredient")
	private String ingredient;

	@Column(name="recipe")
	private String recipe;

	@Column(name="group")
	private String group;
	
	public Ingredient() {
	}
	
	public Ingredient(long id, String ingredient, String recipe, String group) {
		super();
		this.id = id;
		this.ingredient = ingredient;
		this.recipe = recipe;
		this.group = group;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getIngredient() {
		return ingredient;
	}



	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}



	public String getRecipe() {
		return recipe;
	}



	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}



	public String getGroup() {
		return group;
	}



	public void setGroup(String group) {
		this.group = group;
	}



	public String toString() {
		return this.ingredient;
	}
}
