package test.spring_boot_jenkins.configuration;

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

import test.spring_boot_jenkins.interceptor.UrlInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
	@Autowired
	private UrlInterceptor urlInterceptor;
	
	
     @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	 registry.addInterceptor(urlInterceptor);
    }
     
    @Override
    public void addFormatters(FormatterRegistry registry) {
    	// TODO Auto-generated method stub
    	WebMvcConfigurer.super.addFormatters(registry);
    }
    
    @Override

    public void addCorsMappings(CorsRegistry registry) {
    	// TODO Auto-generated method stub
    	WebMvcConfigurer.super.addCorsMappings(registry);
    }
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
    	WebMvcConfigurer.super.addArgumentResolvers(resolvers);
    }
}
