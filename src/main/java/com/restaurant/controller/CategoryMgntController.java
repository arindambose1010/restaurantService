package com.restaurant.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dao.ICommonDao;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICategoryMgntService;
import com.restaurant.service.ICommonService;



@RestController
@RequestMapping(value = "/categoryCtrl")
@CrossOrigin
public class CategoryMgntController {

	private final Logger logger = Logger.getLogger(CategoryMgntController.class);

	@Autowired
	ICategoryMgntService categoryMgntService;
	
	@Autowired
	ICommonService commonService;

	
	@RequestMapping(value = "/getAllCategory", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllCategory() {
		logger.info("*******Request for getAllCategory ******");
		ServiceResponse response = null;
		String type="Category";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllCategory();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	
	@RequestMapping(value = "/getAllItem", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllItem() {
		logger.info("*******Request for getAllItem ******");
		ServiceResponse response = null;
		String type="MASTER_Item";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

	
	@RequestMapping(value = "/getAllItemType", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllItemType() {
		logger.info("*******Request for getAllItemType ******");
		ServiceResponse response = null;
		String type="MASTER_ITEMTYPE";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	
	
	
	@RequestMapping(value = "/getAllItemByType", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllItem(@RequestParam String itemType) {
		logger.info("*******Request for getAllItem ******");
		ServiceResponse response = null;
		String type="ITEMTYPEWISE";
		try {
			response=commonService.getAllMasterData(type,itemType);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/getAllCategoryItemList", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllCategoryItemList() {
		logger.info("*******Request for getAllCategoryItemList ******");
		ServiceResponse response = null;
		String type="CategoryItemList";
		try {
			response=commonService.getAllMasterData(type);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

	
	
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addCategory(@RequestParam String category) {
		logger.info("*******Request for addCategory ******");
		ServiceResponse response = null;
		
		try {
			response=categoryMgntService.addCategory(category);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}

}
