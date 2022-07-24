package com.velocity.userservice.services;

import java.util.Map;

import com.velocity.userservice.model.User;




public interface SecurityTokenGenerator {

	Map<String, String> generateToken(User user);
}
