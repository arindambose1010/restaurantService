package com.restaurant.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.restaurant.controller.CategoryMgntController;
import com.restaurant.model.ServiceResponse;
import com.restaurant.util.ConfigIntl;

@Component
public class CommonDaoImpl implements ICommonDao {

	private final Logger logger = Logger.getLogger(CommonDaoImpl.class);
	static List<Map<String, Object>> configRows = null;
//	
			
	@Autowired
	JdbcTemplate jdbcTemplate;


	@Override
	public ServiceResponse executeQuery(String[] keyDetails,String actionType) {
		// TODO Auto-generated method stub
		ServiceResponse response = new ServiceResponse();
		System.out.println("***********keyDetails====="+keyDetails);
	    try {
			 if("SELECT".equalsIgnoreCase(actionType))
			 {				
				String sqlStr = "";
				int paramlen = 0;
				if (null != configRows) {
					for (Map<?, ?> row : configRows) {
						if(keyDetails!=null) {
							 System.out.println("==========="+keyDetails[0]+"============"+keyDetails.length);
							if( keyDetails.length == 1) {
								if(row.get("COMMON_MASTER_KEY").toString().equalsIgnoreCase(keyDetails[0])) {
									sqlStr = row.get("COMMON_MASTER_VALUE").toString();
									break;
								}
						
						     }else if (keyDetails.length > 1) {
						    	 System.out.println("==========="+keyDetails[0]);
						    	 if(row.get("COMMON_MASTER_KEY").toString().equalsIgnoreCase(keyDetails[0])) {
										sqlStr = row.get("COMMON_MASTER_VALUE").toString();
										paramlen = keyDetails.length - 1;
										break;
									}
						     }
						}
						
						
					}
				}
				System.out.println("*******Final Query:::::="+sqlStr);
				List<Map<String, Object>> rowdata = null;
				
				if(paramlen == 0)
					rowdata = jdbcTemplate.queryForList(sqlStr);
				else {
					System.out.println("**ELSE*****Final Query:::::="+sqlStr);
					List<String> paramStrList = new ArrayList();
					for(int j=1;j<keyDetails.length;j++) {					
						paramStrList.add(keyDetails[j]);
					}
					System.out.println("*******rowdata:::::="+rowdata+"-----"+paramStrList.toArray());
					rowdata = jdbcTemplate.queryForList(sqlStr,paramStrList.toArray());
					
				}
				response.setStatus("Success");
				response.setResponseMessage("Success");
				response.setSearchCount(rowdata.size());
				response.setResObject(rowdata);
			}
			else if("UPDATE".equalsIgnoreCase(actionType))
		    {
				String sqlStr = "";
				int paramlen = 0;
				if (null != configRows) {
					for (Map<?, ?> row : configRows) {
						if(keyDetails!=null) {
							 System.out.println("==========="+keyDetails[0]+"============"+keyDetails.length);
							if( keyDetails.length == 1) {
								if(row.get("COMMON_MASTER_KEY").toString().equalsIgnoreCase(keyDetails[0])) {
									sqlStr = row.get("COMMON_MASTER_VALUE").toString();
									break;
								}
						
						     }else if (keyDetails.length > 1) {
						    	 System.out.println("==========="+keyDetails[0]);
						    	 if(row.get("COMMON_MASTER_KEY").toString().equalsIgnoreCase(keyDetails[0])) {
										sqlStr = row.get("COMMON_MASTER_VALUE").toString();
										paramlen = keyDetails.length - 1;
										break;
									}
						     }
						}
						
						
					}
				}
				System.out.println("*******Final Query:::::="+sqlStr);
				List<Map<String, Object>> rowdata = null;
				System.out.println("**ELSE*****Final Query:::::="+sqlStr);
				List<String> paramStrList = new ArrayList();
				for(int j=1;j<keyDetails.length;j++) {					
					paramStrList.add(keyDetails[j]);
				}
				System.out.println("*******rowdata:::::="+rowdata+"-----"+paramStrList.toArray());
				rowdata = jdbcTemplate.queryForList(sqlStr,paramStrList.toArray());
				
			    response.setStatus("Success");
				response.setResponseMessage("Success");
				response.setSearchCount(rowdata.size());
				response.setResObject(rowdata);
		    }
		} catch (Exception e) {

			response.setStatus("Fail");
			response.setResponseMessage("Error.." + e.getMessage());
			response.setSearchCount(0);
			response.setResObject(null);
		}
      //  if(isCachNeed) {
        	cacheingFileWriter(keyDetails,response);
        	
      //  }
		return response;
	}
	
	private void cacheingFileWriter(String[] keyDetails,ServiceResponse response) {
	
		try {		
			logger.info("---------22----------"+keyDetails[0]+"===");
			ConfigIntl.cmap.put(keyDetails[0], response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void getAllConfigData() {
		// TODO Auto-generated method stub
		System.out.println("*******Final Query:::::="+ConfigIntl.config_fetch_sql);
		configRows = jdbcTemplate.queryForList(ConfigIntl.config_fetch_sql);
		System.out.println("*******Final Query::configRows:::="+configRows);
	}

}
