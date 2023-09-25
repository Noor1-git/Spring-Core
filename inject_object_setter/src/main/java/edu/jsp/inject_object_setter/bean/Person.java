package edu.jsp.inject_object_setter.bean;

public class Person {

	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void useMobile() {
		System.out.println("Person is using Mobile...");
		mobile.ring();
	}
	
}
