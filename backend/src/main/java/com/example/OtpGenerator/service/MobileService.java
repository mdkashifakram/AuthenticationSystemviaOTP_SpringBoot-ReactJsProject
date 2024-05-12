package com.example.OtpGenerator.service;

import com.example.OtpGenerator.config.TwilioConfig;
import com.example.OtpGenerator.model.MobileRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class MobileService {

	@Autowired
	private OTPService otpService;
	@Autowired
	private TwilioConfig twilioConfig;
	
	public void generateOtp(MobileRequest phoneNo){
	        PhoneNumber to = new PhoneNumber(phoneNo.getMobileNumber());
	        PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
	        String otp = otpService.generateOTP();
	        String otpMessage = "Dear Customer , Your OTP is " + otp + ". Otp to expired in 5 minutes";
	        Message message = Message
	                .creator(to, from,
	                        otpMessage)
	                .create();
	  }
	
}

