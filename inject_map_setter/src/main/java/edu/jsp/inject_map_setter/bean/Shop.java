package edu.jsp.inject_map_setter.bean;

import java.util.Map;

public class Shop {

	String name;
	String address;
	Map<String, Double> items;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, Double> getItems() {
		return items;
	}
	public void setItems(Map<String, Double> items) {
		this.items = items;
	}
	
	
}
