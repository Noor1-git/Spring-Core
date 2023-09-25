package edu.jsp.inject_constructor.bean;

public class Student {

	String name;
	int age;
	String email;
	
	public void displayStudent() {
		System.out.println("Name : "+name+"\nAge : "+age+"\nEmail : "+email);
	}

	public Student(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	
}
