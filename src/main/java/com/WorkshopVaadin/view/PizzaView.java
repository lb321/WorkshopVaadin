package com.WorkshopVaadin.view;

import java.util.List;

import com.WorkshopVaadin.model.Pizza;
import com.WorkshopVaadin.services.ServiceProvider;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class PizzaView extends MainView implements View{
    private Grid grid = new Grid();
    private TextField filterText = new TextField();
    
	public PizzaView() {
		HorizontalLayout layout = new HorizontalLayout();
		List<Pizza> pizzas = ServiceProvider.getPizzaService().getAllPizzas();
	    grid.setContainerDataSource(new BeanItemContainer<>(
	    	Pizza.class, pizzas));
	    grid.removeColumn("id");
	    grid.removeColumn("ingredienten");
	    
	    /* Wanneer een pizza word geselecteerd willen we de ingredienten van de gekozen pizza zien
	     * in de pizza ingredienten view.
	     */
	    
	    layout.addComponent(grid);
	    layout.setMargin(true);
	    addComponent(layout);
	}

}
