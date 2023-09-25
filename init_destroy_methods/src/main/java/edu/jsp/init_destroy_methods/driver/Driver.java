package edu.jsp.init_destroy_methods.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.init_destroy_methods.bean.Student;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		context.close();
	}
	
}
