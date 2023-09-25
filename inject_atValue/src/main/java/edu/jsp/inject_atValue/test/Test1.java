package edu.jsp.inject_atValue.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_atValue.bean.Student;

public class Test1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student.name);
		System.out.println(student.age);
	}
}