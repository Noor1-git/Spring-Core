package edu.jsp.inject_list_constructor.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_list_constructor.bean.Student;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		student.displaySubjects();
	}
	
}
