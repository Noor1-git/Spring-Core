package edu.jsp.inject_constructor.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_constructor.bean.Student;

public class Test2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("myStudent1");
		student.displayStudent();
	}
}
