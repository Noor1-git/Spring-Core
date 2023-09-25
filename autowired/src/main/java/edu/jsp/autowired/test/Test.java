package edu.jsp.autowired.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.autowired.bean.Car;
import edu.jsp.autowired.bean.Config;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Car car=(Car)context.getBean("car");
		car.drive();
	}
}