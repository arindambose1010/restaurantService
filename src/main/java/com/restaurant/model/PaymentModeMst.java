package com.restaurant.model;



import java.util.Date;

public class PaymentModeMst {

	
	private int payModId;
	private String payModDesc;
	private String status;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	public int getPayModId() {
		return payModId;
	}
	public void setPayModId(int payModId) {
		this.payModId = payModId;
	}
	public String getPayModDesc() {
		return payModDesc;
	}
	public void setPayModDesc(String payModDesc) {
		this.payModDesc = payModDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "PaymentModeMst [payModId=" + payModId + ", payModDesc=" + payModDesc + ", status=" + status
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + "]";
	}


}
