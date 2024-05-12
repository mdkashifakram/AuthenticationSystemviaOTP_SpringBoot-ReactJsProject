package com.example.OtpGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.OtpGenerator.entity.UserEntity;
import com.example.OtpGenerator.model.OTPRequest;


@Service
public class ControllerEmailService {

	@Autowired()
	private JavaMailSender javaMailSender;
	@Autowired
	private OTPService otpService;
	public void sentOTPEmail(OTPRequest toEmail)
	{
	String otp=otpService.generateOTP();	
	SimpleMailMessage message=new SimpleMailMessage();
	message.setTo(toEmail.getEmail());
	message.setSubject("Your OTP for Verification");
	message.setText("Your OTP is :"+otp);
	message.setCc("alice24cyrus@gmail.com");
	javaMailSender.send(message);

	}
}

