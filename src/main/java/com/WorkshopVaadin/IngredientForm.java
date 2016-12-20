package com.WorkshopVaadin;

import com.WorkshopVaadin.model.Ingredient;
import com.WorkshopVaadin.view.IngredientView;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class IngredientForm extends FormLayout {
	private IngredientView ingredientView;
	private Ingredient ingredient;
	private TextField name;
	private TextField prijs;

	public IngredientForm(IngredientView ingredientView) {
		this.ingredientView = ingredientView;
		//add your form here
	}
	

	public void setIngredient(Ingredient ingredient){
		this.ingredient = ingredient;
		BeanFieldGroup.bindFieldsUnbuffered(ingredient, this);
		if(ingredient.getName() != null){
			name.setEnabled(false);
		}
	    setVisible(true);
	}
	
	private void delete() {
		/* Functionaliteit om ingredient te verwijderen.
		 * Vergeet niet de ingredient lijst te updaten.
		 */
	}

	private void save() {
		/* Maak hier de functionaliteit om een ingredient op te slaan of te updaten.
		 * Gebruik ServiceProvider.getIngredientService().getIngredientByName(ingredient.getName()) om te kijken of een ingredient al bestaat
		 * Vergeet niet de ingredient lijst te updaten.
		 */
	}
}
