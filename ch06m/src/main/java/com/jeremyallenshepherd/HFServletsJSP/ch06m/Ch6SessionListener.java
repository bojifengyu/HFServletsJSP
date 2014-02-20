package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Ch6SessionListener
 * 
 */
public class Ch6SessionListener implements HttpSessionListener {

	private static int activeSessions;
	
	/**
	 * @return the activeSessions
	 */
	public static int getActiveSessions() {
		return activeSessions;
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		activeSessions++;
		// Whenever a session gets created, make sure that it has the myDog attribute with value Geordi!
		String dog = "Geordi";
		arg0.getSession().setAttribute("myDog", dog);
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeSessions--;
	}

}
