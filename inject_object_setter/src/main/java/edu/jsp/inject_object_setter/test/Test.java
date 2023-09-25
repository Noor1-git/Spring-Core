package edu.jsp.inject_object_setter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_object_setter.bean.Person;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("person");
		person.useMobile();
	}
}