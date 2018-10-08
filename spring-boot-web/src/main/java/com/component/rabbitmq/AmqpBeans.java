package com.component.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpBeans {
	
	static final String DIRECT_EXCHANGE="directExchange";
	//广播
	static final String FANOUT_EXCHANGE="fanoutExchange";
	
	static final String DIRECT_QUEUE_1="directQueue1";
	
	static final String DIRECT_QUEUE_2="directQueue2";
	
	static final String DIRECT_QUEUE_ROUTING_KEY_1="routingKey1";
	
	static final String DIRECT_QUEUE_ROUTING_KEY_2="routingKey1";
    
	@Bean
	public DirectExchange newDirectExchange(){
		return new DirectExchange(DIRECT_EXCHANGE);
	}
	
	@Bean
	public FanoutExchange newFanoutExchange(){
		return new FanoutExchange(FANOUT_EXCHANGE);
	}
	
	@Bean
	public Queue newDirectQueue1(){
		return new Queue(DIRECT_QUEUE_1);
	}
	
	@Bean
	public Queue newDirectQueue2(){
		return new Queue(DIRECT_QUEUE_1);
	}
	
	public Binding BindDirectQueue1(Queue queue,DirectExchange directExchange){
		return BindingBuilder.bind(queue).to(directExchange).with(DIRECT_QUEUE_ROUTING_KEY_1);
	}
}
