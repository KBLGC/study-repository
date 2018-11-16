package com.web;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.UserInfoService;
import com.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	  // @Mock
	   @Autowired
	   UserService userService;
	
	   @Autowired
	   private UserInfoService userInfoService;
	   
	   @RequestMapping("/info/{id}")
	   @ResponseBody
	   public Object getUserById(@PathVariable Long id){
		   System.out.println("测试");
		   return userService.getUserById(id);
	   }
	   
	   @RequestMapping(value="/addUserInfo",method=RequestMethod.POST)
	   @ResponseBody
	   public Object addUserInfo(Long userId,String realName){
		   return userInfoService.addUserInfo(userId, realName);
	   }
	   
	  // @Mock
	   private static List<String> list;
	   
	   public  UserController() {
		 //  MockitoAnnotations.initMocks(this);
	}
	   
	   @Test
	   public void test(){
		   list.add("a");
		   verify(list).add("b");
	   }
}
