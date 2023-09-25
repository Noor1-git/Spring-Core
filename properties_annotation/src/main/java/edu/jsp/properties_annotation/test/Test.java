package edu.jsp.properties_annotation.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.jsp.properties_annotation.bean.Student;

@Configuration
@ComponentScan(basePackages = "edu.jsp.properties_annotation")
@PropertySource("classpath:config.properties")
public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Test.class);
		Student student=context.getBean(Student.class);
		student.display();
		 
	}
	
}
