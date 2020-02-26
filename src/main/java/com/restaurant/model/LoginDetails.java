package com.restaurant.model;

public class LoginDetails {
	
	private boolean is_Valid;
	private String subsStatus;
	private String expiryDate;
	private String userName;
	private String userType;
	private boolean is_super_user;
	private String hotelID;
	private String businessDate;
	private String taxType;
	private String taxNumber;
	private String token;
	
	public Object getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	private PropertyAddons propertyAddons;
	
	private ModulesAllowed modulesAllowed;

	public boolean isIs_Valid() {
		return is_Valid;
	}

	public void setIs_Valid(boolean is_Valid) {
		this.is_Valid = is_Valid;
	}

	public String getSubsStatus() {
		return subsStatus;
	}

	public void setSubsStatus(String subsStatus) {
		this.subsStatus = subsStatus;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isIs_super_user() {
		return is_super_user;
	}

	public void setIs_super_user(boolean is_super_user) {
		this.is_super_user = is_super_user;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public PropertyAddons getPropertyAddons() {
		return propertyAddons;
	}

	public void setPropertyAddons(PropertyAddons propertyAddons) {
		this.propertyAddons = propertyAddons;
	}

	public ModulesAllowed getModulesAllowed() {
		return modulesAllowed;
	}

	public void setModulesAllowed(ModulesAllowed modulesAllowed) {
		this.modulesAllowed = modulesAllowed;
	}
	
	
	
	
	

}
