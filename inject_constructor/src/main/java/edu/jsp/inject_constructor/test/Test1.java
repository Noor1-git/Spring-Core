package edu.jsp.inject_constructor.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_constructor.bean.Student;

public class Test1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("myStudent");
		student.displayStudent();
	}
	
}
