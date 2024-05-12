package com.example.OtpGenerator.config;

import com.twilio.Twilio;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;


//
// Twilio Configuration
// Generate own account sid,authToken,trialNumber
// from https://console.twilio.com/?frameUrl=%2Fconsole%3Fx-target-region%3Dus1&newCustomer=true
@Configuration
@ConfigurationProperties(prefix = "twilio")
@Data
public class TwilioConfig {


   @Value("${twilio.account_sid}")
    private String accountSid;


   @Value("${twilio.auth_token}")
    private String authToken;


   @Value("${twilio.trial_number}")
    private String trialNumber;


   public String getAccountSid() {
        return accountSid;
    }


   public String getAuthToken() {
        return authToken;
    }


   public String getTrialNumber() {
        return trialNumber;
    }


   public TwilioConfig(@Value("${twilio.account_sid}") String accountSid,
            @Value("${twilio.auth_token}") String authToken, @Value("${twilio.trial_number}") String trialNumber) {
        this.accountSid = accountSid;
        this.authToken = authToken;
        this.trialNumber = trialNumber;
        Twilio.init(accountSid, authToken); // Initialize Twilio client
    }
}