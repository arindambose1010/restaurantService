package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.RecipeDetails;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.IPurchaseMgntService;



@RestController
@RequestMapping(value="/purchaseCtrl")
@CrossOrigin
public class PurchaseMgntController {

	private final Logger logger=Logger.getLogger(PurchaseMgntController.class);
	
	
	@Autowired
	IPurchaseMgntService purchaseMgntService;
	
	@Autowired
	ICommonService commonService;
	
	
	
	@RequestMapping(value = "/getAllPaymentMode", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllPaymentMode() {
		logger.info("*******Request for getAllPaymentMode ******");
		ServiceResponse response = null;
		String type="MASTER_PaymentMode";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	@RequestMapping(value = "/getAllTaxType", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllTaxDtl() {
		logger.info("*******Request for getAllTaxType ******");
		ServiceResponse response = null;
		String type="MASTER_TaxType";
		
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getAllPurchaseDetails", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllPurchaseDetails() {
		logger.info("*******Request for getAllPurchaseDetails ******");
		ServiceResponse response = null;
		String type="PurchaseDetails";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/addPurchaseDetails", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addPurchaseDetails(@RequestBody PurchaseDetails purchaseDetl) {
		logger.info("*******Request for addPurchaseDetails ******");
		ServiceResponse response = null;
		
		try {
			response=purchaseMgntService.addPurchaseDetails(purchaseDetl);
			//response = categoryMgntService.getAllItem();
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
}
