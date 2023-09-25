package edu.jsp.atPrimary.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    private final Payment payment;

    @Autowired
    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void checkout(double totalAmount) {
        System.out.println("Shopping Cart Total: $" + totalAmount);
        payment.makePayment(totalAmount);
    }
}
