package edu.jsp.atScope.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("edu.jsp.atScope")
public class AppConfig {

	@Bean
	@Scope("prototype")
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}
}
