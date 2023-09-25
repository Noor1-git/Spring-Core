package edu.jsp.multipleconfigfiles.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.multipleconfigfiles.beans.Student;
import edu.jsp.multipleconfigfiles.beans.Teacher;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
		Student student=(Student)context.getBean("myStudent"); 
		student.learn();
		
//		Exception: because myTeacher is not configured for config1.xml.
//		Teacher teacher=(Teacher)context.getBean("myTeacher");
		
		ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("config2.xml");
		Teacher teacher=(Teacher)context1.getBean("myTeacher");
		teacher.teach();
		
//		Exception: because myStudent is not configured for config2.xml.
		Student student1=(Student)context1.getBean("myStudent"); 
		student.learn();
		
	}
	
}
