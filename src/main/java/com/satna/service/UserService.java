package com.satna.service;

import java.util.List;

import com.satna.exception.UserException;
import com.satna.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
