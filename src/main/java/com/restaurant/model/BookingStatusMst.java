package com.restaurant.model;



import java.util.Date;

public class BookingStatusMst {
	
	private int bookingStatusId;
	private String statusDescription;
	private String isActive;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	public int getBookingStatusId() {
		return bookingStatusId;
	}
	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
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
		return "BookingStatusMst [bookingStatusId=" + bookingStatusId + ", statusDescription=" + statusDescription
				+ ", isActive=" + isActive + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + "]";
	}

	
	
}
