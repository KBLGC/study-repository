package org.release;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication//(scanBasePackages="test.spring_boot_jenkins.*")
@ComponentScan(basePackages={"org.release"})
@MapperScan(basePackages="org.release.mapper")
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);

	}

}
