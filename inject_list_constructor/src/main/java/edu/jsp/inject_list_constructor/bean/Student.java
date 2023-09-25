package edu.jsp.inject_list_constructor.bean;

import java.util.List;

public class Student {

	private List<String> subjects;

	public Student(List<String> subjects) {
		super();
		this.subjects = subjects;
	}

	public void displaySubjects() {
		if (subjects != null) {
			for (String string : subjects) {
				System.out.println(string);
			}

		} else {
			System.out.println("Empty list");
		}
	}
}
