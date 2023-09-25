package edu.jsp.atBean.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.jsp.atBean")
public class Config {

	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
	
}
