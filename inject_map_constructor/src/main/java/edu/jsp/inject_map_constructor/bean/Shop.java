package edu.jsp.inject_map_constructor.bean;

import java.util.Map;

public class Shop {
	
	String name;
	
	Map<String, Double> items;

	public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}
	
	public void displayItems() {
		System.out.println(name);
		
		for (Map.Entry<String, Double> entry : items.entrySet()) {
			String key = entry.getKey();
			Double val = entry.getValue();
			System.out.println(key+"----->"+val);
		}
	}
}
