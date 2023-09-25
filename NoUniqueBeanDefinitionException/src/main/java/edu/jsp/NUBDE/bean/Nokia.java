package edu.jsp.NUBDE.bean;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile{

	@Override
	public void call() {
		System.out.println("Calling from Nokia");
	}
}
