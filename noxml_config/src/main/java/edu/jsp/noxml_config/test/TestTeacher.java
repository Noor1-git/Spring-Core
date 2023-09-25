package edu.jsp.noxml_config.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.noxml_config.bean.Config;
import edu.jsp.noxml_config.bean.Teacher;

public class TestTeacher {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Teacher teacher=(Teacher)context.getBean("teacher");
		System.out.println(teacher.getName());
		System.out.println(teacher.getAge());
		
	}
	
}
