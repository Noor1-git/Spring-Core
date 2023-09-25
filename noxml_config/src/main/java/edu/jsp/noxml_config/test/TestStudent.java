package edu.jsp.noxml_config.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.noxml_config.bean.Config;
import edu.jsp.noxml_config.bean.Student;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student=(Student)context.getBean("student");
		System.out.println(student.name);
		System.out.println(student.age);
	}

}
