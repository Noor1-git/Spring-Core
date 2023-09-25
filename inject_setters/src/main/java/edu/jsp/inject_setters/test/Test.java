package edu.jsp.inject_setters.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_setters.bean.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("myStudent");
		System.out.println("Name : "+student.getName()+"\nAge : "+student.getAge()+"\nEmail : "+student.getEmail());
		
		
	}
}
