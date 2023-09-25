package edu.jsp.atPrimary.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atPrimary.bean.AppConfig;
import edu.jsp.atPrimary.bean.ShoppingCart;

public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout(100.0);

        context.close();
    }
}
