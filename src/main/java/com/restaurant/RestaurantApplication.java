package com.restaurant;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restaurant.model.ServiceResponse;
import com.restaurant.service.ICommonService;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner{

	@Autowired
	ICommonService commonService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		commonService.getAllConfigData();
		
	}
}