package edu.jsp.annotation_config.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.annotation_config.bean.Student;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("mystudent");
		student.message();
	}
}