package edu.jsp.atPrimary.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made with Credit Card.");
    }
}
