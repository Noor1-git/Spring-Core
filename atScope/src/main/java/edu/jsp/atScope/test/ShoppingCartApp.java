package edu.jsp.atScope.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atScope.bean.AppConfig;
import edu.jsp.atScope.bean.ShoppingCart;

public class ShoppingCartApp {

    public static void main(String[] args) {
        // Create the Spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Simulate two users adding items to their shopping carts
        ShoppingCart user1Cart = context.getBean(ShoppingCart.class);
        user1Cart.addItem("Product A");
        user1Cart.addItem("Product B");

        ShoppingCart user2Cart = context.getBean(ShoppingCart.class);
        user2Cart.addItem("Product C");

        // Print the contents of each user's shopping cart
        System.out.println("User 1's Shopping Cart: " + user1Cart.getItems());
        System.out.println("User 2's Shopping Cart: " + user2Cart.getItems());

        // Close the Spring context
        context.close();
    }
}