package com.example.OtpGenerator.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OTPService{
	private static final int OTP_LENGTH=4;
	public String generateOTP()
	{
		StringBuilder otp=new StringBuilder();
		Random random=new Random();
		for(int i=0;i<OTP_LENGTH;i++)
		{
			otp.append(random.nextInt(10));
		}
		return otp.toString();
	}
}


