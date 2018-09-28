package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	   @Autowired
	   UserService userService;
	
	   @RequestMapping("/info/{id}")
	   @ResponseBody
	   public Object getUserById(@RequestAttribute String attribute,@PathVariable Long id){
		   System.out.println("attribute:"+attribute);
		   return userService.getUserById(id);
	   }
}
