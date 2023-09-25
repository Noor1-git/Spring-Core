package edu.jsp.noxml_config.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.noxml_config.bean.Config;
import edu.jsp.noxml_config.bean.Person;

public class TestPerson {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Person person=(Person)context.getBean("person");
		person.run();
		
	}
	
}
