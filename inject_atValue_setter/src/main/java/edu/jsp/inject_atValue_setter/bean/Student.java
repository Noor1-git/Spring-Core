package edu.jsp.inject_atValue_setter.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	@Value("Test")
	public void setName( String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("10")
	public void setAge( int age) {
		this.age = age;
	}
}