package com.restaurant.model;



import java.util.Date;

public class BookingAllocationMst {

	
	private int bookingAllocId;
	private String restaurantId;
	private int tableId;
	private String guestId;
	private String hotelRoomNum;
	private Date bookingDate;
	private String bookingStartTime;
	private String bookingEndTime;
	private int bookingStatus;
	private String assignStaffId;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	public int getBookingAllocId() {
		return bookingAllocId;
	}
	public void setBookingAllocId(int bookingAllocId) {
		this.bookingAllocId = bookingAllocId;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public String getHotelRoomNum() {
		return hotelRoomNum;
	}
	public void setHotelRoomNum(String hotelRoomNum) {
		this.hotelRoomNum = hotelRoomNum;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getBookingStartTime() {
		return bookingStartTime;
	}
	public void setBookingStartTime(String bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}
	public String getBookingEndTime() {
		return bookingEndTime;
	}
	public void setBookingEndTime(String bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}
	public int getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(int bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getAssignStaffId() {
		return assignStaffId;
	}
	public void setAssignStaffId(String assignStaffId) {
		this.assignStaffId = assignStaffId;
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
		return "BookingAllocationMst [bookingAllocId=" + bookingAllocId + ", restaurantId=" + restaurantId
				+ ", tableId=" + tableId + ", guestId=" + guestId + ", hotelRoomNum=" + hotelRoomNum + ", bookingDate="
				+ bookingDate + ", bookingStartTime=" + bookingStartTime + ", bookingEndTime=" + bookingEndTime
				+ ", bookingStatus=" + bookingStatus + ", assignStaffId=" + assignStaffId + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy="
				+ modifiedBy + "]";
	}
	
	
	
	
	
}
