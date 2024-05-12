package com.example.OtpGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class OtpGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtpGeneratorApplication.class, args);
	
	}


}
