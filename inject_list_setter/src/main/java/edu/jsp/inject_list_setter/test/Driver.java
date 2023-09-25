package edu.jsp.inject_list_setter.test;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_list_setter.bean.Student;

public class Driver {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("myStudent");
		
		System.out.println("Name : "+student.getName()+"\nAge : "+student.getAge());
		System.out.println("Student Subjects : ");
		List<String> subjects=student.getSubjects();
		for (String string : subjects) {
			System.out.println(string);
		}
	}
}
