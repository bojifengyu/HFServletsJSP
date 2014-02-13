package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class BeerAttributeListener
 * 
 */
public class BeerAttributeListener implements HttpSessionAttributeListener {

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute removed: " + name + ": " + value);
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute added: " + name + ": " + value);
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute replaced: " + name + ": " + value);
	}

}
