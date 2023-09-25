package edu.jsp.atQualifier.bean;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile{

	@Override
	public void call() {
		
		System.out.println("Calling From Moto");
		
	}
}