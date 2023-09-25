package edu.jsp.inject_map_constructor.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_map_constructor.bean.Shop;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Shop shop=(Shop)context.getBean("shop");
		shop.displayItems();
	}
	
}
