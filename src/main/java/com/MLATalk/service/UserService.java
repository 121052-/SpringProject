package com.MLATalk.service;

import com.MLATalk.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
	void save(User user);
	
}