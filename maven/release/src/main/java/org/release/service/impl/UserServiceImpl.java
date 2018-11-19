package org.release.service.impl;

import org.release.entity.User;
import org.release.mapper.UserMapper;
import org.release.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl   implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		return userMapper.selectOne(new User(id));
	}
      
}
