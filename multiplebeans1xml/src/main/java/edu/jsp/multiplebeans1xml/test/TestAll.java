package edu.jsp.multiplebeans1xml.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.multiplebeans1xml.qspiders.Trainer;
import edu.jsp.multiplebeans1xml.school.Student;
import edu.jsp.multiplebeans1xml.school.Teacher;

public class TestAll {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Teacher teacher=(Teacher)context.getBean("myTeacher");
		teacher.teach();
		
		Student student=(Student)context.getBean("myStudent");
		student.learn();
		
		Trainer trainer=(Trainer)context.getBean("myTrainer");
		trainer.train();
		
		//using second mapping for testing.
		Student student1=(Student)context.getBean("myStudent1");
		student1.learn();
	}
}
