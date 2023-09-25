package edu.jsp.atScope.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import edu.jsp.atScope.bean.Student;

@ComponentScan(basePackages = "edu.jsp.atScope")
@Configuration
public class StudentTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(StudentTest.class);
		
		Student student=context.getBean(Student.class);
		System.out.println(student);
		
		Student student1=context.getBean(Student.class);
		System.out.println(student1);
		
		Student student2=context.getBean(Student.class);
		System.out.println(student2);
		
	}
	
	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
}