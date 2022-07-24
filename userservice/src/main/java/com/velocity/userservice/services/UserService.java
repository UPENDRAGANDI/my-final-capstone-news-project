package com.velocity.userservice.services;

import com.velocity.userservice.exception.UserAlreadyExistsException;
import com.velocity.userservice.exception.UserNotFoundException;
import com.velocity.userservice.model.User;

public interface UserService {

	boolean saveUser(User user) throws UserAlreadyExistsException;

	User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException;
}
