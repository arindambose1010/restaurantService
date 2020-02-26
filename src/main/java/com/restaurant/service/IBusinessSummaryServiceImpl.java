package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.dao.IBusinessSummaryDao;


@Service
public class IBusinessSummaryServiceImpl implements IBusinessSummaryService {

    @Autowired
    IBusinessSummaryDao businessSummaryDao;
    
    
    
	
	

}
