package com.SpringProject.service;

import com.SpringProject.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
	void save(User user);
	
}