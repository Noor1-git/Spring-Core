package edu.jsp.inject_map_setter.test;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.inject_map_setter.bean.Shop;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Shop shop=(Shop)context.getBean("myShop");
		
		System.out.println("Name : "+shop.getName());
		System.out.println("Address : "+shop.getAddress());
		System.out.println("Items : ");
		Map<String, Double> items=shop.getItems();
		
		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
