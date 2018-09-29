package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		
		return userMapper.selectOne(new User(id));
	}

	@Override
	public int register(User user) {
		
		return userMapper.insert(user);
	}
     
}
