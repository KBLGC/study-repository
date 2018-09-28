package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication//(scanBasePackages="test.spring_boot_jenkins.*")
@ComponentScan(basePackages={"com"})
@MapperScan(basePackages="com.mapper")
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);

	}

}
