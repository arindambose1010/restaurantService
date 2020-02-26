package com.restaurant.model;



import java.io.Serializable;

public class ServiceResponse implements Serializable {
	
	
	private static final long serialVersionUID = 2331307404151448988L;
	
	private String status;
	private String statusCode;
	private String responseMessage;
	private int searchCount;
	private Object resObject;
	
	

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public int getSearchCount() {
		return searchCount;
	}
	public void setSearchCount(int searchCount) {
		this.searchCount = searchCount;
	}
	public Object getResObject() {
		return resObject;
	}
	public void setResObject(Object resObject) {
		this.resObject = resObject;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ServiceResponse [status=" + status + ", statusCode=" + statusCode + ", responseMessage="
				+ responseMessage + ", searchCount=" + searchCount + ", resObject=" + resObject + "]";
	}
	
	
	
	

}
