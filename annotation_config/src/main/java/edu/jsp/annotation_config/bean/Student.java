package edu.jsp.annotation_config.bean;

import org.springframework.stereotype.Component;

@Component("mystudent")
public class Student {

	public void message() {
		System.out.println("message from student....");
	}
}