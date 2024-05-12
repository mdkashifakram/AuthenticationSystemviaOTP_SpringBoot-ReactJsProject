import React, { useState } from 'react';
import axios from 'axios';
import './Register.css';




const Register = () => {
  const [formData, setFormData] = useState({phoneNumber:'',email:''});

  const [sendToEmail, setSendToEmail] = useState(false);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value
    }));
  };

  const handleSendToChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value
    }));
  };

  /*

*/

  const handleSubmit = async (e) => {
    e.preventDefault();
    const endpoint = sendToEmail ? 'http://localhost:8080/otp/send-otp' : 'http://localhost:8080/otp/send-mobile-otp';
    const data = sendToEmail ? {email: formData.email} : {mobileNumber: formData.mobileNumber};
    
    try {
      const response = await axios.post(endpoint, data);
      console.log('OTP sent successfully:', response.data);
    } catch (error) {
      console.error('Error sending OTP:', error);
    }
  };

  return (
    <div class="container">
    <div class="background-image"></div>
    <div class="form-card">
        <h2>Sign up now</h2>
        <form id="registerForm" onSubmit={handleSubmit}>
            <div class="form-row">
                <input
                    type="text"
                    placeholder="Phone Number"
                    name="mobileNumber"
                    value={formData.mobileNumber}
                    onChange={handleInputChange}
                    
                />
            </div>
            <div class="or"> <p>or</p></div>
            <div class="form-row">
                <input
                    type="email"
                    placeholder="Email address"
                    name="email"
                    value={formData.email}
                    onChange={handleSendToChange}
                    
                />
            </div>
            <div class="form-row">
                <label>
                    <input
                        type="checkbox"
                    />
                    Subscribe to our newsletter
                </label>
            </div>
            <button type="submit">SIGN UP</button>
        </form>
    </div>
</div>

  );
};

export default Register;
