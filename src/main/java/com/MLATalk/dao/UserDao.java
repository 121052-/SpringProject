package com.MLATalk.dao;

import com.MLATalk.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	
	void save(User user);
}

