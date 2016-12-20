package com.WorkshopVaadin.services;

import java.util.List;

import com.WorkshopVaadin.model.Ingredient;
import com.WorkshopVaadin.persistence.IngredientDAO;

public class IngredientService {
	private IngredientDAO id = new IngredientDAO();
	
	public List<Ingredient>	getAllIngredients(){
		return id.getAllIngredients();
	}
	
	public Ingredient getIngredientByName(String name){
		return id.getIngredientByName(name);
	}
	
	public boolean addIngredient(Ingredient ingredient){
		return id.addIngredient(ingredient);
	}
	
	public boolean deleteIngredient(Ingredient ingredient){
		return deleteIngredient(ingredient.getName());
	}
	
	public boolean deleteIngredient(String ingredientName){
		return id.deleteIngredient(ingredientName);
	}
	
	public boolean updateIngredient(Ingredient newIngredient){
		return id.updateIngredient(newIngredient);
	}

	public List<Ingredient> findByName(String name) {
		return id.findByName(name);
	}
}
