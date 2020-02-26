package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.IRecipeMgntService;



@RestController
@RequestMapping(value="/recipeCtrl")
@CrossOrigin
public class RecipeMgntController {

	private final Logger logger=Logger.getLogger(RecipeMgntController.class);
	
	
	@Autowired
	IRecipeMgntService recipeMgntService;
	
	
	@RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addRecipe(@RequestBody RecipeDetails recipeDtl) {
		logger.info("*******Request for addRecipe ******");
		ServiceResponse response = null;
		
		try {
			response=recipeMgntService.addRecipe(recipeDtl);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
}
