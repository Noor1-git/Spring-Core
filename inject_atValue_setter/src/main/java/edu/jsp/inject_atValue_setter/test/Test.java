package edu.jsp.inject_atValue_setter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_atValue_setter.bean.Student;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
}