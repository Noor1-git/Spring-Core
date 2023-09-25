package edu.jsp.properties_xml.bean;

public class Mobile {

	private String name;
	private double cost;

	public Mobile(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public void displayMobile() {

		System.out.println("Name : " + name);
		System.out.println("Cost : " + cost);
	}
}
