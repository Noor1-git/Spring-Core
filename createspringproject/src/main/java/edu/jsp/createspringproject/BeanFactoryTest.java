package edu.jsp.createspringproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryTest {

    public static void main(String[] args) {
        
    	Resource resource=new ClassPathResource("my_config.xml");
    	
    	BeanFactory factory=new XmlBeanFactory(resource);
    	
    	Student student=(Student) factory.getBean("myStudent");
    	student.greet();
    }
}