package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 */
@SuppressWarnings("serial")
public class MainController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int activeSessionCount = Ch6SessionListener.getActiveSessions();
		
		out.println("<html><body><h1 style=\"text-align: center;\">Chapter 6 - Sessions - Cookies - Listeners</h1>");
		if (session.isNew()) {
			out.println("<p>Simply by coming to this page, a session has been created for you! But it is set for a 1 minute expiration from you last click</p>");
			out.println("<p>A String object called " + session.getAttributeNames().nextElement() 
					+ " with the value of " + session.getAttribute("myDog") 
					+ " has been placed in your session</p>");
		} else {
			out.println("<p>Welcome Back! You are still in session! </p>");
			out.println("<p>The " + session.getAttributeNames().nextElement() 
					+ " attribute with value of " + session.getAttribute("myDog") 
					+ " is still in your session</p>");
		}
		out.println("<a href=\"" + response.encodeRedirectURL("SessionPreExistingOnlyCheck.do") + "\">click me (encodeRedirectURL) to SessionPreExistingOnlyCheck.do</a><br>");
		out.println("<a href=\"" + response.encodeURL("CookieTest.do") + "\">click me (encodeURL) to CookieTest.do</a><br>");
//		out.println("<a href=\"" + response.encodeRedirectURL("../ch03/form.html") + "\">click me (encodeRedirectURL) to the Beer app</a><br>");
//		out.println("<a href=\"" + response.encodeURL("../ch05/ListenTest.do") + "\">click me (encodeRedirectURL) to ListenTest.do</a><br>");
		out.println("<br>active sessions = " + activeSessionCount + "<br>");
		out.println("</body></html>");
	}

}
