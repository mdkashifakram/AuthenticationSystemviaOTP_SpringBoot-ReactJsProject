package com.example.OtpGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OtpGenerator.entity.MobileEntity;
import com.example.OtpGenerator.entity.UserEntity;
import com.example.OtpGenerator.model.MobileRequest;
import com.example.OtpGenerator.model.OTPRequest;
import com.example.OtpGenerator.repository.MobileRepository;
import com.example.OtpGenerator.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private MobileRepository mobileRepository;

	public void registerUser(OTPRequest email) {
        // Check if user already exists
       
            // If user does not exist, create a new user entity and save it
        	UserEntity user = new UserEntity();
        	user.setEmail(email.getEmail());
        
            userRepository.save(user);
            // For demonstration purposes, let's just print the email
            System.out.println("User registered with email: " + user.getEmail());
	}
	public void registerMobileUser(MobileRequest mobile) {
        // Check if user already exists
       
            // If user does not exist, create a new user entity and save it
        	MobileEntity user = new MobileEntity();
        	user.setMobileNumber(mobile.getMobileNumber());      
            mobileRepository.save(user);
            // For demonstration purposes, let's just print the email
            System.out.println("User registered with email: " + user.getMobileNumber());
	}
}
