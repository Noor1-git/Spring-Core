package edu.jsp.properties_annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value="${name}")
	String name;
	@Value(value="${email}")
	String email;
	@Value(value="${age}")
	int age;
	
	public void display() {
		System.out.println(name+"\n"+email+"\n"+age);
	}
}