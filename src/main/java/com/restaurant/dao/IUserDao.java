package com.restaurant.dao;

import com.restaurant.model.UserDTO;

public interface IUserDao {

	UserDTO getUserDetailsByName(String userName);
	
}
