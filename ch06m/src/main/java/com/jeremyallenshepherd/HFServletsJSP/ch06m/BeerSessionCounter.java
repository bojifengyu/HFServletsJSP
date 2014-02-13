package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class BeerSessionCounter
 * 
 */
public class BeerSessionCounter implements HttpSessionListener {

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
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeSessions--;
	}

}
