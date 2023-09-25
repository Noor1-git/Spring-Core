package edu.jsp.inject_list_setter.bean;

import java.util.List;

public class Student {

	String name;
	int age;
	List<String> Subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}
	
	
}
