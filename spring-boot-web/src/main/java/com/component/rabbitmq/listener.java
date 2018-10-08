package com.component.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues={"directQueue1","directQueue2"})
public class listener {
     
	  @RabbitHandler
	  public void processDirect(String message){
		  System.out.println("接收到的消息："+message);
	  }
}
