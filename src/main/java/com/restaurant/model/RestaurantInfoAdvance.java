package com.restaurant.model;

public class RestaurantInfoAdvance {

	private String slNo;
	private String restName;
	private String restaurantName;
	private String managerName;
	private int noOfTable;
	private int noOfStaff;
	private String phoneNo;
	private String restBanType;
	
	
	
	
	
	
	public String getRestBanType() {
		return restBanType;
	}
	public void setRestBanType(String restBanType) {
		this.restBanType = restBanType;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getNoOfTable() {
		return noOfTable;
	}
	public void setNoOfTable(int noOfTable) {
		this.noOfTable = noOfTable;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "RestaurantInfoAdvance [slNo=" + slNo + ", restName=" + restName + ", restaurantName=" + restaurantName
				+ ", managerName=" + managerName + ", noOfTable=" + noOfTable + ", noOfStaff=" + noOfStaff
				+ ", phoneNo=" + phoneNo + ", restBanType=" + restBanType + "]";
	}
	
	
	
	
}
