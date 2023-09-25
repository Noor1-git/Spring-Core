package edu.jsp.properties_xml.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.properties_xml.bean.Mobile;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
		Mobile mobile=(Mobile)context.getBean("mobile");
		mobile.displayMobile();
	}
}
