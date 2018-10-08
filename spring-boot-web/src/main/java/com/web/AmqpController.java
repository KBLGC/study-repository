package com.web;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AmqpController {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;

	@RequestMapping("/send")
	@ResponseBody
	public String send(String message){
		rabbitTemplate.convertAndSend("routingKey1", message);
		return "success";
	}
}
