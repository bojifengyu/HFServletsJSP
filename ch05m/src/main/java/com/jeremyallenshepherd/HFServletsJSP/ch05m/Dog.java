package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener{

	private String breed;
	
	public Dog(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Dog added to session");
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Dog removed from session");
	}
}
