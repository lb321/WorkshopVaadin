package com.WorkshopVaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;

public class MainView extends VerticalLayout implements View{

	public MainView() {
		HorizontalLayout layout = new HorizontalLayout();
		MenuBar menuBar = new MenuBar();
		MenuBar.Command mycommand = new MenuBar.Command() {
		    public void menuSelected(MenuItem selectedItem) {
		    	if(selectedItem.getText().equals("Home"))
		    		UI.getCurrent().getNavigator().navigateTo("");
		    	else
		    		UI.getCurrent().getNavigator().navigateTo(selectedItem.getText());
		    }
		};
		menuBar.addItem("Home", mycommand);
		menuBar.addItem("Ingredienten", mycommand);
		menuBar.addItem("Pizzas", mycommand);
		//voeg hier een item toe om naar pizzaingredienten te gaan.
		layout.setMargin(true);
		layout.addComponents(menuBar);
		addComponent(layout);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
