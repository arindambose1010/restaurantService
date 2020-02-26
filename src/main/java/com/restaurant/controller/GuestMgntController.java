package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.GuestDetails;
import com.restaurant.model.GuestReviewDetails;
import com.restaurant.model.PurchaseDetails;
import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;
import com.restaurant.service.IGuestMgntService;


@RestController
@RequestMapping(value="/guestCtrl")
@CrossOrigin
public class GuestMgntController {

	
	private final Logger logger=Logger.getLogger(GuestMgntController.class);
	
	@Autowired
	IGuestMgntService guestMgntService;
	
	@Autowired
	ICommonService commonService;
	
	
	
	@RequestMapping(value = "/getAllReviewType", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllReviewType() {
		logger.info("*******Request for getAllReviewType ******");
		ServiceResponse response = null;
		String type="MASTER_ReviewType";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	

	@RequestMapping(value = "/getAllGuestDetails", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllGuestDetails() {
		logger.info("*******Request for getAllGuestDetails ******");
		ServiceResponse response = null;
		String type="GuestDetails";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/getAllGuestReview", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getAllGuestReview() {
		logger.info("*******Request for getAllGuestReview ******");
		ServiceResponse response = null;
		String type="GuestReviewDetails";
		try {
			response = commonService.getAllMasterData(type);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/addGuestDetails", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addGuestDetails(@RequestBody GuestDetails guestDetl) {
		logger.info("*******Request for addGuestDetails ******");
		ServiceResponse response = null;
		
		try {
			response=guestMgntService.addGuestDetails(guestDetl);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	@RequestMapping(value = "/addGuestReview", method = RequestMethod.POST)
	@ResponseBody
	public ServiceResponse addGuestReview(@RequestBody GuestReviewDetails guestReviewDetl) {
		logger.info("*******Request for addGuestReview ******");
		ServiceResponse response = null;
		
		try {
			response=guestMgntService.addGuestReview(guestReviewDetl);
		} catch (Exception e) {
			logger.info("Exception : " + e.getMessage());

		}
		logger.info("*****After Response ---" + response);
		return response;
	}
	
	
	
}
