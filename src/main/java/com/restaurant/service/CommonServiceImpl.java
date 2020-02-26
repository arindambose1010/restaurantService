package com.restaurant.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.restaurant.dao.CommonDaoImpl;
import com.restaurant.dao.ICommonDao;
import com.restaurant.model.ServiceResponse;
import com.restaurant.util.ConfigIntl;

@Service
public class CommonServiceImpl implements ICommonService {

	private final Logger logger = Logger.getLogger(CommonServiceImpl.class);
	@Autowired 
	ICommonDao commonDao;

	@Override
	public ServiceResponse getAllMasterData(String... keyDetails) {
		// TODO Auto-generated method stub
		
		if("MASTER".equalsIgnoreCase(keyDetails[0].split("_")[0]))
		{
			//cacheingFileWriter(keyDetails,response);
			Object[] retStr = readMasterFile(keyDetails);
			if("true".equals(retStr[0]+"")) {
				logger.info("-----------retStr-----------"+retStr[1].toString());
				//Gson gson = new Gson();
				ServiceResponse response2 = (ServiceResponse) retStr[1];
				return response2;
			}
			
		}else if("UPDATE".equalsIgnoreCase(keyDetails[0].split("_")[0]))
		{
			return commonDao.executeQuery(keyDetails,"UPDATE");
		}
		return commonDao.executeQuery(keyDetails,"SELECT");
	}

	@Override
	public void getAllConfigData() {
		commonDao.getAllConfigData();
		
	}
	
	private Object[] readMasterFile(String[] keyDetails)
	{
		ServiceResponse response = new ServiceResponse();
		Object[] str = new Object[2];
		try {
		//	Path newFilePath = Paths.get("src/test/resources/"+keyDetails[0]+".json");
		//logger.info("newFilePath.getFileName()======>"+newFilePath.toFile().getPath());	
		//File file = new File(newFilePath.toFile().getPath());
		if(ConfigIntl.cmap.containsKey(keyDetails[0]))
		{
			str[0] = "true";
			str[1] = ConfigIntl.cmap.get(keyDetails[0]);	        
		}else {
			str[0] = "false";
			str[1] = null;
		}
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error:=="+e.getMessage());
		}
		 return str;
	}

	
	
	
	
	
}
