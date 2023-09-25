package edu.jsp.createspringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("my_config.xml");
		Student student= (Student)context.getBean("myStudent");
		student.greet();
	}

}
