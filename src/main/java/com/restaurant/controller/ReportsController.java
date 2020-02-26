package com.restaurant.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.service.IReportsService;


@RestController
@RequestMapping(value="/reportCtrl")
@CrossOrigin
public class ReportsController {

	
	private final Logger logger=Logger.getLogger(ReportsController.class);
	
	@Autowired
	IReportsService reportsService;
	
}
