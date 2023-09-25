package edu.jsp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.jsp.bean.Car;

@Configuration
@ComponentScan(basePackages = "edu.jsp")
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

        Car car = context.getBean(Car.class);
        car.start();
    }
}
