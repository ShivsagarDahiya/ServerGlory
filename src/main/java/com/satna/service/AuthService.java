package com.satna.service;

import com.satna.exception.SellerException;
import com.satna.exception.UserException;
import com.satna.request.LoginRequest;
import com.satna.request.ResetPasswordRequest;
import com.satna.request.SignupRequest;
import com.satna.response.ApiResponse;
import com.satna.response.AuthResponse;

import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
