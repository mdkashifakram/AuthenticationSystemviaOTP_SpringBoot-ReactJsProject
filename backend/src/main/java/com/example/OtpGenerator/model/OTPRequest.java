package com.example.OtpGenerator.model;

public class OTPRequest {

	
	private String email;

	
	public OTPRequest() {}
	
	public OTPRequest(String phoneNumber, String email) {
		
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}

