package com.service;

import com.entity.User;

public interface UserService {
    
	public User getUserById(Long id);
	
	public int register(User user);
}
