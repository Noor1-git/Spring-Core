package edu.jsp.createspringproject;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurableApplicationContextTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("my_config.xml");
		Student student= (Student)context.getBean("myStudent");
		student.greet();
	}
}
