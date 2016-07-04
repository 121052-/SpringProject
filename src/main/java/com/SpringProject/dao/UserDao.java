package com.SpringProject.dao;

import com.SpringProject.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	
	void save(User user);
}

