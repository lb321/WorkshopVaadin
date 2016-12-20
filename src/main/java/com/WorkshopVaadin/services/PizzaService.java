package com.WorkshopVaadin.services;

import java.util.List;

import com.WorkshopVaadin.model.Pizza;
import com.WorkshopVaadin.persistence.PizzaDAO;

public class PizzaService {
	private PizzaDAO pd = new PizzaDAO();
	
	public List<Pizza> getAllPizzas(){
		return pd.getAllPizzas();
	}

	public boolean addPizza(Pizza pizza){
		return pd.addPizza(pizza);
	}
	
	public boolean deletePizza(Pizza pizza){
		return deletePizza(pizza.getId());
	}
	
	public boolean deletePizza(int id){
		return pd.deletePizza(id);
	}
	
	public Pizza getPizzaByID(int id){
		return pd.getPizzaByID(id);
	}
}
