package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.service.ISalesMgntService;



@RestController
@RequestMapping(value="/salesCtrl")
@CrossOrigin
public class SalesMgntController {

	
	private final Logger logger=Logger.getLogger(SalesMgntController.class);
	

   @Autowired
   ISalesMgntService salesMgntService;
   
}
