package edu.jsp.inject_atValue_constructor.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	public String name;
	
	public int age;

	public Student(@Value("Test") String name, @Value("10") int age) {
		super();
		this.name = name;
		this.age = age;
	}

}