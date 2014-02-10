package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListener
 * 
 * <p>
 * This is the Listener that will run when the ServletContext gets initialized or destroyed.
 * When initialized, meaning when the web app is deployed for the first time, this class will
 * be notified by a ServletContextEvent that it needs to run the contextInitialized method
 * which will get the ServletContext and get a parameter from and use that parameter to create
 * a dog object which it will then store as an attribute right back on the ServletContext for 
 * later reference by other servlets or any other part of the web app really.
 * </p>
 * 
 * @author Jeremy Shepherd
 */
public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {

		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// nothing to do here, but the method must be implemented
	}

}
