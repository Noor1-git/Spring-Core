package edu.jsp.inject_atValue.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value="Test")
	public String name;
	@Value(value="10")
	public int age;
}