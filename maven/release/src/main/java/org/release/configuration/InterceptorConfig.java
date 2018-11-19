package org.release.configuration;

import org.release.interceptor.UrlInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
	@Autowired
	private UrlInterceptor urlInterceptor;
	
	
     @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	 registry.addInterceptor(urlInterceptor);
    }
     
    public static void main(String[] args) {
		
	}
}
