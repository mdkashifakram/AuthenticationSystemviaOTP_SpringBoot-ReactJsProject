package com.example.OtpGenerator.controller;
import com.example.OtpGenerator.entity.UserEntity;
import com.example.OtpGenerator.model.MobileRequest;
import com.example.OtpGenerator.model.OTPRequest;
import com.example.OtpGenerator.service.ControllerEmailService;
import com.example.OtpGenerator.service.MobileService;
import com.example.OtpGenerator.service.UserService;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otp")
//@Api(tags = "OTP Management")//need to relook--and connected SwaggerApi files
@CrossOrigin(origins="http://localhost:3000")//need to add frontend code
public class ApiController {

	@Autowired
    private UserService userService;
	
    @Autowired
    private ControllerEmailService controllerEmailService; // Update the service reference
    
    @Autowired
    private MobileService mobileService;

    @PostMapping("/send-otp")
    public String sendOTP(@RequestBody OTPRequest email) {
        userService.registerUser(email);
        controllerEmailService.sentOTPEmail(email); // Update the method call
        return "OTP sent successfully to " + email;
    }
    //for mobile message
    @PostMapping("/send-mobile-otp")
    public String sendOTPMobile(@RequestBody MobileRequest mobile) {
        userService.registerMobileUser(mobile);
        mobileService.generateOtp(mobile);
        return "OTP sent successfully to " + mobile;
    }
}


