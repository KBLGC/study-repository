package test.spring_boot_jenkins.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.spring_boot_jenkins.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	   @Autowired
	   UserService userService;
	
	   
	
	   @RequestMapping("/info/{id}")
	   @ResponseBody
	   public Object getUserById(@PathVariable Long id){
		   return userService.getUserById(id);
	   }
}
