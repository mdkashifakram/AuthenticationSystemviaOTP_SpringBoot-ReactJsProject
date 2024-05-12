package com.example.OtpGenerator.model;

public class MobileRequest {

	private String mobileNumber;


	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public MobileRequest(String mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
	}

	public MobileRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
