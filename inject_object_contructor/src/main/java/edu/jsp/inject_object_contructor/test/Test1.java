package edu.jsp.inject_object_contructor.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_object_contructor.bean.Person;

public class Test1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("person");
		person.useMobile();
	}
	
}
