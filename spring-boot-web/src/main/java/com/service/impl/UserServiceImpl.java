package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.mapper1.UserMapper;
import com.service.UserService;
import com.utils.StringUtil;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		
		return userMapper.selectOne(new User(id));
	}
	
	@Override
	public User getUserById(User record) {
		System.out.println(StringUtil.staticMethod(record.getNickname()));
		return userMapper.selectOne(record);
	}
	
	@Override
	public User getUserInfo(Long id){
		return userMapper.selectOne(new User(id));
	}
      
}
