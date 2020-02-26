package com.restaurant.service;

import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;

public interface IRecipeMgntService {
	
	ServiceResponse addRecipe(RecipeDetails recipeDtl);

}
