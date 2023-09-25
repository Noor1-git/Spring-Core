package edu.jsp.noxml_config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	@Value("TestTeacher")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	
	@Value("30")
	public void setAge(int age) {
		this.age = age;
	}

}
