package com.restaurant.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.restaurant.model.ServiceResponse;

public interface ConfigIntl {

	
	String config_fetch_sql = "select COMMON_MASTER_KEY,COMMON_MASTER_VALUE from  COMMON_MASTER_TABLE ";
	
	ConcurrentHashMap< String, ServiceResponse> cmap = new ConcurrentHashMap<>();
	
	Map<String,String> tokenMap = new HashMap();
}
