package com.WorkshopVaadin.view;

import com.WorkshopVaadin.model.Pizza;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;

public class PizzaIngredientenView extends MainView implements View{
	private Label pname;
	private Pizza pizza;
	private Grid grid;
	
	public PizzaIngredientenView() {
		//hier komt de layout van de pagina
   	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		//maak een tabel met de ingredienten uit de pizza
	}
}
