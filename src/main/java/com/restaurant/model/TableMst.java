package com.restaurant.model;



import java.util.Date;

public class TableMst {

	
	private int tableId;
	private String restaurantId;
	private String tableNum;
    private String occupancy;
    private String isActive;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public String getTableNum() {
		return tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
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
		return "TableMst [tableId=" + tableId + ", restaurantId=" + restaurantId + ", tableNum=" + tableNum
				+ ", occupancy=" + occupancy + ", isActive=" + isActive + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}
    
    
    
    
}
