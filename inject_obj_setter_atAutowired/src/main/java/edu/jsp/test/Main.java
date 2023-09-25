package edu.jsp.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.jsp.bean.Movie;

@Configuration
@ComponentScan(basePackages = "edu.jsp")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Movie movie = context.getBean(Movie.class);
        movie.displayInfo();
    }
}