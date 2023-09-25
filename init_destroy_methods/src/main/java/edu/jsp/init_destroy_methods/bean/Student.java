package edu.jsp.init_destroy_methods.bean;

public class Student {

	public Student() {
		System.out.println("constructor accessed");
	}
	
	public void verify() {
		System.out.println("Verify method called");
	}
	
	public void cleanUp() {
		System.out.println("Cleanup method called");
	}
	
}