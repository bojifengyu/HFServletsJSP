package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class Ch6AttributeListener
 *
 * @author Jeremy Shepherd
 */
public class Ch6AttributeListener implements HttpSessionAttributeListener {

	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute removed: " + name + ": " + value);
	}

	public void attributeAdded(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute added: " + name + " : " + value);
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute replaced: " + name + " : " + value);
	}

}
