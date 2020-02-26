package com.restaurant.model;



import java.util.Date;

public class TaxMst {

	
	private int taxId;
	private String taxName;
	private String taxAmtPer;
	private Date isPercent;
	private String min;
	private Date max;
	private String isActive;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxAmtPer() {
		return taxAmtPer;
	}
	public void setTaxAmtPer(String taxAmtPer) {
		this.taxAmtPer = taxAmtPer;
	}
	public Date getIsPercent() {
		return isPercent;
	}
	public void setIsPercent(Date isPercent) {
		this.isPercent = isPercent;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public Date getMax() {
		return max;
	}
	public void setMax(Date max) {
		this.max = max;
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
		return "TaxMst [taxId=" + taxId + ", taxName=" + taxName + ", taxAmtPer=" + taxAmtPer + ", isPercent="
				+ isPercent + ", min=" + min + ", max=" + max + ", isActive=" + isActive + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy="
				+ modifiedBy + "]";
	}
	
	
	
	
	
}
