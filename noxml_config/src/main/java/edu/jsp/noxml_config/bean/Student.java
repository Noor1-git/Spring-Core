package edu.jsp.noxml_config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	public String name;

	public Student(@Value("TestStudent") String name) {
		super();
		this.name = name;
	}
	
	
	@Value("10")
	public int age;
	
	
}