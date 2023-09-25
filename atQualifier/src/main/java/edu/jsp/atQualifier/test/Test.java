package edu.jsp.atQualifier.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atQualifier.bean.Config;
import edu.jsp.atQualifier.bean.Person;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Person person=(Person)context.getBean("person");
		person.use();
		
	}
}