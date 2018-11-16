package com.service.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.entity.User;
import com.mapper.mapper1.UserMapper;
import com.service.UserService;
import com.utils.StringUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StringUtil.class})
public class UserServiceImplTest {

	@Mock
	UserMapper userMapper;
	
	@InjectMocks   
	UserServiceImpl userService;
	
	@Test
	public void testGetUserById() {
		User record =new User(1l);
		User user=new User(2L);
		user.setPassword("2343242");
		user.setNickname("nickname");
		when(userMapper.selectOne(record)).thenReturn(user);
		PowerMockito.mockStatic(StringUtil.class);
		PowerMockito.when(StringUtil.staticMethod(user.getNickname())).thenReturn("nick");
		System.out.println(StringUtil.staticMethod(user.getNickname()));
		User user1=userService.getUserById(record);
		System.out.println(user1.getId());
	}

	@Test
	public void testGetUserInfo() {
		fail("Not yet implemented");
	}

}
