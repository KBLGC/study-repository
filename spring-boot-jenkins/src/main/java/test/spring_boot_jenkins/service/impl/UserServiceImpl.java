package test.spring_boot_jenkins.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;


import test.spring_boot_jenkins.entity.User;
import test.spring_boot_jenkins.mapper.UserMapper;
import test.spring_boot_jenkins.service.UserService;
//import tk.mybatis.mapper.autoconfigure.ConfigurationCustomizer;

@Service
public class UserServiceImpl   implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		return userMapper.selectOne(new User(id));
	}
      
}
