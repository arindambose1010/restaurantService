package com.restaurant.dao;

import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;

public interface IRecipeMgntDao {
	
	
	ServiceResponse addRecipe(RecipeDetails recipeDtl);

}
