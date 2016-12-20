package com.WorkshopVaadin;

import javax.servlet.annotation.WebServlet;

import com.WorkshopVaadin.MyUI;
import com.WorkshopVaadin.view.HomeView;
import com.WorkshopVaadin.view.IngredientView;
import com.WorkshopVaadin.view.PizzaView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    //private IngredientForm iForm = new IngredientForm(this);
    private static Navigator navigator;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	VerticalLayout layout = new VerticalLayout();
    	getPage().setTitle("WorkshopVaadin");
        final Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        navigator = new Navigator(this, viewContainer);
        navigator.addView("", new HomeView());
        navigator.addView("Ingredienten", new IngredientView());
        navigator.addView("Pizzas", new PizzaView());
        //voeg hier de navigatie naar pizzaingredientenview toe
        layout.addComponents(viewContainer);
        layout.setMargin(true);
        setContent(layout);
    }
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
    
    public Navigator getNavigator(){
    	return navigator;
    }
}
