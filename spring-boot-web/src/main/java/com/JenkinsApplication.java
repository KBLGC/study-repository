package com;

import java.text.MessageFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"com.**","com.mapper.**"})
@MapperScan(basePackages="com.mapper.*")
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		//AbstractRoutingDataSource ar= 
//		String str="http://localhost:/dev?spe=1&src=hhr_o1&rcode={0}";
//		System.out.println(MessageFormat.format(str, "code"));
	}

}
