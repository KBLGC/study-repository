package test.spring_boot_jenkins.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
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
}
