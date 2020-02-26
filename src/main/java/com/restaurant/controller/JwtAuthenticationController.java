package com.restaurant.controller;

import java.util.ArrayList;
import java.util.Objects;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.config.JwtTokenUtil;
import com.restaurant.model.JwtRequest;
import com.restaurant.model.JwtResponse;
import com.restaurant.model.LoginDetails;
import com.restaurant.model.ModulesAllowed;
import com.restaurant.model.PropertyAddons;
import com.restaurant.model.ServiceResponse;
import com.restaurant.model.UserDTO;
import com.restaurant.service.JwtUserDetailsService;
import com.restaurant.util.ConfigIntl;

import antlr.collections.List;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ServiceResponse createAuthenticationToken(@RequestBody JwtRequest authenticationRequest,HttpServletResponse res) throws Exception {
        
		ServiceResponse response=new ServiceResponse();
		
		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);
		
		//res.setHeader("token", "Bearer "+token);
		res.addHeader("token", "Bearer "+token);
		res.addHeader("Authorization", "Bearer "+token);
		ConfigIntl.tokenMap.put("Authorization", "Bearer "+token);
		LoginDetails ldts=new LoginDetails();
		PropertyAddons pd=new PropertyAddons();
		ModulesAllowed modulesAllowed=new ModulesAllowed();
		
		pd.setFlexiPrice(true);
		
		ldts.setIs_Valid(true);
		ldts.setSubsStatus("Active");
		ldts.setExpiryDate("2020-11-22 00:00:00.0");
		ldts.setUserName(userDetails.getUsername());
		ldts.setUserType("User");
		ldts.setIs_super_user(true);
		ldts.setHotelID("1");
		ldts.setBusinessDate("2019-12-14");
		ldts.setPropertyAddons(pd);
		ldts.setTaxType("GST");
		ldts.setTaxNumber("GSTIN89746873645");  
		ldts.setToken(token);
		String[] arre=new String[0];
		modulesAllowed.setModules(arre);
		ldts.setModulesAllowed(modulesAllowed);
		response.setStatus("Suucess");
		response.setResponseMessage("Success");
		response.setSearchCount(1);
		response.setResObject(ldts);
		
		return response;
		
	}
	
//	@RequestMapping(value = "/getLoginData/{resId}", method = RequestMethod.POST)
//	public ServiceResponse getLoginData(@PathVariable String resId) throws Exception {
//        
//		ServiceResponse response=new ServiceResponse();
//		
//		
//		//res.setHeader("token", "Bearer "+token);
//		LoginDetails ldts=new LoginDetails();
//		PropertyAddons pd=new PropertyAddons();
//		ModulesAllowed modulesAllowed=new ModulesAllowed();
//		
//		pd.setFlexiPrice(true);
//		
//		ldts.setIs_Valid(true);
//		ldts.setSubsStatus("Active");
//		ldts.setExpiryDate("2020-11-22 00:00:00.0");
//		ldts.setUserName("AjayKumar");
//		ldts.setUserType("User");
//		ldts.setIs_super_user(true);
//		ldts.setHotelID("1");
//		ldts.setBusinessDate("2019-12-14");
//		ldts.setPropertyAddons(pd);
//		ldts.setTaxType("GST");
//		ldts.setTaxNumber("GSTIN89746873645");  
//		//ldts.setToken(token);
//		String[] arre=new String[0];
//		modulesAllowed.setModules(arre);
//		ldts.setModulesAllowed(modulesAllowed);
//		response.setStatus("Suucess");
//		response.setResponseMessage("Success");
//		response.setSearchCount(1);
//		response.setResObject(ldts);
//		
//		return response;
//		
//	}
//	
//	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}