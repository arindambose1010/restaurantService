package com.restaurant.model;


import java.util.Date;

public class RestaurantMst {

	
	private int restaurantId;
	private String restaurantName;
	private String restGrpMst;
	private String address;
	private String city;
	private String county;
	private int pincode;
	private String contactNo;
	private String contactMail;
	private String gstNo;
	private String isActive;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestGrpMst() {
		return restGrpMst;
	}
	public void setRestGrpMst(String restGrpMst) {
		this.restGrpMst = restGrpMst;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getContactMail() {
		return contactMail;
	}
	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@Override
	public String toString() {
		return "RestaurantMst [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", restGrpMst="
				+ restGrpMst + ", address=" + address + ", city=" + city + ", county=" + county + ", pincode=" + pincode
				+ ", contactNo=" + contactNo + ", contactMail=" + contactMail + ", gstNo=" + gstNo + ", isActive="
				+ isActive + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate="
				+ modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}
	
	
	
	
	
	
}
