import axios from 'axios';

const BASE_URL = 'http://localhost:8080'; // Replace with your backend API URL

const ApiService = {
  // Function to add a new student
  sendEmailOTP: (emailData) => {
    return axios.post(`${BASE_URL}/otp/send-otp'`, emailData);
  },

  sendPhoneOTP: (mobileNumber) => {
    return axios.post(`${BASE_URL}/otp/send-mobile-otp'`, mobileNumber);
  }
};

export default ApiService;