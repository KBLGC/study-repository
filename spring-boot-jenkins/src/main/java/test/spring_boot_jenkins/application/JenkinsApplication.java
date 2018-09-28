package test.spring_boot_jenkins.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication//(scanBasePackages="test.spring_boot_jenkins.*")
@ComponentScan(basePackages={"com.rongtai.credit.doc",
        "com.rongtai.backend.**",
        "com.rongtai.credit.spider.**",
        "com.rongtai.credit.dashu.**",
        "com.rongtai.credit.dashu.**",
        "test.spring_boot_jenkins"})
@MapperScan(basePackages="test.spring_boot_jenkins.mapper")
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);

	}

}
