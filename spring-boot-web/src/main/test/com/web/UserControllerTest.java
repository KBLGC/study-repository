package com.web;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.service.UserInfoService;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	
	@Mock
	private UserService userService;
	
	@InjectMocks
	UserController userController;
	
	@Test
	public void testGetUserById() {
		User user=new User(1l);
		user.setNickname("nickname");
		when(userService.getUserById(1l)).thenReturn(user);
	  User result=(User) userController.getUserById(1L);
	  System.out.println(result.getNickname());
	}

	@Test
	public void testAddUserInfo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testUserController() {
		fail("Not yet implemented"); // TODO
	}

}
