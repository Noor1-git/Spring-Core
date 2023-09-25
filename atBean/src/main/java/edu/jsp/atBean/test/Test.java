package edu.jsp.atBean.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atBean.bean.Config;
import edu.jsp.atBean.bean.Student;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student=(Student)context.getBean("student");
		student.play();
		
	}
}