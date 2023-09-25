package edu.jsp.inject_object_contructor.bean;

public class Person {

	Mobile mobile;
	
	public void useMobile() {
		System.out.println("Person is using mobile...");
		mobile.ring();
	}

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}
}