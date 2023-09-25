package edu.jsp.atPrimary.bean;

import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made with PayPal.");
    }
}
