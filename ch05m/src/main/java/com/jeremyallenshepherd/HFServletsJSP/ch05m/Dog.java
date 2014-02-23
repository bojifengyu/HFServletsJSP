package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * <p>
 * This is a simple Dog class that is going to be stored in the ServletContext, after reading
 * the context init parameters
 * </p>
 * 
 * @author Jeremy Shepherd
 *
 */
public class Dog implements HttpSessionBindingListener{

	private String breed;
	private String name;
	
	public Dog() {
		//no-arg constructor
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Dog added to session");
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Dog removed from session");
	}

}
