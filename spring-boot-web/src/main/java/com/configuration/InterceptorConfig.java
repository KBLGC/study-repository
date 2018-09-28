package com.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.interceptor.UrlInterceptor;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
	@Autowired
	private UrlInterceptor urlInterceptor;
	
	
     @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	 registry.addInterceptor(urlInterceptor);
    }
     
}
