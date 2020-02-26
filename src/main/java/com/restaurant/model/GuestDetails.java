package com.restaurant.model;

public class GuestDetails {
	
	private String title;
	private String guestName;
	private String guestNumber;
	private String guestEmail;
	private String birthdate;
	private int eventId;
	private int restaurantId;
	private String aniversaryDate;
	private String status;
	private String bookingEndTime;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestNumber() {
		return guestNumber;
	}
	public void setGuestNumber(String guestNumber) {
		this.guestNumber = guestNumber;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getAniversaryDate() {
		return aniversaryDate;
	}
	public void setAniversaryDate(String aniversaryDate) {
		this.aniversaryDate = aniversaryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBookingEndTime() {
		return bookingEndTime;
	}
	public void setBookingEndTime(String bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}
	@Override
	public String toString() {
		return "GuestDetails [title=" + title + ", guestName=" + guestName + ", guestNumber=" + guestNumber
				+ ", guestEmail=" + guestEmail + ", birthdate=" + birthdate + ", eventId=" + eventId + ", restaurantId="
				+ restaurantId + ", aniversaryDate=" + aniversaryDate + ", status=" + status + ", bookingEndTime="
				+ bookingEndTime + "]";
	}
	
	
	
	
	
	
	
	

}
